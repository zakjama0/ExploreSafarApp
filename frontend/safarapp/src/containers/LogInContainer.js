import React from 'react';
import { Link } from 'react-router-dom';

const LoginContainer = () => {



    
  return (
    <div className="flex flex-col justify-evenly items-center mx-5">
      <div className="bg-gradient-to-b from-indigo-400 via-indigo-500 to-purple-800 border-2 border-darkgreen backdrop-blur shadow-xl text-white rounded-lg p-8 w-full max-w-md mx-auto">
        <form>
        <h2 className='pb-3 text-center text-bold text-lg'>Welcome back! Please login</h2>
          <div className="relative w-full mb-6">
            <label htmlFor="email" className="block mb-2">Email:</label>
            <input
              id="email"
              name="email"
              type="text"
              placeholder="Enter email.."
              className="w-full px-4 py-2 border rounded focus:outline-none text-black focus:ring-2 focus:ring-blue-500"
            />
          </div>
          <div className="relative w-full mb-6">
            <label htmlFor="password" className="block mb-2">Password:</label>
            <input
              id="password"
              name="password"
              type="password"
              placeholder="Enter password.."
              className="w-full  text-black px-4 py-2 border rounded focus:outline-none focus:ring-2 focus:ring-blue-500"
            />
          </div>
          <div className="text-center mb-6">
            <p>Don't have an account? <a to="/" className="text-blue-500 underline">Register</a></p>
          </div>
          <div className="flex justify-center">
            <input
              type="submit"
              value="Login"
              className="px-5 py-2 bg-white border-none rounded-full shadow-md cursor-pointer text-[#4d55bf] font-semibold"
            />
          </div>
        </form>
      </div>
    </div>
  );
};

export default LoginContainer;
