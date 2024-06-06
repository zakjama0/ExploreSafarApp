import React, { useState } from 'react';
import { Link } from 'react-router-dom';

const LoginForm = ({ login }) => {

  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();
    if (handleValidation()) {

      const user = {
        email,
        password
      }

      login(user);
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
    <div className="bg-transparent flex flex-col justify-evenly items-center px-12 mx-2 sm:mx-5">
  <div className="px-5 bg-transparent main-login flex flex-col items-center">
    <div className="wrapper">
      <div className="registration w-full px-20 max-w-md bg-gradient-to-b from-blue-500 via-blue-600 to-violet-800 border-2 border-yellow-400 backdrop-blur-sm shadow-lg text-white rounded-lg p-6 sm:p-8">
        <form onSubmit={handleSubmit}>
          <h1 className="text-3xl sm:text-4xl text-center mb-4 sm:mb-6">Log in!</h1>
          <h1 className="text-lg sm:text-xl text-center mb-2 sm:mb-4">Welcome back to Safar!</h1>
          <div className="input-box relative w-full mb-4 sm:mb-6">
            <label htmlFor="email" className="block mb-1 sm:mb-2">Email:</label>
            <input
              className="email w-full p-2 rounded text-black"
              type="email"
              name="email"
              placeholder="Enter email address"
              value={email}
              onChange={event => setEmail(event.target.value)}
            />
          </div>
          <div className="input-box relative w-full mb-4 sm:mb-6">
            <label htmlFor="password" className="block mb-1 sm:mb-2">Password:</label>
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
            <p>Dont have an account? <a href="#" className="text-blue-500">Sign Up!</a></p>
          </div>
          <div className="register-button flex justify-center">
            <input
              className="register-btn w-32 sm:w-40 h-10 sm:h-12 bg-white border-none outline-none rounded-full shadow-md cursor-pointer text-lg text-orange-500 font-semibold text-center"
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

export default LoginForm;
