import React from 'react'
import {motion} from 'framer-motion'
import {twMerge} from 'tailwind-merge'
import { Youtube, YoutubeIcon } from 'lucide-react';


const BentoItem = ({className, ...rest}) => {
  return (
    <motion.div {...rest} className={twMerge('col-span-4 rounded-lg border border-zinc-800 dark:border-zinc-200 p-6', className)}/>
  )
}



export default BentoItem;
