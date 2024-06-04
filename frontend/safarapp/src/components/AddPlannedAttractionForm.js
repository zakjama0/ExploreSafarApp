import { useState } from "react";

const AddPlannedAttractionForm = ({ postPlannedAttraction }) => {

    // private Long itineraryId;
    // private Long attractionId;
    // private LocalDate startTime;
    // private LocalDate endTime;
    // private Long userId;
    // private String itineraryName;
    const [itineraryId, setItineraryId] = useState(null);
    const [attractionId, setAttractionId] = useState(null);
    const [startTime, setStartTime] = useState(null);
    const [endTime, setEndTime] = useState(null);
    const [itineraryId, setItineraryId] = useState(null);
    const [itineraryId, setItineraryId] = useState(null);

  const handleSubmit = (event) => {
    event.preventDefault();
    if (handleValidation()) {

    //   const user = {
    //     email,
    //     password
    //   }

      postPlannedAttraction();
    }
  }

  const handleValidation = () => {

    if (email === "" || password === "") {
      alert("Please fill in all fields")
      return false;
    }
    return true;
  }


  return (
    <div className="flex flex-col justify-evenly items-center mx-5">
      <div className="main-login flex flex-col items-center">
        <div className="wrapper">
          <div className="registration w-[500px] bg-gradient-to-b from-blue-500 via-blue-600 to-violet-800 border-2 border-yellow-400 backdrop-blur-sm shadow-lg text-white rounded-lg p-8">
            <form onSubmit={handleSubmit}>
              <h1 className="text-4xl text-center mb-6">Log in!</h1>
              <h1 className="text-xl text-center mb-1">Welcome back to Safar!</h1>
              <div className="input-box relative w-11/12 mb-6">
                <label htmlFor="email" className="block mb-2">Email:</label>
                <input
                  className="email w-full p-2 rounded text-black"
                  type="email"
                  name="email"
                  placeholder="Enter email address"
                  value={email}
                  onChange={event => setEmail(event.target.value)}
                />
              </div>
              <div className="input-box relative w-11/12 mb-6">
                <label htmlFor="password" className="block mb-2">Password:</label>
                <input
                  className="password w-full p-2 rounded text-black"
                  type="password"
                  name="password"
                  placeholder="Enter password"
                  value={password}
                  onChange={event => setPassword(event.target.value)}
                />
              </div>
              <div className="register-link text-center mb-4">
                <p>Dont have an account? <a to="" className="text-blue-500">Sign Up!</a></p>
              </div>
              <div className="register-button flex justify-center">
                <input
                  className="register-btn w-40 h-12 bg-white border-none outline-none rounded-full shadow-md cursor-pointer text-lg text-orange-500 font-semibold text-center"
                  type="submit"
                  value="Login"
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