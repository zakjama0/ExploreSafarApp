import React from 'react'
import { motion } from 'framer-motion';
import { FaCoffee, FaApple, FaAndroid, FaE } from 'react-icons/fa';
import { MdOutlineMosque, MdOutlineReviews } from "react-icons/md";
import { PiForkKnifeBold } from "react-icons/pi";
import { SlGlobe } from "react-icons/sl";
import { LuHelpingHand } from "react-icons/lu";


const iconsLeft = [
    { component: MdOutlineMosque, key: 'Masjid' },
    { component: PiForkKnifeBold, key: 'Food' },

  ];
  
const iconsRight =[
    { component: LuHelpingHand, key: 'Dua' },
    { component: MdOutlineReviews, key: 'Dua' },
]
  const iconVariants = {
    hidden: { opacity: 0, y: 50 },
    visible: { opacity: 1, y: 0 },
  };

const LandingPageContainer = () => {

    
  return (
    <div className=' dark:bg-slate-800 w-full h-screen'>
         <h1 className="py-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-purple-800 ">Welcome to the future of Travelling</h1>

        <div className="flex justify-around h-screen space-between">
            <motion.div
                className="m-4"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 3  }}
                variants={iconVariants}
            >
                <MdOutlineReviews className="text-6xl text-blue-500" />
            </motion.div>
        
            <motion.div
                className="m-4"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 2  }}
                variants={iconVariants}
            >
                <MdOutlineMosque className="text-6xl text-blue-500" />
            </motion.div>
            <motion.div
                className="m-4"
                initial="hidden"
                animate="visible"
                variants={iconVariants}
            >
                <SlGlobe className="text-6xl text-blue-500" />
            </motion.div>
            <motion.div
                className="m-4"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 2  }}
                variants={iconVariants}
            >
                <LuHelpingHand className="text-6xl text-blue-500" />
            </motion.div>
            <motion.div
                className="m-4"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 3  }}
                variants={iconVariants}
            >
                <PiForkKnifeBold className="text-6xl text-blue-500" />
            </motion.div>
        </div>
        <div className="flex justify-around h-screen space-between">
            <motion.div
                className="m-4"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 3  }}
                variants={iconVariants}
            >
                <MdOutlineReviews className="text-6xl text-blue-500" />
            </motion.div>
        
            <motion.div
                className="m-4"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 2  }}
                variants={iconVariants}
            >
                <MdOutlineMosque className="text-6xl text-blue-500" />
            </motion.div>
            <motion.div
                className="m-4"
                initial="hidden"
                animate="visible"
                variants={iconVariants}
            >
                <SlGlobe className="text-6xl text-blue-500" />
            </motion.div>
            <motion.div
                className="m-4"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 2  }}
                variants={iconVariants}
            >
                <LuHelpingHand className="text-6xl text-blue-500" />
            </motion.div>
            <motion.div
                className="m-4"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 3  }}
                variants={iconVariants}
            >
                <PiForkKnifeBold className="text-6xl text-blue-500" />
            </motion.div>
        </div>
    </div>
  )
}

export default LandingPageContainer