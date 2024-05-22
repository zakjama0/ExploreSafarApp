import Morocco from '../assests/Morocco.jpeg'
import React from 'react';
import { useState } from 'react';
import Card from '../components/Card';
import CountryList from '../components/CountryList';


import PropTypes from 'prop-types';
import Tabs from '@mui/material/Tabs';
import Tab from '@mui/material/Tab';
import Typography from '@mui/material/Typography';
import Box from '@mui/material/Box';

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
    };
  }
const ItineraryContainer = ({ countries }) => {
    const [value, setValue] = React.useState(0);

    const handleChange = (event, newValue) => {
      setValue(newValue);
    };

    const [continent, setContinent] = useState("EUROPE"); // Set as Europe for testing purposes

    const filteredCountries = countries.filter(country => continent == country.continent);
    
    return ( <>
    <Card picture={Morocco} name = "Morocco" />
    <Box sx={{ width: '100%' }}>
      <Box sx={{ borderBottom: 1, borderColor: 'divider' }}>
        <Tabs value={value} onChange={handleChange}  aria-label="basic tabs example">
          <Tab label="Europe" {...a11yProps(0)}/>
          <Tab label="Asia" {...a11yProps(1)} />
          <Tab label="Africa" {...a11yProps(2)} disabled/>
          <Tab label="North America" {...a11yProps(2)} disabled/>
          <Tab label="South America" {...a11yProps(2)} disabled/>
        </Tabs>
      </Box>
      <CustomTabPanel value={value} index={0} >
      <CountryList countries={filteredCountries} />
      </CustomTabPanel>
      <CustomTabPanel value={value} index={1}>
      <CountryList countries={filteredCountries} />
      </CustomTabPanel>
      <CustomTabPanel value={value} index={2}>
        Item Three
      </CustomTabPanel>
    </Box>

    </> );
}

        
export default ItineraryContainer;
