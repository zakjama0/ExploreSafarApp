import { Box } from "@mui/material";
import { useLoaderData } from "react-router-dom";
import Card from "./Card";

const Country = ({ }) => {

    const country = useLoaderData();

    return (
        <>
            <div className="flex justify-center">
                <Card name={country.name} image={country.image} />
            </div>
        </>
    );
}

export default Country;