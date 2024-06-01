import { useEffect, useState } from "react";
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import ItineraryContainer from "./ItineraryContainer";
import Navigation from "../components/Navigation";
import Country from "../components/Country";
import LandingPageContainer from "./LandingPageContainer";
import DuasContainer from "./DuasContainer";
import SafarAnimation from "../components/SafarAnimation";
import MapsContainer from "./MapsContainer";

const apiUrl = "localhost:8080";

const MainContainer = () => {

    const [attractions, setAttractions] = useState([]);
    const [cities, setCities] = useState([]);
    const [countries, setCountries] = useState([]);
    const [duas, setDuas] = useState([]);
    const [reviews, setReviews] = useState([]);
    const [loading, setLoading] =useState(false)

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
                if (response.status === 409) {
                    alert("A user with this email address already exists.");
                } else {
                    throw new Error("An unexpected error occurred.");
                }
            }

            const data = await response.json();
            console.log(data);
            return data;
        } catch (error) {
            console.error(error);
            throw error;
        }
    };

    useEffect(() => {
        fetchAttractions();
        fetchCities();
        fetchCountries();
        fetchDuas();
        fetchReviews();
        setLoading(true)
        setTimeout(() =>{
            setLoading(false)
        },5500)
    }, []);

    const countryLoader = ({ params }) => {
        return countries.find(country => {
            return country.id === parseInt(params.countryId);
        });
    }

    const router = createBrowserRouter([
        {
            path: "/",
            element: <Navigation postUser={postUser} />,
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

                    element: <Country cities={cities}/>
                },
                {
                    path: "/duas",
                    element: <DuasContainer duas={duas} />
                },
                {
                    path: "/maps",
                    element: <MapsContainer />
                },
            ]
        }
    ]);

    return (
        <>
        {
            loading ?
            <SafarAnimation />
            :
            <RouterProvider router={router} />
        }
            
        </>
    );
}

export default MainContainer;