import { Box } from "@mui/material";
import { useLoaderData } from "react-router-dom";
import Card from "./Card";
import { useEffect, useState } from "react";
import FeaturedAttractionList from "./FeaturedAttractionList";
import AttractionList from "./AttractionList";

const Country = ({ cities }) => {

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
        <div className="bg-[#d2dbd8] h-full pb-40 dark:bg-slate-800 dark:text-white w-full">
            <div
      className="block w-full bg-white bg-cover p-20 shadow-lg dark:bg-neutral-700"
      style={{
        backgroundImage: `url(${country.image})`,
        backgroundSize: 'cover',
        backgroundPosition: 'center',
      }}
    >
      <h1 className="font-bold italic text-6xl text-slate-200  text-center">{country.name}</h1>

            </div>
            <Box>
                <h5 class=" text-center my-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white pl-10">Top Things To Do:</h5>
                <FeaturedAttractionList attractions={attractions.slice(0, 3)} />
            </Box>
            <Box>
                <AttractionList cities={filteredCities}/>
            </Box>
        </div>
    );
}

export default Country;