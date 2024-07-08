import React from 'react';

const EssentialBlogs = () => {
  return (
    <div className="min-h-screen bg-gray-100 p-6">
      <header className="bg-green-800 text-white p-6 text-center">
        <h1 className="text-3xl font-bold">Essential Items for Muslim Travelers</h1>
      </header>
      <main className="space-y-12">
        <section className="bg-white p-6 rounded-lg shadow-lg">
          <h2 className="text-2xl font-bold mb-4">1. Prayer Mat</h2>
          <p className="text-gray-700 text-lg">
            A portable prayer mat is essential for Muslim travelers, allowing them to perform their prayers comfortably and cleanly, no matter where they are.
          </p>
        </section>
        <section className="bg-white p-6 rounded-lg shadow-lg">
          <h2 className="text-2xl font-bold mb-4">2. Qibla Compass</h2>
          <p className="text-gray-700 text-lg">
            Knowing the direction of the Qibla (the direction of the Kaaba in Makkah) is crucial for prayers. A Qibla compass or a smartphone app can help you find the right direction.
          </p>
        </section>
        <section className="bg-white p-6 rounded-lg shadow-lg">
          <h2 className="text-2xl font-bold mb-4">3. Travel Size Quran</h2>
          <p className="text-gray-700 text-lg">
            Carrying a travel-sized Quran or having a Quran app on your phone ensures you can read and reflect on the holy text during your journey.
          </p>
        </section>
        <section className="bg-white p-6 rounded-lg shadow-lg">
          <h2 className="text-2xl font-bold mb-4">4. Halal Snacks</h2>
          <p className="text-gray-700 text-lg">
            Halal snacks can be handy, especially during long travels when finding Halal food may be difficult. Nuts, dried fruits, and energy bars are good options.
          </p>
        </section>
        <section className="bg-white p-6 rounded-lg shadow-lg">
          <h2 className="text-2xl font-bold mb-4">5. Portable Wudu Bottle</h2>
          <p className="text-gray-700 text-lg">
            A portable wudu bottle helps in performing ablution (wudu) when you don’t have access to running water. It's compact and easy to carry in your bag.
          </p>
        </section>
        <section className="bg-white p-6 rounded-lg shadow-lg">
          <h2 className="text-2xl font-bold mb-4">6. Comfortable Clothing</h2>
          <p className="text-gray-700 text-lg">
            Ensure you have comfortable, modest clothing that suits the climate of your destination. Layered clothing can be helpful for varying temperatures.
          </p>
        </section>
        <section className="bg-white p-6 rounded-lg shadow-lg">
          <h2 className="text-2xl font-bold mb-4">7. Reusable Water Bottle</h2>
          <p className="text-gray-700 text-lg">
            Staying hydrated is important, especially when traveling. A reusable water bottle is eco-friendly and ensures you always have water on hand.
          </p>
        </section>
        <section className="bg-white p-6 rounded-lg shadow-lg">
          <h2 className="text-2xl font-bold mb-4">8. Personal Hygiene Kit</h2>
          <p className="text-gray-700 text-lg">
            A personal hygiene kit including hand sanitizer, tissues, and wipes helps maintain cleanliness and hygiene, especially when facilities are limited.
          </p>
        </section>
      </main>
      <footer className="bg-green-800 text-white p-4 text-center">
        <p>&copy; 2024 Islamic Travel Guide. All rights reserved.</p>
      </footer>
    </div>
  );
};

export default EssentialBlogs;
