import { useEffect, useState } from 'react';
import CountryList from '../components/CountryList';


import PropTypes from 'prop-types';
import Tabs from '@mui/material/Tabs';
import Tab from '@mui/material/Tab';
import Typography from '@mui/material/Typography';
import Box from '@mui/material/Box';
import { styled } from '@mui/material/styles';
import { TextField } from '@mui/material';

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
  };
}
const ItineraryContainer = ({ countries }) => {
  const [value, setValue] = useState(0);
  const [continent, setContinent] = useState("EUROPE");
  const [searchQuery, setSearchQuery] = useState("");
  const [searchedCountries, setSearchedCountries] = useState([]);

  const filteredCountries = countries.filter(country => continent === country.continent);

  const search = (searchQuery => {
    return countries.filter(country => country.name.toLowerCase().includes(searchQuery.toLowerCase()));
  });

  useEffect(() => {
    setSearchedCountries(search(searchQuery));
  }, [searchQuery])

  const valueToContinent = {
    0: "EUROPE",
    1: "ASIA",
    2: "AFRICA",
    3: "NORTH AMERICA",
    4: "SOUTH AMERICA"
  }

  const handleTabChange = (event, newValue) => {
    setValue(newValue);
    setContinent(valueToContinent[newValue]);
  };
  return (<div className=' h-screen dark:bg-slate-800 dark:text-white w-full'>
    <Box sx={{ width: '100%' }}>
      <div className='flex justify-center pt-5'>
      <TextField className="mx-auto"
        id="outlined-basic"
        label="Search Countries"
        variant="outlined"
        onChange={e => {
          setSearchQuery(e.target.value);
        }} />
        </div>
      {searchQuery.trim() === "" ?
        <div>
          <Box>
            <Tabs className='mx-auto' sx={{ width: 4 / 5 }} value={value} onChange={handleTabChange} variant='fullWidth' aria-label="basic tabs example">
              <CustomTab label="Europe" {...a11yProps(0)} className='dark:text-white' />
              <CustomTab label="Asia" {...a11yProps(1)} className='dark:text-white' />
              <CustomTab label="Africa" {...a11yProps(2)} disabled className='dark:text-white' />
              <CustomTab label="North America" {...a11yProps(2)} disabled className='dark:text-white' />
              <CustomTab label="South America" {...a11yProps(2)} disabled className='dark:text-white' />
            </Tabs>
          </Box>
          <CustomTabPanel value={value} index={0} >
            <CountryList countries={filteredCountries} />
          </CustomTabPanel>
          <CustomTabPanel value={value} index={1}>
            <CountryList countries={filteredCountries} />
          </CustomTabPanel>
        </div>
        :
        <CountryList countries={searchedCountries} />
      }
    </Box>
  </div>
  );
}


export default ItineraryContainer;
