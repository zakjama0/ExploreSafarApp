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
    <div className=" hidden h-80 md:flex md:justify-around md:space-between  ">
    <motion.div
          className="m-4 flex-row items-center justify-center"
        initial="hidden"
        animate="visible"
        transition={{ duration: 0.7, delay: 2  }}
        variants={iconVariants}
    >
        <MdOutlineReviews className="mx-2 text-4xl md:text-6xl text-zinc-500" />
        <motion.h2 className='text-zinc-500 text-md md:text-xl'
         initial="hidden"
         animate="visible"
         transition={{ duration: 0.7, delay: 2.5  }}
         variants={textVariants}>Reviews</motion.h2>
    </motion.div>

    <motion.div
        className="m-4 flex-row items-center justify-center"
        initial="hidden"
        animate="visible"
        transition={{ duration: 0.7, delay: 1.2  }}
        variants={iconVariants}
    >
        <MdOutlineMosque className="mx-2 text-4xl md:text-6xl text-blue-500" />
        <motion.h2  initial="hidden"
        animate="visible"
        transition={{ duration: 0.7, delay: 2.5  }}
        variants={textVariants} className='text-zinc-500 text-md md:text-xl'>Masjids</motion.h2>
    </motion.div>
    <motion.div
        className="m-4 flex-row items-center justify-center"
        initial="hidden"
        animate="visible"
        variants={iconVariants}
    >
        <SlGlobe className="mx-10 text-5xl md:text-7xl text-blue-500" />
        <motion.img 
        initial="hidden"
        animate="visible"
        transition={{ duration: 0.7, delay: 3.5  }}
        variants={iconVariants}
        className='w-28 md:w-40' alt='Safar Logo' src={Logo}/>
    </motion.div>
    <motion.div
        className="m-4 flex-row items-center justify-center"
        initial="hidden"
        animate="visible"
        transition={{ duration: 0.7, delay: 1.2  }}
        variants={iconVariants}
    >
        <LuHelpingHand className="text-4xl md:text-6xl text-blue-500" />
        <motion.h2 className='text-zinc-500 text-md md:text-xl'
         initial="hidden"
         animate="visible"
         transition={{ duration: 0.7, delay: 2.5  }}
         variants={textVariants}>Dhikr</motion.h2>
    </motion.div>
    <motion.div
        className="m-4 flex-row items-center justify-center"
        initial="hidden"
        animate="visible"
        transition={{ duration: 0.7, delay: 2  }}
        variants={iconVariants}
    >
        <PiForkKnifeBold className=" text-4xl md:text-6xl text-blue-500" />
        <motion.h2 className='mx-2 text-zinc-500 text-md md:text-xl'
        initial="hidden"
        animate="visible"
        transition={{ duration: 0.7, delay: 2.5  }}
        variants={textVariants}>Food</motion.h2>
    </motion.div>
</div>
  )
}

export default SafarAnimation