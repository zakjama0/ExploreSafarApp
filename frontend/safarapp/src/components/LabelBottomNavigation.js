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

export default function LabelBottomNavigation() {
  const [value, setValue] = React.useState('recents');

  const handleChange = (event, newValue) => {
    setValue(newValue);
  };

  return (
    <BottomNavigation sx={{ flexGrow: 1, display: { xs: 'flex', md: 'none'}, bottom: 0, }} value={value} onChange={handleChange}>
      
      <BottomNavigationAction
        label="Favorites"
        value="favorites"
        icon={<FavoriteIcon />}
      />
      <BottomNavigationAction
        label="Duas"
        value="duas"
        icon={<LocalLibraryIcon />}
      />
      <BottomNavigationAction
        label="Itinerary"
        value="itinerary"
        icon={<LanguageIcon />}
      />
      <BottomNavigationAction 
      label="Mosque" 
      value="mosque" 
      icon={<MosqueIcon />} />

    <BottomNavigationAction
        label="Food"
        value="food"
        icon={<RestaurantMenuIcon />}
      />
    </BottomNavigation>
  );
}
