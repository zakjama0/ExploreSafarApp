import React from 'react'
import Logo from '../../../assests/logoname.png'


const getPhotoUrl = (photoReference) => {
    return `https://maps.googleapis.com/maps/api/place/photo?maxwidth=3264&maxheight=1837&photoreference=${photoReference}&key=AIzaSyD5OAaC5LrjisDtQOlgnXAoaWvbvGguVIc`;
  };

  const PlaceDetails = ({ place, selected, refProp }) => {
    
    if(selected) refProp?.current?.scrollIntoView({behaviour:"smooth", block:"start"})


    return (
      <div>
        <div className="max-w-sm rounded overflow-hidden shadow-lg m-4 transition-transform transform hover:-translate-y-2">
      <img 
        src={place.photos && place.photos.length > 0 ? getPhotoUrl(place.photos[0].photo_reference) : {Logo} } 
        alt={place.name} 
        className="w-full h-48 object-cover"
      />
      <div className="px-6 py-4">
        <div className="font-bold text-xl mb-2">{place.name}</div>
        <p className="text-gray-800 dark:text-gray-200 text-base">{place.vicinity}</p>
        <div className="mt-4">
          <span className="text-gray-800 dark:text-gray-200  font-semibold">Rating: {place.rating}</span>
          <span className="text-gray-700 dark:text-gray-300 font-semibold ml-4">Price Level: {'$'.repeat(place.price_level || 0)}</span>
        </div>
      </div>
    </div>
      </div>
    );
  };
export default PlaceDetails;