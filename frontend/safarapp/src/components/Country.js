import { Box } from "@mui/material";
import { useLoaderData } from "react-router-dom";
import Card from "./Card";
import { useEffect, useState } from "react";
import FeaturedAttractionList from "./FeaturedAttractionList";
import AttractionList from "./AttractionList";

const Country = ({ cities, postPlannedAttraction }) => {

    const [attractions, setAttractions] = useState([]);
    const country = useLoaderData();
    const filteredCities = cities.filter(city => city.country.name === country.name);

    const fetchAttractionsByCountry = async (countryId) => {
        const response = await fetch(`http://localhost:8080/attractions/country/${countryId}`);
        const data = await response.json();
        setAttractions(data);
    }

    useEffect(() => {
        fetchAttractionsByCountry(country.id);
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
                <FeaturedAttractionList attractions={attractions.slice(0, 3)} postPlannedAttraction={postPlannedAttraction} />
            </Box>
            <Box sx={{ p: 3 }}>
                <AttractionList cities={filteredCities} postPlannedAttraction={postPlannedAttraction} />
            </Box>
        </>
    );
}

export default Country;