import * as React from 'react';
import BottomNavigation from '@mui/material/BottomNavigation';
import BottomNavigationAction from '@mui/material/BottomNavigationAction';
import FolderIcon from '@mui/icons-material/Folder';
import RestoreIcon from '@mui/icons-material/Restore';
import FavoriteIcon from '@mui/icons-material/Favorite';
import LocationOnIcon from '@mui/icons-material/LocationOn';
import LanguageIcon from '@mui/icons-material/Language';
import RestaurantMenuIcon from '@mui/icons-material/RestaurantMenu';
import MosqueIcon from '@mui/icons-material/Mosque';
import LocalLibraryIcon from '@mui/icons-material/LocalLibrary';
import { Home } from 'lucide-react';
import { Link } from 'react-router-dom';

export default function LabelBottomNavigation() {
  const [value, setValue] = React.useState('recents');

  const handleChange = (event, newValue) => {
    setValue(newValue);
  };

  return (
    <BottomNavigation sx={{ bgcolor: '#1E293B',flexGrow: 1, display: { xs: 'flex', md: 'none'}, bottom: 0, position:'fixed', width:'100%'}} value={value} onChange={handleChange}>
      
      <BottomNavigationAction
        label="Home"
        value="home"
        icon={<Home className='text-white' 
        />}
      />
      <BottomNavigationAction
        label="Duas"
        value="duas"
        icon={<LocalLibraryIcon className='text-white' />}
      />
      <BottomNavigationAction
        label="Itinerary"
        value="itinerary"
        icon={<LanguageIcon className='text-white'/>}
      />
      <BottomNavigationAction 
      label="Mosque" 
      value="mosque" 
      icon={<MosqueIcon  className='text-white'/>} />

    <BottomNavigationAction
        label="Food"
        value="food"
        icon={<RestaurantMenuIcon className='text-white' />}
      />
    </BottomNavigation>
  );
}
