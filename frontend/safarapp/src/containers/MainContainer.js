import { useEffect, useState } from "react";
import { Navigate, RouterProvider, createBrowserRouter } from "react-router-dom";
import ItineraryContainer from "./ItineraryContainer";
import Navigation from "../components/Navigation";
import HomeContainer from "./HomeContainer";
import Country from "../components/Country";

const MainContainer = () => {

    const [attractions, setAttractions] = useState([]);
    const [cities, setCities] = useState([]);
    const [countries, setCountries] = useState([]);
    const [duas, setDuas] = useState([]);
    const [reviews, setReviews] = useState([]);

    const fetchAttractions = async () => {
        const response = await fetch(`http://localhost:8080/attractions`);
        const data = await response.json();
        setAttractions(data);
    }

    const fetchCities = async () => {
        const response = await fetch(`http://localhost:8080/cities`);
        const data = await response.json();
        setCities(data);
    }

    const fetchCountries = async () => {
        const response = await fetch(`http://localhost:8080/countries`);
        const data = await response.json();
        setCountries(data);
    }

    const fetchDuas = async () => {
        const response = await fetch(`http://localhost:8080/duas`);
        const data = await response.json();
        setDuas(data);
    }

    const fetchReviews = async () => {
        const response = await fetch(`http://localhost:8080/reviews`);
        const data = await response.json();
        setReviews(data);
    }



    useEffect(() => {
        fetchAttractions();
        fetchCities();
        fetchCountries();
        fetchDuas();
        fetchReviews();
    }, []);

    const countryLoader = ({ params }) => {
        return countries.find(country => {
            return country.id === parseInt(params.countryId);
        });
    }

    const router = createBrowserRouter([
        {
            path: "/",
            element: <Navigation />,
            children: [
                {
                    path: "/",
                    element: <HomeContainer />
                },
                {
                    path: "/itineraries",
                    element: <ItineraryContainer countries={countries} />
                },
                {
                    path: "/countries/:countryId",
                    loader: countryLoader,
                    element: <Country />
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