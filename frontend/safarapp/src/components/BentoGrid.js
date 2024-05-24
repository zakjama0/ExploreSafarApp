import React from 'react'
import BentoItem, { SocialMediaBlock } from './BentoItem'
import Logo from '../assests/logoname.png'
import DhikrWhite from '../assests/DhikrWhite.png'
import { ArrowRight } from 'lucide-react';
import {SiInstagram, SiTiktok, SiTwitter, SiYoutube} from 'react-icons/si'
const BentoGrid = () => {
  return (
    <div className='min-h-screen bg-zinc-900 px-4 py-12 text-zinc-50'>
        <div className='mx-auto grid max-w-4xl grid-flow-dense grid-cols-12 gap-4'>
            <BentoItem className='col-span-12 row-span-2 md:col-span-6' >
                <h2 className='mb-12 text-xl font-medium leading-tight'>Lorem Ipsum. {" "} <span className='text-zinc-400'> is simply dummy text of the printing and typesetting industry.</span></h2>
                <img src={Logo} />
                <a href='/' className='flex items-center gap-1 text-red-300 hover:underline'>Try <ArrowRight/> </a>
            </BentoItem>
            <BentoItem className="col-span-6 bg-red-500 md:col-span-3 ">
                <a href='/' className='grid h-full place-content-center text-3xl text-white'>
                <SiYoutube/>
                </a>
            </BentoItem>
            <BentoItem className="col-span-6 bg-blue-500 md:col-span-3 ">
                <a href='/' className='grid h-full place-content-center text-3xl text-white'>
                <SiTwitter/>
                </a>
            </BentoItem>
            <BentoItem className="col-span-6 bg-black-500 dark:bg-white md:col-span-3 ">
                <a href='/' className='grid h-full place-content-center text-3xl text-white dark:text-black'>
                <SiTiktok/>
                </a>
            </BentoItem>
            <BentoItem whileHover={{scale:1.1,}}className="col-span-6 bg-pink-500 md:col-span-3 ">
                <a href='/' className='grid h-full place-content-center text-3xl text-white'>
                <SiInstagram/>
                </a>
            </BentoItem>
            <BentoItem className="col-span-12 text-3xl leading-snug">
            <h2 className='mb-12 text-xl font-medium leading-tight grid h-full place-content-center'>Lorem Ipsum. {" "} <span className='text-zinc-400'> is simply dummy text of the printing and typesetting industry.</span></h2>
            </BentoItem>
            <BentoItem className="col-span-3 row-span-10 flex flex-row justify-between">
            <h2 className='mb-12 text-xl font-medium leading-tight'>Lorem Ipsum. {" "}</h2>
                <img src={DhikrWhite} className='w-24 h-24 bottom-0 left-0'/>
            </BentoItem>
            <BentoItem className="col-span-3 row-span-10 flex flex-row justify-between">
            <h2 className='mb-12 text-xl font-medium leading-tight'>Lorem Ipsum. {" "}</h2>
                <img src={DhikrWhite} className='w-24 h-24 bottom-0 left-0'/>
            </BentoItem>
            <BentoItem className="col-span-3 row-span-10 flex flex-row justify-between">
            <h2 className='mb-12 text-xl font-medium leading-tight'>Lorem Ipsum. {" "}</h2>
                <img src={DhikrWhite} className='w-24 h-24 bottom-0 left-0'/>
            </BentoItem>
            <BentoItem className="col-span-3 row-span-10 flex flex-row justify-between">
            <h2 className='mb-12 text-xl font-medium leading-tight'>Lorem Ipsum. {" "}</h2>
                <img src={DhikrWhite} className='w-24 h-24 bottom-0 left-0'/>
            </BentoItem>
        </div>
    </div>
  )
}

export default BentoGrid