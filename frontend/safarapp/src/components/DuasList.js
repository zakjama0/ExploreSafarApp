import React, { useState } from 'react';
import { ArrowBigDown, ArrowDown, ArrowUp } from 'lucide-react';

const DuasList = ({ duas }) => {
  // Initialize the open state array with all values set to false
  const [isOpenArray, setIsOpenArray] = useState(Array(duas.length).fill(false));

  const toggleContent = (index) => {
    setIsOpenArray(isOpenArray.map((isOpen, i) => (i === index ? !isOpen : isOpen)));
  };

  return (
    <div>
      {duas.map((dua, index) => (
        <div key={index} className="max-w-md mx-auto p-4 border rounded-lg shadow-lg mb-4">
          <div className="flex justify-between items-center">
            <h2 className="text-xl font-bold">{dua.name}</h2>
            <button
              onClick={() => toggleContent(index)}
              className="bg-blue-500 text-white px-2 py-1 rounded-lg focus:outline-none"
            >
              {isOpenArray[index] ? <ArrowUp/> : <ArrowDown/>}
            </button>
          </div>
          {isOpenArray[index] && (
            <div className="mt-4">
              <p className="mt-2">{dua.arabic}</p>
              <p className="mt-2">{dua.transliteration}</p>
              <p className="mt-2">{dua.translation}</p>
              <p className="mt-2">{dua.explanation}</p>
              <p className="mt-2">{dua.source}</p>
            </div>
          )}
        </div>
      ))}
    </div>
  );
};

export default DuasList;