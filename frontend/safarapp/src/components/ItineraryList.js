import { Link } from "react-router-dom";
import ItineraryCard from "./ItineraryCard";

const ItineraryList = ({ itineraries }) => {

    const itineraryCards = itineraries.map(itinerary => {
        return (
            <Link to={`/my-itineraries/${itinerary.id}`}>
                <ItineraryCard
                    key={itinerary.id}
                    image={itinerary.image}
                    name={itinerary.name}
                    startDate={itinerary.startDate}
                    endDate={itinerary.endDate}
                />
            </Link>
        )
    });

    return (
        <>
            {itineraryCards}
        </>
    )
}

export default ItineraryList;