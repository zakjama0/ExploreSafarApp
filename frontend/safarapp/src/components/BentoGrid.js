import React, { useEffect, useState } from 'react';
import BentoItem, { SocialMediaBlock } from './BentoItem'
import GlobeLanding from '../assests/cornerglobe.png'
import DhikrWhite from '../assests/DhikrWhite.png'
import DhikrBlack from '../assests/DhikrBlack.png'
import VectorWhite from '../assests/VectorWhite.png'
import VectorBlack from '../assests/VectorBlack.png'
import MasjidWhite from '../assests/MasjidWhite.png'
import MasjidBlack from '../assests/MasjidBlack.png'
import BulbWhite from '../assests/BulbWhite.png'
import BulbBlack from '../assests/BulbBlack.png'
import { ArrowRight } from 'lucide-react';
import { HiArrowNarrowRight } from 'react-icons/hi';
import { Link} from 'react-router-dom';


const BentoGrid = () => {
    const [isDark, setIsDark] = useState(true);

    useEffect(() => {
      const htmlElement = document.documentElement;
      const isDarkMode = htmlElement.classList.contains('dark');
      setIsDark(isDarkMode);
    }, []);

    
  return (
    <div className='pb-10 bg-[#d2dbd8] dark:bg-slate-800 w-full px-4 py-4 text-zinc-50'>
        <div className='mx-auto grid max-w-4xl grid-flow-dense grid-cols-12 gap-4'>
            <BentoItem className='col-span-12 row-span-2 md:col-span-6 relative p-4' >
                <h2 className='mb-12 text-lg font-medium leading-tight text-black dark:text-white'>We're thrilled to introduce the beta version of our app, offering exclusive early access to key features, so you can help us shape and perfect the ultimate faith-aligned travel companion!</h2>
            
            </BentoItem>
            <BentoItem whileHover={{scale:1.1,}}className="col-span-6 bg-gradient-to-r from-pink-500 to-blue-500 md:col-span-3 ">
            <h1 className=" text-5xl text-center font-bold text-white ">1</h1>
            <h1 className="text-center">app for your travel needs</h1>
            </BentoItem>
            <BentoItem whileHover={{scale:1.1,}}className="col-span-6 md:col-span-3 ">
            <h1 className="text-4xl md:text-5xl text-center  text-gradient font-bold bg-gradient-to-r from-pink-500 to-blue-500 ">1000+</h1>
            <h1 className="text-center text-black dark:text-white">activities in your disposal *</h1>
            </BentoItem>
            <BentoItem whileHover={{scale:1.1,}}className="col-span-6 md:col-span-3 ">
            <h1 className=" text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-purple-800 ">100+</h1>
            <h1 className="text-center text-black dark:text-white">countries to discover</h1>
            </BentoItem>
            <BentoItem whileHover={{scale:1.1,}}className="col-span-6 bg-gradient-to-r from-pink-500 to-blue-500 md:col-span-3 ">
            <h1 className=" text-4xl text-center font-bold text-white "> <> &#123; &#125;</></h1>
            <h1 className="text-center text-sm">created by young muslims</h1>
            </BentoItem>
            <BentoItem className="col-span-12 text-3xl leading-snug">
            <h2 className='mb-12 text-xl text-center dark:text-white text-black font-medium leading-tight grid h-full place-content-center'>Introducing the beta version of our app: your ultimate companion for seamless, Muslim-friendly travel experiences!</h2>
            </BentoItem>
            <BentoItem className="md:col-span-3 row-span-10 relative p-4 col-span-12">
            <h2 className='mb-3 text-xl text-zinc-900 font-medium leading-tight dark:text-white'>Itineraries. {" "}</h2>
            <h3 className='dark:text-white text-black text-sm md:hidden w-60 mb-3'>The in app itinerary builder, the easiest way to plan your dream trip.</h3>
            <Link to='/itineraries' className='md:hidden text-sm bg-gradient-to-r from-blue-500 to-blue-800 py-2 px-3 rounded-md dark:text-white'>Learn more {" "}<button
                className='text-sm'
                    >
                <HiArrowNarrowRight className="" />
             </button></Link>
            <img src={VectorBlack} className='absolute bottom-0 right-0 w-24 h-24 dark:hidden'/>
            <img src={VectorWhite} className='hidden dark:block   dark:absolute dark:bottom-0 dark:right-0 dark:w-24 dark:h-24 z-10 '/>
            </BentoItem>
            <BentoItem className="md:col-span-3 col-span-12 row-span-10 relative p-4">
            <h2 className='mb-3 text-xl font-medium text-zinc-900 leading-tight dark:text-white'>Duas and Etiquette. {" "}</h2>
            <h3 className='dark:text-white text-black text-sm md:hidden w-60 mb-3'>Enhance your travels with blessings by remembering the Creator of the heavens and the earth. </h3>
            <Link to='/duas' className='md:hidden text-sm bg-gradient-to-r from-blue-500 to-blue-800 py-2 px-3 rounded-md dark:text-white'>Learn more {" "}<button
                className='text-sm'
                    >
                <HiArrowNarrowRight className="" />
             </button></Link>
                <img src={DhikrBlack} className='absolute bottom-0 right-0 w-24 h-24 dark:hidden'/>
                <img src={DhikrWhite} className='hidden dark:block   dark:absolute dark:bottom-0 dark:right-0 dark:w-24 dark:h-24 z-10 '/>
            </BentoItem>
            <BentoItem className="md:col-span-3 col-span-12 row-span-10 relative p-4">
            <h2 className='mb-3 text-xl font-medium text-zinc-900 leading-tight dark:text-white'>Masjids and Food {" "}</h2>
            <h3 className='dark:text-white text-black text-sm md:hidden w-60 mb-3'>Discover nearby halal food and mosques with our interactive map. </h3>
            <Link to='/maps' className='md:hidden text-sm bg-gradient-to-r from-blue-500 to-blue-800 py-2 px-3 rounded-md dark:text-white'>Learn more {" "}<button
                className='text-sm'
                    >
                <HiArrowNarrowRight className="" />
             </button></Link>
                <img src={MasjidBlack} className='absolute bottom-0 right-0 w-18 h-24 dark:hidden'/>
                <img src={MasjidWhite} className='hidden dark:block   dark:absolute dark:bottom-0 dark:right-0 dark:w-18 dark:h-24 z-10 '/>
            </BentoItem>
            <BentoItem className="md:col-span-3 col-span-12 row-span-10 relative p-4">
            <h2 className='mb-3 text-xl font-medium text-zinc-900 leading-tight dark:text-white'>Have your say. {" "}</h2>
            <h3 className='dark:text-white text-black text-sm md:hidden w-60 mb-3'>Designed to be a community first application, share your favoruite activities below. </h3>
            <a href='https://forms.gle/aAUjgemrFXHwqM2Y8' className='md:hidden before:text-sm bg-gradient-to-r from-blue-500 to-blue-800 py-2 px-3 rounded-md dark:text-white'>Learn more {" "}<button
                className='text-sm'
                    >
                <HiArrowNarrowRight className="" />
             </button></a>
                <img src={BulbBlack} className='absolute bottom-0 right-0 w-18 h-24 dark:hidden'/>
                <img src={BulbWhite} className='hidden dark:block   dark:absolute dark:bottom-0 dark:right-0 dark:w-18 dark:h-24 z-10 '/>
            </BentoItem>
        </div>
    </div>
  )
}

export default BentoGrid