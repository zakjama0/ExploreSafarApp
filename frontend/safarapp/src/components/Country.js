import { Box } from "@mui/material";
import { useLoaderData } from "react-router-dom";
import Card from "./Card";
import { useEffect, useState } from "react";
import FeaturedAttractionList from "./FeaturedAttractionList";
import AttractionList from "./AttractionList";

import { apiUrl } from "../containers/MainContainer";

const Country = ({ cities, postPlannedAttraction }) => {

    const [attractions, setAttractions] = useState([]);
    const [itineraries, setItineraries] = useState([]);
    const country = useLoaderData();
    const filteredCities = cities.filter(city => city.country.name === country.name);

    const fetchAttractionsByCountry = async (countryId) => {
        const response = await fetch(`http://localhost:8080/attractions/country/${countryId}`);
        const data = await response.json();
        setAttractions(data);
    }

    const fetchItinerariesByUser = async () => {
        try {
            const response = await fetch(`http://${apiUrl}/planned-attractions`, {
                method: "GET",
                headers: {
                    "Content-Type": "application/json",
                    "Authorization": `Bearer ${sessionStorage.getItem("access_token")}`
                }
            });
            if (!response.ok) {
                if (response.status === 403) {
                    alert("Must be signed in");
                    throw new Error("Must be signed in");
                }
            }
            const data = await response.json();
            setItineraries(data);
        } catch (error) {

        }
    }

    useEffect(() => {
        fetchAttractionsByCountry(country.id);
        fetchItinerariesByUser();
    }, []);

    return (
        <>
            <Box sx={{ width: '100%' }}>
                <div className="flex justify-center">
                    <Card name={country.name} image={country.image} />
                </div>
            </Box>
            <Box sx={{ p: 3 }}>
                <h5 class="mb-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white pl-10">Top Things To Do:</h5>
                <FeaturedAttractionList
                    attractions={attractions.slice(0, 3)}
                    postPlannedAttraction={postPlannedAttraction}
                    itineraries={itineraries}
                />
            </Box>
            <Box sx={{ p: 3 }}>
                <AttractionList
                    cities={filteredCities}
                    postPlannedAttraction={postPlannedAttraction}
                    itineraries={itineraries}
                />
            </Box>
        </>
    );
}

export default Country;