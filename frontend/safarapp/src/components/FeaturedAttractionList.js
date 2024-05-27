import { Grid } from "@mui/material";
import { Link } from "react-router-dom";
import Card from "./Card";
import { useEffect, useState } from "react";

const FeaturedAttractionList = ({ attractions }) => {

    const [isMobile, setIsMobile] = useState(window.innerWidth < 768);

    const handleResize = () => {
        setIsMobile(window.innerWidth < 768);
    };

    useEffect(() => {
        window.addEventListener('resize', handleResize);
        return () => window.removeEventListener('resize', handleResize);
    }, []);

    const attractionsCards = attractions.map(attraction => {
        return (
            <Grid item>
                <Link to={`/attractions/${attraction.id}`}>
                    <Card name={attraction.name} image={attraction.image} />
                </Link>
            </Grid>
        );
    })

    return (
        <>
            <div>
                {isMobile ? (
                    <div>

                    </div>
                )
                    :
                    (
                        <div>
                            <Grid className="flex justify-center" container spacing={8}>
                                {attractionsCards}
                            </Grid>
                        </div>
                    )
                }
            </div>
        </>
    );
}

export default FeaturedAttractionList;