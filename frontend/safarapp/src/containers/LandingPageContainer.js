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
    <div   className=' dark:bg-slate-800 w-full h-full'>
        <div className=' flex-row items-center justify-center mb-40'>
          <motion.h1 className="py-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-purple-800 "
           variants={{
            hidden:{opacity:0 , y:75},
            visible:{opacity:1 , y:0}
          }}
          initial="hidden"
          animate="visible"
          transition={{duration:1, delay:0.25}}
          >Welcome to the future of travelling</motion.h1>
          <h2 className='text-center mx-16 md:mx-32 dark:text-white'>The app that simplifies Muslim travel by providing tailored itineraries, halal food recommendations, nearby mosques, and authentic duas and dhikr for various occasions. Designed to ensure a seamless, faith-aligned experience, it makes journeys both enjoyable and spiritually fulfilling</h2>
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
        <SafarAnimation />
        <h1 className="py-5 mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800 ">Our App</h1>
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
        <div className="min-h-screen bg-white dark:bg-slate-800 w-full px-4 py-12 text-zinc-50">
  <div className="max-w-7xl mx-auto grid grid-cols-1 md:grid-cols-1 gap-8">
    <div className="flex flex-col items-center">
      <h1 className="py-5 mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800">Our Story</h1>
      <div className='md:flex md:items-center md:justify-center'>
      <h2 className='text-sm text-black text-left mx-16 md:mx-0 dark:text-white'>
        As three Muslim software developers from diverse backgrounds, none of which were originally in computer science, we found the journey to this point both challenging and deeply rewarding. 
        Our collective frustration with the difficulties of traveling as Muslims—constantly searching for activities that align with our faith, hunting for halal food, and finding nearby mosques—drove us to create this app. 
        Our travel advisory app is dedicated to easing the travel experience for Muslims by providing tailored itineraries, recommendations for halal food and mosques in searched cities, and a repository of authentic duas and dhikr for various occasions, including travel. 
        We built this app to be the ultimate companion for seamless, faith-aligned travel experiences, ensuring that your journey is both enjoyable and spiritually fulfilling.
      </h2>
      <img src={Hike} className='h-60'/>
      </div>
      
    </div>
    <div className="flex flex-col items-center">
      <h1 className="py-5 mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800">Our Mission</h1>
      <div className='md:flex md:items-center md:justify-center'>
      <img src={MuslimCouple} className='h-60'/>
      <h2 className='text-sm text-black text-right mx-16 md:mx-0 dark:text-white'>
        Our mission extends beyond simply easing the travel experience for Muslims; we aim to foster a sense of community and inclusivity within the travel industry. 
        By developing this app, we are creating a platform that not only provides practical solutions for finding halal food and mosques but also curates personalized travel itineraries enriched with authentic duas and dhikr. 
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