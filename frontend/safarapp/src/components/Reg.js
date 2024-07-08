import React, { useState } from 'react';
import { Link} from 'react-router-dom';
import mountain from '../assests/loginImg.jpg';
import Logo from '../assests/safarLogo.png'

const Register = ({ register }) => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    if (handleValidation()) {
      const newUser = {
        email,
        password,
      };
      register(newUser);
    }
  };

  const handleValidation = () => {
    if (email === '' || password === '' || confirmPassword === '') {
      alert('Please fill in all fields');
      return false;
    }
    if (password !== confirmPassword) {
      alert('Passwords do not match');
      return false;
    }
    return true;
  };

  return (
    <section className="bg-[#d2dbd8] pb-3 px-3 dark:bg-slate-800 min-h-screen flex flex-col items-center">
      <img src={Logo} alt="Safar Logo" className="w-[100px] mt-8 " />

      <div className="bg-gray-100 mx-3 flex rounded-2xl shadow-lg max-w-3xl w-full h-auto">
        <div className="w-full sm:w-1/2 p-12 flex flex-col justify-center">
          <h2 className="font-bold text-2xl text-indigo-400">Register</h2>
          <p className="text-sm mt-4 text-indigo-400">Create a new account</p>

          <form onSubmit={handleSubmit} className="flex flex-col gap-4 mt-8">
            <div className="input-box relative w-full mb-4">
              <label htmlFor="email" className="block mb-1">Email:</label>
              <input
                className="p-2 rounded-xl border w-full mb-4"
                type="email"
                name="email"
                placeholder="Enter email address"
                value={email}
                onChange={e => setEmail(e.target.value)}
              />
            </div>
            <div className="input-box relative w-full mb-4">
              <label htmlFor="password" className="block mb-1">Password:</label>
              <input
                className="p-2 rounded-xl border w-full"
                type="password"
                name="password"
                placeholder="Enter password"
                value={password}
                onChange={e => setPassword(e.target.value)}
              />
            </div>
            <div className="input-box relative w-full mb-4">
              <label htmlFor="confirmPassword" className="block mb-1">Confirm Password:</label>
              <input
                className="p-2 rounded-xl border w-full"
                type="password"
                name="confirmPassword"
                placeholder="Confirm password"
                value={confirmPassword}
                onChange={e => setConfirmPassword(e.target.value)}
              />
            </div>
            <button type="submit" className="bg-indigo-400 p-2 rounded-xl text-white py-2 hover:scale-105 duration-300">Register</button>
          </form>

          <div className="mt-10 grid grid-cols-3 items-center text-gray-400">
            <hr className="border-gray-400" />
            <hr className="border-gray-400" />
            <hr className="border-gray-400" />
          </div>

          <p className="mt-5 text-xs text-center text-indigo-400">Already have an account?</p>

          <div className="mt-5 text-xs flex justify-between items-center">
            <p className="text-indigo-400">Log in here:</p>
            <Link to={"/login"}><button href="login.html" className="py-2 px-5 bg-white border rounded-xl text-indigo-400 hover:scale-105 duration-300">Login</button></Link>
          </div>
        </div>

        <div className="hidden sm:block w-1/2">
          <img className="rounded-2xl h-full object-cover" src={mountain} alt="Registration Image" />
        </div>
      </div>
    </section>
  );
};

export default Register;
