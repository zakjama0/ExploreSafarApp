import React from 'react'
import axios from 'axios'

const URL = 'https://map-places.p.rapidapi.com/nearbysearch/json';

  
export const getPlacesData = async ({coordinates}) => {
      try {
        const {data: data} = await axios.get(URL, {
            params: {
              location: `${coordinates.lat},${coordinates.lng}`,
              radius: '1500',
              keyword: 'halal',
              type: 'restaurant'
            },
            headers: {
              'x-rapidapi-key': "b12c3ae6c3msh51f7af4304e6c46p17ae41jsn4f6ae070f0a2", // Ensure your key is set in the environment variables
              'x-rapidapi-host': 'map-places.p.rapidapi.com'
            }
          });

        // console.log('Full response:', response); // Log the full response to see its structure
        // const { data } = response;
        // console.log('Data:', data); // Log the data to see if it contains the expected properties
        return data; // Adjust based on the actual structure of the response
      } catch (error) {
        console.error('Error fetching data:', error);
        return []; // Return an empty array or handle the error as needed
      }
    };


