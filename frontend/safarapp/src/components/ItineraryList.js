import ItineraryCard from "./ItineraryCard";

const ItineraryList = ({ itineraries }) => {

    console.log(itineraries);

    const itineraryCards = itineraries.map(itinerary => {
        return (
            <ItineraryCard
                image={itinerary.image}
                startDate={itinerary.startDate}
                endDate={itinerary.endDate}
            />
        )
    });

    console.log(itineraries);

    return (
        <>
            {itineraryCards}
        </>
    )
}

export default ItineraryList;