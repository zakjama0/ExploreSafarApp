import { jwtDecode } from 'jwt-decode';
import React, { createContext, useEffect, useState } from "react";
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import Attraction from "../components/Attraction";
import Country from "../components/Country";
import Navigation from "../components/Navigation";
import SafarAnimation from "../components/SafarAnimation";
import BlogContainer from "./BlogContainer";
import DuasContainer from "./DuasContainer";
import ItineraryContainer from "./ItineraryContainer";
import LandingPageContainer from "./LandingPageContainer";
import MapsContainer from "./MapsContainer";
import MyItineraryContainer from "./MyItineraryContainer";
import MyItineraryList from "./MyItineraryListContainer";
import SafetyContainer from "./SafetyContainer";
import NotFoundContainer from './NotFoundContainer';
import Log from "../components/Login";
import IslamicHistoryBlog from "../components/Blogs/Blog1";
import EssentialBlogs from "../components/Blogs/Blog2";
import Register from "../components/Register";


export const Context = createContext(null);

export const apiUrl = "localhost:8080";
export const userState = React.createContext();

const MainContainer = () => {

    const [attractions, setAttractions] = useState([]);
    const [cities, setCities] = useState([]);
    const [countries, setCountries] = useState([]);
    const [duas, setDuas] = useState([]);
    const [itineraries, setItineraries] = useState([]);
    const [reviews, setReviews] = useState([]);
    const [loggedUserReviews, setLoggedUserReviews] = useState([]);
    const [loading, setLoading] = useState(false);
    const [isLoggedIn, setIsLoggedIn] = useState(() => {
        return sessionStorage.getItem("access_token") !== null;
    });


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

    const fetchReviewsByUser = async () => {
        try {
            const response = await fetch(`http://${apiUrl}/reviews/user`, {
                method: "GET",
                headers: {
                    "Content-Type": "application/json",
                    "Authorization": `Bearer ${sessionStorage.getItem("access_token")}`
                }
            });

            if (!response.ok) {
                if (response.status === 403) {
                    throw new Error("Must be signed in");
                }
            }

            const data = await response.json();
            setLoggedUserReviews(data);
        } catch (error) {

        }
    }

    const fetchItinerariesByUser = async () => {
        try {
            const response = await fetch(`http://${apiUrl}/itineraries/user`, {
                method: "GET",
                headers: {
                    "Content-Type": "application/json",
                    "Authorization": `Bearer ${sessionStorage.getItem("access_token")}`
                }
            });

            if (!response.ok) {
                if (response.status === 403) {
                    throw new Error("Must be signed in");
                }
            }

            const data = await response.json();
            setItineraries(data);
        } catch (error) {

        }
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
                    throw new Error("A user with this email address already exists.");
                } else {
                    throw new Error("An unexpected error occurred.");
                }
            }

            alert("User has signed up.");
        } catch (error) {
        }
    }

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

            setIsLoggedIn(true);

            return data;
        } catch (error) {
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

            setIsLoggedIn(false);
        } catch (error) {
        }
    }

    const postReview = async (newReview) => {
        const response = await fetch("http://localhost:8080/reviews", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
                "Authorization": `Bearer ${sessionStorage.getItem("access_token")}`
            },
            body: JSON.stringify(newReview)
        });
        fetchReviewsByUser();
        fetchAttractions();
    }

    const patchReview = async (amendedReview, reviewId) => {
        const response = await fetch(`http://localhost:8080/reviews/${reviewId}`, {
            method: "PATCH",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(amendedReview)
        });
        fetchReviews();
        fetchAttractions();
    }

    const deleteReview = async (reviewId) => {
        const response = await fetch(`http://localhost:8080/reviews/${reviewId}`, {
            method: "DELETE",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(reviewId)
        });
        fetchAttractions();
    }

    const postPlannedAttraction = async (plannedAttraction) => {
        try {
            const response = await fetch(`http://${apiUrl}/planned-attractions`, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                    "Authorization": `Bearer ${sessionStorage.getItem("access_token")}`
                },
                body: JSON.stringify(plannedAttraction)
            });

            if (!response.status === 201) {
                alert("An unexpected error has occured");
                throw new Error();
            }

            alert("Planned Attraction added");
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
        if (isLoggedIn) {
            fetchItinerariesByUser();
            fetchReviewsByUser();
        }
        const token = sessionStorage.getItem("access_token");
        if (token) {
            const decoded = jwtDecode(token);
            const expiry = decoded.exp;
            if (expiry < Date.now() / 1000) {
                sessionStorage.removeItem("access_token");
            }
        }
        setLoading(true)
        setTimeout(() => {
            setLoading(false)
        }, 5500)
    }, []);

    useEffect(() => {
        fetchItinerariesByUser();
        fetchReviewsByUser();
    }, [isLoggedIn])

    const countryLoader = ({ params }) => {
        return countries.find(country => {
            return country.id === parseInt(params.countryId);
        });
    }

    const attractionLoader = ({ params }) => {
        return attractions.find(attraction => {
            return attraction.id === parseInt(params.attractionId);
        });
    }

    const myItineraryLoader = ({ params }) => {
        return itineraries.find(itinerary => {
            return itinerary.id === parseInt(params.itineraryId);
        })
    }

    const router = createBrowserRouter([
        {
            path: "/",
            errorElement: <NotFoundContainer />,
            element: <Navigation postUser={postUser} login={login} logout={logout} />,
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
                    element: <Country cities={cities} postPlannedAttraction={postPlannedAttraction} />
                },
                {
                    path: "/attractions/:attractionId",
                    loader: attractionLoader,
                    element: <Attraction
                        cities={cities}
                        postPlannedAttraction={postPlannedAttraction}
                        postReview={postReview}
                        deleteReview={deleteReview}
                        editReview={patchReview}
                        loggedUserReviews={loggedUserReviews}
                    />
                },
                {
                    path: "/my-itineraries",
                    element: <MyItineraryList fetchItinerariesByUser={fetchItinerariesByUser} />
                },
                {
                    path: "my-itineraries/:itineraryId",
                    loader: myItineraryLoader,
                    element: <MyItineraryContainer />
                },
                {
                    path: "/duas",
                    element: <DuasContainer duas={duas} />
                },
                {
                    path: "/maps",
                    element: <MapsContainer />
                },
                {
                    path: "/safety",
                    element: <SafetyContainer />
                },
                {
                    path: "/blogs",
                    element: <BlogContainer />
                },
                {
                    path: "/login",
                    element: <Log login={login} />
                },
                {
                    path: "/blog0",
                    element: <IslamicHistoryBlog />
                },
                {
                    path: "/blog1",
                    element: <EssentialBlogs />
                },
                {
                    path: "/registration",
                    element: <Register register={postUser} />
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
                    <Context.Provider value={{ isLoggedIn, setIsLoggedIn, itineraries, setItineraries }}>
                        <RouterProvider router={router} />
                    </Context.Provider>
            }

        </>
    );
}

export default MainContainer;