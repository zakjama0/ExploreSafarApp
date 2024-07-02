// src/IslamicHistoryPage.js
import React from 'react';
import 'tailwindcss/tailwind.css';

const islamicHistoryData = [
  {
    title: 'Alhambra, Spain',
    description: 'The Alhambra is a palace and fortress complex located in Granada, Andalusia, Spain. It is one of the finest examples of Islamic architecture in Europe. The site’s most notable features include the Alcazaba, the Nasrid Palaces, and the Generalife. The Alhambra is not only a symbol of the Moorish presence in Spain, but it is also a testament to the rich cultural exchanges that occurred over centuries.',
    imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/e/eb/Alhambra-patio-de-los-leones.jpg',
  },
  {
    title: 'Marrakech, Morocco',
    description: 'Marrakech is a city rich in history and culture. The medina is a UNESCO World Heritage site and home to stunning examples of Islamic architecture, including the Koutoubia Mosque, the Saadian Tombs, and the Bahia Palace. The vibrant souks and historical sites reflect the city’s long history as a cultural and religious center.',
    imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/5/58/Koutoubia_from_air.JPG',
  },
  {
    title: 'Cairo, Egypt',
    description: 'Cairo is home to numerous historical sites, including the Citadel of Saladin, the Sultan Hassan Mosque, and the Al-Azhar University. The city’s rich history as a center of Islamic learning and culture makes it a fascinating destination for history enthusiasts.',
    imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/4/4d/Mosque_of_Muhammad_Ali_Pasha.jpg',
  },
  {
    title: 'Samarkand, Uzbekistan',
    description: 'Samarkand is one of the oldest cities in Central Asia and a key stop along the Silk Road. Its stunning Islamic architecture includes the Registan Square, Shah-i-Zinda, and the Bibi-Khanym Mosque. The city’s historical significance and beautiful monuments make it a must-visit destination.',
    imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/e/eb/Registan_square_Samarkand.jpg',
  },
  {
    title: 'Fez, Morocco',
    description: 'Fez is one of Morocco’s oldest and most historically significant cities. The city’s medina is a UNESCO World Heritage site and home to the world’s oldest continuously operating university, the University of al-Qarawiyyin. The city’s rich history and stunning architecture make it a fascinating place to explore.',
    imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/e/ed/Fes_Medina.jpg',
  },
];

const IslamicHistoryPage = () => {
  return (
    <div className="min-h-screen bg-gray-100">
      <header className="bg-green-800 text-white p-6 text-center">
        <h1 className="text-3xl font-bold">Best Places to Discover Islamic History Across the Globe</h1>
      </header>
      <main className="p-6 space-y-12">
        {islamicHistoryData.map((place, index) => (
          <section key={index} className="bg-white p-6 rounded-lg shadow-lg">
            <img src={place.imageUrl} alt={place.title} className="w-full h-64 object-cover rounded-lg mb-6" />
            <h2 className="text-2xl font-bold mb-4">{place.title}</h2>
            <p className="text-gray-700 text-lg">{place.description}</p>
          </section>
        ))}
      </main>
      <footer className="bg-green-800 text-white p-4 text-center">
        <p>&copy; 2024 Islamic History Travel Guide. All rights reserved.</p>
      </footer>
    </div>
  );
};

export default IslamicHistoryPage;
