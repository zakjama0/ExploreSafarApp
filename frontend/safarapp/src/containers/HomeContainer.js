import { useEffect, useState } from "react";
import LabelBottomNavigation from "../components/LabelBottomNavigation";
import Navigation from "../components/ResponsiveAppBar";
import Card from "../components/Card";
import ItineraryContainer from "./ItineraryContainer";
import CountryList from "../components/CountryList";
import BentoGrid from "../components/BentoGrid";

const HomeContainer = () => {

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
    


    useEffect(() =>{
        fetchAttractions();
        fetchCities();
        fetchCountries();
        fetchDuas();
        fetchReviews();
    }, [])

    return (  <>
    <BentoGrid/>
    <ItineraryContainer countries={countries}/>
    </>);
}
 
export default HomeContainer;