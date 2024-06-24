import React from 'react'
import { Link } from 'react-router-dom';
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
const BlogContainer = () => {
  return (
    <div className='h-full min-h-screen w-full bg-[#d2dbd8]'>
    <div className=" bg-[#d2dbd8] container mx-auto px-4 py-8">
    <h1 className="text-3xl text-black dark:text-white font-bold text-center mb-8">Halal Travel Tips & Itineraries</h1>
    <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-6">
      {tips.map((tip, index) => (
        <Link to={`/${tip.title}`}>
        <div key={index} className=" rounded-lg overflow-hidden transform hover:scale-105 transition-transform duration-200">
          <img className="w-full h-48 object-cover" src={tip.image} alt={tip.title} />
          <div className="p-4">
            <h2 className="text-xl text-black font-semibold mb-2">{tip.title}</h2>
            <p className="text-gray-700">{tip.description}</p>
          </div>
        </div>
        </Link>
      ))}
    </div>
  </div>
    </div>
  )
}

export default BlogContainer