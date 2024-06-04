import React, { useState, useRef, useEffect } from 'react'
import {  motion, useInView, useAnimation, } from 'framer-motion';
import { HiArrowNarrowRight } from 'react-icons/hi';
import SafarAnimation from '../components/SafarAnimation';
import BentoGrid from '../components/BentoGrid';
import { duration } from '@mui/material';
import Cappadocia from '../assests/Cappadocia.jpeg'
import Hike from '../assests/Hike.png'
import MuslimCouple from '../assests/MuslimCouple.png'

const LandingPageContainer = () => {
  const [isBouncing, setIsBouncing] = useState(true);

  const toggleBounce = () => {
    setIsBouncing(!isBouncing);
  };
  const mainControls =useAnimation();
  const ref = useRef(null);
  const isInView = useInView(ref, {once: true});
  useEffect(() =>{
    if(isInView){
      mainControls.start("visible")
    }
      

  }, [isInView])
  
  return (
    <div   className=' bg-[#d2dbd8] dark:bg-slate-800 w-full h-full'>
        <div className=' flex-row items-center justify-center mb-20'>
          <h1 className="py-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-purple-800 "
          >Welcome to the future of travelling</h1>
          <h2 className='mb-10 text-sm md:text-base lg:text-lg text-black dark:text-white mx-4 md:mx-10 text-left leading-relaxed'>The app that simplifies Muslim travel by providing tailored itineraries, halal food recommendations, nearby mosques, and authentic duas and dhikr for various occasions. Designed to ensure a seamless, faith-aligned experience, in which we make journeys both enjoyable and spiritually fulfilling</h2>
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
        </div > 
        <h1 className="py-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800 ">Our App</h1>
        <motion.div
        ref={ref}
        variants={{
          hidden:{opacity:0 , y:75},
          visible:{opacity:1 , y:0}
        }}
        initial="hidden"
        animate={mainControls}
        transition={{duration:0.5, delay:0.5}}
        >
        <BentoGrid />
        </motion.div>
  <div className="min-h-screen dark:bg-slate-800 w-full px-4 pb-5 text-zinc-50">
  <div className=" max-w-7xl mx-auto grid grid-cols-1 md:grid-cols-1 gap-8">
    <div className="flex flex-col items-center">
      <h1 className="py-2 mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800">Our Story</h1>
      <div className='md:flex md:items-center md:justify-center'>
      <h2 className='text-sm md:text-base lg:text-lg text-black dark:text-white mx-4 md:mx-0 text-left leading-relaxed'>
  As three Muslim software developers from diverse, non-computer science backgrounds, we faced challenges in our journey but found it deeply rewarding. Our frustration with the difficulties of traveling as Muslims—finding faith-aligned activities, halal food, and nearby mosques—inspired us to create this app.
  <br  />
  <br  />
  Our travel advisory app simplifies travel for Muslims by offering tailored itineraries, halal food recommendations, mosque locations, and a collection of authentic duas and dhikr for various occasions, including travel. We built this app to be the ultimate companion for seamless, faith-aligned travel experiences, making your journey enjoyable and spiritually fulfilling.
</h2>
      <img src={Hike} className='h-60'/>
      </div>
      
    </div>
    <div className="flex flex-col items-center">
      <h1 className="py-5 mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800">Our Mission</h1>
      <div className='md:flex md:items-center md:justify-center'>
      <img src={MuslimCouple} className='h-60'/>
      <h2 className='mb-10 text-sm md:text-base lg:text-lg text-black dark:text-white mx-4 md:mx-0 text-left leading-relaxed'>
        Our mission extends beyond simply easing the travel experience for Muslims; we aim to foster a sense of community and inclusivity within the travel industry. 
        By developing this app, we are creating a platform that not only provides practical solutions for finding halal food and mosques but also curates personalized travel itineraries enriched with authentic duas and dhikr. 
        <br  />
        <br  />
        We envision a future where Muslim travelers can explore the world with confidence and peace of mind, knowing that their faith-based needs are seamlessly integrated into their journey. 
        As we continue to grow, we are committed to involving our community in shaping the app's features and services, ensuring that it remains a truly collaborative and inclusive resource for all Muslim travelers.
      </h2>
      
      </div>
     
    </div>
  </div>
</div>
</div>
    
  )
}

export default LandingPageContainer