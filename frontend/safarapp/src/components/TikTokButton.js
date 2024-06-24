// src/components/TikTokButton.js
import React from 'react';

const TikTokButton = ({source}) => {
  return (
    <a
      href={source}
      target="_blank"
      rel="noopener noreferrer"
      className="inline-flex items-center px-4 py-2 bg-black text-white font-semibold rounded-lg shadow-md hover:bg-gray-800 focus:outline-none focus:ring-2 focus:ring-black focus:ring-opacity-75"
    >
      <svg
        className="w-6 h-6 mr-2"
        fill="currentColor"
        viewBox="0 0 24 24"
        xmlns="http://www.w3.org/2000/svg"
      >
        <path d="M9 3v4a7 7 0 01-5 6.75 7 7 0 006.24-6.73H15a6 6 0 01-1.23 3.73 8 8 0 01-3.77 3.2V21a9 9 0 004.5-1.22 9 9 0 005-7.78v-6.5H19v3.7a4 4 0 01-1.45-.31 4 4 0 01-2.15-3.19h-2.72V8a6.14 6.14 0 01-4.2 1.7A6 6 0 019 3zm-1 8a2 2 0 100 4 2 2 0 000-4z"/>
      </svg>
      TikTok
    </a>
  );
};

export default TikTokButton;
