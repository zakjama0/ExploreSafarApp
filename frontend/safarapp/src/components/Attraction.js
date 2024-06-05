import { useLoaderData } from "react-router-dom";
import React, { useEffect, useState }from 'react';
import { Box, Button, Collapse, IconButton, Typography, Card, CardContent } from '@mui/material';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import { CssBaseline, Grid } from '@mui/material'
import AccessTimeIcon from '@mui/icons-material/AccessTime';
import EditIcon from '@mui/icons-material/Edit';
import Popup from 'reactjs-popup';
import AddPlan from "./AddPlan";
import ReviewList from "./ReviewList";
import ReviewForm from "./ReviewForm";

const Attraction = ({ postReview, deleteReview, editReview }) => {
    const attraction = useLoaderData();
    const [expanded, setExpanded] = useState(false);
  
    const handleExpandClick = () => {
      setExpanded(!expanded);
    };

    useEffect(() =>{
        console.log(attraction)
    },[])
  return (
    <div className="h-full pb-60 bg-[#d2dbd8] dark:bg-slate-800 dark:text-white w-full">
            <div
            className="block w-full bg-white bg-cover p-20 shadow-lg dark:bg-neutral-700"
            style={{
                backgroundImage: `url(${attraction.image})`,
                backgroundSize: 'cover',
                backgroundPosition: 'center',
            }}
            >
            <h1 className="font-bold italic text-3xl md:text-6xl text-slate-200  text-center">{attraction.name}</h1>
    </div>

    <Grid container spacing={3} style={{width:'100%'}}>
    <Grid item xs={12} md={4} style={{ marginTop:'20px'}}>
    <div className="ml-6 max-w-sm mx-auto my-4 shadow-lg rounded-lg overflow-hidden">
      <div className="px-6 py-4 ">
        <h2 className="text-2xl font-bold mb-2 text-center">About</h2>
        <p className={`text-gray-700 dark:text-white text-base ${expanded ? '' : 'line-clamp-3'}`}>
        {attraction.description}
        </p>
        <Button
          size="small"
          endIcon={<ExpandMoreIcon />}
          onClick={handleExpandClick}
        >
          {expanded ? 'Read less' : 'Read more'}
        </Button>
      </div>
      <div className="bg-gray-100 px-6 py-4 flex-row justify-between items-center border-t border-gray-200">
        <div>
          <p className="text-gray-900 text-lg font-bold">Interested?</p>
          <p className="text-gray-600 text-sm">Add this to your plan by a simple click</p>
        </div>
        <Popup trigger=
                                        {<button className='py-2 px-3 border rounded-md bg-gradient-to-r from-blue-500 to-blue-800 dark:text-white'>Add to your itinerary</button>}
                                        modal nested>
                                        {
                                            close => (
                                                <div className='modal'>
                                                    <div className='review-form'>
                                                        <AddPlan />
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
      </div>
         </div>
          
          </Grid>
        <Grid item xs={12} md={8}>
          <div className="ml-4">
        <h2 className="text-2xl font-bold my-2 text-center mb-5">Reviews</h2>
        <p className="text-gray-900 dark:text-white text-lg font-bold mb-3">Average Rating:</p>
        <Popup trigger=
                                        {<button className='py-2 px-3 mb-3 border rounded-md bg-gradient-to-r from-blue-500 to-blue-800 dark:text-white'>Create a review</button>}
                                        modal nested>
                                        {
                                            close => (
                                                <div className='modal'>
                                                    <div className='review-form'>
                                                    <ReviewForm attractionId ={attraction.id} postReview={postReview}/>
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
        
        <ReviewList reviews={attraction.reviews} deleteReview={deleteReview} editReview={editReview}/>
        </div>
        </Grid>
        </Grid>


    
    </div>
  )
}

export default Attraction