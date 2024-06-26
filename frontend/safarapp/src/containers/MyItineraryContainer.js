import { useContext, useEffect, useState } from "react";
import { Context, apiUrl } from "./MainContainer";
import ItineraryList from "../components/ItineraryList";
import { Box } from "@mui/material";

const MyItineraryContainer = () => {

    const { isLoggedIn } = useContext(Context);

    const [itineraries, setItineraries] = useState([]);

    const fetchItinerariesByUser = async () => {
        try {
            const response = await fetch(`http://${apiUrl}/itineraries/user`, {
                method: "GET",
                headers: {
                    "Content-Type": "application/json",
                    "Authorization": `Bearer ${sessionStorage.getItem("access_token")}`
                }
            });

            if (!response.ok) {
                if (response.status === 403) {
                    throw new Error("Must be signed in");
                }
            }

            const data = await response.json();
            setItineraries(data);
        } catch (error) {

        }
    }

    useEffect(() => {
        fetchItinerariesByUser();
    }, [sessionStorage]);


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

export default MyItineraryContainer;