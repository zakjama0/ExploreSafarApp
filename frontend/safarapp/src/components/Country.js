import { useLoaderData } from "react-router-dom";

const Country = ({}) => {

    const country = useLoaderData();
    console.log(country);
    return(
    <>
    </>
    );
}

export default Country;