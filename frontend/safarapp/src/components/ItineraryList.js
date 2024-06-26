import ItineraryCard from "./ItineraryCard";

const ItineraryList = ({ itineraries }) => {
    
    console.log(itineraries);

    const itineraryCards = itineraries.map(itinerary => {
        return (
            <ItineraryCard
                image={itinerary.image}
                name={itinerary.name}
                startDate={itinerary.startDate}
                endDate={itinerary.endDate}
            />
        )
    });

    return (
        <>
            {itineraryCards}
        </>
    )
}

export default ItineraryList;