import { useContext, useState } from "react";
import React from 'react'
import { userState } from '../containers/MainContainer'

const ReviewForm = () => {
    const [rating, setRating] = useState(0);
    const [comment, setComment] = useState('');
    const { activeCustomer } = useContext(userState);
    
  return (
    <div>

    </div>
  )
}

export default ReviewForm