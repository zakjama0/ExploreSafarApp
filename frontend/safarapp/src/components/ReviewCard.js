import React from 'react'
import { useContext, useState } from "react";
import { userState } from "../containers/MainContainer";

const ReviewCard = ({review, deleteReview, editReview}) => {

    const [expandStatus, setExpandStatus] = useState(false);
    const { activeCustomer } = useContext(userState);

    const handleDeleteButton = () => {
        deleteReview(review.id);
    }

    const toggleExpandStatus = () => {
        setExpandStatus((expandStatus) => !expandStatus);
    }

    const toggleButtonLabel = () => {
        if (!expandStatus) {
            return "More"
        }
        return "Less"
    }


  return (
    <div>
        <div className="m-3 border border-gray-200 p-4 rounded-md shadow-md">
    <h3 className="text-lg font-semibold">{review.user.name}</h3>
    <p className="text-gray-600">Rating: {review.rating}</p>
    {expandStatus && <p className="text-gray-600">Comment: {review.comment}</p>}
    <button
        onClick={toggleExpandStatus}
        className="mt-2 inline-block bg-blue-500 text-white py-1 px-4 rounded-md shadow-md hover:bg-blue-600 focus:outline-none focus:ring focus:ring-blue-400"
    >
        {toggleButtonLabel()}
    </button>
    {activeCustomer.id === review.user.id ? (
        <button
            onClick={handleDeleteButton}
            className="mt-2 ml-2 inline-block bg-red-500 text-white py-1 px-4 rounded-md shadow-md hover:bg-red-600 focus:outline-none focus:ring focus:ring-red-400"
        >
            Delete
        </button>
    ) : (
        <></>
    )}
</div>

    </div>
  )
}

export default ReviewCard