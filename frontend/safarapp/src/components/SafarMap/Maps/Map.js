import React, { useState } from 'react';
import GoogleMapReact from 'google-map-react';
import { Paper, Typography, useMediaQuery } from '@material-ui/core';
import LocationOnOutlinedIcon from '@material-ui/icons/LocationOnOutlined';
import Rating from '@material-ui/lab/Rating';
import Logo from '../../../assests/logoname.png';
import useStyles from './styles.js';

const getPhotoUrl = (photoReference) => {
  return `https://maps.googleapis.com/maps/api/place/photo?maxwidth=3264&maxheight=1837&photoreference=${photoReference}&key=AIzaSyD5OAaC5LrjisDtQOlgnXAoaWvbvGguVIc`;
};

const Map = ({ setCoordinates, coordinates, places, setBounds, setChildClicked }) => {
  const classes = useStyles();
  const isDesktop = useMediaQuery('(min-width:600px)');

  return (
    <div className={classes.mapContainer}>
      <GoogleMapReact
        bootstrapURLKeys={{ key: 'AIzaSyD5OAaC5LrjisDtQOlgnXAoaWvbvGguVIc' }}
        defaultCenter={coordinates}
        center={coordinates}
        defaultZoom={14}
        onChange={(e) => {
          setCoordinates({ lat: e.center.lat, lng: e.center.lng });
          setBounds({ ne: e.marginBounds.ne, sw: e.marginBounds.sw });
        }}
        onChildClick={(child) => {
          setChildClicked(child);
        }}
      >
        {places?.map((place, i) => (
          <div
            className={classes.markerContainer}
            lat={Number(place.geometry.location.lat)}
            lng={Number(place.geometry.location.lng)}
            key={i}
          >
            
          </div>
        ))}
      </GoogleMapReact>
    </div>
  );
};

export default Map;



// const APIKEY = 'AIzaSyD5OAaC5LrjisDtQOlgnXAoaWvbvGguVIc';