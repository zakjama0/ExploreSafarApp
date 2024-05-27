import { useEffect, useState } from "react";
import Carousel from "react-multi-carousel";
import { Link } from "react-router-dom";
import Card from "./Card";

const AttractionList = ({ cities }) => {

    const [isMobile, setIsMobile] = useState(window.innerWidth < 768);

    const handleResize = () => {
        setIsMobile(window.innerWidth < 768);
    };

    useEffect(() => {
        window.addEventListener('resize', handleResize);
        return () => window.removeEventListener('resize', handleResize);
    }, []);

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

    const components = cities.map(city => {
        return (
            <div key={city.id}>
                <h2>{city.name}</h2>
                <Carousel responsive={responsive}>{city.attractions.map(attraction => {
                    return (
                        <Card name={attraction.name} image={attraction.image} />
                    );
                })}
                </Carousel>
            </div>
        )
    });

    return (
        <>
            <div>
                {components}
            </div>
        </>
    );
}

export default AttractionList;