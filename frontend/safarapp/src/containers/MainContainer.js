import { createContext, useEffect, useState } from "react";
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import { jwtDecode } from 'jwt-decode';
import ItineraryContainer from "./ItineraryContainer";
import Navigation from "../components/Navigation";
import Country from "../components/Country";
import LandingPageContainer from "./LandingPageContainer";

const apiUrl = "localhost:8080";

const MainContainer = () => {

    const [attractions, setAttractions] = useState([]);
    const [cities, setCities] = useState([]);
    const [countries, setCountries] = useState([]);
    const [duas, setDuas] = useState([]);
    const [reviews, setReviews] = useState([]);

    const fetchAttractions = async () => {
        const response = await fetch(`http://${apiUrl}/attractions`);
        const data = await response.json();
        setAttractions(data);
    }

    const fetchCities = async () => {
        const response = await fetch(`http://${apiUrl}/cities`);
        const data = await response.json();
        setCities(data);
    }

    const fetchCountries = async () => {
        const response = await fetch(`http://${apiUrl}/countries`);
        const data = await response.json();
        setCountries(data);
    }

    const fetchDuas = async () => {
        const response = await fetch(`http://${apiUrl}/duas`);
        const data = await response.json();
        setDuas(data);
    }

    const fetchReviews = async () => {
        const response = await fetch(`http://${apiUrl}/reviews`);
        const data = await response.json();
        setReviews(data);
    }

    const postUser = async (newUser) => {
        try {
            const response = await fetch(`http://${apiUrl}/api/v1/auth/register`, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(newUser)
            });

            if (!response.ok) {
                if (response.status === 403) {
                    alert("A user with this email address already exists.");
                    throw new Error()
                } else {
                    throw new Error("An unexpected error occurred.");
                }
            }

            alert("User has signed up.");
        } catch (error) {
            console.error(error);
            throw error;
        }
    };

    const login = async (userCredentials) => {
        try {
            const response = await fetch(`http://${apiUrl}/api/v1/auth/authenticate`, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(userCredentials)
            });

            if (!response.ok) {
                if (response.status === 401) {
                    alert("Email address or password is incorrect.");
                    throw new Error("Email address or password is incorrect.");
                } else {
                    throw new Error("An unexpected error occurred.");
                }
            }

            alert("User has logged in")
            const data = await response.json();
            const { access_token, refresh_token } = data;

            sessionStorage.setItem("access_token", access_token);
            sessionStorage.setItem("refresh_token", refresh_token);

            // getUser(userCredentials.email);
            return data;
        } catch (error) {
            throw error;
        }
    }

    const logout = async () => {
        try {
            const response = await fetch(`http://${apiUrl}/api/v1/auth/logout`, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                    "Authorization": `Bearer ${sessionStorage.getItem("access_token")}`
                }
            });

            if (!response.ok) {
                alert("An unexpected error has occured!");
                return;
            }

            alert("Log out successful.");
            sessionStorage.clear();
        } catch (error) {
            throw error;
        }
    }

    useEffect(() => {
        fetchAttractions();
        fetchCities();
        fetchCountries();
        fetchDuas();
        fetchReviews();
        const token = sessionStorage.getItem("access_token");
        if (token) {
            const decoded = jwtDecode(token);
            const expiry = decoded.exp;
            if (expiry < Date.now() / 1000) {
                sessionStorage.removeItem("access_token");
            }
        }
    }, []);

    const countryLoader = ({ params }) => {
        return countries.find(country => {
            return country.id === parseInt(params.countryId);
        });
    }

    const router = createBrowserRouter([
        {
            path: "/",
            element: <Navigation postUser={postUser} login={login} logout={logout}/>,
            children: [
                {
                    path: "/",
                    element: <LandingPageContainer />
                },
                {
                    path: "/itineraries",
                    element: <ItineraryContainer countries={countries} />
                },
                {
                    path: "/countries/:countryId",
                    loader: countryLoader,
                    element: <Country cities={cities} />
                }
            ]
        }
    ]);

    return (
        <>
            <RouterProvider router={router} />
        </>
    );
}

export default MainContainer;