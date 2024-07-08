import { useEffect, useState } from "react";
import Carousel from "react-multi-carousel";
import { Link } from "react-router-dom";
import Card from "./Card";
import { Box } from "lucide-react";
import Popup from "reactjs-popup";
import AddPlannedAttractionForm from "./AddPlannedAttractionForm";

const AttractionList = ({ cities, postPlannedAttraction, itineraries }) => {

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
        },
        mobile: {
            breakpoint: {max: 425, min: 0},
            items: 1,
            slidesToSlide: 1
        }
    };

    const components = cities.map(city => {
        return (
            <div className="m-4 md:m-8" key={city.id}>
                <h2 className="text-center my-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white pl-10">{city.name}</h2>
                <Carousel key={city.id} responsive={responsive}>{city.attractions.map(attraction => {
                    return (
                        <div>
                            <Link to={`/attractions/${attraction.id}`}>
                                <Card name={attraction.name} image={attraction.image} />
                            </Link>
                            <Popup trigger=
                                {<button className='py-2 px-3 border rounded-md dark:text-white'>Add to Itinerary</button>}
                                modal nested>
                                {
                                    close => (
                                        <div className='modal'>
                                            <div className='review-form'>
                                                <AddPlannedAttractionForm
                                                    attractionId={attraction.id}
                                                    itineraries={itineraries}
                                                    postPlannedAttraction={postPlannedAttraction}
                                                />
                                            </div>
                                            <div className='flex justify-center items-center'>
                                                <button className="w-[150px] h-[45px] m-[10px] bg-white border-none outline-none rounded-full shadow-md cursor-pointer text-[16px] text-[#5c67c5] font-semibold text-center"
                                                    onClick=
                                                    {() => close()} >
                                                    Close
                                                </button>
                                            </div>
                                        </div>
                                    )
                                }
                            </Popup>
                        </div>
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