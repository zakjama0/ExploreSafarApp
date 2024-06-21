import { useState } from "react";
import { DatePicker, LocalizationProvider } from '@mui/x-date-pickers';
import { AdapterDayjs } from '@mui/x-date-pickers/AdapterDayjs'

const AddPlannedAttractionForm = ({ postPlannedAttraction, attractionId, itineraries }) => {

  const [selectedItinerary, setSelectedItinerary] = useState({});
  const [selectedItineraryName, setSelectedItineraryName] = useState("");
  const [startTime, setStartTime] = useState(null);
  const [endTime, setEndTime] = useState(null);
  const [newItineraryName, setNewItineraryName] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();
    if (handleValidation()) {

      const plannedAttraction = {
        itineraryId: selectedItinerary ? selectedItinerary.id : null,
        attractionId,
        startTime: startTime.format('DD/MM/YYYY'),
        endTime: endTime.format('DD/MM/YYYY'),
        itineraryName: newItineraryName
      }

      postPlannedAttraction(plannedAttraction);
    }
  }

  const handleValidation = () => {

    if (startTime === null || endTime === null) {
      alert("Please set dates.")
      return false;
    }

    if (selectedItinerary.id === null && newItineraryName === "") {
      alert("Please select existing itinerary or enter name for new itinerary")
      return false;
    }

    if (startTime.isAfter(endTime)) {
      alert("Selected start date is after selected end date.");
      return false;
    }

    return true;
  }

  const handleItineraryChange = (event) => {
    setSelectedItineraryName(event.target.value);
    setSelectedItinerary(itineraries.find(itinerary => itinerary.name == event.target.value));
  }

  return (
    <div className="flex flex-col justify-evenly items-center mx-5">
      <div className="main-login flex flex-col items-center">
        <div className="wrapper">
          <div className="registration w-[500px] bg-gradient-to-b from-blue-500 via-blue-600 to-violet-800 border-2 border-yellow-400 backdrop-blur-sm shadow-lg text-white rounded-lg p-8">
            <form onSubmit={handleSubmit}>
              <h1 className="text-4xl text-center mb-6">Add Attraction to Itinerary!</h1>
              <div className="input-box relative w-11/12 mb-6">
                <label className="block mb-2">Itinerary:</label>
                <select
                  value={selectedItineraryName}
                  onChange={(event) => handleItineraryChange(event)}
                >
                  <option value="">Create New Itinerary</option>
                  {itineraries.map(itinerary => (
                    <option key={itinerary.id} value={itinerary.name}>{itinerary.name}</option>
                  ))}
                </select>
              </div>
              <div className="input-box relative w-11/12 mb-6">
                <label className="block mb-2">New Itinerary Name:</label>
                <input
                  className="w-full p-2 rounded text-black"
                  name="itinerary-name"
                  placeholder="Enter name of new itinerary"
                  value={newItineraryName}
                  onChange={event => setNewItineraryName(event.target.value)}
                />
              </div>
              <div className="input-box relative w-11/12 mb-6">
                <label className="block mb-2">Start Date</label>
                <LocalizationProvider dateAdapter={AdapterDayjs}>
                  <DatePicker value={startTime} onChange={value => setStartTime(value)} />
                </LocalizationProvider>
              </div>
              <div className="input-box relative w-11/12 mb-6">
                <label className="block mb-2">End Date</label>
                <LocalizationProvider dateAdapter={AdapterDayjs}>
                  <DatePicker value={endTime} onChange={value => setEndTime(value)} />
                </LocalizationProvider>
              </div>
              <div className="register-button flex justify-center">
                <input
                  className="register-btn w-40 h-12 bg-white border-none outline-none rounded-full shadow-md cursor-pointer text-lg text-orange-500 font-semibold text-center"
                  type="submit"
                  value="Add"
                />
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AddPlannedAttractionForm;