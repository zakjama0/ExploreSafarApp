import ItineraryCard from "./ItineraryCard";

const ItineraryList = ({ itineraries }) => {

    const itineraryCards = itineraries.map(itinerary => {
        return (
            <ItineraryCard
                img={itinerary.img}
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