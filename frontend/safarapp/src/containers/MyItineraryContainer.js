import { useContext } from "react";
import { Context } from "./MainContainer";
import { useLoaderData } from "react-router-dom";
import PlannedAttractionList from "./../components/PlannedAttractionList";

const MyItineraryContainer = () => {

    const { isLoggedIn } = useContext(Context);
    const itinerary = useLoaderData();

    return (
        <>
        <PlannedAttractionList plannedAttractions={itinerary.plannedAttractions} />
        </>
    )

}

export default MyItineraryContainer;