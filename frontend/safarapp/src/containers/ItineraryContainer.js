import { useState } from 'react';
import CountryList from '../components/CountryList';


import PropTypes from 'prop-types';
import Tabs from '@mui/material/Tabs';
import Tab from '@mui/material/Tab';
import Typography from '@mui/material/Typography';
import Box from '@mui/material/Box';
import { styled } from '@mui/material/styles';

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
    '-apple-system',
    'BlinkMacSystemFont',
    '"Segoe UI"',
    'Roboto',
    '"Helvetica Neue"',
    'Arial',
    'sans-serif',
    '"Apple Color Emoji"',
    '"Segoe UI Emoji"',
    '"Segoe UI Symbol"',
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
  };
}
const ItineraryContainer = ({ countries }) => {
  const [value, setValue] = useState(0);
  const [continent, setContinent] = useState("EUROPE");

  const filteredCountries = countries.filter(country => continent === country.continent);

  const valueToContinent = {
    0: "EUROPE",
    1: "ASIA",
    2: "AFRICA",
    3: "NORTH AMERICA",
    4: "SOUTH AMERICA"
  }

  const handleChange = (event, newValue) => {
    setValue(newValue);
    setContinent(valueToContinent[newValue]);
  };

  return (<div className='dark:bg-slate-800 w-full'>
    <Box sx={{ width: '100%' }}>
      <Box sx={{ borderBottom: 1, borderColor: 'divider', zIndex: 5 }}>
        <Tabs value={value} onChange={handleChange} aria-label="basic tabs example">
          <CustomTab label="Europe" {...a11yProps(0)} />
          <CustomTab label="Asia" {...a11yProps(1)} />
          <CustomTab label="Africa" {...a11yProps(2)} disabled />
          <CustomTab label="North America" {...a11yProps(2)} disabled />
          <CustomTab label="South America" {...a11yProps(2)} disabled />
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

  </div>);
}


export default ItineraryContainer;
