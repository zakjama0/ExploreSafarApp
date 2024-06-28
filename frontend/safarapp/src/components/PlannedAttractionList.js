import { Grid } from "@mui/material";
import PlannedAttractionCard from "./PlannedAttractionCard";
import { Link } from "react-router-dom";

const PlannedAttractionList = ({ plannedAttractions }) => {

    const parseDate = (dateString) => {
        const [day, month, year] = dateString.split('/');
        return new Date(`20${year}`, month - 1, day);
      };

    const sortedPlannedAttractions = plannedAttractions.sort((a, b) => {
        const dateA = parseDate(a.startDate);
        const dateB = parseDate(b.startDate);
        return dateA - dateB;
    });

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