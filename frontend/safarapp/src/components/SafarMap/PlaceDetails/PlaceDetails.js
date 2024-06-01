import React from 'react'


const staticPhotoReference = "AUGGfZlXes2edPoMmAdcAv1w2L-gVLa_-fNIwhM-CqKF0y74i6CsKVxk4D8dMeT1X5aNpzUyQ_5EmBKv4DDKB5GQkB9A-B3NCDZRT9xQoYlpvt_4gizxBkdGPelgzm2n1O605D_TDv5W8c_CCCh0YKIQbQ7e9e2aC0FQFPu53UjHqKAw7jFB"

const getPhotoUrl = (photoReference) => {
    return `https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=${photoReference}&key=AIzaSyD5OAaC5LrjisDtQOlgnXAoaWvbvGguVIc'`;
  };

  const PlaceDetails = ({ place }) => {
  
    return (
      <div>
        <h1>{place.name}</h1>
  
        {place.photos && place.photos.length > 0 && (
          <img
            src={getPhotoUrl(staticPhotoReference)}
            alt={place.name}
            style={{ width: '400px' }}
          />
        )}
      </div>
    );
  };
export default PlaceDetails;