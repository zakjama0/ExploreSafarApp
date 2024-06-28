import { Grid } from "@mui/material";
import Card from "./Card";

const PlannedAttractionCard = ({ name, image, startDate }) => {

    return (
        <Grid columns={2} container>
            <Grid item>
                <h1>{startDate}</h1>
            </Grid>
            <Grid item>
                <Card name={name} image={image} />
            </Grid>
        </Grid>
    );

}

export default PlannedAttractionCard;