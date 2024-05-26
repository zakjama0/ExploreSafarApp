import { Menu, X, Sun, Moon } from 'lucide-react';
import { useEffect, useState } from 'react';
import React from 'react'
import Logo from '../assests/logoname.png'
import { Link, Outlet } from 'react-router-dom';

const NavBar = () => {
    const [mobileDrawerOpen, setMobileDrawerOpen] = useState(false);
    const toggleNavBar = () => {
        setMobileDrawerOpen(!mobileDrawerOpen);
    }
    const [darkMode, setDarkMode] = useState(false);
    const toggleDark = () => {
        setDarkMode(!darkMode);
    }

    useEffect(() => {
        if (darkMode) {
            document.documentElement.classList.add("dark")
        }
        else {
            document.documentElement.classList.remove("dark")
        }
    }, [darkMode])

    return (
        <>
            <nav className='sticky top-0 z-50 py-3 backdrop-blur-lg border-b border-neutral-700/80 dark:bg-gray-800'>
                <div className='container px-4 mx-auto relative text-sm'>
                    <div className='flex justify-between items-center'>
                        <div className='flex items-start flex-shrink-0'>
                            <ul>
                                <li><Link to="/"> <img className='w-40 mr-2' alt='Safar Logo' src={Logo} /> </Link></li>
                            </ul>
                        </div>
                        <ul className='hidden lg:flex ml-14 space-x-12'>
                            <li><Link to="/itineraries">Itineraries</Link></li>
                            <li> <a href={'/'}>Test 2</a> </li>
                            <li> <a href={'/'}>Test 3</a> </li>
                        </ul>
                        <div className="hidden lg:flex justify-center space-x-12 items-center" >
                            <a href='/' className='bg-gradient-to-r from-orange-500 to-orange-800 py-2 px-3 rounded-md'>Create an account</a>
                            {darkMode ? <Moon onClick={toggleDark} className='cursor-pointer' /> : <Sun onClick={toggleDark} className='cursor-pointer' />}
                        </div>
                        <div className='lg:hidden md:flex flex-col justify-end'>
                            <button onClick={toggleNavBar}>
                                {mobileDrawerOpen ? <X /> : <Menu />}
                            </button>
                        </div>
                        {mobileDrawerOpen && (
                            <div className='fixed right-0 z-50 bg-slate-200/80 w-full mt-96 p-12 py-16 flex flex-col justify-center items-center border-b rounded-lg border-neutral-700/80 dark:bg-gray-800/80 lg:hidden'>
                                <ul>
                                    <li className='py-4'> <a href={'/'}>Test 1</a> </li>
                                    <li className='py-4'> <a href={'/'}>Test 2</a> </li>
                                    <li className='py-4'> <a href={'/'}>Test 3</a> </li>

                                </ul>
                                <div className="flex space-x-6">
                                    <a href='/' className='py-2 px-3 border rounded-md'>Sign in</a>
                                    <a href='/' className='py-2 px-3 border rounded-md bg-gradient-to-r from-orange-500 to-orange-800'>Create account</a>
                                    {darkMode ? <Moon onClick={toggleDark} className='cursor-pointer ' /> : <Sun onClick={toggleDark} className='cursor-pointer' />}
                                </div>
                            </div>


                        )}
                    </div>
                </div>
            </nav>
            <Outlet />
        </>
    )
}

export default NavBar