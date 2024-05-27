import React, { useState } from 'react'
import {  motion } from 'framer-motion';
import { HiArrowNarrowRight } from 'react-icons/hi';
import SafarAnimation from '../components/SafarAnimation';
import BentoGrid from '../components/BentoGrid';

const LandingPageContainer = () => {
  const [isBouncing, setIsBouncing] = useState(true);

  const toggleBounce = () => {
    setIsBouncing(!isBouncing);
  };
  return (
    
    <div className=' dark:bg-slate-800 w-full h-full'>
        <div className=' flex-row items-center justify-center mb-28'>
          <h1 className="py-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-purple-800 ">Welcome to the future of Travelling</h1>
          <h2 className='text-center mx-16 md:mx-32 dark:text-white'>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</h2>
          <div className="flex items-center justify-center mt-3">
          <a href='/' className='text-lg bg-gradient-to-r from-blue-500 to-blue-800 py-2 px-3 rounded-md dark:text-white'>Get started {" "}<motion.button
          className='text-sm'
        animate={isBouncing ? { y: [0, -5, 0] } : { y: 0 }}
        transition={isBouncing ? { repeat: 4, duration: 1 } : {}}
        onClick={toggleBounce}
      >
        <HiArrowNarrowRight className="" />
      </motion.button></a>
            </div>
        </div> 
        <SafarAnimation />
        <BentoGrid/>
    </div>
    
  )
}

export default LandingPageContainer