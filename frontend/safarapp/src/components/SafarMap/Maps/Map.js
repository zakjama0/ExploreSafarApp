import React from 'react';
import GoogleMapReact from 'google-map-react';
import { Paper, Typography, useMediaQuery } from '@material-ui/core';
import LocationOnOutlinedIcon from '@material-ui/icons/LocationOnOutlined';
import Rating from '@material-ui/lab/Rating';
import Logo from '../../../assests/logoname.png'


import useStyles from './styles.js';


const getPhotoUrl = (photoReference) => {
  return `https://maps.googleapis.com/maps/api/place/photo?maxwidth=3264&maxheight=1837&photoreference=${photoReference}&key=AIzaSyD5OAaC5LrjisDtQOlgnXAoaWvbvGguVIc`;
};

const Map = ({setCoordinates, coordinates, places}) => {
  const classes = useStyles();
  const isDesktop = useMediaQuery('(min-width:600px)');
  // const coordinates = {lat:0, lng:0}
  
  return (
    <div className={classes.mapContainer}>
      <GoogleMapReact
      bootstrapURLKeys={{key:'AIzaSyD5OAaC5LrjisDtQOlgnXAoaWvbvGguVIc'}}
      defaultCenter={coordinates}
      center={coordinates}
      defaultZoom={14}
      margin={[50,50,50,50]}
      options={""}
      onChange={(e) =>{
        setCoordinates({lat:e.center.lat, lng: e.center.lng})
      }}
      onChildClick={""}
      >
        {places?.map((place, i) =>(
          <div
          className={classes.markerContainer}
          lat={Number(place.geometry.location.lat)}
          lng={Number(place.geometry.location.lng)}
          key={i}
          >
            {
              !isDesktop? (
                <LocationOnOutlinedIcon color="primary" fontSize='large'/>
              ) : (
                <Paper elevation={3} className={classes.paper}>
                  <Typography className={classes.typography} variant='subtitle2' gutterBottom>
                    {place.name}
                  </Typography>
                  <img className={classes.pointer} 
                  src={place.photos && place.photos.length > 0 ? getPhotoUrl(place.photos[0].photo_reference) : {Logo} } 
                  alt={place.name}
                  />
                  <Rating size="small" value={Number(place.rating)} readOnly />
                </Paper>
              )
            }
          </div>
        ))}
      </GoogleMapReact>
    </div>
  )
}

export default Map