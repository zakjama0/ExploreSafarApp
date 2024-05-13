package com.example.demo.components;

import com.example.demo.enums.Continent;
import com.example.demo.enums.Region;
import com.example.demo.models.Attraction;
import com.example.demo.models.City;
import com.example.demo.models.Country;
import com.example.demo.models.User;
import com.example.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    public DataLoader() {
    }

    @Autowired
    ItineraryRepository itineraryRepository;
    @Autowired
    CityRepository cityRepository;
    @Autowired
    CountryRepository countryRepository;
    @Autowired
    DuaRepository duaRepository;
    @Autowired
    PlannedAttractionRepository plannedAttractionRepository;
    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    AttractionRepository attractionRepository;

    @Override
    public void run(ApplicationArguments arguments) throws Exception {
        User user1 = new User("Zakaria", "zak@safar.com", "password");
        User user2 = new User("Tadiwa", "tadiwa@safar.com", "password");
        User user3 = new User("Marvellous", "marv@safar.com", "password");
        User user4 = new User("Mohammed", "sharif@safar.com", "password");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);

        //Asia Continent
        Country china = new Country(Region.EAST_ASIA, Continent.ASIA, "", "China");
        Country india = new Country(Region.SOUTH_ASIA, Continent.ASIA, "", "India");
        Country japan = new Country(Region.EAST_ASIA, Continent.ASIA, "", "Japan");
        Country indonesia = new Country(Region.SOUTH_EAST_ASIA, Continent.ASIA, "", "Indonesia");
        Country pakistan = new Country(Region.SOUTH_ASIA, Continent.ASIA, "", "Pakistan");
        Country bangladesh = new Country(Region.SOUTH_ASIA, Continent.ASIA, "", "Bangladesh");
        Country philippines = new Country(Region.SOUTH_EAST_ASIA, Continent.ASIA, "", "Philippines");
        Country vietnam = new Country(Region.SOUTH_EAST_ASIA, Continent.ASIA, "", "Vietnam");
        Country kyrgyzstan = new Country(Region.CENTRAL_ASIA, Continent.ASIA, "", "Kyrgyzstan");
        Country australia = new Country(Region.OCEANIA, Continent.ASIA, "", "Australia");
        Country saudi = new Country(Region.MIDDLE_EAST, Continent.ASIA, "", "Saudi Arabia");
        Country southKorea = new Country(Region.EAST_ASIA, Continent.ASIA, "", "South Korea");
        Country thailand = new Country(Region.EAST_ASIA, Continent.ASIA, "", "Thailand");
        Country phillipinnes = new Country(Region.EAST_ASIA, Continent.ASIA, "", "Phillipinnes");
        Country malaysia = new Country(Region.EAST_ASIA, Continent.ASIA, "", "Malaysia");
        Country oman = new Country(Region.MIDDLE_EAST, Continent.ASIA, "", "Oman");
        Country qatar = new Country(Region.MIDDLE_EAST, Continent.ASIA, "", "Qatar");

        //FEATURED ASIA COUNTRY: Vietnam, Indoneisa, Japan, China, Kygryzstan, Austalia, South Korea, Thailand, Phillipinnes, Malaysia, Oman, Qatar, Saudi
//        Europe
        Country france = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "France");
        Country spain = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "Spain");
        Country italy = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "Italy");
        Country germany = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "Germany");
        Country unitedKingdom = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "United Kingdom");
        Country turkey = new Country(Region.MIDDLE_EAST, Continent.EUROPE, "", "Turkey");
        Country austria = new Country(Region.CENTRAL_EUROPE, Continent.EUROPE, "", "Austria");
        Country greece = new Country(Region.MEDITERRANEAN, Continent.EUROPE, "", "Greece");
        Country russia = new Country(Region.EASTERN_EUROPE, Continent.EUROPE, "", "Russia");
        Country portugal = new Country(Region.MEDITERRANEAN, Continent.EUROPE, "", "Portugal");
        Country switzerland = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "Switzerland");
        Country netherlands = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "Netherlands");
        Country belgium = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "Belgium");
        Country iceland = new Country(Region.SCANDINAVIA, Continent.EUROPE, "", "Iceland");
        Country finland = new Country(Region.SCANDINAVIA, Continent.EUROPE, "", "Finland");
        // Featured Europe Countries: Turkey, Switzerland, Austria, Italy, Spain, France, Greece, Portuga

        countryRepository.save(china);
        countryRepository.save(india);
        countryRepository.save(japan);
        countryRepository.save(indonesia);
        countryRepository.save(pakistan);
        countryRepository.save(bangladesh);
        countryRepository.save(philippines);
        countryRepository.save(vietnam);
        countryRepository.save(turkey);
        countryRepository.save(kyrgyzstan);
        countryRepository.save(australia);
        countryRepository.save(saudi);
        countryRepository.save(southKorea);
        countryRepository.save(thailand);
        countryRepository.save(malaysia);
        countryRepository.save(oman);
        countryRepository.save(qatar);
        countryRepository.save(phillipinnes);


        countryRepository.save(france);
        countryRepository.save(spain);
        countryRepository.save(italy);
        countryRepository.save(germany);
        countryRepository.save(unitedKingdom);
        countryRepository.save(turkey);
        countryRepository.save(austria);
        countryRepository.save(greece);
        countryRepository.save(russia);
        countryRepository.save(portugal);
        countryRepository.save(switzerland);
        countryRepository.save(netherlands);
        countryRepository.save(belgium);
        countryRepository.save(iceland);
        countryRepository.save(finland);

// CITIES
//        Europe
        // Top 5 cities in France
        City paris = new City("Paris", france);
        City marseille = new City("Marseille", france);
        City lyon = new City("Lyon", france);
        City toulouse = new City("Toulouse", france);
        City nice = new City("Nice", france);

// Save cities in France
        cityRepository.save(paris);
        cityRepository.save(marseille);
        cityRepository.save(lyon);
        cityRepository.save(toulouse);
        cityRepository.save(nice);

        // Top 5 cities in Italy
        City rome = new City("Rome", italy);
        City milan = new City("Milan", italy);
        City naples = new City("Naples", italy);
        City turin = new City("Turin", italy);
        City palermo = new City("Palermo", italy);

// Save cities in Italy
        cityRepository.save(rome);
        cityRepository.save(milan);
        cityRepository.save(naples);
        cityRepository.save(turin);
        cityRepository.save(palermo);
// Top 5 cities in Portugal
        City lisbon = new City("Lisbon", portugal);
        City porto = new City("Porto", portugal);
        City braga = new City("Braga", portugal);
        City coimbra = new City("Coimbra", portugal);
        City faro = new City("Faro", portugal);

// Save cities in Portugal
        cityRepository.save(lisbon);
        cityRepository.save(porto);
        cityRepository.save(braga);
        cityRepository.save(coimbra);
        cityRepository.save(faro);
// Top 5 cities in Spain
        City madrid = new City("Madrid", spain);
        City barcelona = new City("Barcelona", spain);
        City valencia = new City("Valencia", spain);
        City seville = new City("Seville", spain);
        City malaga = new City("Malaga", spain);

// Save cities in Spain
        cityRepository.save(madrid);
        cityRepository.save(barcelona);
        cityRepository.save(valencia);
        cityRepository.save(seville);
        cityRepository.save(malaga);
// Top 5 cities in Germany
        City berlin = new City("Berlin", germany);
        City hamburg = new City("Hamburg", germany);
        City munich = new City("Munich", germany);
        City cologne = new City("Cologne", germany);
        City frankfurt = new City("Frankfurt", germany);

// Save cities in Germany
        cityRepository.save(berlin);
        cityRepository.save(hamburg);
        cityRepository.save(munich);
        cityRepository.save(cologne);
        cityRepository.save(frankfurt);
// Top 5 cities in the United Kingdom
        City london = new City("London", unitedKingdom);
        City manchester = new City("Manchester", unitedKingdom);
        City birmingham = new City("Birmingham", unitedKingdom);
        City liverpool = new City("Liverpool", unitedKingdom);
        City bristol = new City("Bristol", unitedKingdom);

// Save cities in the United Kingdom
        cityRepository.save(london);
        cityRepository.save(manchester);
        cityRepository.save(birmingham);
        cityRepository.save(liverpool);
        cityRepository.save(bristol);
// Top 5 cities in Turkey
        City istanbul = new City("Istanbul", turkey);
        City ankara = new City("Ankara", turkey);
        City cappadocia = new City("Cappadocia", turkey);
        City bursa = new City("Bursa", turkey);
        City antalya = new City("Antalya", turkey);

// Save cities in Turkey
        cityRepository.save(istanbul);
        cityRepository.save(ankara);
        cityRepository.save(cappadocia);
        cityRepository.save(bursa);
        cityRepository.save(antalya);
// Top 5 cities in Austria
        City vienna = new City("Vienna", austria);
        City graz = new City("Graz", austria);
        City linz = new City("Linz", austria);
        City salzburg = new City("Salzburg", austria);
        City innsbruck = new City("Innsbruck", austria);

// Save cities in Austria
        cityRepository.save(vienna);
        cityRepository.save(graz);
        cityRepository.save(linz);
        cityRepository.save(salzburg);
        cityRepository.save(innsbruck);
// Top 5 Greek islands
        City athens = new City("Athens", greece);
        City crete = new City("Crete", greece);
        City rhodes = new City("Rhodes", greece);
        City santorini = new City("Santorini", greece);
        City mykonos = new City("Mykonos", greece);
        City corfu = new City("Corfu", greece);

// Save Greek islands as cities
        cityRepository.save(crete);
        cityRepository.save(athens);
        cityRepository.save(rhodes);
        cityRepository.save(santorini);
        cityRepository.save(mykonos);
        cityRepository.save(corfu);

// Top 5 cities in Switzerland
        City zurich = new City("Zurich", switzerland);
        City geneva = new City("Geneva", switzerland);
        City basel = new City("Basel", switzerland);
        City bern = new City("Bern", switzerland);
        City lucerne = new City("Lucerne", switzerland);

// Save cities for Switzerland
        cityRepository.save(zurich);
        cityRepository.save(geneva);
        cityRepository.save(basel);
        cityRepository.save(bern);
        cityRepository.save(lucerne);
// Top 5 destinations in Iceland
        City reykjavik = new City("Reykjavik", iceland);
        City akureyri = new City("Akureyri", iceland);
        City vik = new City("Vik", iceland);
        City thingvellir = new City("Thingvellir", iceland);
        City gullfoss = new City("Gullfoss", iceland);

// Save Icelandic destinations as cities
        cityRepository.save(reykjavik);
        cityRepository.save(akureyri);
        cityRepository.save(vik);
        cityRepository.save(thingvellir);
        cityRepository.save(gullfoss);
// Top 5 cities in Russia
        City moscow = new City("Moscow", russia);
        City saintPetersburg = new City("Saint Petersburg", russia);

        // Save cities in Russia

        cityRepository.save(moscow);
        cityRepository.save(saintPetersburg);

        // Top 5 cities in the Netherlands
        City amsterdam = new City("Amsterdam", netherlands);
        City rotterdam = new City("Rotterdam", netherlands);
        City theHague = new City("The Hague", netherlands);
        City utrecht = new City("Utrecht", netherlands);
        City eindhoven = new City("Eindhoven", netherlands);

// Save cities in the Netherlands
        cityRepository.save(amsterdam);
        cityRepository.save(rotterdam);
        cityRepository.save(theHague);
        cityRepository.save(utrecht);
        cityRepository.save(eindhoven);
// Top 5 cities in Belgium
        City brussels = new City("Brussels", belgium);
        City antwerp = new City("Antwerp", belgium);
        City ghent = new City("Ghent", belgium);
        City bruges = new City("Bruges", belgium);
        City liege = new City("Liege", belgium);

// Save cities in Belgium
        cityRepository.save(brussels);
        cityRepository.save(antwerp);
        cityRepository.save(ghent);
        cityRepository.save(bruges);
        cityRepository.save(liege);

// Top 5 cities in Vietnam
        City hanoi = new City("Hanoi", vietnam);
        City hoChiMinhCity = new City("Ho Chi Minh City", vietnam);
        City daNang = new City("Da Nang", vietnam);
        City haiPhong = new City("Hai Phong", vietnam);
        City canTho = new City("Can Tho", vietnam);
        City hoiAn = new City("HoiAn", vietnam);
        City nhaTrang = new City("nhaTrang", vietnam);

// Top 5 cities in Indonesia
        City jakarta = new City("Jakarta", indonesia);
        City surabaya = new City("Surabaya", indonesia);
        City bandung = new City("Bandung", indonesia);
        City medan = new City("Medan", indonesia);
        City semarang = new City("Semarang", indonesia);
        City yogyakarta = new City("Yogyakarta", indonesia);

// Top 5 cities in Japan
        City tokyo = new City("Tokyo", japan);
        City osaka = new City("Osaka", japan);
        City kyoto = new City("Kyoto", japan);
        City nagoya = new City("Nagoya", japan);
        City sapporo = new City("Sapporo", japan);
        City yokohama = new City("Yokohama", japan);

// Top 5 cities in China
        City beijing = new City("Beijing", china);
        City shanghai = new City("Shanghai", china);
        City guangzhou = new City("Guangzhou", china);
        City shenzhen = new City("Shenzhen", china);
        City chengdu = new City("Chengdu", china);


// Top 5 cities in Kyrgyzstan
        City bishkek = new City("Bishkek", kyrgyzstan);
        City osh = new City("Osh", kyrgyzstan);
        City jalalAbad = new City("Jalal-Abad", kyrgyzstan);
        City karakol = new City("Karakol", kyrgyzstan);
        City tokmok = new City("Tokmok", kyrgyzstan);

// Top 5 cities in Australia
        City sydney = new City("Sydney", australia);
        City melbourne = new City("Melbourne", australia);
        City brisbane = new City("Brisbane", australia);
        City perth = new City("Perth", australia);
        City adelaide = new City("Adelaide", australia);

// Top 5 cities in Saudi
        City riyadh = new City("Riyadh", saudi);
        City jeddah = new City("Jeddah", saudi);
        City mecca = new City("Mecca", saudi);
        City medina = new City("Medina", saudi);
        City dammam = new City("Dammam", saudi);

// Muscat in Oman
        City muscat = new City("Muscat", oman);

// Top cities in Qatar
        City doha = new City("Doha", qatar);
        City lusail = new City("Lusail", qatar);
// Top 5 cities in southKorea
        City seoul = new City("Seoul", southKorea);
        City busan = new City("Busan", southKorea);
        City incheon = new City("Incheon", southKorea);
        City daegu = new City("Daegu", southKorea);
        City daejeon = new City("Daejeon", southKorea);

// Top 5 cities in thailiand
        City bangkok = new City("Bangokok", thailand);
        City chiangMai = new City("Ciang Mai", thailand);
        City phuket = new City("Phuket", thailand);
        City pattaya = new City("Pattaya", thailand);
        City Nonthaburi = new City("Nonthaburi", thailand);

