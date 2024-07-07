import React from 'react'
import { AnimatePresence, motion } from 'framer-motion';
import { MdOutlineMosque, MdOutlineReviews } from "react-icons/md";
import { PiForkKnifeBold } from "react-icons/pi";
import { SlGlobe } from "react-icons/sl";
import { LuHelpingHand } from "react-icons/lu";
import Logo from '../assests/logoname.png'


  const iconVariants = {
    hidden: { opacity: 0, y: 50 },
    visible: { opacity: 1, y: 0 },
  };
  const textVariants = {
    hidden: { opacity: 0, y: 50 },
    visible: { opacity: 1, y: 0 },
    exit: { opacity: 0, y: -50 }
  };


const SafarAnimation = () => {
  return (
    <div className="h-screen w-screen flex flex-wrap items-center justify-center md:justify-around space-between p-2">
  <motion.div
    className="flex flex-col items-center m-2"
    initial="hidden"
    animate="visible"
    transition={{ duration: 0.7, delay: 2 }}
    variants={iconVariants}
  >
    <MdOutlineReviews className="text-2xl md:text-6xl text-blue-500" />
    <motion.h2 
      className="text-black text-sm md:text-xl mt-2"
      initial="hidden"
      animate="visible"
      transition={{ duration: 0.7, delay: 2.5 }}
      variants={textVariants}
    >
      Reviews
    </motion.h2>
  </motion.div>

  <motion.div
    className="flex flex-col items-center m-2"
    initial="hidden"
    animate="visible"
    transition={{ duration: 0.7, delay: 1.2 }}
    variants={iconVariants}
  >
    <MdOutlineMosque className="text-2xl md:text-6xl text-blue-500" />
    <motion.h2 
      className="text-black text-sm md:text-xl mt-2"
      initial="hidden"
      animate="visible"
      transition={{ duration: 0.7, delay: 2.5 }}
      variants={textVariants}
    >
      Masjids
    </motion.h2>
  </motion.div>

  <motion.div
    className="flex flex-col items-center m-2"
    initial="hidden"
    animate="visible"
    variants={iconVariants}
  >
    <SlGlobe className="text-3xl md:text-7xl text-blue-500" />
    <motion.img 
      className="w-20 md:w-40 mt-2"
      alt="Safar Logo"
      src={Logo}
      initial="hidden"
      animate="visible"
      transition={{ duration: 0.7, delay: 3.5 }}
      variants={iconVariants}
    />
  </motion.div>

  <motion.div
    className="flex flex-col items-center m-2"
    initial="hidden"
    animate="visible"
    transition={{ duration: 0.7, delay: 1.2 }}
    variants={iconVariants}
  >
    <LuHelpingHand className="text-2xl md:text-6xl text-blue-500" />
    <motion.h2 
      className="text-black text-sm md:text-xl mt-2"
      initial="hidden"
      animate="visible"
      transition={{ duration: 0.7, delay: 2.5 }}
      variants={textVariants}
    >
      Dhikr
    </motion.h2>
  </motion.div>

  <motion.div
    className="flex flex-col items-center m-2"
    initial="hidden"
    animate="visible"
    transition={{ duration: 0.7, delay: 2 }}
    variants={iconVariants}
  >
    <PiForkKnifeBold className="text-2xl md:text-6xl text-blue-500" />
    <motion.h2 
      className="text-black text-sm md:text-xl mt-2"
      initial="hidden"
      animate="visible"
      transition={{ duration: 0.7, delay: 2.5 }}
      variants={textVariants}
    >
      Food
    </motion.h2>
  </motion.div>
</div>

  )
}

export default SafarAnimation