// src/IslamicHistoryPage.js
import React, { useEffect, useState }from 'react';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import { Button} from '@mui/material';
import 'tailwindcss/tailwind.css';

const islamicHistoryData = [
    {
        title: 'Mount Uhud, Madinah, Saudi Arabia',
        description: 'Mount Uhud is located north of Madinah and is the site of the Battle of Uhud, fought in 625 CE between the early Muslims and the Quraish of Makkah. The battle, despite being a setback for the Muslims, is significant for its numerous lessons and the bravery displayed by the companions of the Prophet Muhammad. The site includes the graves of the martyrs of Uhud, including the Prophet’s uncle, Hamza ibn Abdul-Muttalib, who is revered as the "Lion of Allah." The mountain holds religious significance and is a place of pilgrimage where visitors reflect on the early struggles of Islam and the sacrifices made by its followers.',
        imageUrl: 'https://c1.wallpaperflare.com/preview/467/622/524/uhud-the-mountain-of-uhud-the-martyrs-of-uhud.jpg',
    },
    {
        title: 'Quba Mosque, Madinah, Saudi Arabia',
        description: 'Quba Mosque, located in the Quba area of Madinah, is the first mosque built by the Prophet Muhammad upon his migration from Makkah to Madinah in 622 CE. The mosque is significant as it symbolizes the establishment of the Muslim community and the beginning of the Islamic calendar. Pilgrims visiting Madinah often visit the Quba Mosque to pray, emulating the Prophet’s practice of visiting the mosque every Saturday. The mosque has been expanded and renovated multiple times over the centuries and remains a revered site for Muslims worldwide.',
        imageUrl: 'https://i0.wp.com/www.amuslima.com/wp-content/uploads/2014/09/2.QUBA-MOSQUE.jpg?fit=888%2C592&ssl=1',
    },
    {
        title: 'Masjid al-Qiblatain, Madinah, Saudi Arabia',
        description: 'Masjid al-Qiblatain, also known as the Mosque of the Two Qiblas, is a historic mosque in Madinah where the Prophet Muhammad received the divine command to change the direction of prayer (Qibla) from Jerusalem to Makkah. This event, known as the "Qibla Change," took place in 624 CE and marked a significant moment in Islamic history. The mosque is unique for having two prayer niches (mihrabs) – one facing Jerusalem and the other facing Makkah. It has been expanded and renovated over the years and stands as a symbol of the early developments of Islamic practice.',
        imageUrl: 'https://alfozanaward.org/wp-content/uploads/2020/05/27-1024x683.png',
    },
    {
        title: 'Trench of Khandaq, Madinah, Saudi Arabia',
        description: 'The Trench of Khandaq is the site of the Battle of the Trench, also known as the Battle of the Confederates, which took place in 627 CE. The battle was a defensive effort by the Muslims of Madinah against a confederation of tribes led by the Quraish of Makkah. Under the suggestion of Salman the Persian, the Muslims dug a trench around the city to thwart the enemy’s advance. The trench proved to be an innovative and effective defense strategy, resulting in a significant victory for the Muslims. The site remains an important landmark, symbolizing the resilience and strategic acumen of the early Muslim community.',
        imageUrl: 'https://live.staticflickr.com/65535/51282613798_00a730dcd9_b.jpg',
    },
    {
        title: 'Jabal al-Nur, Makkah, Saudi Arabia',
        description: 'Jabal al-Nur, a mountain near Makkah, is renowned for the Cave of Hira, where the Prophet Muhammad received his first revelation from the Angel Gabriel in 610 CE. This event marks the beginning of the Prophet’s mission and the revelation of the Quran. The mountain is a popular site for pilgrims and holds great spiritual significance. Visitors often climb Jabal al-Nur to visit the cave and reflect on the transformative moment that laid the foundation for the spread of Islam.',
        imageUrl: '',
    },
    {
        title: 'Mina, Saudi Arabia',
        description: 'Mina is a neighborhood of Makkah and a significant location for the Hajj pilgrimage. Known as the "Tent City," Mina hosts millions of pilgrims during Hajj. It is the site of the Jamarat, where pilgrims perform the symbolic stoning of the devil, reenacting the actions of the Prophet Abraham. Mina is also the place where pilgrims perform the rituals of slaughtering an animal (Qurbani) as part of the Hajj. The area has extensive tent facilities to accommodate the vast number of pilgrims and is a crucial part of the Hajj experience.',
        imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/9/98/Tent_City_Mina.jpg',
    },
    {
        title: 'Masjid Aisha, Makkah, Saudi Arabia',
        description: 'Masjid Aisha, also known as Masjid at-Tan\'eem, is located on the outskirts of Makkah. It serves as a Miqat, or a place where pilgrims intending to perform Umrah can enter into a state of Ihram. The mosque is named after Aisha, the wife of the Prophet Muhammad, who entered into Ihram from this location. It is a well-facilitated mosque with amenities to help pilgrims prepare for their Umrah rituals. The mosque holds a special place in the hearts of many pilgrims as a starting point for their spiritual journey.',
        imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/0/0c/Masjid_Aisha.jpg',
    },
    {
        title: 'Masjid al-Jinn, Makkah, Saudi Arabia',
        description: 'Masjid al-Jinn is a mosque in Makkah associated with the event where a group of Jinn listened to the Prophet Muhammad recite the Quran and converted to Islam. This event is significant in Islamic tradition as it highlights the universality of the Prophet’s message. The mosque is built on the site where this event is believed to have occurred and is a place of spiritual and historical significance for Muslims.',
        imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/9/92/Masjid_Al-Jinn.jpg',
    },
    {
        title: 'Jabal Thawr, Makkah, Saudi Arabia',
        description: 'Jabal Thawr is a mountain near Makkah known for the Cave of Thawr, where the Prophet Muhammad and his companion Abu Bakr sought refuge during their migration to Madinah. The cave is significant for the miraculous event where a spider spun a web and a pigeon laid eggs at the entrance, concealing their presence from their pursuers. This event is seen as a divine intervention and a symbol of Allah’s protection. The mountain and the cave hold significant historical and spiritual value for Muslims, who often visit to reflect on the trials faced by the Prophet and his early followers.',
        imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/5/5d/Jabal_Thawr.jpg',
    },
];

const IslamicHistoryPage = () => {
    const [expanded, setExpanded] = useState(false);
  
    const handleExpandClick = () => {
      setExpanded(!expanded);
    };

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
            <p className={`text-gray-700 dark:text-white text-base ${expanded ? '' : 'line-clamp-3 md:line-clamp-2'}`}>
            {place.description}
        </p>
        <Button
          size="small"
          endIcon={<ExpandMoreIcon />}
          onClick={handleExpandClick}
        >
          {expanded ? 'Read less' : 'Read more'}
        </Button>
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
