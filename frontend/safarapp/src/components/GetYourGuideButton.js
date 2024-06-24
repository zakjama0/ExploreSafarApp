// src/components/GetYourGuideButton.js
import React from 'react';

const GetYourGuideButton = ({source}) => {
  return (
    <a
      href={source}
      target="_blank"
      rel="noopener noreferrer"
      className="inline-flex items-center px-4 py-2 bg-orange-600 text-white font-semibold rounded-lg shadow-md hover:bg-orange-700 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-opacity-75"
    >
      
      GetYourGuide
    </a>
  );
};

export default GetYourGuideButton;
