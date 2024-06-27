import { Grid } from "@mui/material";
import PlannedAttractionCard from "./PlannedAttractionCard";

const PlannedAttractionList = ({ plannedAttractions }) => {

    console.log(plannedAttractions);

    const plannedAttractionCards = plannedAttractions.map(plannedAttraction => {
        return (
            <Grid key={plannedAttraction.id} item>
                <PlannedAttractionCard
                    name={plannedAttraction.attraction.name}
                    image={plannedAttraction.attraction.image}
                    startDate={plannedAttraction.startDate}
                />
            </Grid>
        )
    });

    return (
        <>
            <Grid className="flex justify-center" container>
                {plannedAttractionCards}
            </Grid>
        </>
    )
}

export default PlannedAttractionList;