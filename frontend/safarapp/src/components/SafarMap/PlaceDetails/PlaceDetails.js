import React from 'react'


const staticPhotoReference = "AUGGfZlXes2edPoMmAdcAv1w2L-gVLa_-fNIwhM-CqKF0y74i6CsKVxk4D8dMeT1X5aNpzUyQ_5EmBKv4DDKB5GQkB9A-B3NCDZRT9xQoYlpvt_4gizxBkdGPelgzm2n1O605D_TDv5W8c_CCCh0YKIQbQ7e9e2aC0FQFPu53UjHqKAw7jFB"

const getPhotoUrl = (photoReference) => {
    return `https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=${photoReference}&key=AIzaSyD5OAaC5LrjisDtQOlgnXAoaWvbvGguVIc'`;
  };

  const PlaceDetails = ({ place }) => {
  
    return (
      <div>
        <div className="max-w-sm rounded overflow-hidden shadow-lg m-4 transition-transform transform hover:-translate-y-2">
      <img 
        src={place.photos && place.photos.length > 0 ? getPhotoUrl(place.photos[0].photo_reference) : 'https://via.placeholder.com/400'} 
        alt={place.name} 
        className="w-full h-48 object-cover"
      />
      <div className="px-6 py-4">
        <div className="font-bold text-xl mb-2">{place.name}</div>
        <p className="text-gray-700 text-base">{place.vicinity}</p>
        <div className="mt-4">
          <span className="text-gray-900 font-semibold">Rating: {place.rating}</span>
          <span className="text-gray-900 font-semibold ml-4">Price Level: {'$'.repeat(place.price_level || 0)}</span>
        </div>
      </div>
    </div>
      </div>
    );
  };
export default PlaceDetails;