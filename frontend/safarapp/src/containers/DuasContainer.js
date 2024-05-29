import React from 'react'
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
const DuasContainer = ({duas}) => {
    const [value, setValue] = useState(0);
  const [category, setCategory] = useState("TRAVEL_DUA");
  const [searchQuery, setSearchQuery] = useState("");
  const [searchedDuas, setSearchedDuas] = useState([]);

  const filteredDuas = duas.filter(dua => category === dua.categroy);
  const search = (searchQuery => {
    return duas.filter(dua => dua.name.toLowerCase().includes(searchQuery.toLowerCase()));
  });

  useEffect(() => {
    setSearchedDuas(search(searchQuery));
  }, [searchQuery])

  const valueToCategory = {
    0: "TRAVEL_DUA",
    1: "TRAVEL_ETIQUETTE",
    2: "MORNING",
    3: "EVENING",
  }

  const handleTabChange = (event, newValue) => {
    setValue(newValue);
    setCategory(valueToCategory[newValue]);
  };

  return (
    <div className=' h-screen dark:bg-slate-800 dark:text-white w-full'>
    <div className='flex-row justify-center items-center'>
    <h1 className="py-5  mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800 ">Duas & Dhikr</h1>
    {/* <h1 className='mb-5 mx-5 md:mx-20 text-lg text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800'> قُلْ سِيرُوا۟ فِى ٱلْأَرْضِ فَٱنظُرُوا۟ كَيْفَ بَدَأَ ٱلْخَلْقَ ۚ ثُمَّ ٱللَّهُ يُنشِئُ ٱلنَّشْأَةَ ٱلْـَٔاخِرَةَ ۚ إِنَّ ٱللَّهَ عَلَىٰ كُلِّ شَىْءٍ قَدِيرٌ </h1> */}
    <h1 className='mb-5 mx-5 md:mx-20 md:text-lg text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800'> Say (O Muhammad): ‘Travel throughout the land and see how He originated the creation, then Allah will bring it into being one more time. Surely Allah is Most Capable of everything.’</h1>
    <h1 className='mb-5 text-lg text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800'>(Surah Al-Ankabut, 29:20)</h1>
    <Box sx={{ width: '100%' }}>
      <div className='flex justify-center pt-5'>
      <TextField className="mx-auto"
        id="outlined-basic"
        label="Search Duas"
        variant="outlined"
        onChange={e => {
          setSearchQuery(e.target.value);
        }} />
        </div>
      {searchQuery.trim() === "" ?
        <div>
          <Box>
            <Tabs className='mx-auto' sx={{ width: 4 / 5 }} value={value} onChange={handleTabChange} variant='fullWidth' aria-label="basic tabs example">
              <CustomTab label="Travel Duas" {...a11yProps(0)} className='dark:text-white' />
              <CustomTab label="Travel Etiquette" {...a11yProps(1)} className='dark:text-white' />
              <CustomTab label="Morning Duas" {...a11yProps(2)} className='dark:text-white' />
              <CustomTab label="Evening" {...a11yProps(3)} className='dark:text-white' />
              
            </Tabs>
          </Box>
          <CustomTabPanel value={value} index={0} >
          <h2>Test 1</h2>
          </CustomTabPanel>
          <CustomTabPanel value={value} index={1}>
          <h2>Test 2</h2>
          </CustomTabPanel>
          <CustomTabPanel value={value} index={2} >
          <h2>Test 3</h2>
          </CustomTabPanel>
          <CustomTabPanel value={value} index={3}>
          <h2>Test 4</h2>
          </CustomTabPanel>
        </div>
        :
        <h2>Test</h2>
      }
    </Box>

    </div>



    </div>
  )
}

export default DuasContainer