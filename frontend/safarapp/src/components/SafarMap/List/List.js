import React, { useState, useEffect, createRef } from 'react';
import { CircularProgress, Grid, Typography, InputLabel, MenuItem, FormControl, Select } from '@material-ui/core'
import useStyles from './styles.js';
import PlaceDetails from '../PlaceDetails/PlaceDetails.js'
const List = ({places, childClicked, isLoading}) => {
  const classes = useStyles();
  const [type, setType] =useState('restaurants');
  const [rating, setRating] =useState('');
  const [elRefs, setElrefs] = useState([]);


  useEffect(() => {
    const refs= Array(places?.length).fill().map((_,i) => elRefs[i] || createRef())
    setElrefs(refs)
  }, [places])



  console.log({childClicked})
  return (
    <div className={classes.container}>
      {isLoading?(<div>
        <CircularProgress size="5rem"/>
        </div>)
        :
        (
          <>
      <FormControl className={classes.formControl}>
            <InputLabel id="rating">Rating</InputLabel>
            <Select value={rating} onChange={(e)=> setRating(e.target.value)}>
              <MenuItem value="0">All</MenuItem>
              <MenuItem value="3">Above 3.0</MenuItem>
              <MenuItem value="4">Above 4.0</MenuItem>
              <MenuItem value="4.5">Above 4.5</MenuItem>
            </Select>
      </FormControl>
      <Grid container spacing={3} className={classes.list}>
        {places?.map((place, i) => (
          <Grid item key={i} xs={12}> 
            <PlaceDetails
             place={place}
             selected ={Number(childClicked) === i}
             refProp ={elRefs[i]}
             />
          </Grid>
        ))}
      </Grid>
      </>
        )}
    </div>
  )
}

export default List