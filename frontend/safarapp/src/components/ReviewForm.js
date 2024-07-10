import { useContext, useState } from "react";
import React from 'react'
import { userState } from '../containers/MainContainer'

const ReviewForm = ({ attractionId, postReview }) => {
  const [rating, setRating] = useState(0);
  const [comment, setComment] = useState('');
  const { activeCustomer } = useContext(userState);

  const handleSubmit = (event) => {
    event.preventDefault();

    postReview({
      attractionId: attractionId,
      customerId: activeCustomer.id,
      rating: rating,
      comment: comment
    });
    alert("Review has been added.");
  };

  return (
    <form onSubmit={handleSubmit} className="m-2 bg-gradient-to-b from-teal-500 via-teal-600 to-teal-900 border-2 backdrop-filter bg-blur shadow-md text-white rounded-lg p-4 sm:p-8">
      <div className="mb-4">
        <label htmlFor="rating" className="block text-white">Rating:</label>
        <input
          type="number"
          id="rating"
          value={rating}
          onChange={(event) => setRating(parseInt(event.target.value))}
          min={1}
          max={5}
          required
          className="bg-white border-2 border-green-600 rounded-lg py-2 px-4 text-green-600 font-bold text-center focus:outline-none focus:border-green-900 w-full"
        />
      </div>
      <div className="mb-4">
        <label htmlFor="comment" className="block text-white">Comment:</label>
        <textarea
          id="comment"
          value={comment}
          rows="4" cols="50"
          onChange={(event) => setComment(event.target.value)}
          required
          className="bg-white border-2 border-green-600 rounded-lg py-2 px-4 text-green-600 font-bold text-center focus:outline-none focus:border-green-900 w-full"
        ></textarea>
      </div>
      <div className="register-button flex justify-center">
        <input
          className="register-btn w-40 h-12 bg-white border-none outline-none rounded-full shadow-md cursor-pointer text-lg text-teal-500 font-semibold text-center"
          type="submit"
          value="Submit Form"
        />
      </div>
    </form>

  )
}

export default ReviewForm