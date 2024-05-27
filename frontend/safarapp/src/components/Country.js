import { Box } from "@mui/material";
import { useLoaderData } from "react-router-dom";
import Card from "./Card";
import { useEffect, useState } from "react";
import FeaturedAttractionList from "./FeaturedAttractionList";

const Country = ({ }) => {

    const [attractions, setAttractions] = useState([]);
    const country = useLoaderData();

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
            <Box>
                <h5 class="mb-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white pl-10">Top Things To Do:</h5>
                <FeaturedAttractionList attractions={attractions.slice(0, 3)} />
                {/* <Card name={attractions[0].name} image={attractions[0].image} />
                <Card name={attractions[1].name} image={attractions[1].image} />
                <Card name={attractions[2].name} image={attractions[2].image} /> */}
            </Box>
        </>
    );
}

export default Country;