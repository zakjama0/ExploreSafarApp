import { useEffect, useState } from "react";
import LabelBottomNavigation from "../components/LabelBottomNavigation";
import Navigation from "../components/ResponsiveAppBar";

const HomeContainer = () => {

    const [attractions, setAttraction] = useState([]);

    const fetchAttractions = async () => {
        const response = await fetch('http://localhost:8080/attractions');
        const data = await response.json();
        setAttraction(data);
    }

    useEffect(() => {
        fetchAttractions();
    }, []);

    return (  <>
    <h1>This is the Home Container</h1>
    
    </>);
}
 
export default HomeContainer;