// Top 5 cities in Malaysia
        City kualaLumpur = new City("Kuala Lumpar", malaysia);
        City georgeTown = new City("George Town", malaysia);
        City joharBahru = new City("Johar Bahru", malaysia);
        City ipoh = new City("Ipoh", malaysia);
        City kuching = new City("Kuching", malaysia);


// Save cities for Vietnam
        cityRepository.save(hanoi);
        cityRepository.save(hoChiMinhCity);
        cityRepository.save(daNang);
        cityRepository.save(haiPhong);
        cityRepository.save(canTho);
        cityRepository.save(hoiAn);
        cityRepository.save(nhaTrang);

// Save cities for Indonesia
        cityRepository.save(jakarta);
        cityRepository.save(surabaya);
        cityRepository.save(bandung);
        cityRepository.save(medan);
        cityRepository.save(semarang);
        cityRepository.save(yogyakarta);

// Save cities for Japan
        cityRepository.save(tokyo);
        cityRepository.save(osaka);
        cityRepository.save(kyoto);
        cityRepository.save(nagoya);
        cityRepository.save(sapporo);
        cityRepository.save(yokohama);


// Save cities for China
        cityRepository.save(beijing);
        cityRepository.save(shanghai);
        cityRepository.save(guangzhou);
        cityRepository.save(shenzhen);
        cityRepository.save(chengdu);

// Continue saving cities for other countries...
// Save cities in Kyrgyzstan
        cityRepository.save(bishkek);
        cityRepository.save(osh);
        cityRepository.save(jalalAbad);
        cityRepository.save(karakol);
        cityRepository.save(tokmok);
        // Save cities in Australia
        cityRepository.save(sydney);
        cityRepository.save(melbourne);
        cityRepository.save(brisbane);
        cityRepository.save(perth);
        cityRepository.save(adelaide);

        // Save Cities in Saudi Arabia
        cityRepository.save(riyadh);
        cityRepository.save(jeddah);
        cityRepository.save(mecca);
        cityRepository.save(medina);
        cityRepository.save(dammam);

        cityRepository.save(muscat);

        cityRepository.save(doha);
        cityRepository.save(lusail);

// ATTRACTIONS
//Europe

        // Create Attraction objects for top 5 attractions in Paris with longer descriptions
        Attraction eiffelTower = new Attraction("Eiffel Tower", paris, "The Eiffel Tower, named after engineer Gustave Eiffel, is a global cultural icon of France and one of the most recognizable structures in the world. Standing at 324 meters (1,063 feet), it is the tallest structure in Paris and has welcomed millions of visitors since its completion in 1889. Visitors can ascend to its observation decks for breathtaking panoramic views of the city, dine at its restaurants, or learn about its history at the Eiffel Tower Museum located on the first floor.", "");
        Attraction louvreMuseum = new Attraction("Louvre Museum", paris, "The Louvre Museum, housed in the Louvre Palace, is the world's largest art museum and a historic monument in Paris. It is home to over 38,000 objects, including the Mona Lisa, Venus de Milo, and Winged Victory of Samothrace. Visitors can explore its vast collections spanning thousands of years of art and history, from ancient civilizations to the present day.", "");
        Attraction arabWorldInstitute = new Attraction("Arab World Institute", paris, "The Arab World Institute is a cultural institute dedicated to the Arab world. It showcases exhibits on Arab culture, art, history, and civilization. Visitors can explore Islamic art, calligraphy, and artifacts.", "");
        Attraction montmartre = new Attraction("Montmartre and Sacré-Cœur Basilica", paris, "Montmartre is a historic neighborhood in Paris known for its artistic heritage, charming streets, and vibrant atmosphere. At its summit sits the Sacré-Cœur Basilica, a stunning Roman Catholic church known for its white-domed architecture and panoramic views of the city. Visitors can explore the winding streets of Montmartre, visit art studios and galleries, or enjoy street performances by local artists.", "");
        Attraction seineRiverCruise = new Attraction("Seine River Cruise", paris, "A Seine River cruise offers a leisurely way to explore Paris and its iconic landmarks from a different perspective. As you glide along the Seine, you'll pass by famous sights such as the Eiffel Tower, Notre-Dame Cathedral, and Louvre Museum, all while enjoying commentary about the city's history and architecture. Whether during the day or illuminated at night, a Seine River cruise provides unforgettable views of Paris.", "");
        Attraction museeDOrsay = new Attraction("Musée d'Orsay", paris, "The Musée d'Orsay is a renowned art museum located on the left bank of the Seine River in Paris. Housed in a former railway station, the museum is celebrated for its extensive collection of Impressionist and Post-Impressionist masterpieces, including works by Monet, Van Gogh, Renoir, and Degas. Visitors can explore the museum's galleries to admire these iconic artworks and gain insights into the development of modern art.", "");

// Save attractions in the database
        attractionRepository.save(eiffelTower);
        attractionRepository.save(louvreMuseum);
        attractionRepository.save(arabWorldInstitute);
        attractionRepository.save(montmartre);
        attractionRepository.save(seineRiverCruise);
        attractionRepository.save(museeDOrsay);

        // Create Attraction objects for top 5 attractions in Marseille
        Attraction vieuxPort = new Attraction("Vieux Port (Old Port)", marseille, "The Vieux Port is the historic harbor of Marseille, dating back to ancient Greek times. Today, it is a bustling waterfront area lined with cafes, restaurants, and shops. Visitors can stroll along the promenade, watch fishing boats come and go, or take a boat tour of the harbor.", "");
        Attraction lePanier = new Attraction("Le Panier (The Old Town)", marseille, "Le Panier is Marseille's oldest neighborhood, with narrow cobblestone streets, colorful houses, and charming squares. It is a vibrant area filled with artisan boutiques, galleries, and cafes. Visitors can wander through its winding alleys, admire street art, and soak in the lively atmosphere.", "");
        Attraction muCEM = new Attraction("MuCEM (Museum of European and Mediterranean Civilisations)", marseille, "The MuCEM is a modern museum dedicated to the cultures of Europe and the Mediterranean region. Housed in a striking contemporary building overlooking the sea, it features exhibits on history, art, and anthropology. Visitors can explore its collections, attend cultural events, and enjoy panoramic views from its rooftop terrace.", "");
        Attraction calanquesNationalPark = new Attraction("Calanques National Park", marseille, "Calanques National Park is a stunning natural reserve located just outside Marseille. It is known for its rugged limestone cliffs, hidden coves, and crystal-clear waters. Visitors can hike along scenic trails, swim in secluded beaches, or take a boat tour to explore the park's picturesque coastline.", "");

// Save attractions in the database
        attractionRepository.save(vieuxPort);
        attractionRepository.save(lePanier);
        attractionRepository.save(muCEM);
        attractionRepository.save(calanquesNationalPark);

// Create Attraction objects for top 5 attractions in Lyon
        Attraction vieuxLyon = new Attraction("Vieux Lyon (Old Lyon)", lyon, "Vieux Lyon is the historic heart of Lyon, with well-preserved Renaissance buildings, narrow cobblestone streets, and traboules (hidden passageways). It is a UNESCO World Heritage Site and a bustling area filled with shops, restaurants, and museums. Visitors can explore its medieval architecture, visit landmarks such as the Cathedral of Saint-Jean, and savor traditional Lyonnaise cuisine.", "");
        Attraction museeDesBeauxArts = new Attraction("Musée des Beaux-Arts de Lyon (Museum of Fine Arts of Lyon)", lyon, "The Musée des Beaux-Arts de Lyon is one of France's largest and most important art museums, housed in a former Benedictine convent. It features a vast collection of paintings, sculptures, and decorative arts spanning from antiquity to the present day. Visitors can admire works by masters such as Rembrandt, Monet, and Picasso, as well as explore temporary exhibitions and educational programs.", "");
        Attraction parcDeLaTeteDor = new Attraction("Parc de la Tête d'Or (Park of the Golden Head)", lyon, "Parc de la Tête d'Or is a sprawling urban park in Lyon, known for its lush greenery, botanical gardens, and scenic lake. It offers a tranquil escape from the city's hustle and bustle, with walking paths, playgrounds, and recreational activities. Visitors can relax amid nature, enjoy picnics, or explore attractions such as the zoo and rose garden.", "");
        Attraction croixRousse = new Attraction("La Croix-Rousse", lyon, "La Croix-Rousse is a historic neighborhood in Lyon known for its silk industry and working-class heritage. It is characterized by its steep streets, red-brick buildings, and lively atmosphere. Visitors can explore its markets, art galleries, and workshops, and learn about its rich cultural history. The neighborhood also offers panoramic views of Lyon from its terraces.", "");

// Save attractions in the database
        attractionRepository.save(vieuxLyon);
        attractionRepository.save(museeDesBeauxArts);
        attractionRepository.save(parcDeLaTeteDor);
        attractionRepository.save(croixRousse);
// Create Attraction objects for top 5 attractions in Toulouse
        Attraction capitole = new Attraction("Capitole de Toulouse (Capitolium of Toulouse)", toulouse, "The Capitole de Toulouse is the city hall of Toulouse and a symbol of its civic pride. Located on the Place du Capitole, it is an impressive neoclassical building with a pink-marble facade, columned portico, and grand staircase. Visitors can explore its interior adorned with paintings, sculptures, and ornate decorations, and stroll through the square's bustling markets and cafes.", "");
        Attraction citeDeLEspace = new Attraction("Cité de l'Espace (City of Space)", toulouse, "The Cité de l'Espace is a space-themed amusement park and museum in Toulouse, dedicated to space exploration and astronomy. It features interactive exhibits, educational displays, and full-scale replicas of spacecraft and satellites. Visitors can experience simulated space missions, explore the cosmos in the planetarium, and learn about the history and future of space travel.", "");
        Attraction jardinDesPlantes = new Attraction("Jardin des Plantes (Garden of Plants)", toulouse, "The Jardin des Plantes is a botanical garden and park in Toulouse, known for its diverse plant collections, scenic landscapes, and historic buildings. It offers a peaceful retreat in the heart of the city, with walking paths, ponds, and greenhouses. Visitors can admire exotic plants, enjoy picnics, or attend events and exhibitions throughout the year.", "");
        Attraction pontNeuf = new Attraction("Pont Neuf", toulouse, "Pont Neuf is the oldest bridge in Toulouse and a historic landmark spanning the Garonne River. Built in the 16th and 17th centuries, it features elegant arches, stone balustrades, and ornate sculptures. Visitors can stroll across the bridge, admire views of the river and city skyline, or relax on its shady benches.", "");

// Save attractions in the database
        attractionRepository.save(capitole);
        attractionRepository.save(citeDeLEspace);
        attractionRepository.save(jardinDesPlantes);
        attractionRepository.save(pontNeuf);

//        Top Attractions for Hanoi
        Attraction islamicArtMuseum = new Attraction("Islamic Art Museum", hanoi, "The Islamic Art Museum in Hanoi is dedicated to showcasing the rich artistic heritage of the Islamic world, with exhibits on calligraphy, ceramics, textiles, and other forms of Islamic art and culture. It features a diverse collection of artifacts from various Muslim civilizations, spanning centuries of history and spanning from the Middle East to Southeast Asia. Visitors can explore the museum's galleries, admire its displays, and learn about the beauty and diversity of Islamic art and craftsmanship.", "");
        Attraction hanoiOldQuarter = new Attraction("Hanoi Old Quarter", hanoi, "The Hanoi Old Quarter is the historic heart of Hanoi, characterized by its narrow streets, ancient buildings, and bustling markets. It is one of the oldest and most vibrant parts of the city, with a history dating back over a thousand years. Visitors can wander through its maze-like alleyways, discover traditional shops and street vendors, and experience the sights, sounds, and flavors of authentic Vietnamese culture.", "");
        Attraction ninhBinhAttraction = new Attraction("Ninh Binh", hanoi, "Ninh Binh is a province in northern Vietnam, known for its stunning natural landscapes, rich cultural heritage, and historical sites. It is often referred to as the 'Halong Bay on land' due to its karst limestone mountains, lush rice paddies, and winding waterways. Ninh Binh is home to attractions such as Tam Coc, Trang An Landscape Complex, and Mua Caves, offering visitors opportunities for boat tours, cave exploration, and cultural immersion.", "");
        Attraction sapaAttraction = new Attraction("Sapa", hanoi, "Sapa is a town in Lao Cai Province, located in the northwest region of Vietnam. It is renowned for its stunning mountain landscapes, terraced rice fields, and vibrant ethnic minority culture. Sapa is a popular destination for trekking, hiking, and cultural tourism, with attractions such as Fansipan Peak, Cat Cat Village, and the Love Waterfall. Visitors can explore the town's markets, interact with local ethnic communities, and enjoy breathtaking views of the Hoang Lien Son mountain range.", "");
        Attraction hoChiMinhMausoleum = new Attraction("Ho Chi Minh Mausoleum", hanoi, "The Ho Chi Minh Mausoleum is a monumental building located in Ba Dinh Square, Hanoi, dedicated to the memory of Vietnamese revolutionary leader Ho Chi Minh. It serves as the final resting place of Ho Chi Minh's embalmed body, which is preserved in a glass sarcophagus within the mausoleum. Visitors can pay their respects to Ho Chi Minh, view his embalmed remains, and learn about his life and legacy through exhibits and displays within the mausoleum.", "");
        attractionRepository.save(hoChiMinhMausoleum);
        attractionRepository.save(sapaAttraction);
        attractionRepository.save(ninhBinhAttraction);
        attractionRepository.save(islamicArtMuseum);
        attractionRepository.save(hanoiOldQuarter);
        // Da Nang Attractions
        Attraction baNaHills = new Attraction("Ba Na Hills", daNang, "Ba Na Hills is a hill station and resort located in the Truong Son Mountains near Da Nang, Vietnam. It is known for its scenic beauty, French colonial architecture, and attractions such as the Golden Bridge and Fantasy Park. Visitors can ride the world's longest cable car to reach Ba Na Hills, enjoy panoramic views of the surrounding landscapes, explore gardens, temples, and pagodas, and experience thrilling rides and entertainment.", "");
        Attraction marbleMountains = new Attraction("Marble Mountains", daNang, "The Marble Mountains are a cluster of five limestone hills located just south of Da Nang, Vietnam. They are known for their stunning natural beauty, sacred caves, and Buddhist shrines. Visitors can climb to the summits of the mountains, explore caves filled with religious statues and carvings, and enjoy panoramic views of the coastline and surrounding countryside.", "");
        Attraction dragonBridge = new Attraction("Dragon Bridge", daNang, "Dragon Bridge is a bridge over the Han River in Da Nang, Vietnam, known for its unique design and nightly dragon-shaped fire and water shows. It is one of the city's most iconic landmarks, symbolizing prosperity and good fortune. Visitors can watch the dragon breathe fire and spout water, walk along the bridge's pedestrian walkways, and enjoy views of the river and city skyline.", "");
        Attraction myKheBeach = new Attraction("My Khe Beach", daNang, "My Khe Beach is a popular beach located in Da Nang, Vietnam. It is known for its soft white sand, clear blue waters, and gentle waves, making it an ideal destination for swimming, sunbathing, and water sports. Visitors can relax on the beach, take a dip in the ocean, or enjoy activities such as surfing, jet skiing, and parasailing.", "");
        Attraction linhUngPagoda = new Attraction("Linh Ung Pagoda", daNang, "Linh Ung Pagoda is a Buddhist temple located on Son Tra Peninsula in Da Nang, Vietnam. It is known for its giant statue of the Bodhisattva Avalokiteshvara (Guan Yin), which stands overlooking the East Sea. Visitors can explore the pagoda's beautiful grounds, admire its architecture and sculptures, and enjoy panoramic views of the coastline and city skyline from the hilltop.", "");

