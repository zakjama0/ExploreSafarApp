import Morocco from '../assests/Morocco.jpeg'
import { useState } from 'react';
import Card from '../components/Card';
const ItineraryContainer = ({ countries }) => {


    const [continent, setContinent] = useState("EUROPE"); // Set as Europe for testing purposes

    // const filteredCountries = countries.filter(country => continent == country.continent);

    // const renderCountryCards = () => {
    //     return filteredCountries.map((country, index) => {
    //         <Card name={country.name} picture={country.image}/>
    //     })
    // }

    return ( <>
    {/* {renderCountryCards()} */}
    <Card picture={Morocco} name = "Morocco" />
    </> );
}
 
export default ItineraryContainer;