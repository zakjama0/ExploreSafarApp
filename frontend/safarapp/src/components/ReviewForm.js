import { useContext, useState } from "react";
import React from 'react'
import { userState } from '../containers/MainContainer'

const ReviewForm = ({attractionId, postReview}) => {
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
    <form onSubmit={handleSubmit} className="reviews-form bg-gradient-to-b from-teal-500 via-indigo-600 to-brown-900 border-2 border-yellow-600 backdrop-filter bg-blur shadow-md text-white rounded-lg p-4 sm:p-8">
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
    <button type="submit" className="review-btn w-full">Submit Review</button>
</form>

  )
}

export default ReviewForm