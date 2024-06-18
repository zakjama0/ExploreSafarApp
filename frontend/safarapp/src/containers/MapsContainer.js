import React, {useState, useEffect} from 'react'
import { CssBaseline, Grid } from '@mui/material'
import Search from '../components/SafarMap/Header/Search'
import List from '../components/SafarMap/List/List'
import Map from '../components/SafarMap/Maps/Map'
import { getPlacesData } from '../components/SafarMap/apiIndex'
import PropTypes from 'prop-types';
import Tabs from '@mui/material/Tabs';
import Tab from '@mui/material/Tab';
import Typography from '@mui/material/Typography';
import Box from '@mui/material/Box';
import { styled } from '@mui/material/styles';
import { TextField } from '@mui/material';
import DuaCard from '../components/DuaCard';
import PrayerTime from '../components/SafarPrayer/PrayerTime'


const CustomTab = styled((props) => <Tab disableRipple {...props} />)(({ theme }) => ({
  textTransform: 'none',
  minWidth: 0,
  [theme.breakpoints.up('sm')]: {
    minWidth: 0,
  },
  fontWeight: theme.typography.fontWeightRegular,
  marginRight: theme.spacing(1),
  color: 'rgba(0, 0, 0, 0.85)',
  fontFamily: [
    "Montserrat",
    'sans-serif',
  ].join(','),
  '&:hover': {
    color: '#40a9ff',
    opacity: 1,
  },
  '&.Mui-selected': {
    color: '#1890ff',
    fontWeight: theme.typography.fontWeightMedium,
  },
  '&.Mui-focusVisible': {
    backgroundColor: '#d1eaff',
  },
}));

function CustomTabPanel(props) {
  const { children, value, index, ...other } = props;

  return (
    <div
      role="tabpanel"
      hidden={value !== index}
      id={`simple-tabpanel-${index}`}
      aria-labelledby={`simple-tab-${index}`}
      {...other}
    >
      {value === index && (
        <Box sx={{ p: 3 }}>
          <Typography>{children}</Typography>
        </Box>
      )}
    </div>
  );
}

CustomTabPanel.propTypes = {
  children: PropTypes.node,
  index: PropTypes.number.isRequired,
  value: PropTypes.number.isRequired,
};
function a11yProps(index) {
  return {
    id: `simple-tab-${index}`,
    'aria-controls': `simple-tabpanel-${index}`,
  };}


const MapsContainer = () => {
  const [value, setValue] = useState(0);
    const [places, setPlaces] = useState([])

    const [childClicked, setChildClicked] = useState(null);

    const [coordinates, setCoordinates] = useState([])
    const [category, setCategory] = useState("TRAVEL_DUA");

    const [isLoading, setisLoading] = useState(false);

    useEffect(() => {
      navigator.geolocation.getCurrentPosition(({ coords: { latitude, longitude } }) => {
        setCoordinates({ lat: latitude, lng: longitude });
      });
    }, []);

    useEffect(() => {
      setisLoading(true)
      console.log(coordinates)
      getPlacesData({coordinates}).then((data) => {
        console.log('Returned data:', data.results);
        setPlaces(data.results)
        setisLoading(false);
      });
    }, [coordinates]);
   
    const valueToCategory = {
      0: "TRAVEL_DUA",
      1: "TRAVEL_ETIQUETTE",
    }
  
    const handleTabChange = (event, newValue) => {
      setValue(newValue);
      setCategory(valueToCategory[newValue]);
    };
  return (
    <div className='h-screen bg-[#d2dbd8] dark:bg-slate-800 dark:text-white w-full'>
        <CssBaseline/>
        <div>
          <Search />
        </div>
       
        <Grid container spacing={3} style={{width:'100%'}}>
          <Grid item xs={12} md={4}>
          <div className='h-full'>
          <Box>
            <Tabs className='mx-auto' sx={{ width: 4 / 5 }} value={value} onChange={handleTabChange} variant='fullWidth' aria-label="basic tabs example">
              <CustomTab label="Food" {...a11yProps(0)} className='dark:text-white' />
              <CustomTab label="Masjids" {...a11yProps(1)} className='dark:text-white' />
              <CustomTab label="Prayer Time" {...a11yProps(2)} className='dark:text-white' />
            </Tabs>
          </Box>
          <CustomTabPanel value={value} index={0} >
          <h1 className='text-center text-xl'>Halal food in Hanoi, Vietnam</h1>
          <List 
          places ={places} 
          childClicked={childClicked}
          isLoading ={isLoading}
          />
          </CustomTabPanel>
          <CustomTabPanel value={value} index={1}>
          <PrayerTime/>
          </CustomTabPanel>
          <CustomTabPanel value={value} index={2}>
          <h1> Not available in Beta</h1>
          </CustomTabPanel>
        </div>
          
          </Grid>
          <Grid item xs={12} md={8}>
          <Box
      sx={{
        width: '100%',
        height: '500px', // Adjust height as needed
        '@media (min-width: 600px)': {
          height: '100%', // Height for larger screens
        },
        borderRadius: '10px',
        overflow: 'hidden',
        boxShadow: 3,
        marginLeft: '10px',
      }}
    >
      <Map 
          setCoordinates={setCoordinates}
          coordinates={coordinates}
          places={places}
          setChildClicked={setChildClicked}/>
    </Box>
          
          </Grid>
        </Grid>
    </div>
  )
}

export default MapsContainer