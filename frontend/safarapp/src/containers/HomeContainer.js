import { useEffect, useState } from "react";
import LabelBottomNavigation from "../components/LabelBottomNavigation";
import Navigation from "../components/ResponsiveAppBar";

const HomeContainer = () => {

    const [countries, setCountries] = useState([]);

    const fetchCountries = async () => {
        const response = await fetch(`http://localhost:8080/countries`);
        const data = await response.json();
        setCountries(data);
    }
    
    

    useEffect(() =>{
        fetchCountries();
    }, [])

    return (  <>
    <h1>This is the Home Container</h1>
    
    </>);
}
 
export default HomeContainer;