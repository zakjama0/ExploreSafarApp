// src/components/TikTokButton.js
import React from 'react';

const TikTokButton = ({source}) => {
  return (
    <a
      href={source}
      target="_blank"
      rel="noopener noreferrer"
      className="mx-4 inline-flex items-center px-4 py-2 bg-black text-white font-semibold rounded-lg shadow-md hover:bg-gray-800 focus:outline-none focus:ring-2 focus:ring-black focus:ring-opacity-75"
    >
      <svg
      fill="currentColor"
      viewBox="0 0 16 16"
      height="1em"
      width="1em"
      
    >
      <path d="M9 0h1.98c.144.715.54 1.617 1.235 2.512C12.895 3.389 13.797 4 15 4v2c-1.753 0-3.07-.814-4-1.829V11a5 5 0 11-5-5v2a3 3 0 103 3V0z" />
    </svg>
     <p className='mx-5'>TikTok</p> 
    </a>
  );
};

export default TikTokButton;
