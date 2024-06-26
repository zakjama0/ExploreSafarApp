const ItineraryCard = ({ img, startDate, endDate }) => {



    return (
        <>
            <div class="bg-[#d2dbd8] max-w-sm m-4 border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700">
                <a href="#">
                    <img class="rounded-t-lg w-full h-60" src={img} alt="" />
                </a>
                <div class="p-5">
                    <a href="#">
                        <h5 class="mb-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white">CHANGE HERE</h5>
                    </a>

                </div>
            </div>
        </>
    )
}

export default ItineraryCard;