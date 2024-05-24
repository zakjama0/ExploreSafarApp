import React from 'react'
import BentoItem, { SocialMediaBlock } from './BentoItem'
import Logo from '../assests/logoname.png'
import { ArrowRight } from 'lucide-react';
import {SiInstagram, SiTiktok, SiTwitter, SiYoutube} from 'react-icons/si'
const BentoGrid = () => {
  return (
    <div className='min-h-screen bg-zinc-900 px-4 py-12 text-zinc-50'>
        <div className='mx-auto grid max-w-4xl grid-flow-dense grid-cols-12 gap-4'>
            <BentoItem className={'col-span-12 row-span-12 md:col-span-6'} >
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
            <BentoItem className="col-span-6 bg-black-500 md:col-span-3 ">
                <a href='/' className='grid h-full place-content-center text-3xl text-white'>
                <SiTiktok/>
                </a>
            </BentoItem>
            <BentoItem className="col-span-6 bg-pink-500 md:col-span-3 ">
                <a href='/' className='grid h-full place-content-center text-3xl text-white'>
                <SiInstagram/>
                </a>
            </BentoItem>
            <BentoItem />
            <BentoItem />
            <BentoItem />
            <BentoItem />
        </div>
    </div>
  )
}

export default BentoGrid