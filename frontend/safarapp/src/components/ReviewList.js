import React from 'react'
import Carousel from 'react-multi-carousel';
import ReviewCard from './ReviewCard';


const ReviewList = ({ reviews, deleteReview, editReview }) => {
    const reviewComponents = reviews.map(review => (
        <ReviewCard
            key={review.id}
            review={review}
            deleteReview={deleteReview}
            editReview={editReview}
        />
    ));

    const responsive = {
        desktop: {
          breakpoint: { max: 3000, min: 1024 },
          items: 3,
          slidesToSlide: 1 // optional, default to 1.
        },
        tablet: {
          breakpoint: { max: 1024, min: 464 },
          items: 2,
          slidesToSlide: 2 // optional, default to 1.
        }
      };
    


    return (
        <div className="">
            <Carousel responsive={responsive} >{reviewComponents}</Carousel>
        </div>
    );
};

export default ReviewList;