import React, {useState, useEffect} from 'react'
import { AnimatePresence, motion } from 'framer-motion';
import { FaCoffee, FaApple, FaAndroid, FaE } from 'react-icons/fa';
import { MdOutlineMosque, MdOutlineReviews } from "react-icons/md";
import { PiForkKnifeBold } from "react-icons/pi";
import { SlGlobe } from "react-icons/sl";
import { LuHelpingHand } from "react-icons/lu";
import Logo from '../assests/logoname.png'


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
  const textVariants = {
    hidden: { opacity: 0, y: 50 },
    visible: { opacity: 1, y: 0 },
    exit: { opacity: 0, y: -50 }
  };


const LandingPageContainer = () => {

    const [isVisible, setIsVisible] = useState(true);

  useEffect(() => {
    const timer = setTimeout(() => {
      setIsVisible(false);
    }, 5000); // Time in milliseconds after which icons will disappear

    return () => clearTimeout(timer);
  }, []);
  return (
    
    <div className=' dark:bg-slate-800 w-full h-screen'>
         <h1 className="py-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-purple-800 ">Welcome to the future of Travelling</h1>
         <AnimatePresence>
        <div className="flex justify-around space-between">
            <motion.div
                  className="m-4 flex-row items-center justify-center"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 3  }}
                variants={iconVariants}
            >
                <MdOutlineReviews className="mx-2 text-6xl text-blue-500" />
                <motion.h2 className='text-zinc-500 text-xl'
                 initial="hidden"
                 animate="visible"
                 transition={{ duration: 0.7, delay: 4  }}
                 variants={textVariants}>Reviews</motion.h2>
            </motion.div>
        
            <motion.div
                className="m-4 flex-row items-center justify-center"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 2  }}
                variants={iconVariants}
            >
                <MdOutlineMosque className="mx-2 text-6xl text-blue-500" />
                <motion.h2  initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 4  }}
                variants={textVariants} className='text-zinc-500 text-xl'>Masjids</motion.h2>
            </motion.div>
            <motion.div
                className="m-4 flex-row items-center justify-center"
                initial="hidden"
                animate="visible"
                variants={iconVariants}
            >
                <SlGlobe className="mx-14 text-6xl text-blue-500" />
                <img className='w-40' alt='Safar Logo' src={Logo}/>
            </motion.div>
            <motion.div
                className="m-4 flex-row items-center justify-center"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 2  }}
                variants={iconVariants}
            >
                <LuHelpingHand className="text-6xl text-blue-500" />
                <motion.h2 className='text-zinc-500 text-xl'
                 initial="hidden"
                 animate="visible"
                 transition={{ duration: 0.7, delay: 4  }}
                 variants={textVariants}>Dhikr</motion.h2>
            </motion.div>
            <motion.div
                className="m-4 flex-row items-center justify-center"
                initial="hidden"
                animate="visible"
                transition={{ duration: 0.7, delay: 3  }}
                variants={iconVariants}
            >
                <PiForkKnifeBold className=" text-6xl text-blue-500" />
                <motion.h2 className='mx-2 text-zinc-500 text-xl'
                initial="hidden"
                animate="visible"
                exit='exit'
                transition={{ duration: 0.7, delay: 4  }}
                variants={textVariants}>Food</motion.h2>
            </motion.div>
        </div>
        </AnimatePresence>
    </div>
    
  )
}

export default LandingPageContainer