// Save attractions in Da Nang
        attractionRepository.save(baNaHills);
        attractionRepository.save(marbleMountains);
        attractionRepository.save(dragonBridge);
        attractionRepository.save(myKheBeach);
        attractionRepository.save(linhUngPagoda);

        // Hoi An Attractions
        Attraction hoiAnAncientTown = new Attraction("Hoi An Ancient Town", hoiAn, "Hoi An Ancient Town is a UNESCO World Heritage Site located in Quang Nam Province, central Vietnam. It is known for its well-preserved historic architecture, charming streets, and cultural heritage. Visitors can explore its ancient buildings, temples, and assembly halls, stroll along the picturesque Thu Bon River, and shop for handicrafts, lanterns, and tailor-made clothing.", "");
        Attraction japaneseCoveredBridge = new Attraction("Japanese Covered Bridge", hoiAn, "Japanese Covered Bridge is a historic bridge located in Hoi An Ancient Town, Vietnam. It is one of the town's most iconic landmarks, known for its elegant design, wooden structure, and ornate decorations. Visitors can walk across the bridge, admire its architecture and carvings, and enjoy views of the surrounding canals and traditional houses.", "");
        Attraction hoiAnNightMarket = new Attraction("Hoi An Night Market", hoiAn, "Hoi An Night Market is a bustling market located in the center of Hoi An Ancient Town, Vietnam. It is known for its vibrant atmosphere, colorful lanterns, and wide variety of goods for sale. Visitors can shop for souvenirs, handicrafts, clothing, and accessories, sample local street food and snacks, and enjoy live music and performances.", "");
        Attraction traQueHerbVillage = new Attraction("Tra Que Herb Village", hoiAn, "Tra Que Herb Village is a traditional farming village located near Hoi An, Vietnam. It is known for its organic herb gardens, lush green fields, and peaceful rural scenery. Visitors can take guided tours of the village, learn about organic farming practices, participate in gardening activities, and enjoy cooking classes using fresh herbs and vegetables.", "");
        Attraction camThanhCoconutVillage = new Attraction("Cam Thanh Coconut Village", hoiAn, "Cam Thanh Coconut Village is a scenic village located near Hoi An, Vietnam. It is known for its lush coconut groves, tranquil waterways, and traditional way of life. Visitors can take boat tours of the village's water coconut forest, learn about traditional fishing and farming techniques, and enjoy activities such as basket boat rowing and crab fishing.", "");

// Save attractions in Hoi An
        attractionRepository.save(hoiAnAncientTown);
        attractionRepository.save(japaneseCoveredBridge);
        attractionRepository.save(hoiAnNightMarket);
        attractionRepository.save(traQueHerbVillage);
        attractionRepository.save(camThanhCoconutVillage);

        // Nha Trang Attractions
        Attraction vinpearlLand = new Attraction("Vinpearl Land", nhaTrang, "Vinpearl Land is a theme park located on Hon Tre Island, just off the coast of Nha Trang, Vietnam. It is known for its thrilling rides, water park, aquarium, and entertainment attractions. Visitors can take a cable car ride to the island, enjoy panoramic views of the bay, and spend the day exploring the park's attractions, including roller coasters, water slides, and dolphin shows.", "");
        Attraction nhaTrangBeach = new Attraction("Nha Trang Beach", nhaTrang, "Nha Trang Beach is a beautiful sandy beach located along the coastline of Nha Trang, Vietnam. It is known for its crystal-clear waters, gentle waves, and golden sands, making it a popular destination for swimming, sunbathing, and water sports. Visitors can relax on the beach, rent sun loungers and umbrellas, and enjoy activities such as snorkeling, diving, and jet skiing.", "");
        Attraction honChongPromontory = new Attraction("Hon Chong Promontory", nhaTrang, "Hon Chong Promontory is a scenic coastal area located in Nha Trang, Vietnam. It is known for its unique rock formations, tide pools, and panoramic views of the South China Sea. Visitors can climb the rocky promontory, explore the natural sculptures and caves, and enjoy breathtaking sunsets over the ocean.", "");


// Save attractions in Nha Trang
        attractionRepository.save(vinpearlLand);
        attractionRepository.save(nhaTrangBeach);
        attractionRepository.save(honChongPromontory);

        // Jakarta Attractions
        Attraction nationalMonument = new Attraction("National Monument (Monas)", jakarta, "The National Monument (Monas) is an iconic landmark and national monument located in the heart of Jakarta, Indonesia. It symbolizes the country's struggle for independence and is one of the most visited attractions in the city. Visitors can take an elevator to the top of the monument for panoramic views of Jakarta, explore the museum at the base of the monument, and enjoy the surrounding Merdeka Square.", "");
        Attraction JakartaOldTown = new Attraction("Jakarta Old Town (Kota Tua)", jakarta, "Jakarta Old Town, also known as Kota Tua, is a historic district located in the northern part of Jakarta, Indonesia. It features well-preserved colonial-era buildings, museums, and landmarks dating back to the Dutch colonial period. Visitors can explore the cobblestone streets, visit museums such as the Jakarta History Museum and Wayang Museum, and take a leisurely bike ride around the area.", "");
        Attraction tamanMiniIndonesia = new Attraction("Taman Mini Indonesia Indah", jakarta, "Taman Mini Indonesia Indah (Beautiful Indonesia in Miniature Park) is a cultural theme park located in Jakarta, Indonesia. It showcases the rich diversity of Indonesia's culture, traditions, and architecture through miniature replicas of traditional houses, landmarks, and cultural exhibits from across the country's provinces. Visitors can explore the park by walking or renting bicycles, visit museums, theaters, and pavilions, and learn about Indonesia's history and heritage.", "");
        Attraction ragunanZoo = new Attraction("Ragunan Zoo", jakarta, "Ragunan Zoo is a zoological park located in South Jakarta, Indonesia. It is one of the oldest and largest zoos in Southeast Asia, home to a wide variety of animal species from Indonesia and around the world. Visitors can explore the zoo's spacious grounds, see animals such as elephants, orangutans, and Komodo dragons, and enjoy family-friendly activities such as animal shows and feeding sessions.", "");
        Attraction ancolDreamland = new Attraction("Ancol Dreamland", jakarta, "Ancol Dreamland is a waterfront entertainment complex located along the Jakarta Bay coastline in North Jakarta, Indonesia. It features a variety of attractions and activities for visitors of all ages, including amusement parks, water parks, beaches, and cultural attractions. Visitors can enjoy rides and attractions at Fantasy World and Atlantis Water Adventure, relax on the beach, dine at restaurants, and watch cultural performances at Pasar Seni (Art Market).", "");

// Save attractions in Jakarta
        attractionRepository.save(nationalMonument);
        attractionRepository.save(JakartaOldTown);
        attractionRepository.save(tamanMiniIndonesia);
        attractionRepository.save(ragunanZoo);
        attractionRepository.save(ancolDreamland);
// Bandung Attractions
        Attraction tangkubanPerahu = new Attraction("Tangkuban Perahu", bandung, "Tangkuban Perahu is an active stratovolcano located near Bandung, West Java, Indonesia. It is one of the most popular tourist attractions in the region, known for its distinctive shape and scenic beauty. Visitors can hike to the crater rim, explore fumaroles and hot springs, and enjoy panoramic views of the surrounding mountains and lush forests.", "");
        Attraction ciaterHotSpring = new Attraction("Ciater Hot Spring", bandung, "Ciater Hot Spring is a natural hot spring resort located near Bandung, West Java, Indonesia. It is known for its therapeutic mineral waters and scenic surroundings, making it a popular destination for relaxation and wellness. Visitors can soak in hot spring pools, swim in cool streams, and enjoy beautiful views of the surrounding tea plantations and mountains.", "");
        Attraction transStudioBandung = new Attraction("Trans Studio Bandung", bandung, "Trans Studio Bandung is a large indoor theme park located in Bandung, West Java, Indonesia. It offers a wide range of rides, attractions, and entertainment experiences for visitors of all ages, including roller coasters, thrill rides, live shows, and interactive exhibits. Visitors can enjoy adrenaline-pumping rides, watch spectacular performances, and explore themed zones such as Hollywood, Lost City, and Magic Corner.", "");
        Attraction floatingMarket = new Attraction("Floating Market Lembang", bandung, "Floating Market Lembang is a unique culinary and cultural attraction located in Lembang, near Bandung, West Java, Indonesia. It features traditional wooden boats selling a variety of local snacks, dishes, and handicrafts along a man-made canal. Visitors can explore the market by boat, sample delicious Indonesian street food, and watch cultural performances such as traditional music and dance.", "");
        Attraction farmhouseSusana = new Attraction("Farmhouse Susana", bandung, "Farmhouse Susana is a European-style theme park and tourist village located in Lembang, near Bandung, West Java, Indonesia. It features picturesque Dutch-style buildings, gardens, and attractions inspired by European countryside living. Visitors can take photos in front of windmills and wooden houses, visit a replica Dutch castle, and enjoy activities such as horse riding, feeding animals, and shopping for souvenirs.", "");

// Save attractions in Bandung
        attractionRepository.save(tangkubanPerahu);
        attractionRepository.save(ciaterHotSpring);
        attractionRepository.save(transStudioBandung);
        attractionRepository.save(floatingMarket);
        attractionRepository.save(farmhouseSusana);
// Surabaya Attractions
        Attraction suramaduBridge = new Attraction("Suramadu Bridge", surabaya, "Suramadu Bridge is a cable-stayed bridge that connects the islands of Java and Madura in Indonesia. It is one of the longest bridges in Southeast Asia and a significant landmark in Surabaya, East Java. Visitors can drive or walk across the bridge, enjoy panoramic views of the Madura Strait, and visit attractions such as the Surabaya North Quay and Kenjeran Beach.", "");
        Attraction tunjunganPlaza = new Attraction("Tunjungan Plaza", surabaya, "Tunjungan Plaza is a shopping mall located in the heart of Surabaya, East Java, Indonesia. It is one of the largest and most popular shopping destinations in the city, known for its wide range of stores, restaurants, and entertainment facilities. Visitors can shop for clothing, electronics, and souvenirs, dine at international restaurants, and watch movies at the cinema.", "");
        Attraction surabayaZoo = new Attraction("Surabaya Zoo", surabaya, "Surabaya Zoo, also known as Kebun Binatang Surabaya, is a zoological park located in Surabaya, East Java, Indonesia. It is one of the oldest and largest zoos in Southeast Asia, home to a diverse collection of animal species from Indonesia and around the world. Visitors can explore the zoo's spacious grounds, see animals such as elephants, tigers, and orangutans, and enjoy family-friendly activities such as animal shows and feeding sessions.", "");
        Attraction houseOfSampoerna = new Attraction("House of Sampoerna", surabaya, "House of Sampoerna is a historic museum and cigarette factory located in Surabaya, East Java, Indonesia. It offers visitors a glimpse into the history and heritage of Indonesia's tobacco industry, as well as the culture and traditions of Surabaya. Visitors can take guided tours of the museum, learn about the art of cigarette making, and explore exhibits on Indonesian art, culture, and history.", "");
        Attraction surabayaSubmarineMonument = new Attraction("Surabaya Submarine Monument", surabaya, "Surabaya Submarine Monument is a decommissioned submarine turned museum located in Surabaya, East Java, Indonesia. It is dedicated to the Indonesian Navy and serves as a memorial to the heroes of the KRI Pasopati 410 submarine. Visitors can explore the interior of the submarine, learn about its history and operations, and see exhibits on naval warfare and maritime heritage.", "");

// Save attractions in Surabaya
        attractionRepository.save(suramaduBridge);
        attractionRepository.save(tunjunganPlaza);
        attractionRepository.save(surabayaZoo);
        attractionRepository.save(houseOfSampoerna);
        attractionRepository.save(surabayaSubmarineMonument);
// Yogyakarta Attractions
        Attraction kratonYogyakarta = new Attraction("Kraton Yogyakarta", yogyakarta, "Kraton Yogyakarta, also known as the Yogyakarta Palace, is the official residence of the Sultan of Yogyakarta and the royal court of the Yogyakarta Sultanate. It is a cultural and historical landmark located in the heart of Yogyakarta city. Visitors can explore the palace complex, learn about Javanese royal traditions and ceremonies, and visit the Sultan's living quarters, museums, and cultural exhibits.", "");
        Attraction tamanSariWaterCastle = new Attraction("Taman Sari Water Castle", yogyakarta, "Taman Sari Water Castle, also known as Taman Sari Palace or Taman Sari Underground Mosque, is a historical water palace located in Yogyakarta, Indonesia. It was built in the 18th century as a royal garden and pleasure palace for the Sultan of Yogyakarta. Visitors can explore the palace's complex system of pools, bathing areas, and underground tunnels, and learn about its history and architectural significance.", "");
        Attraction malioboroStreet = new Attraction("Malioboro Street", yogyakarta, "Malioboro Street is a bustling shopping street and cultural hub located in the heart of Yogyakarta, Indonesia. It is known for its vibrant atmosphere, street vendors, and wide range of shops selling clothing, handicrafts, batik textiles, and souvenirs. Visitors can stroll along the street, shop for traditional Javanese goods, sample local street food, and experience Javanese culture and hospitality.", "");

// Save attractions in Yogyakarta
        attractionRepository.save(kratonYogyakarta);
        attractionRepository.save(tamanSariWaterCastle);
        attractionRepository.save(malioboroStreet);
// Top 5 attractions in Tokyo
        Attraction tokyoTower = new Attraction("Tokyo Tower", tokyo, "Tokyo Tower is a landmark communications and observation tower located in the Shiba-koen district of Minato, Tokyo, Japan. It is one of the most iconic symbols of Tokyo, offering panoramic views of the city skyline from its observation decks. Visitors can also enjoy shopping, dining, and various attractions at the base of the tower.", "");
        Attraction uenoPark = new Attraction("Ueno Park", tokyo, "Ueno Park is a spacious public park located in Ueno, Taito, Tokyo, Japan. It is a popular destination for both locals and tourists, offering a wide range of attractions including museums, temples, shrines, and gardens. Visitors can explore attractions such as Ueno Zoo, Tokyo National Museum, Shinobazu Pond, and enjoy cherry blossom viewing during spring.", "");
        Attraction tsukijiMarket = new Attraction("Tsukiji Outer Market", tokyo, "Tsukiji Outer Market is a bustling shopping district located near the former site of the famous Tsukiji Fish Market in Tokyo, Japan. It is known for its fresh seafood stalls, sushi restaurants, and culinary shops selling a variety of Japanese ingredients and kitchenware. Visitors can enjoy shopping for seafood, trying fresh sushi and street food, and learning about Japanese culinary culture.", "");

