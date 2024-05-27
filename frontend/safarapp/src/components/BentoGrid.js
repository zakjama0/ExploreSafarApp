import React, { useEffect, useState } from 'react';
import BentoItem, { SocialMediaBlock } from './BentoItem'
import Logo from '../assests/logoname.png'
import GlobeLanding from '../assests/cornerglobe.png'
import DhikrWhite from '../assests/DhikrWhite.png'
import DhikrBlack from '../assests/DhikrBlack.png'
import { ArrowRight } from 'lucide-react';
import {SiInstagram, SiTiktok, SiTwitter, SiYoutube} from 'react-icons/si'
const BentoGrid = () => {
 
  return (
    <div className='min-h-screen bg-white dark:bg-slate-800 w-full px-4 py-12 text-zinc-50'>
        <div className='mx-auto grid max-w-4xl grid-flow-dense grid-cols-12 gap-4'>
            <BentoItem className='col-span-12 row-span-2 md:col-span-6 relative p-4' >
                <h2 className='mb-12 text-xl font-medium leading-tight'>Introducing the beta version of our app: your ultimate companion for seamless, Muslim-friendly travel experiences!</h2>
                <img src={GlobeLanding} className='absolute bottom-0 right-0 w-32 h-32'/>
                <a href='/' className='flex items-center gap-1 text-red-300 hover:underline'>Try <ArrowRight/> </a>
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
            <h2 className='mb-12 text-xl text-zinc-900 font-medium leading-tight dark:text-white'>Lorem Ipsum. {" "}</h2>
                <img src={GlobeLanding} className='absolute bottom-0 right-0 w-28 h-28'/>
            </BentoItem>
            <BentoItem className="md:col-span-3 col-span-12 row-span-10 relative p-4">
            <h2 className='mb-12 text-xl font-medium text-zinc-900 leading-tight dark:text-white'>Duas & Dhikr. {" "}</h2>
                <img src={DhikrWhite} className='hidden dark:absolute bottom-0 right-0 w-24 h-24'/>
                <img src={DhikrBlack} className='absolute bottom-0 right-0 w-24 h-24 dark:hidden '/>
            </BentoItem>
            <BentoItem className="md:col-span-3 col-span-12 row-span-10 flex flex-row justify-between">
            <h2 className='mb-12 text-xl font-medium text-zinc-900 leading-tight dark:text-white'>Lorem Ipsum. {" "}</h2>
                <img src={DhikrWhite} className='w-24 h-24 bottom-0 left-0'/>
            </BentoItem>
            <BentoItem className="md:col-span-3 col-span-12 row-span-10 flex flex-row justify-between">
            <h2 className='mb-12 text-xl font-medium text-zinc-900 leading-tight dark:text-white'>Lorem Ipsum. {" "}</h2>
                <img src={DhikrWhite} className='w-24 h-24 bottom-0 left-0'/>
            </BentoItem>
        </div>
    </div>
  )
}

export default BentoGrid