import React from 'react';

const Modal = ({ isOpen, onClose }) => {
  return (
    <div
      className={`fixed inset-0 z-50 flex items-end transition-opacity duration-300 ${isOpen ? 'opacity-100 pointer-events-auto' : 'opacity-0 pointer-events-none'}`}
    >
      <div className="fixed inset-0 bg-black opacity-50" onClick={onClose}></div>
      <div
        className={`bg-white rounded-t-lg w-full p-5 transform transition-transform duration-300 ${isOpen ? 'translate-y-0' : 'translate-y-full'}`}
        onClick={(e) => e.stopPropagation()}
      >
        <span className="text-2xl font-bold cursor-pointer" onClick={onClose}>
          &times;
        </span>
        <h2 className="text-lg font-bold mt-2">Modal Title</h2>
        <p className="mt-2">This is the modal content.</p>
      </div>
    </div>
  );
};

export default Modal;