// Save attractions in Tokyo
        attractionRepository.save(tokyoTower);
        attractionRepository.save(uenoPark);
        attractionRepository.save(tsukijiMarket);
// Top 5 attractions in Yokohama
        Attraction yokohamaChinatown = new Attraction("Yokohama Chinatown", yokohama, "Yokohama Chinatown is the largest Chinatown in Japan, located in the Yokohama city center. It is known for its vibrant atmosphere, colorful decorations, and wide variety of Chinese cuisine. Visitors can explore the bustling streets, sample delicious Chinese dishes and street food, and shop for souvenirs and traditional goods.", "");
        Attraction minatoMirai = new Attraction("Minato Mirai 21", yokohama, "Minato Mirai 21 is a futuristic waterfront district in Yokohama, Japan. It features iconic landmarks such as Landmark Tower, Yokohama Cosmo World, and Yokohama Red Brick Warehouse. Visitors can enjoy shopping, dining, entertainment, and panoramic views of Yokohama Bay from observation decks and waterfront promenades.", "");
        Attraction sankeienGarden = new Attraction("Sankeien Garden", yokohama, "Sankeien Garden is a traditional Japanese garden located in the Naka Ward of Yokohama, Japan. It is known for its beautiful landscapes, historic buildings, and seasonal flower displays. Visitors can explore the garden's walking paths, ponds, tea houses, and historic buildings relocated from Kyoto, Kamakura, and other parts of Japan.", "");
        Attraction yokohamaLandmarkTower = new Attraction("Yokohama Landmark Tower", yokohama, "Yokohama Landmark Tower is a skyscraper located in the Minato Mirai 21 district of Yokohama, Japan. It is one of the tallest buildings in Japan, offering panoramic views of Yokohama and Tokyo from its observation deck on the 69th floor. Visitors can also enjoy shopping, dining, and entertainment facilities at the adjacent Landmark Plaza.", "");
        Attraction redBrickWarehouse = new Attraction("Yokohama Red Brick Warehouse", yokohama, "Yokohama Red Brick Warehouse is a historic warehouse complex located in the Minato Mirai 21 district of Yokohama, Japan. It has been renovated into a shopping, dining, and event space, featuring boutiques, restaurants, cafes, and galleries. Visitors can explore the waterfront area, attend cultural events, and enjoy views of Yokohama Bay.", "");

// Save attractions in Yokohama
        attractionRepository.save(yokohamaChinatown);
        attractionRepository.save(minatoMirai);
        attractionRepository.save(sankeienGarden);
        attractionRepository.save(yokohamaLandmarkTower);
        attractionRepository.save(redBrickWarehouse);
// Top 5 attractions in Osaka
        Attraction osakaCastle = new Attraction("Osaka Castle", osaka, "Osaka Castle is a historic landmark and one of Japan's most famous castles, located in Chuo-ku, Osaka, Japan. It is known for its impressive architecture, beautiful gardens, and historical significance. Visitors can explore the castle's interior museum, climb to the top for panoramic views of Osaka, and enjoy cherry blossom viewing during spring.", "");
        Attraction dotonbori = new Attraction("Dotonbori", osaka, "Dotonbori is a lively entertainment district located in the Namba area of Osaka, Japan. It is known for its vibrant nightlife, colorful neon lights, and iconic landmarks such as the Glico Running Man and Kani Doraku Crab. Visitors can explore the bustling streets, dine at local restaurants serving Osaka's famous street food, and experience the vibrant atmosphere of the city.", "");
        Attraction universalStudiosJapan = new Attraction("Universal Studios Japan", osaka, "Universal Studios Japan is a theme park located in Osaka, Japan. It offers a wide range of attractions, entertainment, and themed areas based on popular Hollywood movies and TV shows. Visitors can enjoy thrilling rides, shows, and attractions such as The Wizarding World of Harry Potter, Jurassic Park, and Minion Park.", "");
        Attraction osakaAquariumKaiyukan = new Attraction("Osaka Aquarium Kaiyukan", osaka, "Osaka Aquarium Kaiyukan is one of the largest aquariums in the world, located in Osaka, Japan. It features a diverse range of marine life from around the globe, housed in several themed exhibits and habitats. Visitors can explore the aquarium's various zones, including the Pacific Ocean, Antarctic, and Great Barrier Reef, and learn about marine conservation and biodiversity.", "");

// Save attractions in Osaka
        attractionRepository.save(osakaCastle);
        attractionRepository.save(dotonbori);
        attractionRepository.save(universalStudiosJapan);
        attractionRepository.save(osakaAquariumKaiyukan);
// Top 5 attractions in Nagoya
        Attraction nagoyaCastle = new Attraction("Nagoya Castle", nagoya, "Nagoya Castle is a historic castle located in Nagoya, Japan. It is one of the city's most iconic landmarks, known for its majestic architecture, beautiful gardens, and cultural significance. Visitors can explore the castle's interior museum, climb to the top of the main tower for panoramic views of Nagoya, and enjoy cherry blossom viewing during spring.", "");
        Attraction portOfNagoyaPublicAquarium = new Attraction("Port of Nagoya Public Aquarium", nagoya, "Port of Nagoya Public Aquarium is a marine aquarium located in Nagoya, Japan. It is one of the largest and most impressive aquariums in Japan, featuring a wide variety of marine life from around the world. Visitors can explore themed exhibits such as the Antarctic Ocean and Amazon Rainforest, watch dolphin and sea lion shows, and learn about marine conservation.", "");
        Attraction nagoyaCityScienceMuseum = new Attraction("Nagoya City Science Museum", nagoya, "Nagoya City Science Museum is a science museum located in Nagoya, Japan. It features interactive exhibits, hands-on experiments, and educational programs covering various fields of science and technology. Visitors can learn about astronomy, biology, physics, and robotics through interactive displays and demonstrations.", "");

// Save attractions in Nagoya
        attractionRepository.save(nagoyaCastle);
        attractionRepository.save(portOfNagoyaPublicAquarium);
        attractionRepository.save(nagoyaCityScienceMuseum);
// Top 5 attractions in Sapporo
        Attraction odoriPark = new Attraction("Odori Park", sapporo, "Odori Park is a large public park located in the heart of Sapporo, Japan. It stretches for several blocks along Odori Boulevard and is a popular destination for locals and tourists alike. Visitors can enjoy seasonal events and festivals, stroll along tree-lined pathways, and relax in open green spaces.", "");
        Attraction sapporoBeerMuseum = new Attraction("Sapporo Beer Museum", sapporo, "Sapporo Beer Museum is a museum located in the Sapporo Beer Garden complex in Sapporo, Japan. It is housed in a historic red-brick building that was originally used as a brewery during the Meiji era. Visitors can learn about the history of Sapporo Beer, see brewing equipment and artifacts, and sample different varieties of beer in the tasting room.", "");
        Attraction sapporoClockTower = new Attraction("Sapporo Clock Tower", sapporo, "Sapporo Clock Tower is a historic clock tower located in the city center of Sapporo, Japan. It is one of the city's most iconic landmarks, known for its elegant architecture and symbolic significance. Visitors can tour the interior museum, learn about the history of Sapporo and the clock tower, and enjoy panoramic views from the observation deck.", "");
        Attraction moerenumaPark = new Attraction("Moerenuma Park", sapporo, "Moerenuma Park is a unique public park located in Sapporo, Japan. It was designed by renowned artist and architect Isamu Noguchi and features distinctive sculptures, playgrounds, and landscaped gardens. Visitors can enjoy walking and cycling paths, outdoor art installations, and panoramic views of the surrounding landscape.", "");

// Save attractions in Sapporo
        attractionRepository.save(odoriPark);
        attractionRepository.save(sapporoBeerMuseum);
        attractionRepository.save(sapporoClockTower);
        attractionRepository.save(moerenumaPark);
// Top 5 attractions in Beijing
        Attraction greatWallOfChina = new Attraction("Great Wall of China", beijing, "The Great Wall of China is one of the most iconic landmarks in the world, located near Beijing, China. It is a UNESCO World Heritage Site and one of the Seven Wonders of the World, known for its historical significance, architectural grandeur, and stunning scenery. Visitors can explore various sections of the Great Wall, hike along its ancient ramparts, and marvel at panoramic views of the surrounding landscape.", "");
        Attraction forbiddenCity = new Attraction("Forbidden City", beijing, "The Forbidden City is a vast imperial palace complex located in the heart of Beijing, China. It served as the imperial palace and political center of China for over 500 years, from the Ming dynasty to the end of the Qing dynasty. Today, it is a UNESCO World Heritage Site and one of China's most popular tourist attractions, known for its magnificent architecture, ornate palaces, and extensive collection of cultural artifacts.", "");
        Attraction summerPalace = new Attraction("Summer Palace", beijing, "The Summer Palace is a vast imperial garden complex located in Beijing, China. It is a UNESCO World Heritage Site and one of the most famous classical gardens in the world, known for its natural beauty, architectural splendor, and historical significance. Visitors can explore the palace's pavilions, halls, and gardens, take boat rides on Kunming Lake, and enjoy scenic views of Longevity Hill and the surrounding landscape.", "");
        Attraction hutongAlleyways = new Attraction("Hutong Alleyways", beijing, "Hutong Alleyways are narrow alleys or lanes formed by traditional courtyard residences in Beijing, China. They are a unique and charming feature of Beijing's urban landscape, offering glimpses into the city's rich history, culture, and daily life. Visitors can explore the hutong alleyways on foot, cycle through them on a rickshaw, and discover hidden gems such as local shops, tea houses, and traditional courtyard homes.", "");

// Save attractions in Beijing
        attractionRepository.save(greatWallOfChina);
        attractionRepository.save(forbiddenCity);
        attractionRepository.save(summerPalace);
        attractionRepository.save(hutongAlleyways);
// Top 5 attractions in Shanghai
        Attraction theBund = new Attraction("The Bund", shanghai, "The Bund is a waterfront promenade and historic district located along the Huangpu River in Shanghai, China. It is known for its iconic skyline, featuring colonial-era buildings on one side and modern skyscrapers on the other. Visitors can enjoy panoramic views of Shanghai's skyline, take leisurely strolls along the promenade, and admire architectural landmarks such as the Oriental Pearl Tower and Shanghai Tower.", "");
        Attraction yuGarden = new Attraction("Yu Garden", shanghai, "Yu Garden, also known as Yuyuan Garden, is a classical Chinese garden located in the Old City of Shanghai, China. It is a UNESCO World Heritage Site and one of the city's most famous landmarks, known for its beautiful architecture, tranquil ponds, and lush greenery. Visitors can explore the garden's pavilions, rockeries, and traditional tea houses, and admire ornate sculptures and carvings.", "");
        Attraction shanghaiDisneyland = new Attraction("Shanghai Disneyland", shanghai, "Shanghai Disneyland is a world-class theme park located in Pudong, Shanghai, China. It is the first Disney park in mainland China and offers a wide range of attractions, entertainment, and themed areas based on popular Disney movies and characters. Visitors can enjoy thrilling rides, live shows, parades, and meet-and-greet opportunities with beloved Disney characters.", "");
        Attraction orientalPearlTower = new Attraction("Oriental Pearl Tower", shanghai, "The Oriental Pearl Tower is an iconic landmark and observation tower located in Pudong, Shanghai, China. It is one of the tallest buildings in Asia and a symbol of Shanghai's modernization and economic development. Visitors can ride high-speed elevators to the observation decks, enjoy panoramic views of Shanghai's skyline, and visit the Shanghai History Museum and Space Museum located within the tower.", "");
        Attraction shanghaiMuseum = new Attraction("Shanghai Museum", shanghai, "Shanghai Museum is a renowned museum located in the People's Square of Shanghai, China. It is one of China's largest and most prestigious museums, known for its extensive collection of ancient Chinese art, artifacts, and cultural relics. Visitors can explore galleries dedicated to Chinese bronzes, ceramics, calligraphy, painting, jade, and furniture, and learn about China's rich cultural heritage and history.", "");

// Save attractions in Shanghai
        attractionRepository.save(theBund);
        attractionRepository.save(yuGarden);
        attractionRepository.save(shanghaiDisneyland);
        attractionRepository.save(orientalPearlTower);
        attractionRepository.save(shanghaiMuseum);
// Top 5 attractions in Guangzhou
        Attraction cantonTower = new Attraction("Canton Tower", guangzhou, "Canton Tower, also known as Guangzhou Tower, is a landmark observation tower located in Haizhu District, Guangzhou, China. It is one of the tallest buildings in the world and offers panoramic views of Guangzhou and the Pearl River Delta from its observation decks. Visitors can enjoy attractions such as the Bubble Tram, Sky Drop, and outdoor skywalk.", "");
        Attraction chenClanAcademy = new Attraction("Chen Clan Academy", guangzhou, "Chen Clan Academy, also known as Chen Clan Ancestral Hall or Chen Clan Temple, is a historic academic complex located in Liwan District, Guangzhou, China. It is renowned for its exquisite architecture, ornate decorations, and cultural significance. Visitors can explore the academy's courtyards, halls, and galleries, and admire traditional Cantonese architecture, woodcarvings, and folk art.", "");
        Attraction yuexiuPark = new Attraction("Yuexiu Park", guangzhou, "Yuexiu Park is a large public park located in Yuexiu District, Guangzhou, China. It is one of the oldest and most popular parks in the city, known for its beautiful landscapes, historical sites, and cultural attractions. Visitors can explore attractions such as the Five Rams Statue, Zhenhai Tower, and Guangzhou Museum of Art, and enjoy leisure activities such as boating, picnicking, and tai chi.", "");
        Attraction shamianIsland = new Attraction("Shamian Island", guangzhou, "Shamian Island is a historic and scenic island located in Liwan District, Guangzhou, China. It is known for its charming colonial architecture, tree-lined streets, and tranquil atmosphere. Visitors can stroll along the waterfront promenade, admire historic buildings such as the British and French Consulates, and relax in picturesque parks and gardens.", "");
        Attraction chimelongParadise = new Attraction("Chimelong Paradise", guangzhou, "Chimelong Paradise is a large-scale amusement park located in Panyu District, Guangzhou, China. It features a wide range of thrilling rides, shows, and attractions for visitors of all ages. Highlights include roller coasters, water rides, animal exhibits, and live performances. Visitors can also explore adjacent attractions such as Chimelong Safari Park and Chimelong Water Park.", "");

// Save attractions in Guangzhou
        attractionRepository.save(cantonTower);
        attractionRepository.save(chenClanAcademy);
        attractionRepository.save(yuexiuPark);
        attractionRepository.save(shamianIsland);
        attractionRepository.save(chimelongParadise);
