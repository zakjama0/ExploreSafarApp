import React from 'react'
import axios from 'axios'

const URL = 'https://map-places.p.rapidapi.com/nearbysearch/json';


const options = {
    params: {
      location: '51.52478613001649, -0.13755916092148784',
      radius: '1500',
      keyword: 'halal',
      type: 'restaurant'
    },
    headers: {
      'x-rapidapi-key': "312917582fmsh44ae633e94bb69ap18d3fajsn8617488ed8c7", // Ensure your key is set in the environment variables
      'x-rapidapi-host': 'map-places.p.rapidapi.com'
    }
  };
  
 
  
export const getPlacesData = async () => {
      try {
        const {data: data} = await axios.get(URL, options);

        // console.log('Full response:', response); // Log the full response to see its structure
        // const { data } = response;
        // console.log('Data:', data); // Log the data to see if it contains the expected properties
        return data; // Adjust based on the actual structure of the response
      } catch (error) {
        console.error('Error fetching data:', error);
        return []; // Return an empty array or handle the error as needed
      }
    };


