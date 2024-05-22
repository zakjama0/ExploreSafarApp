import Morocco from '../assests/Morocco.jpeg'
import { useState } from 'react';
import Card from '../components/Card';
import CountryList from '../components/CountryList';
const ItineraryContainer = ({ countries }) => {


    const [continent, setContinent] = useState("EUROPE"); // Set as Europe for testing purposes

    const filteredCountries = countries.filter(country => continent == country.continent);
    
    return ( <>
    <Card picture={Morocco} name = "Morocco" />
    <CountryList countries={filteredCountries} />
    <CountryList countries={filteredCountries} />
        

    </> );
}
 
export default ItineraryContainer;