// Top 5 attractions in Chengdu
        Attraction giantPandaBreedingResearchBase = new Attraction("Giant Panda Breeding Research Base", chengdu, "Giant Panda Breeding Research Base is a conservation center and tourist attraction located in Chengdu, China. It is dedicated to the preservation and breeding of giant pandas, one of the world's most endangered species. Visitors can observe pandas in their natural habitat, learn about conservation efforts, and participate in educational programs and activities.", "");
        Attraction jinliAncientStreet = new Attraction("Jinli Ancient Street", chengdu, "Jinli Ancient Street is a historic pedestrian street located in the heart of Chengdu, China. It is known for its traditional architecture, lively atmosphere, and diverse array of shops, restaurants, and cultural attractions. Visitors can explore the street's ancient buildings, sample local snacks and delicacies, and shop for souvenirs and handicrafts.", "");
        Attraction dujiangyanIrrigationSystem = new Attraction("Dujiangyan Irrigation System", chengdu, "Dujiangyan Irrigation System is an ancient water management system located in Dujiangyan, near Chengdu, China. It is a UNESCO World Heritage Site and one of the oldest and most successful irrigation projects in the world. Visitors can explore the system's dams, canals, and aqueducts, learn about its history and engineering innovations, and enjoy scenic views of the surrounding landscape.", "");

// Save attractions in Chengdu
        attractionRepository.save(giantPandaBreedingResearchBase);
        attractionRepository.save(jinliAncientStreet);
        attractionRepository.save(dujiangyanIrrigationSystem);
// Top 5 attractions in Shenzhen
        Attraction windowOfTheWorld = new Attraction("Window of the World", shenzhen, "Window of the World is a theme park located in the Nanshan District of Shenzhen, China. It features miniature replicas of famous landmarks and scenic spots from around the world, including the Eiffel Tower, Taj Mahal, and Egyptian pyramids. Visitors can explore the park's themed zones, enjoy cultural performances, and take photos with iconic landmarks.", "");
        Attraction shenzhenBayPark = new Attraction("Shenzhen Bay Park", shenzhen, "Shenzhen Bay Park is a waterfront park located along the coastline of Shenzhen, China. It offers stunning views of Shenzhen Bay and the Hong Kong skyline, as well as recreational facilities such as jogging and cycling paths, playgrounds, and picnic areas. Visitors can relax by the waterfront, enjoy outdoor activities, and take in the scenic beauty of the park.", "");
        Attraction splendchina = new Attraction("Splendid China Folk Village", shenzhen, "Splendid China Folk Village is a cultural theme park located in the Nanshan District of Shenzhen, China. It showcases the diverse cultures, traditions, and architectural styles of China's ethnic minorities and regions. Visitors can explore miniature replicas of famous landmarks, ethnic villages, and historical sites, and learn about China's rich cultural heritage.", "");
        Attraction shenzhenGardenAndFlowerExpoPark = new Attraction("Shenzhen Garden and Flower Expo Park", shenzhen, "Shenzhen Garden and Flower Expo Park is a botanical garden and expo park located in the Longgang District of Shenzhen, China. It features a diverse collection of plants, flowers, and landscaped gardens, as well as pavilions, sculptures, and cultural exhibitions. Visitors can enjoy leisurely strolls, nature walks, and photography opportunities amidst the park's natural beauty.", "");
        Attraction dafenOilPaintingVillage = new Attraction("Dafen Oil Painting Village", shenzhen, "Dafen Oil Painting Village is an artists' village located in the Buji Subdistrict of Shenzhen, China. It is renowned for its thriving art community and production of high-quality oil paintings. Visitors can explore galleries, studios, and workshops, watch artists at work, and purchase original artworks or custom-made paintings.", "");

// Save attractions in Shenzhen
        attractionRepository.save(windowOfTheWorld);
        attractionRepository.save(shenzhenBayPark);
        attractionRepository.save(splendchina);
        attractionRepository.save(shenzhenGardenAndFlowerExpoPark);
        attractionRepository.save(dafenOilPaintingVillage);
// Top 5 attractions in Sydney
        Attraction sydneyHarbourBridge = new Attraction("Sydney Harbour Bridge", sydney, "The Sydney Harbour Bridge is an iconic steel through arch bridge across Sydney Harbour, connecting the Sydney central business district and the North Shore. It is one of the most famous landmarks in Sydney, offering breathtaking views of the harbor and city skyline. Visitors can climb the bridge for panoramic views or take a leisurely walk across the pedestrian walkway.", "");
        Attraction bondiBeach = new Attraction("Bondi Beach", sydney, "Bondi Beach is one of Australia's most famous beaches, located in the eastern suburbs of Sydney. It is known for its golden sand, clear waters, and iconic surf culture. Visitors can enjoy swimming, sunbathing, and surfing at Bondi Beach, as well as exploring the surrounding coastal walks, cafes, and boutiques.", "");
        Attraction royalBotanicGarden = new Attraction("Royal Botanic Garden", sydney, "The Royal Botanic Garden Sydney is a beautiful oasis located in the heart of Sydney, adjacent to the Sydney Opera House and Sydney Harbour Bridge. It features lush gardens, stunning waterfront views, and a diverse collection of plant species from around the world. Visitors can enjoy leisurely walks, guided tours, and picnics amidst the natural beauty of the garden.", "");
        Attraction tarongaZoo = new Attraction("Taronga Zoo", sydney, "Taronga Zoo is a world-renowned zoo located in Mosman, on the shores of Sydney Harbour. It is home to over 4,000 animals from around the world, including native Australian species such as kangaroos, koalas, and platypuses. Visitors can explore the zoo's exhibits, watch animal shows, and participate in behind-the-scenes experiences such as keeper talks and animal encounters.", "");
        Attraction sydneyTowerEye = new Attraction("Sydney Tower Eye", sydney, "Sydney Tower Eye is Sydney's tallest structure and a prominent feature of the city's skyline. It offers panoramic views of Sydney and its surroundings from its observation deck, located 250 meters above street level. Visitors can enjoy 360-degree views of the city, including landmarks such as the Sydney Opera House, Sydney Harbour Bridge, and Bondi Beach.", "");

// Save attractions in Sydney
        attractionRepository.save(sydneyHarbourBridge);
        attractionRepository.save(bondiBeach);
        attractionRepository.save(royalBotanicGarden);
        attractionRepository.save(tarongaZoo);
        attractionRepository.save(sydneyTowerEye);
// Top 5 attractions in Melbourne
        Attraction federationSquare = new Attraction("Federation Square", melbourne, "Federation Square is a cultural precinct located in the heart of Melbourne's central business district. It is known for its distinctive architecture, public spaces, and cultural attractions. Visitors can explore galleries, museums, and theaters, attend events and festivals, and enjoy dining and shopping in the square.", "");
        Attraction queenVictoriaMarket = new Attraction("Queen Victoria Market", melbourne, "Queen Victoria Market is a historic landmark and iconic shopping destination in Melbourne. It offers a wide range of fresh produce, gourmet foods, clothing, souvenirs, and handicrafts, as well as dining options and cultural events. Visitors can explore the market's bustling stalls, sample local delicacies, and soak up the vibrant atmosphere.", "");
        Attraction royalExhibitionBuilding = new Attraction("Royal Exhibition Building", melbourne, "The Royal Exhibition Building is a UNESCO World Heritage Site located in Carlton Gardens, Melbourne. It is one of the world's oldest remaining exhibition pavilions, known for its stunning architecture and historical significance. Visitors can take guided tours of the building, learn about its history and use, and admire its ornate interiors and decorative features.", "");
        Attraction melbourneZoo = new Attraction("Melbourne Zoo", melbourne, "Melbourne Zoo is a zoological garden located in Royal Park, Melbourne. It is home to a diverse collection of animals from around the world, including endangered species such as Sumatran tigers, orangutans, and gorillas. Visitors can explore the zoo's exhibits, attend animal presentations, and participate in behind-the-scenes experiences such as keeper talks and animal encounters.", "");
        Attraction nationalGalleryOfVictoria = new Attraction("National Gallery of Victoria", melbourne, "The National Gallery of Victoria is the oldest and largest public art museum in Australia, located in Melbourne. It features an extensive collection of artworks from around the world, including Australian Indigenous art, European masterpieces, Asian artifacts, and contemporary installations. Visitors can explore the gallery's permanent and temporary exhibitions, attend art talks and workshops, and enjoy guided tours and special events.", "");

// Save attractions in Melbourne
        attractionRepository.save(federationSquare);
        attractionRepository.save(queenVictoriaMarket);
        attractionRepository.save(royalExhibitionBuilding);
        attractionRepository.save(melbourneZoo);
        attractionRepository.save(nationalGalleryOfVictoria);
// Top 5 attractions in Brisbane
        Attraction southBankParklands = new Attraction("South Bank Parklands", brisbane, "South Bank Parklands is a premier recreational precinct located on the southern bank of the Brisbane River. It features lush gardens, sandy beaches, walking paths, playgrounds, and picnic areas. Visitors can enjoy swimming in the Streets Beach lagoon, exploring the Arbour promenade, visiting cultural institutions such as the Queensland Museum and Gallery of Modern Art, and dining at waterfront restaurants and cafes.", "");
        Attraction lonePineKoalaSanctuary = new Attraction("Lone Pine Koala Sanctuary", brisbane, "Lone Pine Koala Sanctuary is the world's first and largest koala sanctuary, located in the Brisbane suburb of Fig Tree Pocket. It is home to over 130 koalas, as well as a variety of other Australian wildlife, including kangaroos, wallabies, wombats, and emus. Visitors can cuddle koalas, hand-feed kangaroos, watch animal presentations and shows, and learn about Australian wildlife conservation.", "");
        Attraction storyBridgeAdventureClimb = new Attraction("Story Bridge Adventure Climb", brisbane, "The Story Bridge Adventure Climb offers a thrilling and unique experience to climb Brisbane's iconic Story Bridge. Participants are guided by experienced climb leaders as they ascend the bridge's steel structure, reaching heights of up to 80 meters above the Brisbane River. Along the way, climbers enjoy panoramic views of the city skyline, surrounding suburbs, and natural landmarks.", "");
        Attraction queenslandArtGallery = new Attraction("Queensland Art Gallery", brisbane, "The Queensland Art Gallery is one of Australia's leading art museums, located in the South Bank cultural precinct of Brisbane. It features an extensive collection of Australian and international art, including paintings, sculptures, decorative arts, and multimedia installations. Visitors can explore the gallery's permanent and temporary exhibitions, attend art workshops and events, and enjoy dining at the on-site cafe.", "");
        Attraction mtCootthaBotanicGardens = new Attraction("Mt Coot-tha Botanic Gardens", brisbane, "The Mt Coot-tha Botanic Gardens is a beautiful botanical garden located at the foot of Mt Coot-tha, just a short drive from Brisbane's city center. It features themed gardens, walking trails, picnic areas, and panoramic views of Brisbane and the surrounding areas. Visitors can explore the gardens' diverse plant collections, enjoy guided tours and workshops, and relax in tranquil natural surroundings.", "");

// Save attractions in Brisbane
        attractionRepository.save(southBankParklands);
        attractionRepository.save(lonePineKoalaSanctuary);
        attractionRepository.save(storyBridgeAdventureClimb);
        attractionRepository.save(queenslandArtGallery);
        attractionRepository.save(mtCootthaBotanicGardens);
// Top 5 attractions in Perth
        Attraction kingsParkAndBotanicGarden = new Attraction("Kings Park and Botanic Garden", perth, "Kings Park and Botanic Garden is one of the largest inner-city parks in the world, located on the western edge of Perth's central business district. It features expansive gardens, native bushland, walking trails, playgrounds, and picnic areas. Visitors can enjoy stunning views of the Swan River and Perth skyline, explore the park's biodiversity, and attend cultural events and festivals.", "");
        Attraction swanRiverCruise = new Attraction("Swan River Cruise", perth, "A Swan River Cruise is a scenic boat tour along the Swan River, offering picturesque views of Perth and its surrounding areas. Visitors can choose from a variety of cruise options, including sightseeing cruises, lunch and dinner cruises, and wine and beer tasting cruises. Along the way, passengers can admire iconic landmarks such as the Perth Mint, Old Swan Brewery, and Kings Park.", "");
        Attraction fremantlePrison = new Attraction("Fremantle Prison", perth, "Fremantle Prison is a UNESCO World Heritage Site located in Fremantle, just south of Perth. It is one of Western Australia's most significant historic landmarks, known for its well-preserved Victorian-era architecture and fascinating history as a former convict prison. Visitors can take guided tours of the prison, explore its cellblocks, gallows, and underground tunnels, and learn about the lives of convicts and prison guards.", "");
        Attraction cottesloeBeach = new Attraction("Cottesloe Beach", perth, "Cottesloe Beach is one of Perth's most popular and picturesque beaches, located in the western suburbs of the city. It features golden sands, clear turquoise waters, and stunning sunset views. Visitors can swim, sunbathe, surf, and snorkel at Cottesloe Beach, as well as enjoy beachside dining and cafes.", "");
        Attraction perthZoo = new Attraction("Perth Zoo", perth, "Perth Zoo is a zoological garden located in South Perth, just a short ferry ride from Perth's central business district. It is home to a diverse collection of animals from around the world, including native Australian species such as kangaroos, koalas, and wombats. Visitors can explore the zoo's exhibits, attend animal presentations and shows, and participate in behind-the-scenes experiences such as keeper talks and animal encounters.", "");

// Save attractions in Perth
        attractionRepository.save(kingsParkAndBotanicGarden);
        attractionRepository.save(swanRiverCruise);
        attractionRepository.save(fremantlePrison);
        attractionRepository.save(cottesloeBeach);
        attractionRepository.save(perthZoo);
// Top 5 attractions in Adelaide
        Attraction adelaideBotanicGarden = new Attraction("Adelaide Botanic Garden", adelaide, "Adelaide Botanic Garden is a beautiful botanical garden located in the heart of Adelaide, South Australia. It features lush gardens, exotic plant collections, and iconic landmarks such as the Palm House and Bicentennial Conservatory. Visitors can explore the garden's themed sections, enjoy guided tours and workshops, and relax in peaceful natural surroundings.", "");
        Attraction adelaideCentralMarket = new Attraction("Adelaide Central Market", adelaide, "Adelaide Central Market is a vibrant and bustling market located in the Adelaide city center. It is one of Australia's largest and oldest fresh produce markets, offering a wide range of fruits, vegetables, meats, cheeses, seafood, and gourmet foods. Visitors can explore the market's stalls, sample local delicacies, and experience the diverse flavors and aromas of South Australian cuisine.", "");
        Attraction adelaideZoo = new Attraction("Adelaide Zoo", adelaide, "Adelaide Zoo is a zoological park located in the parklands of Adelaide, South Australia. It is home to over 2,500 animals from around the world, including native Australian species such as kangaroos, koalas, and wombats. Visitors can explore the zoo's exhibits, attend animal presentations and shows, and participate in behind-the-scenes experiences such as keeper talks and animal encounters.", "");
        Attraction glenelgBeach = new Attraction("Glenelg Beach", adelaide, "Glenelg Beach is a popular seaside destination located just a short tram ride from Adelaide's city center. It features a sandy beach, calm waters, and a lively esplanade with cafes, restaurants, and shops. Visitors can swim, sunbathe, enjoy water sports, and take scenic walks along the beachfront promenade.", "");
        Attraction adelaideOval = new Attraction("Adelaide Oval", adelaide, "Adelaide Oval is a renowned sports stadium located in the parklands of Adelaide, South Australia. It is home to major sporting events such as cricket, Australian rules football, and rugby, as well as concerts and other entertainment events. Visitors can take guided tours of the stadium, learn about its history and architecture, and enjoy panoramic views of the playing field and city skyline.", "");

