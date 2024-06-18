import axios from 'axios';

const URL = 'https://prayer-times11.p.rapidapi.com/timingsByCity/%22';


export const getPrayerData = async (city, country) => {
    try {
        const response = await axios.get(URL, {
            params: {
                method: '2',
                city: city,
                country: country
            },
            headers: {
                'x-rapidapi-key': 'b12c3ae6c3msh51f7af4304e6c46p17ae41jsn4f6ae070f0a2',
                'x-rapidapi-host': 'prayer-times11.p.rapidapi.com',
                'Accept': 'application/json'
            }
        });
        return response.data;
    } catch (error) {
        console.error('Error fetching data:', error);
        return null; // Return null or handle the error as needed
    }
};
