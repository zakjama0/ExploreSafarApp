import { useContext } from "react";
import { Context } from "./MainContainer";
import ItineraryList from "../components/ItineraryList";
import { Box } from "@mui/material";

const MyItineraryListContainer = ( { fetchItinerariesByUser } ) => {

    fetchItinerariesByUser();

    const { isLoggedIn, itineraries } = useContext(Context);

    return (
        <div className=' bg-[#d2dbd8] h-full min-h-screen dark:bg-slate-800 dark:text-white w-full'>
            {
                isLoggedIn ?
                    <Box>
                        <h1 className="py-5 mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800 ">Your Plan</h1>
                        <ItineraryList itineraries={itineraries} />
                    </Box>
                    :
                    <h1>WE NOT HERE</h1>
            }
        </div>
    )
}

export default MyItineraryListContainer;