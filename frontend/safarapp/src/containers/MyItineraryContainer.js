import { useContext } from "react";
import { Context } from "./MainContainer";
import { useLoaderData } from "react-router-dom";

const MyItineraryContainer = () => {

    const { isLoggedIn } = useContext(Context);
    const itinerary = useLoaderData();

    return (
        <></>
    )

}

export default MyItineraryContainer;