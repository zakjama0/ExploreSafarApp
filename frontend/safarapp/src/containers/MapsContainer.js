import React, {useState, useEffect} from 'react'
import { CssBaseline, Grid } from '@mui/material'
import Search from '../components/SafarMap/Header/Search'
import List from '../components/SafarMap/List/List'
import Map from '../components/SafarMap/Maps/Map'
import { getPlacesData } from '../components/SafarMap/apiIndex'
const MapsContainer = () => {
    const [places, setPlaces] = useState([])
    const [coordinates, setCoordinates] = useState([])



    useEffect(() => {
      navigator.geolocation.getCurrentPosition(({ coords: { latitude, longitude } }) => {
        setCoordinates({ lat: latitude, lng: longitude });
      });
    }, []);

    // useEffect(() => {
    //   console.log(coordinates)
    //   getPlacesData({coordinates}).then((data) => {
    //     console.log('Returned data:', data.results);
    //     setPlaces(data.results)
    //   });
    // }, [coordinates]);


  return (
    <div className='h-screen dark:bg-slate-800 dark:text-white w-full'>
        <CssBaseline/>
        <div>
          <Search />
        </div>
       
        <Grid container spacing={3} style={{width:'100%'}}>
          <Grid item xs={12} md={4}>
          <List places ={places} />
          </Grid>
          <Grid item xs={12} md={8}>
          <Map 
          setCoordinates={setCoordinates}
          coordinates={coordinates}/>
          </Grid>
        </Grid>
    </div>
  )
}

export default MapsContainer