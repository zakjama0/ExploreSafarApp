import React from 'react'
import mountain from '../assests/loginImg.jpg'
import Logo from '../assests/SafarLog.jpg'

const Log = () => {
  return (
    <section class="bg-[#d2dbd8] min-h-screen flex flex-col items-center                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ">

    <img src={Logo} alt="Safar Logo" class="w-[100px] mt-8 mb-8"/>

    <div class="bg-gray-100 mx-3 flex rounded-2xl shadow-lg max-w-3xl w-full h-auto">

        <div class="w-full sm:w-1/2 p-12 flex flex-col justify-center">

            <h2 class="font-bold text-2xl text-[#C8AECD]">Login</h2>

            <p class="text-sm mt-4 text-[#C8AECD]">If you already have an account, log in easily</p>




            <form action="" class="flex flex-col gap-4 mt-8">

                <input class="p-2 rounded-xl border w-full mb-4" type="text" name="email" placeholder="Email"/>

                <div class="relative">

                    <input class="p-2 rounded-xl border w-full" type="password" name="password" placeholder="Password"/>

                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye absolute top-1/2 right-4 transform -translate-y-1/2 cursor-pointer" viewBox="0 0 16 16">

                        <path d="M16 8s-3-5.5-8-5.5S0 8 0 8s3 5.5 8 5.5S16 8 16 8M1.173 8a13 13 0 0 1 1.66-2.043C4.12 4.668 5.88 3.5 8 3.5s3.879 1.168 5.168 2.457A13 13 0 0 1 14.828 8q-.086.13-.195.288c-.335.48-.83 1.12-1.465 1.755C11.879 11.332 10.119 12.5
 8 12.5s-3.879-1.168-5.168-2.457A13 13 0 0 1 1.172 8z"/>

                        <path d="M8 5.5a2.5 2.5 0 1 0 0 5 2.5 2.5 0 0 0 0-5M4.5 8a3.5 3.5 0 1 1 7 0 3.5 3.5 0 0 1-7 0"/>

                    </svg>

                </div>

                <button class="bg-[#C8AECD] p-2 rounded-xl text-white py-2 hover:scale-105 duration-300">Login</button>

            </form>




            <div class="mt-10 grid grid-cols-3 items-center text-gray-400">

                <hr class="border-gray-400"/>
                <hr class="border-gray-400"/>
                <hr class="border-gray-400"/>

            </div>




            <p class="mt-5 text-xs text-center text-[#C8AECD]">Forgot your password?</p>




            <div class="mt-5 text-xs flex justify-between items-center">

                <p class="text-[#C8AECD]">Don't have an account?</p>

                <a href="signup.html" class="py-2 px-5 bg-white border rounded-xl text-[#C8AECD] hover:scale-105 duration-300">Register</a>

            </div>

        </div>




        <div class="hidden sm:block w-1/2">

            <img class="rounded-2xl h-full object-cover" src={mountain} alt="Login Image"/>

        </div>

    </div>

</section>

  )
}

export default Log