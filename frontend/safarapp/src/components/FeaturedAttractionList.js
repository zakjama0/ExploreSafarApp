import { Grid } from "@mui/material";
import { Link } from "react-router-dom";
import Card from "./Card";
import { useEffect, useState } from "react";
import Popup from "reactjs-popup";
import LoginForm from "./LogInForm";
import AddPlannedAttractionForm from "./AddPlannedAttractionForm";

const FeaturedAttractionList = ({ attractions, postPlannedAttraction, itineraries }) => {

    const [isMobile, setIsMobile] = useState(window.innerWidth < 768);

    const handleResize = () => {
        setIsMobile(window.innerWidth < 768);
    };

    useEffect(() => {
        window.addEventListener('resize', handleResize);
        return () => window.removeEventListener('resize', handleResize);
    }, []);

    const attractionsCardsDesktop = attractions.map(attraction => {
        return (
            <Grid key={attraction.id} item>
                <Link to={`/attractions/${attraction.id}`}>
                    <Card name={attraction.name} image={attraction.image} />
                </Link>
                <Popup trigger=
                    {<button className='py-2 px-3 border rounded-md dark:text-white'>Add to Itinerary</button>}
                    modal nested>
                    {
                        close => (
                            <div className='modal'>
                                <div className='review-form'>
                                    <AddPlannedAttractionForm
                                        attractionId={attraction.id}
                                        itineraries={itineraries}
                                        postPlannedAttraction={postPlannedAttraction}
                                    />
                                </div>
                                <div className='flex justify-center items-center'>
                                    <button className="w-[150px] h-[45px] m-[10px] bg-white border-none outline-none rounded-full shadow-md cursor-pointer text-[16px] text-[#5c67c5] font-semibold text-center"
                                        onClick=
                                        {() => close()} >
                                        Close
                                    </button>
                                </div>
                            </div>
                        )
                    }
                </Popup>
            </Grid>
        );
    });

    const attractionsCardsMobile = attractions.map(attraction => {
        return (
            <Grid key={attraction.id} item>
                <Link to={`/attractions/${attraction.id}`}>
                    <Card name={attraction.name} image={attraction.image} />
                </Link>
                <Popup trigger=
                    {<button className='py-2 px-3 border rounded-md dark:text-white'>Add to Itinerary</button>}
                    modal nested>
                    {
                        close => (
                            <div className='modal'>
                                <div className='review-form'>
                                    <AddPlannedAttractionForm
                                        attractionId={attraction.id}
                                        itineraries={itineraries}
                                        postPlannedAttraction={postPlannedAttraction}
                                    />
                                </div>
                                <div className='flex justify-center items-center'>
                                    <button className="w-[150px] h-[45px] m-[10px] bg-white border-none outline-none rounded-full shadow-md cursor-pointer text-[16px] text-[#5c67c5] font-semibold text-center"
                                        onClick=
                                        {() => close()} >
                                        Close
                                    </button>
                                </div>
                            </div>
                        )
                    }
                </Popup>
            </Grid>
        );
    });

    return (
        <>
            <div>
                {isMobile ? (
                    <div>
                        <Grid className="flex justify-center" container rowSpacing={8} columns={1}>
                            {attractionsCardsMobile}
                        </Grid>
                    </div>
                )
                    :
                    (
                        <div>
                            <Grid className="flex justify-center" container spacing={8}>
                                {attractionsCardsDesktop}
                            </Grid>
                        </div>
                    )
                }
            </div>
        </>
    );
}

export default FeaturedAttractionList;