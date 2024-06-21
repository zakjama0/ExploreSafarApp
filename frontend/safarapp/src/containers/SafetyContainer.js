import React from 'react'

const SafetyContainer = () => {
  return (
    <div   className=' bg-[#d2dbd8] dark:bg-slate-800 w-full h-full min-h-screen'>
        <h1 className="py-5 mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-pink-400 via-pink-500 to-pink-800 ">Safar Safety</h1>
        

        <div className=''>
        <h2 className='text-center mt-4'>Do your research on the location</h2>
        <p className='text-center mt-4'>
            Understanding the location youre going to is amongst the most important things you need to do inorder to protect yourself.
            Read reviews from Safar on attractions and read blogs on other muslim's experience in the city.
            For British citizens use the UK's <a className="text-blue-500 underline" href={"https://www.gov.uk/foreign-travel-advice"}>Foreign Travel Advice</a>, and follow the specific guidelines for your chosen location.

        </p>
        </div>
    </div>
  )
}

export default SafetyContainer