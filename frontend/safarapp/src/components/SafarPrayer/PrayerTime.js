import React, { useState, useEffect } from 'react';
import { getPrayerData } from '../SafarPrayer/prayerApiIndex';

function PrayerTime() {
    const [times, setTimes] = useState({});
    const [city, setCity] = useState('Brisbane');
    const [country, setCountry] = useState('Australia');
    const [searchParams, setSearchParams] = useState({ city: 'Brisbane', country: 'Australia' });

    useEffect(() => {
        getPrayerData(searchParams.city, searchParams.country).then((data) => {
            if (data && data.data && data.data.timings) {
                console.log('Returned Data:', data.data.timings);
                setTimes(data.data.timings);
            }
        }).catch(error => {
            console.error('Error fetching data:', error);
        });
    }, [searchParams]);

    const handleSearch = () => {
        setSearchParams({ city, country });
    };

    return (
        <>
            <h1 className='mb-3 text-xl text-bold'>Prayer Times for {searchParams.city}, {searchParams.country}:</h1>
            <div className='flex flex-col items-center '>
                <label className='my-2'>
                    City:
                    <input 
                        type="text" 
                        value={city} 
                        onChange={(e) => setCity(e.target.value)} 
                    />
                </label>
                <label className='mb-2 '>
                    Country:
                    <input 
                        type="text" 
                        value={country} 
                        onChange={(e) => setCountry(e.target.value)} 
                    />
                </label>
                
                <button className='py-2 px-3 border text-white rounded-md bg-gradient-to-r from-blue-500 to-blue-800 dark:text-white' onClick={handleSearch}>Get Prayer Times</button>
            </div>

            <h3>Fajr: {times.Fajr}</h3>
            <h3>Dhuhr: {times.Dhuhr}</h3>
            <h3>Asr: {times.Asr}</h3>
            <h3>Maghrib: {times.Maghrib}</h3>
            <h3>Last third of the night: {times.Lastthird}</h3>
        </>
    );
}

export default PrayerTime;
