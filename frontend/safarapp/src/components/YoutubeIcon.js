// src/components/YouTubeButton.js
import React from 'react';

const YouTubeButton = ({source}) => {
  return (
    <a
      href={source}
      target="_blank"
      rel="noopener noreferrer"
      className="mx-6 inline-flex items-center px-4 py-2 bg-red-600 text-white font-semibold rounded-lg shadow-md hover:bg-red-700 focus:outline-none focus:ring-2 focus:ring-red-500 focus:ring-opacity-75"
    >
      <svg
        className="w-6 h-6 mr-2"
        fill="currentColor"
        viewBox="0 0 24 24"
        xmlns="http://www.w3.org/2000/svg"
      >
        <path d="M23.499 6.203a2.994 2.994 0 00-2.117-2.12C19.474 3.5 12 3.5 12 3.5s-7.474 0-9.382.583a2.994 2.994 0 00-2.117 2.12C.5 8.132.5 12 .5 12s0 3.868.501 5.797a2.994 2.994 0 002.117 2.12C4.526 20.5 12 20.5 12 20.5s7.474 0 9.382-.583a2.994 2.994 0 002.117-2.12C23.5 15.868 23.5 12 23.5 12s0-3.868-.501-5.797zM9.797 15.341V8.659l6.336 3.341-6.336 3.341z" />
      </svg>
      YouTube
    </a>
  );
};

export default YouTubeButton;
