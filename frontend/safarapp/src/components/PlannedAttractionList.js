import { Grid } from "@mui/material";
import PlannedAttractionCard from "./PlannedAttractionCard";
import { Link } from "react-router-dom";

const PlannedAttractionList = ({ plannedAttractions }) => {

    const sortedPlannedAttractions = plannedAttractions.sort((a, b) => b.startDate - a.startDate);

    const plannedAttractionCards = sortedPlannedAttractions.map(plannedAttraction => {
        return (
            <Grid key={plannedAttraction.id} xs={12} item>
                <Link to={`/attractions/${plannedAttraction.attraction.id}`}>
                    <PlannedAttractionCard
                        name={plannedAttraction.attraction.name}
                        image={plannedAttraction.attraction.image}
                        startDate={plannedAttraction.startDate}
                    />
                </Link>
            </Grid>
        )
    });

    return (
        <>
            <Grid className="flex justify-center" spacing={2} container>
                {plannedAttractionCards}
            </Grid>
        </>
    )
}

export default PlannedAttractionList;