// Save attractions in Adelaide
        attractionRepository.save(adelaideBotanicGarden);
        attractionRepository.save(adelaideCentralMarket);
        attractionRepository.save(adelaideZoo);
        attractionRepository.save(glenelgBeach);
        attractionRepository.save(adelaideOval);
// Top 5 attractions in Bishkek
        Attraction alaArchaNationalPark = new Attraction("Ala Archa National Park", bishkek, "Ala Archa National Park is a picturesque mountainous area located just outside of Bishkek, the capital city of Kyrgyzstan. It offers stunning alpine landscapes, glacier-fed rivers, and diverse flora and fauna. Visitors can enjoy hiking, trekking, picnicking, and wildlife spotting amidst the park's natural beauty.", "");
        Attraction oshBazaar = new Attraction("Osh Bazaar", bishkek, "Osh Bazaar is one of the largest and most vibrant markets in Bishkek, offering a wide range of goods and products. Visitors can explore the market's stalls selling fresh produce, spices, textiles, clothing, souvenirs, and traditional Kyrgyz handicrafts. It is a bustling hub of activity and a great place to experience the local culture and atmosphere.", "");
        Attraction victorySquare = new Attraction("Victory Square", bishkek, "Victory Square is a central square located in the heart of Bishkek, Kyrgyzstan's capital city. It is dedicated to the victory of the Soviet Union in World War II and features a prominent statue of a woman holding a laurel wreath, symbolizing victory. Visitors can stroll around the square, admire the monument, and take in the surrounding architecture and cityscape.", "");
        Attraction stateHistoricalMuseum = new Attraction("State Historical Museum", bishkek, "The State Historical Museum is a cultural institution located in Bishkek, Kyrgyzstan. It showcases the history, culture, and heritage of Kyrgyzstan through a diverse collection of artifacts, exhibits, and displays. Visitors can learn about the country's ancient civilizations, nomadic tribes, and Soviet-era history, as well as its modern-day culture and society.", "");

// Save attractions in Bishkek
        attractionRepository.save(alaArchaNationalPark);
        attractionRepository.save(oshBazaar);
        attractionRepository.save(victorySquare);
        attractionRepository.save(stateHistoricalMuseum);
// Top 5 attractions in Osh
        Attraction leninPeak = new Attraction("Lenin Peak", osh, "Lenin Peak is one of the highest mountains in the Pamir range, located near the border between Kyrgyzstan and Tajikistan. It is a popular destination for mountaineers and adventure enthusiasts, offering challenging climbing routes and breathtaking views from its summit. Visitors can trek to base camps at the foot of the mountain or join guided expeditions to attempt the summit.", "");
        Attraction oshRegionalMuseum = new Attraction("Osh Regional Museum", osh, "The Osh Regional Museum is a cultural institution located in Osh, Kyrgyzstan. It showcases the history, culture, and heritage of the Osh region through a diverse collection of artifacts, exhibits, and displays. Visitors can learn about the region's ancient civilizations, nomadic tribes, and Silk Road heritage, as well as its modern-day culture and society.", "");
        Attraction jalaAbadBazaar = new Attraction("Jalal-Abad Bazaar", osh, "Jalal-Abad Bazaar is a bustling market located in the city of Jalal-Abad, Kyrgyzstan. It offers a wide range of goods and products, including fresh produce, spices, textiles, clothing, household items, and souvenirs. Visitors can explore the market's stalls, shop for local goods, and experience the vibrant atmosphere of Jalal-Abad's trading culture.", "");

// Save attractions in Osh
        attractionRepository.save(leninPeak);
        attractionRepository.save(oshRegionalMuseum);
        attractionRepository.save(jalaAbadBazaar);
// Top 5 attractions in Jalal-Abad
        Attraction arslanbob = new Attraction("Arslanbob", jalalAbad, "Arslanbob is a picturesque village located in the Jalal-Abad region of Kyrgyzstan. It is famous for its walnut forests, which are some of the largest in the world, as well as its stunning natural scenery and hospitable local community. Visitors can explore the village, hike in the surrounding mountains, and learn about traditional Kyrgyz culture and agriculture.", "");
        Attraction saryChelek = new Attraction("Sary-Chelek Biosphere Reserve", jalalAbad, "Sary-Chelek Biosphere Reserve is a protected area located in the Jalal-Abad region of Kyrgyzstan. It is known for its pristine natural beauty, diverse ecosystems, and unique flora and fauna. Visitors can enjoy hiking, trekking, wildlife watching, and picnicking amidst the reserve's forests, lakes, and mountain landscapes.", "");
        Attraction khujandBazaar = new Attraction("Khujand Bazaar", jalalAbad, "Khujand Bazaar is a historic market located in the city of Khujand, Tajikistan, near the border with Kyrgyzstan. It offers a wide range of goods and products, including fresh produce, spices, textiles, clothing, household items, and souvenirs. Visitors can explore the market's stalls, shop for local goods, and experience the vibrant atmosphere of Khujand's trading culture.", "");
        Attraction somalinskyCanyon = new Attraction("Sary-Chelek Biosphere Reserve", jalalAbad, "The Somalinsky Canyon is a stunning natural attraction located in the Jalal-Abad region of Kyrgyzstan. It features dramatic rock formations, rugged cliffs, and a meandering river, creating a picturesque landscape for hiking, photography, and outdoor adventure. Visitors can explore the canyon's trails, admire its geological formations, and enjoy the tranquility of nature.", "");

// Save attractions in Jalal-Abad
        attractionRepository.save(arslanbob);
        attractionRepository.save(saryChelek);
        attractionRepository.save(khujandBazaar);
        attractionRepository.save(somalinskyCanyon);
// Top 5 attractions in Karakol
        Attraction issykKulLake = new Attraction("Issyk-Kul Lake", karakol, "Issyk-Kul Lake is the largest and one of the most beautiful alpine lakes in Kyrgyzstan, located near the city of Karakol. It is surrounded by majestic snow-capped mountains and offers stunning scenery year-round. Visitors can enjoy swimming, sunbathing, boating, and water sports in the crystal-clear waters of the lake, as well as explore nearby attractions such as hot springs, waterfalls, and historic sites.", "");
        Attraction karakolSkiResort = new Attraction("Karakol Ski Resort", karakol, "Karakol Ski Resort is a popular winter sports destination located in the Tien Shan mountains near the city of Karakol. It offers excellent skiing and snowboarding opportunities for all skill levels, with a variety of slopes, trails, and terrain parks. Visitors can also enjoy other winter activities such as snowshoeing, snowmobiling, and sledding, as well as cozy accommodations and après-ski amenities.", "");
        Attraction prjevalskyMuseum = new Attraction("Przhevalsky Museum", karakol, "The Przhevalsky Museum is a historical museum located in the city of Karakol, Kyrgyzstan. It is dedicated to the life and explorations of Nikolai Przhevalsky, a renowned Russian explorer and naturalist who conducted expeditions in Central Asia during the 19th century. Visitors can learn about Przhevalsky's adventures, discoveries, and contributions to science and geography through exhibits, artifacts, and multimedia displays.", "");
        Attraction jetiOguz = new Attraction("Jeti-Oguz Valley", karakol, "Jeti-Oguz Valley is a picturesque gorge located near the city of Karakol, Kyrgyzstan. It is known for its distinctive red sandstone rock formations, which resemble seven bulls lying down, as well as its lush alpine meadows, forests, and rivers. Visitors can hike, horseback ride, or take a scenic drive through the valley, enjoying panoramic views of the surrounding landscape and exploring natural attractions such as waterfalls and hot springs.", "");

// Save attractions in Karakol
        attractionRepository.save(issykKulLake);
        attractionRepository.save(karakolSkiResort);
        attractionRepository.save(prjevalskyMuseum);
        attractionRepository.save(jetiOguz);

// Top 5 attractions in Tokmok
        Attraction buranaTower = new Attraction("Burana Tower", tokmok, "Burana Tower is a historic minaret located near the town of Tokmok, Kyrgyzstan. It dates back to the 11th century and is one of the few remaining structures of the ancient city of Balasagun, which was once a thriving center of the Silk Road. Visitors can climb to the top of the tower for panoramic views of the surrounding countryside and explore the nearby archaeological site, which features ancient ruins, burial mounds, and petroglyphs.", "");
        Attraction tokmokMuseum = new Attraction("Tokmok Museum", tokmok, "The Tokmok Museum is a local history museum located in the town of Tokmok, Kyrgyzstan. It showcases the history, culture, and heritage of the Tokmok region through a diverse collection of artifacts, exhibits, and displays. Visitors can learn about the area's ancient civilizations, nomadic tribes, and Soviet-era history, as well as its modern-day culture and society.", "");
        Attraction kokMoinokCave = new Attraction("Kok-Moinok Cave", tokmok, "Kok-Moinok Cave is a natural limestone cave located near the town of Tokmok, Kyrgyzstan. It is known for its unique geological formations, including stalactites, stalagmites, and underground chambers. Visitors can explore the cave's passages, admire its mineral formations, and learn about its formation and significance through guided tours and educational programs.", "");

// Save attractions in Tokmok
        attractionRepository.save(buranaTower);
        attractionRepository.save(tokmokMuseum);
        attractionRepository.save(kokMoinokCave);

// Top Attractions for Riyadh
        Attraction kingdomCentreTower = new Attraction("Kingdom Centre Tower", riyadh, "The Kingdom Centre Tower is one of Riyadh's most iconic landmarks, soaring over the city's skyline with its distinctive design. It houses luxury apartments, offices, and a shopping mall, but the highlight is the Sky Bridge, an observation deck offering panoramic views of Riyadh. Visitors can enjoy breathtaking vistas of the city and beyond from this vantage point.", "");
        Attraction alMasmakFortress = new Attraction("Al-Masmak Fortress", riyadh, "Al-Masmak Fortress is a historic castle located in the heart of Riyadh, dating back to the 19th century. It played a significant role in the founding of the Kingdom of Saudi Arabia, serving as a symbol of resistance during the Riyadh Reconquest. Today, the fortress has been transformed into a museum, showcasing exhibits on Saudi heritage, culture, and history.", "");
        Attraction nationalMuseumOfSaudiArabia = new Attraction("National Museum of Saudi Arabia", riyadh, "The National Museum of Saudi Arabia is a cultural institution in Riyadh dedicated to preserving and promoting the history, heritage, and traditions of Saudi Arabia. It features a vast collection of artifacts, manuscripts, and archaeological finds spanning thousands of years, from prehistoric times to the present day. Visitors can explore exhibits on ancient civilizations, Islamic art, Saudi folklore, and more, offering insights into the kingdom's rich cultural tapestry.", "");
        Attraction edgeOfTheWorld = new Attraction("Edge of the World", riyadh, "The Edge of the World is a dramatic escarpment located just outside Riyadh, offering breathtaking views of the surrounding desert landscape. It is a popular destination for outdoor enthusiasts, hikers, and nature lovers seeking adventure and solitude. Visitors can hike along the rugged terrain, marvel at the sheer cliffs and rock formations, and witness stunning sunsets over the horizon.", "");
        Attraction diriyahHistoricalQuarter = new Attraction("Diriyah Historical Quarter", riyadh, "Diriyah Historical Quarter is a UNESCO World Heritage Site located on the outskirts of Riyadh, comprising ancient palaces, mosques, and traditional mud-brick houses. It was the original seat of the Saudi royal family and the capital of the first Saudi state. Today, the quarter has been restored and transformed into a cultural and historical attraction, allowing visitors to step back in time and experience Saudi Arabia's rich heritage and architecture.", "");

        attractionRepository.save(kingdomCentreTower);
        attractionRepository.save(alMasmakFortress);
        attractionRepository.save(nationalMuseumOfSaudiArabia);
        attractionRepository.save(edgeOfTheWorld);
        attractionRepository.save(diriyahHistoricalQuarter);

// Top Attractions for Jeddah
        Attraction alBaladHistoricDistrict = new Attraction("Al-Balad Historic District", jeddah, "Al-Balad Historic District is the old town of Jeddah, renowned for its traditional architecture, historic buildings, and bustling souks. It is a UNESCO World Heritage Site, preserving the rich cultural heritage of Jeddah's past. Visitors can wander through its labyrinthine streets, admire the intricately decorated houses known as 'coral homes,' and explore the vibrant markets selling everything from spices to textiles.", "");
        Attraction kingFahdFountain = new Attraction("King Fahd Fountain", jeddah, "The King Fahd Fountain, also known as the Jeddah Fountain, is one of the tallest fountains in the world, located on the coast of Jeddah's Corniche. It shoots water jets up to 312 meters high, creating a spectacular display that can be seen from miles away. Visitors can enjoy leisurely strolls along the Corniche promenade and admire the fountain's mesmerizing nighttime illumination.", "");
        Attraction floatingMosque = new Attraction("Floating Mosque", jeddah, "The Floating Mosque, officially known as the King Fahd Fountain Mosque, is an architectural marvel located near the King Fahd Fountain on Jeddah's Corniche. It appears to float on the Red Sea, giving it a unique and striking appearance. Visitors can marvel at its modern Islamic design, adorned with intricate patterns and calligraphy, and experience a sense of serenity inside its prayer halls.", "");
        Attraction coralReefDiving = new Attraction("Coral Reef Diving", jeddah, "Jeddah is renowned for its pristine coral reefs and vibrant marine life, making it a popular destination for scuba diving and snorkeling enthusiasts. The city's coastline is dotted with numerous dive sites, offering opportunities to explore colorful coral gardens, encounter exotic fish species, and even spot sea turtles and rays. Visitors can embark on diving excursions led by experienced guides to discover the underwater wonders of the Red Sea.", "");
        Attraction redSeaMall = new Attraction("Red Sea Mall", jeddah, "Red Sea Mall is one of the largest shopping malls in Jeddah, offering a wide range of retail outlets, dining options, and entertainment facilities. It features luxury boutiques, international brands, and a diverse food court, catering to all tastes and preferences. Visitors can shop for designer fashion, electronics, cosmetics, and souvenirs, or simply enjoy a day of leisure and recreation with family and friends.", "");

        attractionRepository.save(alBaladHistoricDistrict);
        attractionRepository.save(kingFahdFountain);
        attractionRepository.save(floatingMosque);
        attractionRepository.save(coralReefDiving);
        attractionRepository.save(redSeaMall);

