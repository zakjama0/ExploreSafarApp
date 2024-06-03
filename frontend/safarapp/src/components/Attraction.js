import React from 'react'
import { useLoaderData } from "react-router-dom";
import { useEffect, useState } from "react";

const Attraction = () => {
    const attraction = useLoaderData();
  return (
    <div className="h-full pb-40 dark:bg-slate-800 dark:text-white w-full">
            <div
      className="block w-full bg-white bg-cover p-20 shadow-lg dark:bg-neutral-700"
      style={{
        backgroundImage: `url(${attraction.image})`,
        backgroundSize: 'cover',
        backgroundPosition: 'center',
      }}
    >
      <h1 className="font-bold italic text-6xl text-slate-200  text-center">{attraction.name}</h1>

    </div>
    </div>
  )
}

export default Attraction