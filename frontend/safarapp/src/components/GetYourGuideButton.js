// src/components/GetYourGuideButton.js
import React from 'react';

const GetYourGuideButton = ({source}) => {
  return (
    <a
      href={source}
      target="_blank"
      rel="noopener noreferrer"
      className="inline-flex items-center px-4 py-2 bg-blue-600 text-white font-semibold rounded-lg shadow-md hover:bg-blue-700 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-opacity-75"
    >
      <svg
        className="w-6 h-6 mr-2"
        fill="currentColor"
        viewBox="0 0 24 24"
        xmlns="https://logovectorseek.com/getyourguide-logo-vector-svg/"
      >
        <path d="M3 12a9 9 0 1118 0 9 9 0 01-18 0zm9-8a8 8 0 100 16A8 8 0 0012 4zm1 11H8v-1h5v1zm2.5-2.5h-10v-1h10v1zM14 10H8V9h6v1z" />
      </svg>
      GetYourGuide
    </a>
  );
};

export default GetYourGuideButton;
