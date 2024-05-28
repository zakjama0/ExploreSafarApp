import React, { useState, useRef, useEffect } from 'react'
import {  motion, useInView, useAnimation, } from 'framer-motion';
import { HiArrowNarrowRight } from 'react-icons/hi';
import SafarAnimation from '../components/SafarAnimation';
import BentoGrid from '../components/BentoGrid';
import { duration } from '@mui/material';

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
        </div > 
        <SafarAnimation />
        <h1 className="py-5 mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800 ">Our app</h1>
        <motion.div
        // ref={ref}
        // variants={{
        //   hidden:{opacity:0 , y:75},
        //   visible:{opacity:1 , y:0}
        // }}
        // initial="hidden"
        // animate={mainControls}
        // transition={{duration:0.5, delay:0.5}}
        >
        <BentoGrid />
        </motion.div>

    </div>
    
  )
}

export default LandingPageContainer