// Top Attractions for Mecca
        Attraction alMasjidAlHaram = new Attraction("Al-Masjid al-Haram", mecca, "Al-Masjid al-Haram, also known as the Grand Mosque, is the holiest site in Islam and the largest mosque in the world. It surrounds the Kaaba, the cubic structure towards which Muslims around the world face during their prayers. Millions of pilgrims visit the mosque every year, especially during the Hajj pilgrimage, to perform religious rituals and seek spiritual blessings. The mosque's magnificent architecture and historical significance make it a symbol of unity and devotion for Muslims worldwide.", "");
        Attraction mountArafat = new Attraction("Mount Arafat", mecca, "Mount Arafat, also known as Jabal al-Rahmah (the Mount of Mercy), is a granite hill located near Mecca, Saudi Arabia. It is a significant site for Muslims, as it is where the Prophet Muhammad delivered his Farewell Sermon during his final pilgrimage (Hajj). Pilgrims performing the Hajj gather at Mount Arafat on the ninth day of the Islamic month of Dhu al-Hijjah to engage in prayers and supplications, following the tradition set by the Prophet Muhammad.", "");
        Attraction jabalAlNour = new Attraction("Jabal al-Nour", mecca, "Jabal al-Nour, meaning the 'Mountain of Light,' is a mountain located near Mecca, Saudi Arabia. It is famous for the Cave of Hira, where the Prophet Muhammad received the first revelation of the Quran from the Angel Gabriel. Pilgrims and visitors often hike up the mountain to visit the cave and reflect on its historical significance in Islam. The ascent offers panoramic views of Mecca and its surroundings, providing a spiritual and serene experience for believers.", "");
        Attraction zamzamWell = new Attraction("Zamzam Well", mecca, "The Zamzam Well is a sacred well located within the precincts of the Masjid al-Haram in Mecca, Saudi Arabia. According to Islamic tradition, the well miraculously appeared to provide water for the Prophet Ibrahim (Abraham) and his family. It continues to be a vital water source for pilgrims visiting Mecca, who drink from its waters and collect it for religious purposes. The well's history and significance make it a revered site for Muslims performing the Hajj and Umrah pilgrimages.", "");
        Attraction alBaikRestaurant = new Attraction("Al-Baik Restaurant", mecca, "Al-Baik is a popular fast-food chain in Saudi Arabia, known for its delicious fried chicken and seafood dishes. The restaurant has several branches in Mecca, offering a convenient dining option for pilgrims and visitors. Its crispy chicken, flavorful sauces, and affordable prices have made it a favorite among locals and tourists alike. Visitors to Mecca often indulge in Al-Baik's mouthwatering meals, making it a must-try culinary experience in the city.", "");

        attractionRepository.save(alMasjidAlHaram);
        attractionRepository.save(mountArafat);
        attractionRepository.save(jabalAlNour);
        attractionRepository.save(zamzamWell);
        attractionRepository.save(alBaikRestaurant);

// Top Attractions for Medina
        Attraction alMasjidAnNabawi = new Attraction("Al-Masjid an-Nabawi", medina, "Al-Masjid an-Nabawi, also known as the Prophet's Mosque, is the second holiest site in Islam and one of the largest mosques in the world. It is located in the city of Medina, Saudi Arabia, and contains the tomb of the Prophet Muhammad. Pilgrims and visitors flock to the mosque to offer prayers, pay their respects to the Prophet Muhammad, and seek blessings. The mosque's green dome and minarets are iconic symbols of Medina's skyline, attracting millions of worshippers and tourists each year.", "");
        Attraction qubaMosque = new Attraction("Quba Mosque", medina, "Quba Mosque is the first mosque built by the Prophet Muhammad in Medina, Saudi Arabia, and holds significant religious importance in Islam. It is located on the outskirts of Medina and is considered the oldest mosque in the world. Muslims visit Quba Mosque to perform prayers and seek blessings, believing that praying in the mosque carries great rewards. The mosque's simple yet elegant architecture and tranquil surroundings make it a serene and spiritual destination for worshippers and visitors alike.", "");
        Attraction mountUhud = new Attraction("Mount Uhud", medina, "Mount Uhud is a mountain range located north of Medina, Saudi Arabia, notable for its historical significance in Islamic history. It was the site of the Battle of Uhud, a key battle fought between the early Muslims of Medina and the Quraysh tribe of Mecca. Pilgrims and visitors often climb Mount Uhud to explore its rugged terrain, visit the site of the battle, and reflect on its lessons of bravery and sacrifice. The mountain offers panoramic views of the city of Medina and its surrounding landscapes, providing a peaceful and contemplative experience for visitors.", "");
        Attraction alBaqiCemetery = new Attraction("Al-Baqi' Cemetery", medina, "Al-Baqi' Cemetery is an ancient burial ground located near Al-Masjid an-Nabawi in Medina, Saudi Arabia. It is the final resting place of many prominent figures in Islamic history, including several companions of the Prophet Muhammad and members of his family. Pilgrims and visitors pay their respects to the deceased, recite prayers, and contemplate the transient nature of life. The cemetery's serene atmosphere and historical significance make it a sacred and contemplative site for Muslims.", "");
        Attraction datesMarket = new Attraction("Dates Market", medina, "The Dates Market in Medina is a bustling marketplace known for its wide variety of dates, a staple fruit in the Middle East. It offers an array of dates sourced from local farms and orchards, including premium varieties such as Ajwa and Sukkari. Visitors can sample different types of dates, purchase them as souvenirs, or enjoy traditional date-based sweets and snacks. The market's vibrant atmosphere and aromatic scents make it a popular destination for locals and tourists alike.", "");

        attractionRepository.save(alMasjidAnNabawi);
        attractionRepository.save(qubaMosque);
        attractionRepository.save(mountUhud);
        attractionRepository.save(alBaqiCemetery);
        attractionRepository.save(datesMarket);

// Top Attractions for Dammam
        Attraction corniche = new Attraction("Dammam Corniche", dammam, "The Dammam Corniche is a picturesque waterfront promenade that stretches along the coast of Dammam, Saudi Arabia. It offers stunning views of the Arabian Gulf, with landscaped gardens, walking paths, and recreational areas for visitors to enjoy. The corniche is a popular destination for families, joggers, and couples seeking leisure and relaxation by the sea. Visitors can take in the sea breeze, watch the sunset, or indulge in waterfront dining at one of the many cafes and restaurants.", "");
        Attraction kingAbdulazizCenterForWorldCulture = new Attraction("King Abdulaziz Center for World Culture", dammam, "The King Abdulaziz Center for World Culture, also known as Ithra, is a cultural complex located in Dammam, Saudi Arabia. It serves as a hub for arts, education, and innovation, offering a diverse range of programs and activities for visitors of all ages. The center features state-of-the-art facilities, including theaters, galleries, libraries, and interactive exhibits, showcasing Saudi Arabia's cultural heritage and fostering creativity and learning. Visitors can attend performances, workshops, and exhibitions, making it a vibrant cultural destination in Dammam.", "");
        Attraction alDanahMall = new Attraction("Al Danah Mall", dammam, "Al Danah Mall is a modern shopping destination located in the heart of Dammam, Saudi Arabia. It offers a wide range of retail stores, international brands, and entertainment facilities, catering to shoppers of all ages and interests. The mall features spacious atriums, stylish boutiques, and a variety of dining options, making it a popular spot for leisurely shopping and socializing. Visitors can shop for fashion, electronics, cosmetics, and more, or enjoy family-friendly activities such as cinema screenings and indoor playgrounds.", "");
        Attraction marjanIsland = new Attraction("Marjan Island", dammam, "Marjan Island is a man-made island located off the coast of Dammam, Saudi Arabia, offering a tranquil retreat from the city's hustle and bustle. It features pristine beaches, lush green spaces, and recreational facilities for visitors to enjoy. The island is a popular destination for picnics, water sports, and beachside relaxation, with designated areas for swimming, sunbathing, and beach volleyball. Visitors can escape the urban landscape and immerse themselves in the natural beauty and serenity of Marjan Island.", "");
        Attraction alShateaMall = new Attraction("Al Shatea Mall", dammam, "Al Shatea Mall is a popular shopping and entertainment complex located in Dammam, Saudi Arabia. It offers a diverse range of retail outlets, dining options, and recreational activities for visitors of all ages. The mall features international and local brands, a food court with various cuisines, and entertainment facilities such as cinemas and amusement arcades. Visitors can shop, dine, and socialize in a vibrant and dynamic environment, making it a favorite destination for locals and tourists alike.", "");

        attractionRepository.save(corniche);
        attractionRepository.save(kingAbdulazizCenterForWorldCulture);
        attractionRepository.save(alDanahMall);
        attractionRepository.save(marjanIsland);
        attractionRepository.save(alShateaMall);

// Top Attractions for Muscat
        Attraction sultanQaboosGrandMosque = new Attraction("Sultan Qaboos Grand Mosque", muscat, "The Sultan Qaboos Grand Mosque is one of the most iconic landmarks in Muscat, Oman, known for its stunning architecture and grandeur. It features a magnificent main prayer hall, adorned with a massive chandelier, intricately designed carpets, and marble walls with intricate Islamic patterns. The mosque's exterior is equally impressive, with its distinctive domes, minarets, and expansive courtyard. Visitors can explore the mosque's interior, marvel at its beauty, and learn about Omani culture and Islamic architecture.", "");
        Attraction muttrahSouq = new Attraction("Muttrah Souq", muscat, "Muttrah Souq is a bustling marketplace located in the heart of Muscat, Oman, offering a wide array of goods and merchandise. It is one of the oldest souqs in the country, dating back over two centuries, and retains its traditional charm and atmosphere. Visitors can wander through its narrow alleyways, browse through stalls selling spices, textiles, jewelry, and handicrafts, and haggle with friendly shopkeepers. The souq is also a great place to experience Omani culture, taste local delicacies, and shop for souvenirs.", "");
        Attraction royalOperaHouseMuscat = new Attraction("Royal Opera House Muscat", muscat, "The Royal Opera House Muscat is a prestigious cultural institution and performing arts venue located in Muscat, Oman. It showcases a diverse program of opera, ballet, classical music, theater, and dance performances, featuring both local talent and international artists. The opera house is renowned for its stunning architecture, blending traditional Omani design elements with modern amenities. Visitors can attend world-class performances, guided tours, and educational workshops, making it a must-visit destination for arts and culture enthusiasts in Muscat.", "");
        Attraction alRiyamPark = new Attraction("Al Riyam Park", muscat, "Al Riyam Park is a scenic park located along the coastline of Muscat, Oman, offering panoramic views of the city's skyline and the Arabian Sea. It features lush greenery, walking trails, and recreational facilities for visitors to enjoy. The park is home to several iconic landmarks, including the giant incense burner monument and the Omani French Museum. Visitors can relax in the park's tranquil setting, take in the stunning views, and capture memorable photos of Muscat's picturesque coastline.", "");
        Attraction bimmahSinkhole = new Attraction("Bimmah Sinkhole", muscat, "Bimmah Sinkhole, also known as Hawiyat Najm Park, is a natural wonder located near Muscat, Oman, formed by the collapse of limestone bedrock. It is filled with turquoise-blue water and surrounded by rocky cliffs, creating a breathtaking sight. The sinkhole is a popular swimming and picnic spot for locals and tourists, offering crystal-clear waters and stunning views of the surrounding landscape. Visitors can swim, snorkel, or simply admire the beauty of this natural marvel, making it a must-visit destination for nature lovers in Muscat.", "");

        attractionRepository.save(sultanQaboosGrandMosque);
        attractionRepository.save(muttrahSouq);
        attractionRepository.save(royalOperaHouseMuscat);
        attractionRepository.save(alRiyamPark);
        attractionRepository.save(bimmahSinkhole);

// Top Attractions for Doha
        Attraction thePearlQatar = new Attraction("The Pearl-Qatar", doha, "The Pearl-Qatar is an artificial island and luxury residential development located off the coast of Doha, Qatar. It features upscale residences, high-end shopping boutiques, fine dining restaurants, and luxury hotels, all surrounding a marina with yachts and boats. Visitors can stroll along the picturesque promenade, enjoy waterfront dining, shop for designer brands, and admire the stunning architecture and views of the Arabian Gulf.", "");
        Attraction souqWaqif = new Attraction("Souq Waqif", doha, "Souq Waqif is a vibrant traditional market in the heart of Doha, Qatar, known for its bustling atmosphere, maze-like alleyways, and diverse range of products. It offers a variety of goods, including spices, textiles, traditional garments, handicrafts, and souvenirs. Visitors can explore the souq's narrow lanes, interact with local vendors, and experience Qatari culture and heritage. Souq Waqif also features numerous cafes, restaurants, and shisha lounges, where visitors can relax and enjoy authentic Arabian cuisine.", "");
        Attraction museumOfIslamicArt = new Attraction("Museum of Islamic Art", doha, "The Museum of Islamic Art is a world-class cultural institution located on the Corniche waterfront in Doha, Qatar. It houses one of the most extensive collections of Islamic art in the world, spanning over 1,400 years and three continents. The museum's stunning architecture, designed by renowned architect I. M. Pei, and its rich collection of artifacts, including ceramics, textiles, manuscripts, and metalwork, make it a must-visit destination for art and history enthusiasts.", "");
        Attraction aspirePark = new Attraction("Aspire Park", doha, "Aspire Park is a sprawling green oasis located in the heart of Doha, Qatar, adjacent to the Aspire Zone sports complex. It is one of the largest parks in the country, featuring lush landscaped gardens, walking paths, playgrounds, and recreational facilities. Visitors can enjoy picnics, leisurely strolls, and outdoor activities, with scenic views of the Aspire Tower and the surrounding skyline. Aspire Park is a popular destination for families, fitness enthusiasts, and nature lovers seeking relaxation and tranquility amidst the urban landscape.", "");
        Attraction kataraCulturalVillage = new Attraction("Katara Cultural Village", doha, "Katara Cultural Village is a cultural hub and entertainment precinct located on the eastern coast of Doha, Qatar. It celebrates Qatar's heritage and multiculturalism through various cultural, artistic, and educational initiatives. The village features theaters, galleries, museums, restaurants, and outdoor performance spaces, hosting a diverse range of events and festivals throughout the year. Visitors can explore exhibitions, attend concerts, watch theatrical performances, and participate in workshops, offering insights into Qatari culture and traditions.", "");

        attractionRepository.save(thePearlQatar);
        attractionRepository.save(souqWaqif);
        attractionRepository.save(museumOfIslamicArt);
        attractionRepository.save(aspirePark);
        attractionRepository.save(kataraCulturalVillage);

