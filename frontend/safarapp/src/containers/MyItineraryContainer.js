import { useContext } from "react";
import { Context } from "./MainContainer";
import { useLoaderData } from "react-router-dom";
import PlannedAttractionList from "./../components/PlannedAttractionList";

const MyItineraryContainer = () => {

    const { isLoggedIn } = useContext(Context);
    const itinerary = useLoaderData();

    return (
        <>
        { isLoggedIn ?
            <PlannedAttractionList
                plannedAttractions={itinerary.plannedAttractions}
                startDate={itinerary.startDate}
                endDate={itinerary.endDate}
            />
            :
            <h1>WE NOT HERE</h1>
        }
        </>
    )

}

export default MyItineraryContainer;