import React, { useState, useRef, useEffect } from 'react'
import {  motion, useInView, useAnimation, } from 'framer-motion';
import { HiArrowNarrowRight } from 'react-icons/hi';
import SafarAnimation from '../components/SafarAnimation';
import BentoGrid from '../components/BentoGrid';
import { duration } from '@mui/material';
import Cappadocia from '../assests/Cappadocia.jpeg'
import Hike from '../assests/Hike.png'
import MuslimCouple from '../assests/MuslimCouple.png'
import { Link} from 'react-router-dom';



const tips = [
  {
    title: "Best places to discover Islamic History across the globe",
    description: "Explore the rich Islamic heritage around the world, from the magnificent Alhambra in Spain to the grand mosques of the Middle East.",
    image: "https://cdn.audleytravel.com/5595/3996/79/1342712-patio-de-los-leones-alhambra-granada.jpg"
  },
  {
    title: "Essential items to have in your travel bag.",
    description: "Ensure you have all the essentials for a hassle-free trip, including a travel pillow, portable charger, reusable water bottle, and more.",
    image: "https://149358801.v2.pressablecdn.com/wp-content/uploads/2020/05/IMG_1593-1200x653.png" // Replace with actual path
  },
  {
    title: "Everything you need for that Japan trip",
    description: "Prepare for an unforgettable journey through Japan with our comprehensive packing list, travel tips, and must-visit destinations.",
    image: "https://www.state.gov/wp-content/uploads/2019/04/Japan-2107x1406.jpg" // Replace with actual path
  },
  {
    title: "The Delicacy of Vietnamese Egg Coffee, You Must Try",
    description: "Discover the unique and delicious Vietnamese egg coffee, a must-try beverage that combines rich coffee with creamy egg yolk.",
    image: "https://www.thespruceeats.com/thmb/b2_OB5pw7FF6WmodM1l_jkOyu3c=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/vietnamese-egg-coffee-3030347-hero-01-9897b12116fc4439b415c63110aa90e6.jpg" // Replace with actual path
  },
  {
    title: "The gems of Africa",
    description: "Uncover the hidden gems of Africa, from the stunning landscapes of Namibia to the vibrant cultures of West Africa.",
    image: "https://www.safarisource.com/media/wysiwyg/Namibiaimage.jpg" // Replace with actual path
  },
  {
    title: "Islam in South America: How did it grow?",
    description: "Learn about the history and growth of Islam in South America, and explore the unique cultural influences it has had across the continent.",
    image: "https://assets.evcdn.net/pim-assets-images/82503/5ea01cbfe83fb.jpeg" // Replace with actual path
  }
];



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
          <h2 className='mb-10 mx-5 text-sm md:text-base lg:text-lg text-black dark:text-white  md:mx-10 text-left leading-relaxed'>The app that simplifies Muslim travel by providing tailored itineraries, halal food recommendations, nearby mosques, and authentic duas and dhikr for various occasions. Designed to ensure a seamless, faith-aligned experience, in which we make journeys both enjoyable and spiritually fulfilling</h2>
          <div className="flex items-center justify-center mt-3">
          <Link to='/itineraries' className='text-lg text-white bg-gradient-to-r from-blue-500 to-blue-800 py-2 px-3 mr-10 rounded-md dark:text-white'>Get started {" "}<button
          className='text-sm'
      >
        <HiArrowNarrowRight className="" />
      </button></Link>
      <Link to='/safety' className='text-lg text-white bg-gradient-to-r from-pink-500 to-pink-800 py-2 px-3 rounded-md dark:text-white'>Safar Safety{" "}<button
          className='text-sm'
      >
        <HiArrowNarrowRight className="" />
      </button></Link>
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
      <div className="container mx-auto px-4 py-8">
      <h1 className="text-3xl text-black dark:text-white font-bold text-center mb-8">Halal Travel Tips & Itineraries</h1>
      <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-6">
        {tips.map((tip, index) => (
          <div key={index} className="bg-[#d2dbd8] rounded-lg overflow-hidden transform hover:scale-105 transition-transform duration-200">
            <img className="w-full h-48 object-cover" src={tip.image} alt={tip.title} />
            <div className="p-4">
              <h2 className="text-xl text-black font-semibold mb-2">{tip.title}</h2>
              <p className="text-gray-700">{tip.description}</p>
            </div>
          </div>
        ))}
      </div>
    </div>
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