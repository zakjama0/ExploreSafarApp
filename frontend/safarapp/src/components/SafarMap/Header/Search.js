import React, {useState} from 'react';
import { Autocomplete } from '@react-google-maps/api';
import { AppBar, Toolbar, Typography, InputBase, Box } from '@mui/material';
import SearchIcon from '@material-ui/icons/Search';
import useStyles from './styles.js';
const Search = ({setCoordinates}) => {
    const classes = useStyles();
    const [autocomplete, setAutocomplete] = useState(null);
    const onLoad = (autocomplete) => setAutocomplete(autocomplete);

    const onPlaceChanged = () =>{
      const lat = autocomplete.getPlace().geometry.location.lat();
      const lng = autocomplete.getPlace().geometry.location.lng();
      setCoordinates({lat, lng});
    }
  return (
    <div>
        <Autocomplete onLoad={onLoad} onPlaceChanged={onPlaceChanged}>
            <div className={classes.search}>
              <div className={classes.searchIcon}>
                <SearchIcon />
              </div>
              <InputBase placeholder="Search…" classes={{ root: classes.inputRoot, input: classes.inputInput }} />
            </div>
          </Autocomplete>
    </div>
  )
}

export default Search