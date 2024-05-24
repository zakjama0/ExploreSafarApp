import Morocco from '../assests/Morocco.jpeg'
const Card = ({name, image}) => {
    return ( <>
    

<div class="max-w-sm my-4 bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700 dark:text-white">
    <a href="#">
        <img class="rounded-t-lg w-full h-60" src={image} alt="" />
    </a>
    <div class="p-5">
        <a href="#">
            <h5 class="mb-2 text-2xl font-bold tracking-tight text-gray-900 ">{name}</h5>
        </a>
        
    </div>
</div>

    
    </> );
}
 // dark:bg-gray-800 dark:border-gray-700 dark:text-white
export default Card;