import { useEffect, useState } from "react";
import { DatePicker, LocalizationProvider } from '@mui/x-date-pickers';
import { AdapterDayjs } from '@mui/x-date-pickers/AdapterDayjs'

const apiUrl = "localhost:8080";
const AddPlannedAttractionForm = ({ postPlannedAttraction, attractionId }) => {

  const [itineraries, setItineraries] = useState([]);
  const [itineraryId, setItineraryId] = useState(null);
  const [startTime, setStartTime] = useState(null);
  const [endTime, setEndTime] = useState(null);
  const [newItineraryName, setNewItineraryName] = useState("");

  const fetchItinerariesByUser = async () => {
    const response = await fetch(`http://${apiUrl}/planned-attractions`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${sessionStorage.getItem("access_token")}`
      }
    });
    const data = await response.json();
    setItineraries(data);
  }

  const handleSubmit = (event) => {
    event.preventDefault();
    if (handleValidation()) {

      const plannedAttraction = {
        itineraryId,
        attractionId,
        startTime: startTime.$d,
        endTime,
        newItineraryName
      }

      console.log(plannedAttraction);

      // postPlannedAttraction(plannedAttraction);
    }
  }

  const handleValidation = () => {

    // if (email === "" || password === "") {
    //   alert("Please fill in all fields")
    //   return false;
    // }
    return true;
  }

  const handleItineraryChange = (event) => {
    setItineraryId(event.target.value.id);
  }

  useEffect(() => {
    fetchItinerariesByUser();
  }, []);


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
                  value={itineraryId}
                  onChange={handleItineraryChange}
                >
                  <option value="New">Create New Itinerary</option>
                  {itineraries.map(itinerary => (
                    <option key={itinerary.id} value={itinerary}>{itinerary.name}</option>
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