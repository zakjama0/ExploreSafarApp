
import React, {useState, useEffect} from 'react'
import {getPrayerData} from '../SafarPrayer/prayerApiIndex'

function PrayerTime() {
    const [times, setTimes] =useState([])
    useEffect(() =>{
        getPrayerData().then((data) =>{
            console.log('Returned Data;', data.data.timings);
            setTimes(data.data.timings)
            console.log("Timings =", times)
        })
    }, [])
  return (
    <>

    <h1>Prayer Times for Brisbane, Australia:</h1>


    <h3>Fajr: {times.Fajr}</h3>
    <h3>Dhuhr: {times.Dhuhr}</h3>
    <h3>Asr: {times.Asr}</h3>
    <h3>Maghrib: {times.Maghrib}</h3>
    <h3>Last third of the night: {times.Lastthird}</h3>
    </>
  )
}

export default PrayerTime