// Top Attractions for Lusail
        Attraction lusailIconicStadium = new Attraction("Lusail Iconic Stadium", lusail, "Lusail Iconic Stadium is a state-of-the-art sports venue located in Lusail, Qatar, designed to host matches during the FIFA World Cup. It features a striking architectural design inspired by traditional Arab architectural elements, with a capacity to seat over 80,000 spectators. The stadium is equipped with modern facilities, including hospitality suites, VIP lounges, and media centers, ensuring a world-class experience for visitors and participants alike.", "");
        Attraction lusailMarinaPromenade = new Attraction("Lusail Marina Promenade", lusail, "Lusail Marina Promenade is a scenic waterfront promenade located along the coastline of Lusail, Qatar. It offers panoramic views of the marina, with luxury yachts, sailing boats, and waterfront cafes lining the promenade. Visitors can stroll along the boardwalk, enjoy alfresco dining, and admire the stunning sunset over the Arabian Gulf. The promenade is a popular destination for leisure and recreation, with landscaped gardens, jogging tracks, and outdoor seating areas.", "");
        Attraction lusailTowers = new Attraction("Lusail Towers", lusail, "Lusail Towers is a mixed-use development located in Lusail, Qatar, comprising several high-rise buildings that form the centerpiece of the city's skyline. It includes residential towers, commercial offices, retail outlets, and luxury hotels, all connected by pedestrian-friendly promenades and plazas. The towers feature modern architecture, innovative design elements, and panoramic views of the surrounding cityscape and waterfront. Visitors can explore the towers, dine at upscale restaurants, and shop at designer boutiques, experiencing the epitome of luxury and sophistication in Lusail.", "");
        Attraction lusailLightRailTransit = new Attraction("Lusail Light Rail Transit", lusail, "Lusail Light Rail Transit (LRT) is a modern tram system that serves the city of Lusail, Qatar, providing efficient and sustainable transportation for residents and visitors. The LRT network connects key destinations within Lusail, including residential areas, commercial districts, and leisure attractions, with comfortable and convenient tram services. Visitors can ride the LRT to explore Lusail's landmarks, shopping centers, and entertainment venues, enjoying scenic views of the city along the way.", "");
        Attraction lusailNationalMuseum = new Attraction("Lusail National Museum", lusail, "Lusail National Museum is a cultural institution located in Lusail, Qatar, dedicated to showcasing the history, heritage, and future vision of the city. It features interactive exhibits, multimedia displays, and immersive experiences that highlight Lusail's development as a modern metropolis. The museum's architecture reflects Qatari design motifs and sustainable principles, with innovative technologies and environmentally friendly features integrated throughout the building. Visitors can learn about Lusail's urban planning, architectural landmarks, and cultural landmarks, gaining insights into the city's past, present, and future.", "");

        attractionRepository.save(lusailIconicStadium);
        attractionRepository.save(lusailMarinaPromenade);
        attractionRepository.save(lusailTowers);
        attractionRepository.save(lusailLightRailTransit);
        attractionRepository.save(lusailNationalMuseum);

// Top Attractions for Bangkok
        Attraction chatuchakWeekendMarket = new Attraction("Chatuchak Weekend Market", bangkok, "Chatuchak Weekend Market is one of the largest and most popular markets in Bangkok, Thailand, offering a vast array of goods and merchandise. It spans over 35 acres and features thousands of stalls selling everything from clothing and accessories to handicrafts, antiques, and souvenirs. The market is a treasure trove for bargain hunters and shoppers, with a diverse range of products at affordable prices. Visitors can wander through its maze-like alleyways, sample local snacks, and immerse themselves in the vibrant atmosphere of this bustling marketplace.", "");
        Attraction floatingMarkets = new Attraction("Floating Markets", bangkok, "Floating markets are a unique and traditional feature of Bangkok, Thailand, where vendors sell goods from boats along the city's canals and rivers. There are several floating markets in and around Bangkok, each offering its own distinct charm and atmosphere. Visitors can explore the markets by boat, browse through stalls selling fresh produce, local snacks, and handicrafts, and experience the vibrant sights, sounds, and flavors of Thai culture. Floating markets provide an authentic glimpse into Bangkok's rich culinary and trading heritage, making them a popular attraction for tourists.", "");
        Attraction lumpiniPark = new Attraction("Lumpini Park", bangkok, "The oldest park in the city.", "");
        Attraction jimThompsonHouse = new Attraction("Jim Thompson house", bangkok, "This former home of an American named Jim Thompson, who started the Thai silk industry after World War II, houses a magnificent collection of Asian art and many unique displays.", "");
        Attraction centralWorld = new Attraction("Central Word", bangkok, "This massive shopping complex in Bangkok houses over 500 stores across seven floors. CentralWorld is also connected to a 5-star hotel, a 15-screen cinema, two Hindu shrines, and an ice skating rink—great for a family outing. For avid shoppers, expect designer brands as well as leading international and local fashion brands. When hungry, don’t miss the Central Food Hall and the array of restaurants, cafes, and dessert joints in the mall. Tourists can obtain a special discount card with their passports and enjoy even more savings. CentralWorld can be easily reached by the BTS Skytrain.", "");

        attractionRepository.save(chatuchakWeekendMarket);
        attractionRepository.save(floatingMarkets);
        attractionRepository.save(lumpiniPark);
        attractionRepository.save(jimThompsonHouse);
        attractionRepository.save(centralWorld);

// Top Attractions for Chiang Mai
        Attraction nightBazaar = new Attraction("Night Bazaar", chiangMai, "Chiang Mai Night Bazaar is a bustling market that comes to life after sunset, offering a lively and vibrant shopping experience. It spans several blocks along Chang Khlan Road and features hundreds of stalls selling a variety of goods, including clothing, handicrafts, souvenirs, and street food. Visitors can browse through the stalls, haggle with vendors, and sample local snacks while soaking in the energetic atmosphere. The Night Bazaar is also known for its live music performances, cultural shows, and entertainment, making it a must-visit destination for tourists in Chiang Mai.", "");
        Attraction chiangMaiElephantNaturePark = new Attraction("Chiang Mai Elephant Nature Park", chiangMai, "Chiang Mai Elephant Nature Park is an ethical elephant sanctuary located in the outskirts of Chiang Mai, Thailand, dedicated to the rescue and conservation of elephants. It provides a natural and humane environment for rescued elephants to roam freely, socialize, and rehabilitate after years of mistreatment in the tourism and logging industries. Visitors can experience close encounters with elephants, feed them, and observe their natural behaviors in their natural habitat. The park also offers educational programs and volunteer opportunities, allowing visitors to learn about elephant welfare and contribute to conservation efforts.", "");

        attractionRepository.save(nightBazaar);
        attractionRepository.save(chiangMaiElephantNaturePark);


// Top Attractions for Seoul
        Attraction gyeongbokgungPalace = new Attraction("Gyeongbokgung Palace", seoul, "This historic palace is the largest of the Five Grand Palaces built during the Joseon Dynasty. Visitors can explore its impressive architecture, beautiful gardens, and learn about Korean royal history.", "");
        Attraction myeongdongShoppingStreet = new Attraction("MyeongdongShoppingStreet", seoul, "A bustling district renowned for its vibrant blend of modernity and tradition. Lined with skyscrapers and neon signs, the narrow streets offer a sensory explosion of sizzling street food aromas and tantalizing Korean delicacies. It's a haven for fashion enthusiasts, with a maze of boutiques and international brands, alongside a paradise for beauty aficionados, boasting an array of cosmetics shops. Amidst the hustle, traditional hanok houses peek out, offering a glimpse into Seoul's rich heritage. As night falls, Myeongdong transforms into a pulsating hub of nightlife, with street performances and bustling night markets, making it an exhilarating destination for immersive cultural experiences.", "");
        Attraction nationalMuseumOfKorea = new Attraction("National Museum of Korea", seoul, "A cultural gem renowned for its vast collection spanning centuries of Korean history and art. Set against a backdrop of modern architecture, the museum offers a journey through the nation's rich heritage, from ancient artifacts to contemporary masterpieces. Visitors are immersed in a treasure trove of exhibits showcasing traditional ceramics, exquisite paintings, and archaeological wonders. The museum's sprawling grounds also feature tranquil gardens, providing a serene escape amidst the bustling city. With its comprehensive displays and immersive experiences, the National Museum of Korea stands as a beacon of cultural preservation and exploration.", "");
        Attraction changdeokgungPalace = new Attraction("Changdeokgung Palace", seoul, "A testament to Korea's majestic royal history. Surrounded by lush gardens and centuries-old trees, the palace exudes an aura of tranquility and grandeur. Its meticulously preserved architecture, characterized by intricate wooden structures and colorful painted details, offers visitors a glimpse into the opulent lifestyle of Korean royalty. As you wander through its graceful courtyards and ornate halls, you're transported back in time to a bygone era of splendor and tradition. Changdeokgung Palace, a UNESCO World Heritage site, stands as a timeless symbol of Korea's cultural heritage and architectural brilliance.", "");
        Attraction nSeoulTower = new Attraction("N Seoul Tower", seoul, "An iconic landmark perched atop Namsan Mountain in the heart of Seoul, offers panoramic views and cultural experiences that captivate visitors. Rising majestically above the city skyline, the tower's observation decks provide breathtaking vistas of Seoul's sprawling urban landscape and surrounding mountains. Beyond its awe-inspiring views, N Seoul Tower boasts an array of attractions, including restaurants, exhibitions, and even a digital art gallery, offering visitors a diverse range of experiences. Whether you're admiring the city lights at night or enjoying a leisurely stroll through the adjacent Namsan Park, N Seoul Tower stands as a symbol of Seoul's vibrant spirit and a must-visit destination for locals and tourists alike.", "");
        Attraction insadong = new Attraction("Insadong", seoul, "A cultural enclave nestled in the heart of Seoul, enchants visitors with its charming blend of tradition and modernity. Lined with quaint alleyways and historic storefronts, this bustling neighborhood is a treasure trove of Korean art, crafts, and cuisine. Meandering through its lively streets, visitors encounter a vibrant tapestry of galleries, teahouses, and souvenir shops, showcasing everything from traditional hanbok attire to contemporary artwork. Amidst the hustle and bustle, ancient temples and tranquil gardens provide serene retreats from the urban landscape, offering a glimpse into Seoul's rich cultural heritage. Whether savoring a cup of aromatic green tea or exploring the latest in Korean crafts, Insadong captivates with its timeless charm and vibrant energy.", "");

        attractionRepository.save(gyeongbokgungPalace);
        attractionRepository.save(myeongdongShoppingStreet);
        attractionRepository.save(nationalMuseumOfKorea);
        attractionRepository.save(changdeokgungPalace);
        attractionRepository.save(nSeoulTower);
        attractionRepository.save(insadong);

// Top Attractions for Busan
        Attraction haeundaeBeach = new Attraction("Haeundae Beach", busan, "One of South Korea's most famous beaches, Haeundae Beach offers golden sands, clear waters, and a vibrant atmosphere. Visitors can enjoy sunbathing, swimming, and water sports during the day, and explore nearby cafes, restaurants, and bars along the bustling beachfront promenade. As night falls, the beach transforms into a lively hub of activity, with concerts, festivals, and fireworks lighting up the night sky.", "");
        Attraction gamcheonCultureVillage = new Attraction("Gamcheon Culture Village", busan, "Known as the 'Santorini of the East', Gamcheon Culture Village is a colorful hillside neighborhood in Busan, South Korea. Visitors can wander through its narrow alleys adorned with vibrant murals, art installations, and quirky sculptures, while enjoying panoramic views of the city and sea. The village is also home to galleries, cafes, and handicraft shops, offering a unique blend of art, culture, and community.", "");
        Attraction jagalchiFishMarket = new Attraction("Jagalchi Fish Market", busan, "Jagalchi Fish Market is South Korea's largest seafood market, located in the heart of Busan's coastal district. Visitors can explore its bustling indoor and outdoor stalls, brimming with a dizzying array of fresh seafood, from fish and shellfish to squid and octopus. The market also features seafood restaurants where visitors can enjoy delicious seafood dishes prepared on the spot, as well as cooking demonstrations and cultural performances showcasing Busan's maritime heritage.", "");
        Attraction busanTower = new Attraction("Busan Tower", busan, "Perched atop Yongdusan Park, Busan Tower is a symbol of the city's skyline and offers panoramic views of Busan's harbor and downtown area. Visitors can take an elevator to the observation deck, where they can enjoy breathtaking vistas of the city and sea, as well as visit the tower's museum and souvenir shop. At night, the tower is illuminated, creating a romantic atmosphere for couples and a captivating sight for visitors.", "");
        Attraction gwangaliBeach = new Attraction("Gwangali Beach", busan, "A coastal gem nestled in the vibrant city of Busan, invites visitors to bask in its sun-kissed shores and captivating views. Stretching along the Gwangan Bridge, this sandy expanse offers a picturesque backdrop of shimmering waters and towering skyscrapers. Whether strolling along the palm-lined promenade, taking a dip in the refreshing sea, or indulging in fresh seafood delicacies at nearby cafes, Gwangalli Beach promises endless opportunities for relaxation and enjoyment. As day turns to night, the beach comes alive with vibrant lights and energetic nightlife, with bars and restaurants offering a lively atmosphere against the backdrop of the illuminated bridge. Gwangalli Beach embodies the essence of coastal charm and urban allure, making it a beloved destination for locals and tourists alike.", "");

        attractionRepository.save(haeundaeBeach);
        attractionRepository.save(gamcheonCultureVillage);
        attractionRepository.save(jagalchiFishMarket);
        attractionRepository.save(busanTower);
        attractionRepository.save(gwangaliBeach);

// Top Attractions for Incheon
        Attraction songdoCentralPark = new Attraction("Songdo Central Park", incheon, "As the centerpiece of Songdo International Business District, Songdo Central Park is a green oasis amidst the city's urban landscape. Visitors can stroll along the park's walking paths, admire its scenic waterfront views, and relax in lush greenery. The park features recreational facilities, including playgrounds, cycling trails, and water taxis, making it a popular destination for families, couples, and outdoor enthusiasts.", "");
        Attraction incheonChinatown = new Attraction("Incheon Chinatown", incheon, "Incheon Chinatown is the largest Chinatown in South Korea, offering a rich tapestry of Chinese culture, history, and cuisine. Visitors can explore its colorful streets lined with traditional Chinese buildings, temples, and shops selling souvenirs and street food. The area is known for its vibrant atmosphere, with lantern festivals, cultural performances, and culinary events celebrating Chinese heritage.", "");
        Attraction wolmidoIsland = new Attraction("Wolmido Island", incheon, "Wolmido Island is a popular leisure destination in Incheon, offering scenic views, outdoor activities, and entertainment options. Visitors can take a ferry to the island and explore its waterfront promenades, amusement parks, and seafood restaurants. Wolmido also features cultural attractions such as the Incheon Port Lighthouse and Wolmi Theme Park, as well as opportunities for hiking, biking, and enjoying sunset views over the Yellow Sea.", "");
        Attraction incheonGrandPark = new Attraction("Incheon Grand Park", incheon, "Incheon Grand Park is a sprawling urban park that offers a tranquil retreat from the city's hustle and bustle. Visitors can explore its lush green spaces, scenic walking trails, and botanical gardens, which showcase a diverse range of plant species. The park also features recreational facilities, including picnic areas, playgrounds, and a zoo, making it a popular destination for families, nature lovers, and outdoor enthusiasts.", "");
        Attraction incheonBridge = new Attraction("Incheon Bridge", incheon, "As one of the longest cable-stayed bridges in the world, Incheon Bridge is an iconic landmark that connects the mainland of Incheon to Yeongjong Island. Visitors can admire the bridge's sleek design and engineering marvels from various vantage points along the coast. The bridge is especially enchanting at night when it is illuminated by colorful lights, creating a stunning spectacle against the backdrop of the night sky.", "");

        attractionRepository.save(songdoCentralPark);
        attractionRepository.save(incheonChinatown);
        attractionRepository.save(wolmidoIsland);
        attractionRepository.save(incheonGrandPark);
        attractionRepository.save(incheonBridge);
    }
}
