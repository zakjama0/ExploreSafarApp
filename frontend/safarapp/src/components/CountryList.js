import Card from '../components/Card';
import React, { useState, useEffect } from 'react';
import Carousel from 'react-multi-carousel';
import 'react-multi-carousel/lib/styles.css';
const CountryList = ({countries, regions}) => {

    const [isMobile, setIsMobile] = useState(window.innerWidth < 768);

    const handleResize = () => {
      setIsMobile(window.innerWidth < 768);
    };
  
    useEffect(() => {
      window.addEventListener('resize', handleResize);
      return () => window.removeEventListener('resize', handleResize);
    }, []);
    

    const listCountries = countries.map(country => (
        <Card 
        key={country.id}
        name={country.name}
        image={country.image}
        />
    ));

    const responsive = {
        desktop: {
          breakpoint: { max: 3000, min: 1024 },
          items: 3,
          slidesToSlide: 1 // optional, default to 1.
        },
        tablet: {
          breakpoint: { max: 1024, min: 464 },
          items: 2,
          slidesToSlide: 2 // optional, default to 1.
        }
      };


    return ( <>

    <div>
     {isMobile?
     (<div>{listCountries} </div>)
     :
    (<div className='my-20 w-5/6'>
    <Carousel responsive={responsive}>
             {listCountries}
    </Carousel>
            
    </div>)
    }
    </div>
    
    
    </> );
}
 
export default CountryList;