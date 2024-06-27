import { useContext } from "react";
import { Context } from "./MainContainer";
import { useLoaderData } from "react-router-dom";
import PlannedAttractionList from "./../components/PlannedAttractionList";
import { Box } from "@mui/material";

const MyItineraryContainer = () => {

    const { isLoggedIn } = useContext(Context);
    const itinerary = useLoaderData();

    return (
        <div className=' bg-[#d2dbd8] h-full min-h-screen dark:bg-slate-800 dark:text-white w-full'>
            {isLoggedIn ?
                <Box>
                    <h1 className="py-5 mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800 ">{itinerary.name}</h1>
                    <h3 className="py-5 mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800 ">{itinerary.startDate} - {itinerary.endDate}</h3>
                    <PlannedAttractionList
                        plannedAttractions={itinerary.plannedAttractions}
                    />
                </Box>
                :
                <h1>WE NOT HERE</h1>
            }
        </div>
    )

}

export default MyItineraryContainer;