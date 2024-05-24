package com.example.demo.components;

import com.example.demo.enums.Continent;
import com.example.demo.enums.Region;
import com.example.demo.models.Attraction;
import com.example.demo.models.City;
import com.example.demo.models.Country;
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
        Country france = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "https://s.abcnews.com/images/Travel/gty_eiffel_tower_kb_150612_16x9_992.jpg?w=1600", "France");
        Country spain = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "https://static.independent.co.uk/2023/02/20/12/iStock-1016528726.jpg?quality=75&width=1250&crop=3%3A2%2Csmart&auto=webp", "Spain");
        Country italy = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "https://static.independent.co.uk/2023/02/20/12/iStock-1016528726.jpg?quality=75&width=1250&crop=3%3A2%2Csmart&auto=webp", "Italy");
        Country germany = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "https://www.planetware.com/photos-large/D/germany-brandenburg-gate.jpg", "Germany");
        Country unitedKingdom = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "https://adm.dookinternational.com/dook/images/country/XYwKYrjh1656324286.jpg", "United Kingdom");
<<<<<<< HEAD
        Country turkey = new Country(Region.MEDITERRANEAN, Continent.EUROPE, "", "Turkey");
        Country austria = new Country(Region.CENTRAL_EUROPE, Continent.EUROPE, "", "Austria");
        Country greece = new Country(Region.MEDITERRANEAN, Continent.EUROPE, "", "Greece");
        Country russia = new Country(Region.EASTERN_EUROPE, Continent.EUROPE, "", "Russia");
        Country portugal = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "Portugal");
        Country switzerland = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "Switzerland");
        Country netherlands = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "Netherlands");
        Country belgium = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "", "Belgium");
        Country iceland = new Country(Region.SCANDINAVIA, Continent.EUROPE, "", "Iceland");
        Country finland = new Country(Region.SCANDINAVIA, Continent.EUROPE, "", "Finland");
=======

        Country turkey = new Country(Region.MIDDLE_EAST, Continent.EUROPE, "https://cdn.kimkim.com/files/a/images/7f60455b2302182e8f62b0a25c97dfb6ef4a8c38/big-3aa2ec570920b07c1521217f315e9adb.jpg", "Turkey");
        Country austria = new Country(Region.CENTRAL_EUROPE, Continent.EUROPE, "https://ychef.files.bbci.co.uk/1280x720/p08fq4z7.jpg", "Austria");
        Country greece = new Country(Region.MEDITERRANEAN, Continent.EUROPE, "https://www.moon.com/wp-content/uploads/2020/03/Santorini.png", "Greece");
        Country russia = new Country(Region.EASTERN_EUROPE, Continent.EUROPE, "https://mf.b37mrtl.ru/rbthmedia/images/2018.12/original/5c1565a585600a097840f3a7.jpg", "Russia");
        Country portugal = new Country(Region.MEDITERRANEAN, Continent.EUROPE, "https://ik.imgkit.net/3vlqs5axxjf/TAW/ik-seo/uploadedImages/All_Gateways/Europe/Features/madeiradestinationguidelbeach/madeiraislandportugalvisit.jpg?tr=w-1008%2Ch-567%2Cfo-auto", "Portugal");
        Country switzerland = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "https://cdn.britannica.com/65/162465-050-9CDA9BC9/Alps-Switzerland.jpg", "Switzerland");
        Country netherlands = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "https://www.telegraph.co.uk/content/dam/Travel/Spark/tui-2020/amsterdam-getty.jpg?imwidth=680", "Netherlands");
        Country belgium = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "https://www.nationsonline.org/gallery/Belgium/Royal-Palace-in-Brussels.jpg", "Belgium");
        Country iceland = new Country(Region.SCANDINAVIA, Continent.EUROPE, "https://cdn.britannica.com/06/171306-050-C88DD752/Aurora-borealis-peninsula-Snaefellsnes-Iceland-March-2013.jpg", "Iceland");
        Country finland = new Country(Region.SCANDINAVIA, Continent.EUROPE, "https://londonsouthendairport.com/wp-content/uploads/2023/08/magical-lapland.png", "Finland");
>>>>>>> 9465fa5e2676cc0abe67301cec57fc6dd6f88558
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

// Save cities in Italy
        cityRepository.save(rome);
        cityRepository.save(milan);
        cityRepository.save(naples);
// Top 5 cities in Portugal
        City lisbon = new City("Lisbon", portugal);
        City porto = new City("Porto", portugal);
        City azores = new City("Azores", portugal);
        City madeira = new City("Madeira", portugal);

// Save cities in Portugal
        cityRepository.save(lisbon);
        cityRepository.save(porto);
        cityRepository.save(azores);
        cityRepository.save(madeira);
// Top 5 cities in Spain
        City madrid = new City("Madrid", spain);
        City barcelona = new City("Barcelona", spain);
        City valencia = new City("Valencia", spain);
        City malaga = new City("Malaga", spain);

// Save cities in Spain
        cityRepository.save(madrid);
        cityRepository.save(barcelona);
        cityRepository.save(valencia);
        cityRepository.save(malaga);
// Top 5 cities in Germany
        City berlin = new City("Berlin", germany);
        City munich = new City("Munich", germany);
        City cologne = new City("Cologne", germany);

// Save cities in Germany
        cityRepository.save(berlin);
        cityRepository.save(munich);
        cityRepository.save(cologne);
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
        City cappadocia = new City("Cappadocia", turkey);
        City antalya = new City("Antalya", turkey);

// Save cities in Turkey
        cityRepository.save(istanbul);
        cityRepository.save(cappadocia);
        cityRepository.save(antalya);
// Top 5 cities in Austria
        City vienna = new City("Vienna", austria);
        City salzburg = new City("Salzburg", austria);
        City innsbruck = new City("Innsbruck", austria);

// Save cities in Austria
        cityRepository.save(vienna);
        cityRepository.save(salzburg);
        cityRepository.save(innsbruck);


// Top 5 cities in Switzerland
        City zurich = new City("Zurich", switzerland);
        City geneva = new City("Geneva", switzerland);
        City basel = new City("Basel", switzerland);


// Save cities for Switzerland
        cityRepository.save(zurich);
        cityRepository.save(geneva);
        cityRepository.save(basel);

// Top 5 destinations in Iceland
        City reykjavik = new City("Reykjavik", iceland);

// Save Icelandic destinations as cities
        cityRepository.save(reykjavik);

// Top 5 cities in Russia
        City moscow = new City("Moscow", russia);
        City saintPetersburg = new City("Saint Petersburg", russia);

        // Save cities in Russia

        cityRepository.save(moscow);
        cityRepository.save(saintPetersburg);

        // Top 5 cities in the Netherlands
        City amsterdam = new City("Amsterdam", netherlands);
        City rotterdam = new City("Rotterdam", netherlands);


// Save cities in the Netherlands
        cityRepository.save(amsterdam);
        cityRepository.save(rotterdam);
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
        City nonthaburi = new City("Nonthaburi", thailand);

// Top 5 cities in Malaysia
        City kualaLumpur = new City("Kuala Lumpar", malaysia);
        City georgeTown = new City("George Town", malaysia);
        City johorBahru = new City("Johor Bahru", malaysia);
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

        // Save Cities for Oman
        cityRepository.save(muscat);

        // Save Cities for Qatar
        cityRepository.save(doha);
        cityRepository.save(lusail);

        // Save Cities for South Korea
        cityRepository.save(seoul);
        cityRepository.save(daegu);
        cityRepository.save(incheon);
        cityRepository.save(daejeon);
        cityRepository.save(busan);

        // Save Cities for Thailand
        cityRepository.save(bangkok);
        cityRepository.save(phuket);
        cityRepository.save(pattaya);
        cityRepository.save(nonthaburi);
        cityRepository.save(chiangMai);

        // Save Cities for Malaysia
        cityRepository.save(kualaLumpur);
        cityRepository.save(georgeTown);
        cityRepository.save(johorBahru);
        cityRepository.save(ipoh);
        cityRepository.save(kuching);

// ATTRACTIONS
//Europe

        // Create Attraction objects for top 5 attractions in Paris with longer descriptions
        Attraction eiffelTower = new Attraction("Eiffel Tower", paris, "The Eiffel Tower, named after engineer Gustave Eiffel, is a global cultural icon of France and one of the most recognizable structures in the world. Standing at 324 meters (1,063 feet), it is the tallest structure in Paris and has welcomed millions of visitors since its completion in 1889. Visitors can ascend to its observation decks for breathtaking panoramic views of the city, dine at its restaurants, or learn about its history at the Eiffel Tower Museum located on the first floor.", "");
        Attraction louvreMuseum = new Attraction("Louvre Museum", paris, "The Louvre Museum, housed in the Louvre Palace, is the world's largest art museum and a historic monument in Paris. It is home to over 38,000 objects, including the Mona Lisa, Venus de Milo, and Winged Victory of Samothrace. Visitors can explore its vast collections spanning thousands of years of art and history, from ancient civilizations to the present day.", "");
        Attraction arabWorldInstitute = new Attraction("Arab World Institute", paris, "The Arab World Institute is a cultural institute dedicated to the Arab world. It showcases exhibits on Arab culture, art, history, and civilization. Visitors can explore Islamic art, calligraphy, and artifacts.", "");
        Attraction montmartre = new Attraction("Montmartre and Sacré-Cœur Basilica", paris, "Montmartre is a historic neighborhood in Paris known for its artistic heritage, charming streets, and vibrant atmosphere. Visitors can explore the winding streets of Montmartre, visit art studios and galleries, or enjoy street performances by local artists.", "");
        Attraction seineRiverCruise = new Attraction("Seine River Cruise", paris, "A Seine River cruise offers a leisurely way to explore Paris and its iconic landmarks from a different perspective. As you glide along the Seine, you'll pass by famous sights such as the Eiffel Tower, and Louvre Museum, all while enjoying commentary about the city's history and architecture. Whether during the day or illuminated at night, a Seine River cruise provides unforgettable views of Paris.", "");
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
        Attraction vieuxLyon = new Attraction("Vieux Lyon (Old Lyon)", lyon, "Vieux Lyon is the historic heart of Lyon, with well-preserved Renaissance buildings, narrow cobblestone streets, and traboules (hidden passageways). It is a UNESCO World Heritage Site and a bustling area filled with shops, restaurants, and museums. Visitors can explore its medieval architecture and savor traditional Lyonnaise cuisine.", "");
        Attraction museeDesBeauxArts = new Attraction("Musée des Beaux-Arts de Lyon (Museum of Fine Arts of Lyon)", lyon, "The Musée des Beaux-Arts de Lyon is one of France's largest and most important art museums, housed in a former Benedictine convent. It features a vast collection of paintings, sculptures, and decorative arts spanning from antiquity to the present day. Visitors can admire works by masters such as Rembrandt, Monet, and Picasso, as well as explore temporary exhibitions and educational programs.", "");
        Attraction parcDeLaTeteDor = new Attraction("Parc de la Tête d'Or (Park of the Golden Head)", lyon, "Parc de la Tête d'Or is a sprawling urban park in Lyon, known for its lush greenery, botanical gardens, and scenic lake. It offers a tranquil escape from the city's hustle and bustle, with walking paths, playgrounds, and recreational activities. Visitors can relax amid nature, enjoy picnics, or explore attractions such as the zoo and rose garden.", "");
        Attraction croixRousse = new Attraction("La Croix-Rousse", lyon, "La Croix-Rousse is a historic neighborhood in Lyon known for its silk industry and working-class heritage. It is characterized by its steep streets, red-brick buildings, and lively atmosphere. Visitors can explore its markets, art galleries, and workshops, and learn about its rich cultural history. The neighborhood also offers panoramic views of Lyon from its terraces.", "");

// Save attractions in the database
        attractionRepository.save(vieuxLyon);
        attractionRepository.save(museeDesBeauxArts);
        attractionRepository.save(parcDeLaTeteDor);
        attractionRepository.save(croixRousse);
// Create Attraction objects for top 5 attractions in Toulouse
        Attraction capitole = new Attraction("Capitole de Toulouse (Capitolium of Toulouse)", toulouse, "The Capitole de Toulouse is the city hall of Toulouse and a symbol of its civic pride. Located on the Place du Capitole, it is an impressive neoclassical building with a pink-marble facade, columned portico, and grand staircase. Visitors can explore its interior adorned with paintings and ornate decorations, and stroll through the square's bustling markets and cafes.", "");
        Attraction citeDeLEspace = new Attraction("Cité de l'Espace (City of Space)", toulouse, "The Cité de l'Espace is a space-themed amusement park and museum in Toulouse, dedicated to space exploration and astronomy. It features interactive exhibits, educational displays, and full-scale replicas of spacecraft and satellites. Visitors can experience simulated space missions, explore the cosmos in the planetarium, and learn about the history and future of space travel.", "");
        Attraction jardinDesPlantes = new Attraction("Jardin des Plantes (Garden of Plants)", toulouse, "The Jardin des Plantes is a botanical garden and park in Toulouse, known for its diverse plant collections, scenic landscapes, and historic buildings. It offers a peaceful retreat in the heart of the city, with walking paths, ponds, and greenhouses. Visitors can admire exotic plants, enjoy picnics, or attend events and exhibitions throughout the year.", "");
        Attraction pontNeuf = new Attraction("Pont Neuf", toulouse, "Pont Neuf is the oldest bridge in Toulouse and a historic landmark spanning the Garonne River. Built in the 16th and 17th centuries, it features elegant arches, stone balustrades, and ornate sculptures. Visitors can stroll across the bridge, admire views of the river and city skyline, or relax on its shady benches.", "");

// Save attractions in the database
        attractionRepository.save(capitole);
        attractionRepository.save(citeDeLEspace);
        attractionRepository.save(jardinDesPlantes);
        attractionRepository.save(pontNeuf);
//        Attractions for Nice

        Attraction verdonGorge = new Attraction("Verdon Gorge", nice, "Verdon Gorge, also known as the Grand Canyon of Verdon, is a breathtaking natural wonder located in southeastern France. Carved by the Verdon River, the gorge boasts stunning turquoise waters, towering limestone cliffs, and dramatic landscapes. Visitors can explore the gorge by hiking along its scenic trails, kayaking or canoeing in its emerald waters, or simply admiring its beauty from viewpoints such as Point Sublime and Route des Crêtes.", "");
        Attraction ezeVillage = new Attraction("Eze Village", nice, "Eze Village is a charming medieval hilltop village located near Nice, France. Perched high above the Mediterranean Sea, it offers stunning panoramic views of the French Riviera coastline. Visitors can wander through narrow cobblestone streets, explore ancient stone buildings, and discover artisan shops, art galleries, and cafes nestled within the village walls.", "");
        Attraction antibesOldTown = new Attraction("Antibes Old Town", nice, "Antibes Old Town, also known as Vieil Antibes, is a historic district located along the French Riviera, between Cannes and Nice. Enclosed by ancient ramparts, it is characterized by narrow cobblestone streets, colorful buildings, and bustling markets. Visitors can explore its medieval architecture, visit landmarks such as the 16th-century Fort Carré and Picasso Museum, and stroll along the charming waterfront promenade.", "");
        Attraction islamicCulturalCenter = new Attraction("Islamic Cultural Center of Nice (Centre Culturel Islamique de Nice)", null, "The Islamic Cultural Center of Nice, also known as Centre Culturel Islamique de Nice, is a cultural and educational institution serving the Muslim community in Nice. It offers religious services, Islamic education programs, and cultural events aimed at promoting interfaith dialogue and understanding.", "");
        Attraction openSkyNice = new Attraction("Open Sky Area in Nice", nice, "The Open Sky Area in Nice is a unique public space located along the Promenade des Anglais, offering stunning views of the Mediterranean Sea and the city's iconic coastline. This expansive open-air area provides a picturesque setting for leisurely strolls, picnics, and outdoor activities. Visitors can relax on sun-drenched benches, soak in the sea breeze, and admire the vibrant colors of the sky as the sun sets over the horizon. The Open Sky Area in Nice is a popular gathering spot for locals and tourists alike, providing a perfect blend of natural beauty and urban charm.", "");

// Save attraction in the database
        attractionRepository.save(openSkyNice);
        attractionRepository.save(ezeVillage);
        attractionRepository.save(verdonGorge);
        attractionRepository.save(antibesOldTown);
        attractionRepository.save(islamicCulturalCenter);

//        Attractions for Rome
        Attraction colosseum = new Attraction("Colosseum (Colosseo)", rome, "The Colosseum, also known as the Flavian Amphitheatre, is an ancient Roman landmark located in the heart of Rome. Built in the 1st century AD, it is the largest amphitheater ever built and is considered one of the greatest works of Roman architecture. Visitors can explore its ruins, learn about its history as a venue for gladiatorial contests and public spectacles, and admire its iconic architecture.", "");
        Attraction piazzaVittorioEmanuele = new Attraction("Piazza Vittorio Emanuele II", rome, "Piazza Vittorio Emanuele II is a lively square located in the Esquilino district of Rome. It is home to a diverse community, including a significant Muslim population. Visitors can explore the multicultural atmosphere of the square, visit halal shops and eateries, and experience the vibrant street life of this cosmopolitan neighborhood.", "");
// Save attraction in the database
        attractionRepository.save(piazzaVittorioEmanuele);
        attractionRepository.save(colosseum);

//        Attractions for Milan
        Attraction parcoDelleCave = new Attraction("Parco delle Cave", milan, "Parco delle Cave is a public park located in the southern outskirts of Milan. It offers a peaceful retreat from the city center and features walking trails, picnic areas, and scenic views of the surrounding nature. Muslim visitors can enjoy leisurely walks, outdoor activities, and serene moments of reflection in this natural setting.", "");
        Attraction sanSiroStadium = new Attraction("San Siro Stadium (Stadio Giuseppe Meazza)", milan, "San Siro Stadium, officially known as Stadio Giuseppe Meazza, is a world-renowned football stadium located in Milan. It is home to two of Italy's most successful football clubs, AC Milan and Inter Milan. The stadium has a rich history and has hosted numerous international football matches, including UEFA Champions League finals and FIFA World Cup games. Visitors can take guided tours of the stadium, explore its facilities, and learn about the illustrious footballing legacy of San Siro.", "");
        Attraction sforzaCastle = new Attraction("Sforza Castle (Castello Sforzesco)", milan, "Sforza Castle, also known as Castello Sforzesco, is a historic fortress located in the center of Milan. It was built in the 15th century by the Duke of Milan and later served as a residence for various rulers. Today, it houses several museums and art collections, including the Museum of Ancient Art, the Museum of Musical Instruments, and the Egyptian Museum.", "");
        Attraction galleriaVittorioEmanuele = new Attraction("Galleria Vittorio Emanuele II", milan, "Galleria Vittorio Emanuele II is a historic shopping arcade and one of the oldest shopping malls in the world. Located next to the Milan Cathedral, it is renowned for its stunning architecture, including glass-vaulted ceilings and ornate decorations. Visitors can shop at luxury boutiques, dine at elegant cafes, and admire the grandeur of the arcade.", "");
        Attraction dolomiteMountains = new Attraction("Dolomite Mountains (Dolomiti)", milan, "The Dolomite Mountains, or Dolomiti in Italian, are a UNESCO World Heritage site and one of the most stunning natural landscapes in Italy. Located in the northeastern part of the country, the Dolomites are known for their dramatic peaks, rugged cliffs, and picturesque valleys. Visitors can enjoy a range of outdoor activities, including hiking, skiing, rock climbing, and mountain biking. The Dolomites offer breathtaking views and unforgettable experiences for nature lovers and outdoor enthusiasts.", "");
        Attraction lakeComo = new Attraction("Lake Como (Lago di Como)", milan, "Lake Como, or Lago di Como in Italian, is a breathtaking lake located in the Lombardy region of northern Italy. Surrounded by majestic mountains and verdant hillsides, Lake Como is famous for its stunning scenery, elegant villas, and charming lakeside towns. Visitors can take boat cruises across the lake, explore picturesque villages like Bellagio, Varenna, and Menaggio, and enjoy leisurely walks along the scenic waterfront promenades. With its natural beauty and serene atmosphere, Lake Como is a must-visit destination for travelers seeking relaxation and romance.", "");

// Save attraction in the database
        attractionRepository.save(lakeComo);
        attractionRepository.save(dolomiteMountains);
        attractionRepository.save(galleriaVittorioEmanuele);
        attractionRepository.save(sforzaCastle);
        attractionRepository.save(sanSiroStadium);
        attractionRepository.save(parcoDelleCave);

//Naples

        Attraction mountVesuvius = new Attraction("Mount Vesuvius (Monte Vesuvio)", naples, "Mount Vesuvius is one of the most famous volcanoes in the world, known for its eruption in 79 AD that buried the ancient cities of Pompeii and Herculaneum. Today, it is a popular tourist destination, offering hiking trails to the crater rim and breathtaking views of the Bay of Naples. Visitors can learn about the volcano's geology, history, and impact on the surrounding landscape.", "");
        Attraction pompeiiArchaeologicalPark = new Attraction("Pompeii Archaeological Park (Parco Archeologico di Pompei)", naples, "The Pompeii Archaeological Park is a UNESCO World Heritage site that preserves the ancient Roman city of Pompeii, which was buried under volcanic ash during the eruption of Mount Vesuvius in 79 AD. Visitors can explore the remarkably well-preserved ruins of Pompeii, including streets, houses, and public buildings, and learn about daily life in ancient Rome.", "");
        Attraction capriIsland = new Attraction("Capri Island (Isola di Capri)", naples, "Capri is a picturesque island located in the Bay of Naples, known for its stunning natural beauty, rugged coastline, and luxury resorts. Visitors can explore the charming town of Capri, take boat tours to iconic landmarks such as the Blue Grotto and the Faraglioni rock formations, and enjoy leisurely walks along scenic hiking trails. Capri offers a perfect blend of relaxation and adventure in a breathtaking Mediterranean setting.", "");
        Attraction amalfiCoast = new Attraction("Amalfi Coast (Costiera Amalfitana)", naples, "The Amalfi Coast is a stunning stretch of coastline in southern Italy, known for its dramatic cliffs, colorful fishing villages, and picturesque towns. Visitors can drive along the scenic coastal road, stopping in charming villages such as Positano, Amalfi, and Ravello, each offering breathtaking views of the Mediterranean Sea. The Amalfi Coast is also famous for its delicious cuisine, lemon groves, and historic landmarks, making it a must-visit destination for travelers seeking natural beauty and cultural experiences.", "");
        Attraction positano = new Attraction("Positano", naples, "Positano is a charming coastal town located on the Amalfi Coast in southern Italy. Known for its colorful cliffside houses, narrow streets, and stunning views of the Tyrrhenian Sea, Positano is a popular destination for travelers seeking romance and relaxation. Visitors can explore its picturesque beaches, shop for local ceramics and fashion, and dine at seaside restaurants serving fresh seafood and regional specialties. With its unique beauty and laid-back atmosphere, Positano offers a memorable experience for visitors exploring the Amalfi Coast.", "");

// Save attraction in the database
        attractionRepository.save(positano);
        attractionRepository.save(amalfiCoast);
        attractionRepository.save(capriIsland);
        attractionRepository.save(mountVesuvius);
        attractionRepository.save(pompeiiArchaeologicalPark);

// Attractions for Lisbon
        // Create Attraction object for Belém Tower
        Attraction belemTower = new Attraction("Belém Tower (Torre de Belém)", lisbon, "The Belém Tower, or Torre de Belém in Portuguese, is an iconic fortress located on the banks of the Tagus River in Lisbon. Built in the 16th century during the Age of Discovery, it served as a defensive structure and ceremonial gateway to the city. Today, it is a UNESCO World Heritage site and one of Lisbon's most recognizable landmarks. Visitors can explore its impressive architecture, climb to the top for panoramic views of the river and city, and learn about Portugal's maritime history.", "");
        Attraction sintra = new Attraction("Sintra", lisbon, "Sintra is a charming town located just outside of Lisbon, nestled amidst the lush hills of the Serra de Sintra. It is renowned for its fairy-tale palaces, enchanting gardens, and romantic atmosphere. Visitors can explore iconic landmarks such as the colorful Pena Palace, the mysterious Quinta da Regaleira, and the historic Moorish Castle. Sintra's magical ambiance and architectural wonders make it a popular day trip destination from Lisbon.", "");
        Attraction cascais = new Attraction("Cascais", lisbon, "Cascais is a charming coastal town located just west of Lisbon, Portugal. Once a sleepy fishing village, it has transformed into a popular resort destination known for its beautiful beaches, historic architecture, and vibrant atmosphere. Visitors can stroll along the scenic waterfront promenade, relax on sandy beaches like Praia da Rainha and Praia do Guincho, and explore attractions such as the Cascais Citadel and the Museum of the Sea. Cascais offers a perfect blend of relaxation and culture, making it a delightful day trip from Lisbon.", "");
        Attraction oceanarioDeLisboa = new Attraction("Oceanário de Lisboa", lisbon, "Oceanário de Lisboa is the largest indoor aquarium in Europe and one of the most popular attractions in Lisbon, Portugal. Located in the Parque das Nações district, it showcases a diverse range of marine life from various ecosystems around the world. Visitors can explore different themed exhibits, including the Atlantic Ocean tank, the Indian Ocean tank, and the Pacific Ocean tank, home to a wide variety of fish, sharks, rays, and other aquatic species. Oceanário de Lisboa offers a fascinating and educational experience for visitors of all ages, making it a must-visit destination in Lisbon.", "");
        Attraction pracaDoComercio = new Attraction("Praça do Comércio (Terreiro do Paço)", lisbon, "Praça do Comércio, also known as Terreiro do Paço, is one of the most iconic squares in Lisbon, Portugal. Situated along the Tagus River in the historic Baixa district, it is characterized by its grand arcades, colorful buildings, and monumental equestrian statue of King José I. Praça do Comércio has served as the commercial and political center of Lisbon for centuries and is surrounded by important landmarks such as the Rua Augusta Arch and the Lisbon City Hall. Visitors can enjoy leisurely walks, outdoor dining, and stunning views of the river and surrounding area from the square.", "");
        Attraction miradouroSenhoraDoMonte = new Attraction("Miradouro da Senhora do Monte", lisbon, "Miradouro da Senhora do Monte is one of the highest viewpoints in Lisbon, offering panoramic views of the city and the Tagus River. Located in the Graça neighborhood, it is named after the Chapel of Our Lady of the Mount (Capela de Nossa Senhora do Monte), which sits adjacent to the viewpoint. Visitors can enjoy breathtaking vistas of Lisbon's historic center, including landmarks such as the São Jorge Castle, the Alfama district, and the Ponte 25 de Abril bridge. Miradouro da Senhora do Monte is a popular spot for sunset viewing and photography, providing a peaceful retreat from the bustling streets below.", "");

// Save attraction in the database
        attractionRepository.save(miradouroSenhoraDoMonte);
        attractionRepository.save(pracaDoComercio);
        attractionRepository.save(oceanarioDeLisboa);
        attractionRepository.save(cascais);
        attractionRepository.save(sintra);
        attractionRepository.save(belemTower);

// Attractions in Azores

        Attraction seteCidades = new Attraction("Sete Cidades", azores, "Sete Cidades is a breathtaking volcanic crater located on the island of São Miguel in the Azores archipelago. Known for its stunning twin lakes, one blue and one green, Sete Cidades offers mesmerizing views of the surrounding landscape. Visitors can hike along the crater rim, explore scenic viewpoints, and enjoy outdoor activities such as kayaking and paddleboarding on the lakes. Sete Cidades is a natural wonder and a must-visit destination for travelers exploring São Miguel.", "");
        Attraction lagoaDoFogo = new Attraction("Lagoa do Fogo", azores, "Lagoa do Fogo, or Lake of Fire, is a stunning crater lake situated in the center of São Miguel island in the Azores. Surrounded by lush vegetation and volcanic landscapes, the lake is known for its crystal-clear waters and scenic beauty. Visitors can hike along the trails surrounding the lake, swim in its pristine waters, and marvel at the panoramic views from the viewpoints along the way. Lagoa do Fogo is a natural paradise and a must-visit destination for nature lovers and outdoor enthusiasts.", "");
        Attraction furnas = new Attraction("Furnas", azores, "Furnas is a picturesque town located on the island of São Miguel in the Azores archipelago. Famous for its geothermal hot springs, lush botanical gardens, and volcanic landscapes, Furnas is a popular destination for relaxation and rejuvenation. Visitors can soak in the warm mineral-rich waters of the hot springs, explore the scenic Terra Nostra Botanical Garden, and witness the geothermal activity at the fumaroles and geysers scattered throughout the town. Furnas offers a unique blend of natural beauty and wellness experiences.", "");
        Attraction caldeiraVelha = new Attraction("Caldeira Velha", azores, "Caldeira Velha is a natural thermal park located on the island of São Miguel in the Azores archipelago. Nestled amidst lush rainforest vegetation, the park features hot springs, cascading waterfalls, and natural pools filled with warm mineral-rich waters. Visitors can relax in the therapeutic waters, take a dip in the refreshing waterfall pools, and enjoy the tranquil ambiance of the surrounding forest. Caldeira Velha is a hidden gem and a perfect retreat for relaxation and immersion in nature.", "");
        Attraction picoMountain = new Attraction("Pico Mountain (Montanha do Pico)", azores, "Pico Mountain, or Montanha do Pico in Portuguese, is the highest peak in Portugal and a UNESCO World Heritage site located on the island of Pico in the Azores archipelago. Rising 2,351 meters above sea level, the mountain offers breathtaking panoramic views of the surrounding islands and the Atlantic Ocean. Visitors can hike to the summit, traverse rugged volcanic landscapes, and explore the unique flora and fauna of the mountain's slopes. Pico Mountain is a paradise for hikers and adventurers seeking epic outdoor experiences.", "");
        Attraction algarDoCarvao = new Attraction("Algar do Carvão", azores, "Algar do Carvão is a fascinating volcanic cave located on the island of Terceira in the Azores archipelago. Formed by ancient volcanic activity, the cave features stunning geological formations, including stalactites, stalagmites, and lava tubes. Visitors can descend into the depths of the cave and explore its otherworldly interior, marveling at the natural beauty and unique rock formations. Algar do Carvão is a geological marvel and a must-visit destination for travelers seeking adventure and exploration in the Azores.", "");

// Save attraction in the database
        attractionRepository.save(algarDoCarvao);
        attractionRepository.save(picoMountain);
        attractionRepository.save(furnas);
        attractionRepository.save(caldeiraVelha);
        attractionRepository.save(lagoaDoFogo);
        attractionRepository.save(seteCidades);

//        Attractions in Madeira

        Attraction picoDoArieiro = new Attraction("Pico do Arieiro", madeira, "Pico do Arieiro is the third-highest peak on the island of Madeira, offering stunning panoramic views of the surrounding mountains and coastline. Visitors can reach the summit by car or hiking along well-marked trails, enjoying breathtaking vistas along the way. At the top, there is a viewing platform where travelers can admire the rugged landscape and take in the beauty of the island's rugged terrain. Pico do Arieiro is a popular destination for outdoor enthusiasts and photographers seeking spectacular vistas in Madeira.", "");
        Attraction levadaWalks = new Attraction("Levada Walks", madeira, "Madeira is famous for its levadas, irrigation channels that crisscross the island and provide access to some of its most scenic spots. Levada walks offer a unique way to explore Madeira's diverse landscapes, from lush forests to rugged coastlines. Visitors can choose from a variety of trails, ranging from easy strolls to challenging hikes, and discover hidden waterfalls, pristine valleys, and panoramic viewpoints along the way. Levada walks are a must-do activity for nature lovers and outdoor enthusiasts visiting Madeira.", "");
        Attraction caboGirao = new Attraction("Cabo Girão", madeira, "Cabo Girão is a spectacular sea cliff located on the southern coast of Madeira, offering breathtaking views of the Atlantic Ocean and the surrounding coastline. Rising 580 meters above sea level, it is one of the highest sea cliffs in Europe. Visitors can walk along a glass-floored viewing platform suspended over the edge of the cliff, providing a thrilling experience and panoramic vistas of the ocean below. Cabo Girão is a popular destination for sightseeing and photography, offering unforgettable views of Madeira's dramatic landscape.", "");
        Attraction montePalaceGarden = new Attraction("Monte Palace Tropical Garden (Jardim Tropical Monte Palace)", madeira, "Monte Palace Tropical Garden is a botanical garden located in the hills above Funchal, Madeira's capital city. Spread over 70,000 square meters, it features a diverse collection of exotic plants, tranquil ponds, and striking sculptures from around the world. Visitors can explore themed gardens inspired by different cultures, including Japanese, African, and Madeiran, and enjoy panoramic views of Funchal and the surrounding landscape. Monte Palace Tropical Garden is a serene oasis of beauty and tranquility in Madeira.", "");
        Attraction kayakPortoSanto = new Attraction("Kayaking in Porto Santo", madeira, "Kayaking in Porto Santo offers a unique way to explore the stunning coastline and crystal-clear waters of this beautiful island. Visitors can rent kayaks from local outfitters and embark on guided tours or self-guided excursions to discover hidden coves, sea caves, and secluded beaches along the island's shoreline. With its calm seas and gentle currents, Porto Santo provides ideal conditions for kayaking adventures for both beginners and experienced paddlers. Whether paddling solo or with a group, kayaking in Porto Santo promises unforgettable experiences and breathtaking views of the island's natural beauty.", "");
        Attraction scubaDivingFunchal = new Attraction("Scuba Diving in Funchal", madeira, "Scuba diving in Funchal offers an exhilarating opportunity to explore the vibrant underwater world of Madeira's coastline. With its clear waters, abundant marine life, and fascinating rock formations, Funchal is a prime destination for divers of all levels. Visitors can dive along colorful reefs, underwater caves, and shipwrecks, encountering a diverse array of marine species such as colorful fish, octopuses, and moray eels. Guided dives and certification courses are available for beginners, while experienced divers can enjoy deeper dives and more challenging sites. Scuba diving in Funchal promises unforgettable underwater adventures and opportunities for discovery.", "");

// Save attraction in the database
        attractionRepository.save(scubaDivingFunchal);
        attractionRepository.save(montePalaceGarden);
        attractionRepository.save(caboGirao);
        attractionRepository.save(levadaWalks);
        attractionRepository.save(picoDoArieiro);
        attractionRepository.save(kayakPortoSanto);

//        Attractions for Madrid
        Attraction pradoMuseum = new Attraction("Prado Museum (Museo del Prado)", madrid, "The Prado Museum, or Museo del Prado in Spanish, is one of the most important art museums in the world, located in Madrid, Spain. It houses an extensive collection of European art from the 12th to the early 20th century, including works by renowned artists such as Velázquez, Goya, and El Greco. Visitors can admire masterpieces like Velázquez's 'Las Meninas' and Goya's 'The Third of May 1808,' as well as works by other Spanish and European artists. The Prado Museum is a cultural treasure trove and a must-visit destination for art lovers and history enthusiasts.", "");
        Attraction retiroPark = new Attraction("Retiro Park (Parque del Retiro)", madrid, "Retiro Park, or Parque del Retiro in Spanish, is a sprawling green oasis located in the heart of Madrid. Covering 125 hectares, it is one of the city's largest and most popular parks, offering lush gardens, scenic pathways, and recreational areas. Visitors can stroll along tree-lined avenues, rent rowboats on the park's central lake, and relax amidst the park's iconic landmarks, including the Crystal Palace and the Fountain of the Fallen Angel. Retiro Park is a beloved gathering place for locals and tourists alike, providing a tranquil escape from the hustle and bustle of the city.", "");
        Attraction royalPalaceMadrid = new Attraction("Royal Palace of Madrid (Palacio Real de Madrid)", madrid, "The Royal Palace of Madrid, or Palacio Real de Madrid in Spanish, is the official residence of the Spanish royal family, located in the heart of Madrid. With its grand architecture, opulent interiors, and extensive art collection, it is one of the most impressive palaces in Europe. Visitors can tour the palace's lavishly decorated rooms, including the Throne Room, the Hall of Mirrors, and the Royal Armoury, and admire artworks by renowned artists such as Velázquez, Goya, and Caravaggio. The Royal Palace of Madrid is a symbol of Spain's rich cultural heritage and a must-visit attraction for history buffs and architecture enthusiasts.", "");
        Attraction bernabeuStadium = new Attraction("Santiago Bernabéu Stadium", madrid, "The Santiago Bernabéu Stadium is one of the most iconic football stadiums in the world, located in Madrid, Spain. Home to the renowned football club Real Madrid, the stadium has a rich history and has hosted numerous memorable matches and events. Visitors can take guided tours of the stadium, exploring its impressive facilities, including the player locker rooms, trophy room, and presidential box. They can also walk through the tunnel onto the pitch, experiencing the stadium from the perspective of the players. The Santiago Bernabéu Stadium is a must-visit destination for football fans, offering an immersive experience into the world of one of the most prestigious football clubs in history.", "");
        Attraction segoviaHotAirBalloon = new Attraction("Hot Air Balloon Rides in Segovia", madrid, "Hot air balloon rides in Segovia offer a breathtaking way to experience the beauty of this historic Spanish city and its surroundings from a unique perspective. Visitors can soar high above Segovia's iconic landmarks, including the majestic Alcázar fortress and the ancient Roman aqueduct, while enjoying panoramic views of the picturesque countryside and distant mountains. Guided by experienced pilots, hot air balloon flights provide a serene and exhilarating adventure, allowing passengers to float effortlessly through the sky and witness the changing landscapes below. Whether at sunrise or sunset, hot air balloon rides in Segovia promise unforgettable moments and unparalleled vistas of this enchanting region.", "");

// Save attraction in the database
        attractionRepository.save(segoviaHotAirBalloon);
        attractionRepository.save(bernabeuStadium);
        attractionRepository.save(royalPalaceMadrid);
        attractionRepository.save(retiroPark);
        attractionRepository.save(pradoMuseum);

//        Attractions for Barca
        // Create Attraction object for Coastal Path (Camí de Ronda)
        Attraction coastalPath = new Attraction("Coastal Path (Camí de Ronda)", barcelona, "The Coastal Path, or Camí de Ronda, is a scenic hiking trail that stretches along the rugged coastline of Costa Brava, Catalonia. Offering breathtaking views of the Mediterranean Sea, hidden coves, and picturesque fishing villages, the Coastal Path is a paradise for nature lovers and outdoor enthusiasts. Visitors can explore the trail on foot or by bike, winding their way through pine forests, rocky cliffs, and sandy beaches. Along the way, they can discover secluded coves for swimming, enjoy fresh seafood at beachside restaurants, and immerse themselves in the natural beauty of the Mediterranean coast. The Coastal Path is a tranquil escape from the hustle and bustle of city life, providing a rejuvenating experience amidst stunning coastal landscapes.", "");
        Attraction casaBatllo = new Attraction("Casa Batlló", barcelona, "Casa Batlló is a renowned Modernist building located in the heart of Barcelona's Eixample district. Designed by the architect Antoni Gaudí, the building is known for its striking facade, organic shapes, and colorful mosaic tiles. Visitors can take guided tours of the building, exploring its unique interiors, including the Noble Floor, the Loft, and the Roof Terrace, which offers panoramic views of the city. Casa Batlló is a masterpiece of Catalan Modernism and a testament to Gaudí's innovative architectural vision.", "");
        Attraction montserratMonastery = new Attraction("Montserrat Monastery", barcelona, "The Montserrat Monastery is a Benedictine abbey located in the Montserrat mountain range near Barcelona, Catalonia. Perched atop a rocky cliff at an altitude of over 700 meters, the monastery is renowned for its stunning natural setting, religious significance, and cultural heritage. Visitors can take a scenic cable car or rack railway to reach the monastery, where they can explore its historic buildings, including the basilica, chapels, and museums. The monastery is also home to the famous statue of the Black Madonna, a revered religious icon believed to have miraculous powers. Surrounding the monastery, the Montserrat mountain range offers opportunities for hiking, rock climbing, and enjoying panoramic views of the Catalan countryside. Montserrat Monastery is a spiritual sanctuary and a symbol of Catalonia's religious and cultural identity.", "");
        Attraction parkGuell = new Attraction("Park Güell", barcelona, "Park Güell is a public park located on Carmel Hill in Barcelona, Catalonia. Designed by the renowned architect Antoni Gaudí, the park was originally conceived as a residential housing development but was later transformed into a municipal garden. Park Güell is famous for its colorful mosaic sculptures, whimsical architecture, and stunning panoramic views of the city. Visitors can explore the park's winding pathways, admire the vibrant mosaic designs of the iconic lizard statue and the serpentine bench, and enjoy the tranquility of the surrounding nature. Park Güell is a UNESCO World Heritage Site and one of Barcelona's most popular attractions, attracting millions of visitors each year with its unique blend of art, architecture, and natural beauty.", "");
// Save attraction in the database
        attractionRepository.save(parkGuell);
        attractionRepository.save(montserratMonastery);
        attractionRepository.save(casaBatllo);
        attractionRepository.save(coastalPath);
// Attraction for Malaga

        Attraction caminitoDelRey = new Attraction("Caminito del Rey", malaga, "Caminito del Rey, also known as the King's Little Pathway, is a famous hiking trail located in the province of Malaga, Andalusia. This breathtaking path runs along the steep walls of a narrow gorge carved by the Guadalhorce River, offering stunning views of the surrounding landscape. Originally constructed in the early 20th century as a service route for hydroelectric power plants, Caminito del Rey has since been restored and reopened as a thrilling adventure for hikers and nature enthusiasts. Visitors can traverse the narrow walkways and suspension bridges suspended high above the river, experiencing the thrill of walking through rugged terrain while admiring the natural beauty of the gorge below. Caminito del Rey is a must-visit destination for anyone seeking an unforgettable outdoor adventure in Andalusia.", "");
        Attraction nerja = new Attraction("Nerja", malaga, "Nerja is a charming coastal town located in the province of Malaga, Andalusia. Famous for its picturesque beaches, crystal-clear waters, and scenic cliffs, Nerja is a popular destination for beach lovers and outdoor enthusiasts. Visitors can relax on the sandy shores of beaches such as Playa Burriana and Playa de la Calahonda, or explore the stunning sea caves of Nerja, including the famous Cuevas de Nerja. The town's historic center is dotted with whitewashed buildings, narrow streets, and quaint squares, offering a glimpse into traditional Andalusian life. Nerja also boasts a vibrant culinary scene, with numerous restaurants serving fresh seafood and traditional Spanish dishes. Whether it's soaking up the sun on the beach, exploring the town's cultural attractions, or enjoying outdoor activities such as hiking and diving, Nerja has something for everyone to enjoy.", "");
        Attraction alhambraGranada = new Attraction("Alhambra, Granada", malaga, "The Alhambra is a magnificent palace and fortress complex located in Granada, Andalusia. Built during the Moorish rule of Al-Andalus, the Alhambra is renowned for its stunning Islamic architecture, intricate tilework, and lush gardens. Visitors can explore the Nasrid Palaces, the Generalife Gardens, and the Alcazaba fortress, marveling at the beauty and craftsmanship of the Moorish art and design. The Alhambra is a UNESCO World Heritage Site and one of Spain's most iconic cultural landmarks, attracting millions of visitors from around the world each year.", "");
        Attraction alcazabaMalaga = new Attraction("Alcazaba of Malaga", malaga, "The Alcazaba of Malaga is a historic Moorish fortress located in the heart of Malaga, Spain. Built in the 11th century during the Moorish rule of Al-Andalus, the Alcazaba is renowned for its impressive architecture, picturesque gardens, and commanding views of the city and the Mediterranean Sea. Visitors can explore the fortress's well-preserved ramparts, towers, and courtyards, as well as its archaeological museum, which showcases artifacts from the Islamic period. The Alcazaba of Malaga is a cultural landmark that offers insight into the region's rich history and architectural heritage.", "");
        Attraction alcazabaAlmeria = new Attraction("Alcazaba of Almería", malaga, "The Alcazaba of Almería is a fortified complex located in the city of Almería, Andalusia. Built in the 10th century by the Moorish rulers of Al-Andalus, the Alcazaba is one of the largest and best-preserved Muslim fortresses in Spain. Visitors can explore the fortress's imposing walls, towers, and courtyards, as well as its archaeological museum, which showcases artifacts from the Islamic period. The Alcazaba of Almería offers panoramic views of the city and the Mediterranean Sea, making it a popular destination for history buffs and photography enthusiasts alike.", "");
// Save attraction in the database
        attractionRepository.save(alcazabaAlmeria);
        attractionRepository.save(alcazabaMalaga);
        attractionRepository.save(alhambraGranada);
        attractionRepository.save(nerja);
        attractionRepository.save(caminitoDelRey);


//        Attractions in Berlin
        // Create Attraction object for Brandenburg Gate
        Attraction brandenburgGate = new Attraction("Brandenburg Gate", berlin, "The Brandenburg Gate is an iconic neoclassical monument located in the heart of Berlin, Germany. Built in the late 18th century, the gate has come to symbolize both the division and reunification of Germany. With its impressive columns, grand Doric architecture, and Quadriga sculpture atop, the Brandenburg Gate is a must-visit landmark and a symbol of peace and unity. Visitors can stroll through Pariser Platz, admire the gate from various angles, and learn about its rich history at the nearby information center. The Brandenburg Gate is also a popular venue for cultural events and celebrations throughout the year.", "");
        Attraction museumIsland = new Attraction("Museum Island", berlin, "Museum Island is a UNESCO World Heritage Site located on the northern half of the Spree Island in Berlin. It is home to a complex of five world-renowned museums, including the Altes Museum, the Neues Museum, the Alte Nationalgalerie, the Bode Museum, and the Pergamon Museum. Each museum offers a unique collection of art, artifacts, and historical treasures spanning thousands of years of human history and culture. Visitors can explore ancient Egyptian artifacts, Greek and Roman sculptures, Islamic art, European paintings, and much more. Museum Island is a cultural treasure trove that attracts art lovers, history enthusiasts, and scholars from around the world.", "");
        Attraction reichstagBuilding = new Attraction("Reichstag Building", berlin, "The Reichstag Building is the seat of the German Bundestag (parliament) and one of Berlin's most iconic landmarks. With its distinctive glass dome and neoclassical facade, the Reichstag is a symbol of democracy and national identity. Visitors can take guided tours of the building, learn about its history and architecture, and climb to the top of the dome for panoramic views of the city. The Reichstag also features exhibitions on German history, politics, and democracy, making it a fascinating destination for visitors interested in government and governance.", "");

        // Save attraction in the database
        attractionRepository.save(museumIsland);
        attractionRepository.save(reichstagBuilding);
        attractionRepository.save(brandenburgGate);


//        Attractions for Munich
        Attraction zugspitzeMountain = new Attraction("Zugspitze Mountain", munich, "The Zugspitze is the highest peak in Germany, located in the Bavarian Alps near the town of Garmisch-Partenkirchen. Standing at 2,962 meters above sea level, it offers breathtaking panoramic views of the surrounding alpine landscape and beyond. Visitors can reach the summit by taking the Zugspitze Railway, Germany's highest cogwheel railway, or by hiking one of the mountain trails. At the summit, there are observation platforms, restaurants, and even a glacier for skiing and snowboarding year-round. The Zugspitze offers outdoor enthusiasts the opportunity to experience the beauty and majesty of the Alps in both summer and winter.", "");
        Attraction englishGarden = new Attraction("English Garden", munich, "The English Garden is a vast public park in the heart of Munich, Germany, spanning over 900 acres. Designed in the style of an English landscape garden, it offers scenic walking and cycling paths, lush greenery, and serene lakes and streams. Visitors can relax in the shade of centuries-old trees, enjoy a picnic by the water, or watch surfers riding the standing wave on the Eisbach River. The English Garden is also home to beer gardens, outdoor cafes, and traditional Bavarian beer halls, providing plenty of opportunities to unwind and enjoy the outdoors.", "");
        Attraction nymphenburgPalace = new Attraction("Nymphenburg Palace", munich, "Nymphenburg Palace is a magnificent Baroque palace located in Munich, Germany. Built as a summer residence for the Bavarian rulers, it boasts stunning architecture, landscaped gardens, and opulent interiors. Visitors can explore the palace's lavish rooms, including the Gallery of Beauties, the Porcelain Cabinet, and the Grand Hall, as well as stroll through the sprawling palace gardens, which feature fountains, sculptures, and a charming pagoda. Nymphenburg Palace is a cultural treasure that offers a glimpse into Bavaria's royal past and is a must-visit attraction in Munich.", "");

        // Save attraction in the database
        attractionRepository.save(nymphenburgPalace);
        attractionRepository.save(englishGarden);
        attractionRepository.save(zugspitzeMountain);


//        Attractions in Istanbul

        Attraction grandBazaar = new Attraction("Grand Bazaar (Kapalı Çarşı)", istanbul, "The Grand Bazaar, or Kapalı Çarşı, is one of the world's largest and oldest covered markets, with over 4,000 shops spread across 61 streets. Dating back to the 15th century, it is a vibrant hub of commerce and culture, where visitors can find everything from jewelry and textiles to spices and souvenirs. Navigating the maze-like bazaar is an experience in itself, with its bustling alleys, colorful displays, and friendly vendors. Whether you're shopping for gifts or simply soaking up the atmosphere, the Grand Bazaar is a must-visit destination in Istanbul.", "");
        Attraction bosphorusCruise = new Attraction("Bosphorus Cruise", istanbul, "A Bosphorus Cruise is a scenic boat tour along the Bosphorus Strait, which divides the city of Istanbul into two continents, Europe and Asia. It offers breathtaking views of the city's skyline, historic landmarks, and waterfront mansions, as well as an opportunity to see the iconic bridges that span the strait. Visitors can choose from a variety of cruise options, including daytime sightseeing tours, sunset cruises, and dinner cruises with live entertainment. A Bosphorus Cruise provides a unique perspective of Istanbul and is a memorable way to experience the beauty of the city.", "");
        Attraction buyukada = new Attraction("Büyükada (Princess Island)", istanbul, "Büyükada, also known as Princess Island, is the largest of the Princes' Islands in the Sea of Marmara, just off the coast of Istanbul. Renowned for its tranquil atmosphere, scenic landscapes, and charming Victorian-era architecture, Büyükada offers a peaceful retreat from the hustle and bustle of city life. Visitors can explore the island's picturesque streets by horse-drawn carriage or bicycle, visit historic landmarks such as the Aya Yorgi Church and Monastery, and relax on its pristine beaches. Büyükada is a popular day trip destination for locals and tourists alike, offering a perfect blend of natural beauty and old-world charm.", "");
        Attraction sapancaLake = new Attraction("Sapanca Lake", istanbul, "Sapanca Lake is a serene freshwater lake located in the Sakarya Province of Turkey, near the town of Sapanca. Surrounded by lush greenery and rolling hills, the lake offers breathtaking views and a tranquil atmosphere, making it a popular destination for nature lovers and outdoor enthusiasts. Visitors can enjoy a variety of activities on and around the lake, including boating, fishing, picnicking, and hiking along scenic trails. The area is also home to charming villages, boutique hotels, and cozy cafes, providing plenty of opportunities for relaxation and exploration. Whether you're seeking adventure or simply want to unwind amidst natural beauty, Sapanca Lake offers an idyllic escape from the hustle and bustle of city life.", "");
// Save attraction in the database
        attractionRepository.save(sapancaLake);
        attractionRepository.save(buyukada);
        attractionRepository.save(bosphorusCruise);
        attractionRepository.save(grandBazaar);

//        Attractions in Cappadocia
        // Create Attraction object for Göreme Open-Air Museum
        Attraction goremeMuseum = new Attraction("Göreme Open-Air Museum", cappadocia, "The Göreme Open-Air Museum is a UNESCO World Heritage Site located in the town of Göreme, Cappadocia. It features a complex of rock-cut churches and monasteries dating back to the Byzantine period. Visitors can explore the intricately decorated interiors of these ancient cave dwellings, which contain stunning frescoes depicting scenes from the life of Jesus Christ and other biblical figures. The museum offers a fascinating glimpse into the region's rich religious and cultural history, making it a must-visit attraction for anyone exploring Cappadocia.", "");
        Attraction hotAirBalloon = new Attraction("Hot Air Balloon Ride", cappadocia, "A hot air balloon ride over the surreal landscapes of Cappadocia is a once-in-a-lifetime experience. Visitors can soar above the fairy chimney rock formations, valleys, and vineyards as the sun rises, providing breathtaking panoramic views of the region's unique terrain. Many tour operators offer hot air balloon flights, allowing travelers to witness the stunning beauty of Cappadocia from above and create unforgettable memories.", "");
        Attraction quadBiking = new Attraction("Sunset Quad Biking in Cappadocia", cappadocia, "Sunset quad biking in Cappadocia offers an exhilarating way to explore the region's stunning landscapes and fairy chimney formations. Visitors can embark on guided quad biking tours that traverse rugged trails, ancient valleys, and scenic viewpoints, all while enjoying the breathtaking colors of the sunset casting a golden glow over the surreal terrain. With the wind in your hair and the sun setting on the horizon, sunset quad biking in Cappadocia promises an unforgettable adventure and unparalleled views of one of Turkey's most iconic destinations.", "");
        // Save attraction in the database
        attractionRepository.save(hotAirBalloon);
        attractionRepository.save(goremeMuseum);
        attractionRepository.save(quadBiking);

//Attractions in Antalya
        // Create Attraction object for Konyaaltı Beach
        Attraction konyaaltiBeach = new Attraction("Konyaaltı Beach", antalya, "Konyaaltı Beach is a popular seaside destination located west of Antalya's city center. Stretching for several kilometers along the Mediterranean coastline, it features pristine sandy shores, turquoise waters, and stunning views of the surrounding mountains. Visitors can relax on the beach, swim in the crystal-clear sea, or participate in water sports such as snorkeling, jet skiing, and parasailing. The beach is also lined with cafes, restaurants, and bars, offering a variety of dining and entertainment options. Whether you're seeking sun and relaxation or adventure and excitement, Konyaaltı Beach has something for everyone.", "");
        Attraction oldTown = new Attraction("Antalya Old Town (Kaleiçi)", antalya, "Antalya Old Town, also known as Kaleiçi, is a charming historic district located within the ancient city walls of Antalya. It is characterized by narrow cobblestone streets, Ottoman-era architecture, and picturesque harbor views. Visitors can wander through the maze-like alleys, explore ancient landmarks such as Hadrian's Gate and the Yivli Minare Mosque, and browse boutique shops selling traditional handicrafts and souvenirs. Kaleiçi is also home to a vibrant dining scene, with cozy cafes, rooftop restaurants, and waterfront tavernas serving delicious Turkish cuisine. Exploring Antalya Old Town is like stepping back in time, offering a glimpse into the city's rich history and cultural heritage.", "");
        Attraction landOfLegends = new Attraction("The Land of Legends Theme Park", antalya, "The Land of Legends Theme Park is a world-class entertainment complex located in Belek, near Antalya. It offers a wide range of attractions and activities for visitors of all ages, including thrilling rides, water slides, and interactive experiences. The park features themed zones such as Adventure, Waterfront Kingdom, and Legends Avenue, as well as a shopping and dining district. Highlights include the Typhoon Coaster, the Deep Dive immersive aquarium, and the Mythical Creatures Island. The Land of Legends Theme Park promises an unforgettable day of fun and excitement for the whole family.", "");
        Attraction horseRiding = new Attraction("Horse Riding Adventure", antalya, "Experience the beauty of Antalya's countryside on a thrilling horse riding adventure. Guided tours are available for riders of all skill levels, allowing you to explore scenic trails, lush forests, and picturesque valleys on horseback. Whether you're a beginner or an experienced rider, horse riding in Antalya offers a unique and memorable way to connect with nature and enjoy the tranquility of the Turkish countryside.", "");
        Attraction jetSkiing = new Attraction("Jet Skiing Adventure", antalya, "Experience the thrill of jet skiing on the crystal-clear waters of the Mediterranean Sea in Antalya. Jet ski rentals are available at various beaches and marinas along the coast, allowing you to explore the coastline at your own pace and enjoy the freedom of riding the waves. Whether you're a beginner or an experienced jet skier, Antalya offers ideal conditions for an exhilarating aquatic adventure.", "");
        Attraction kursunluPark = new Attraction("Kurşunlu Waterfall Nature Park", antalya, "Kurşunlu Waterfall Nature Park is a tranquil oasis located approximately 19 kilometers northeast of Antalya city center. It is characterized by lush greenery, meandering streams, and a series of cascading waterfalls. Visitors can follow scenic walking trails through the park, passing by dense forests, rock formations, and picnic areas along the way. The highlight of the park is the stunning Kurşunlu Waterfall, which plunges into a natural pool surrounded by ferns and moss-covered rocks. Kurşunlu Waterfall Nature Park is a peaceful retreat where visitors can reconnect with nature and enjoy the sights and sounds of the Turkish countryside.", "");
// Save attraction in the database
        attractionRepository.save(kursunluPark);
        attractionRepository.save(jetSkiing);
        attractionRepository.save(horseRiding);
        attractionRepository.save(landOfLegends);
        attractionRepository.save(oldTown);
        attractionRepository.save(konyaaltiBeach);

// Attractions for Vienna


        Attraction hallstattDayTrip = new Attraction("Hallstatt Day Trip from Vienna", vienna, "Embark on a scenic day trip from Vienna to the picturesque village of Hallstatt, nestled in the Austrian Alps. Situated on the shores of Lake Hallstatt and surrounded by towering mountains, Hallstatt is renowned for its breathtaking natural beauty, charming architecture, and rich cultural heritage. The journey from Vienna to Hallstatt takes approximately 3-4 hours by train or car, passing through stunning alpine landscapes along the way. Once in Hallstatt, visitors can explore the village's historic streets, visit the iconic Hallstatt Skywalk for panoramic views of the lake and mountains, and learn about the region's salt mining history at the Salt Mine Museum. With its idyllic setting and old-world charm, Hallstatt is a must-visit destination for travelers seeking a day of exploration and relaxation amidst stunning alpine scenery.", "");
        Attraction schonbrunnAttraction = new Attraction("Schönbrunn Palace", vienna, "Schönbrunn Palace is a UNESCO World Heritage Site and one of Vienna's most iconic landmarks. This Baroque palace served as the summer residence of the Habsburg monarchs and is renowned for its stunning architecture, extensive gardens, and rich history. Visitors can explore the opulent rooms of the palace, stroll through the meticulously landscaped gardens, and enjoy panoramic views of the city from the Gloriette. Schönbrunn Palace offers a fascinating glimpse into the grandeur and splendor of Austria's imperial past.", "");
        Attraction danubeValleyAttraction = new Attraction("Danube Valley", vienna, "The Danube Valley, or Donauvalley, is a scenic region along the Danube River known for its stunning landscapes, charming villages, and historic landmarks. Stretching from the Wachau Valley to the Iron Gate, the Danube Valley offers a wealth of outdoor activities and cultural attractions for visitors to enjoy. Highlights of the region include the medieval town of Dürnstein, famous for its hilltop castle and vineyards; the baroque abbey of Melk, a UNESCO World Heritage Site; and the picturesque village of Grein, home to Austria's oldest theater. Visitors can explore the Danube Valley by boat, bike, or car, stopping to admire the breathtaking scenery, visit charming villages, and sample regional cuisine along the way.", "");
// Save attraction in the database
        attractionRepository.save(danubeValleyAttraction);
        attractionRepository.save(schonbrunnAttraction);
        attractionRepository.save(hallstattDayTrip);

//        Attraction for Innsbruck

        Attraction nordketteMountains = new Attraction("Nordkette Mountain Range", innsbruck, "The Nordkette is a dramatic mountain range located just north of Innsbruck, Austria. It is part of the larger Karwendel Nature Park and offers spectacular alpine scenery and outdoor recreational opportunities year-round. Visitors can take the Nordkette Cable Car (Hungerburgbahn) from the city center to the Seegrube and Hafelekar stations, where they can enjoy panoramic views of the surrounding mountains and valleys. The Nordkette is a popular destination for hiking, mountain biking, skiing, and snowboarding, with trails and slopes suitable for all skill levels. Whether you're seeking adventure or simply want to admire the natural beauty of the Austrian Alps, the Nordkette Mountain Range has something for everyone.", "");
        Attraction swarovskiCrystalWorlds = new Attraction("Swarovski Crystal Worlds", innsbruck, "Swarovski Crystal Worlds, or Kristallwelten, is an enchanting art installation and museum located in Wattens, near Innsbruck, Austria. Created by the renowned crystal manufacturer Swarovski, the attraction features stunning crystal artworks, interactive exhibits, and beautifully landscaped gardens. Visitors can explore the Crystal Worlds Chamber of Wonder, a subterranean space filled with dazzling crystal creations by international artists, as well as outdoor installations such as the Crystal Cloud and the Giant's Garden. Swarovski Crystal Worlds offers a magical experience for visitors of all ages, blending art, design, and nature in a unique and immersive setting.", "");
// Save attraction in the database
        attractionRepository.save(swarovskiCrystalWorlds);
        attractionRepository.save(nordketteMountains);

        // Attractions for cities in Belgium

 //Brussels

        Attraction grandPlace = new Attraction("Grand Place", brussels, "The Grand Place is a UNESCO World Heritage Site and the central square of Brussels. It is surrounded by opulent guildhalls and the stunning Brussels City Hall. The square is a hub of activity, hosting events, markets, and festivals throughout the year. Visitors can admire the magnificent architecture, enjoy a Belgian waffle from one of the nearby vendors, or simply soak in the vibrant atmosphere.", "");
        Attraction atomium = new Attraction("Atomium", brussels, "The Atomium is an iconic symbol of Brussels, representing an iron crystal magnified 165 billion times. It was originally built for the 1958 Brussels World's Fair and has since become a major tourist attraction. Visitors can explore the spheres, which house exhibitions on science, technology, and design, and enjoy panoramic views of the city from the top sphere.", "");
        Attraction royalPalace = new Attraction("Royal Palace of Brussels", brussels, "The Royal Palace of Brussels serves as the official residence of the King and Queen of the Belgians, although it is only used for state ceremonies and official receptions. Visitors can tour the palace during the summer months when it is open to the public. The interior is adorned with magnificent decorations, exquisite furnishings, and works of art, offering a glimpse into Belgium's royal heritage.", "");
        Attraction miniEurope = new Attraction("Mini-Europe", brussels, "Mini-Europe is a miniature park located at the foot of the Atomium, featuring replicas of famous landmarks from across Europe at a scale of 1:25. Visitors can wander through the park and marvel at miniature versions of the Eiffel Tower, the Colosseum, and other iconic sites. Interactive exhibits provide insight into the history and culture of each destination.", "");
        Attraction autoWorld = new Attraction("Auto World", brussels, "Auto World is a fascinating museum dedicated to the history of automobiles, located in the beautiful Cinquantenaire Park. The museum boasts an extensive collection of vintage cars, ranging from early horseless carriages to classic sports cars and luxury vehicles. Visitors can explore the evolution of automotive design and technology through interactive exhibits, multimedia displays, and meticulously restored automobiles. Whether you're a car enthusiast or simply curious about the history of transportation, Auto World offers a captivating journey through the world of automobiles.", "");


// Save attraction in the database
        attractionRepository.save(grandPlace);
        attractionRepository.save(atomium);
        attractionRepository.save(royalPalace);
        attractionRepository.save(miniEurope);
        attractionRepository.save(autoWorld);


//Antwerp


        Attraction antwerpCentralStation = new Attraction("Antwerp Central Station", antwerp, "Antwerp Central Station is often referred to as the 'Railway Cathedral' due to its stunning architecture and grandeur. It is one of the most beautiful train stations in the world, featuring a blend of Art Nouveau and Neo-Gothic styles. Visitors can admire the impressive dome, intricate detailing, and spacious concourse, or simply marvel at the bustling activity of trains and passengers.", "");
        Attraction antwerpZoo = new Attraction("Antwerp Zoo", antwerp, "Antwerp Zoo is one of the oldest and largest zoos in the world, dating back to 1843. It is home to a diverse collection of animals, including elephants, giraffes, lions, and penguins. Visitors can explore various habitats, attend animal feedings and demonstrations, or relax in the tranquil surroundings of the zoo's botanical garden.", "");
        Attraction diamondDistrict = new Attraction("Antwerp Diamond District", antwerp, "The Antwerp Diamond District is renowned as the diamond capital of the world, with approximately 80% of the world's rough diamonds and 50% of cut diamonds passing through its streets. Visitors can stroll through the district's diamond shops, learn about the diamond trade's history and significance, and even purchase their own precious gemstones.", "");
        Attraction masMuseum = new Attraction("Museum aan de Stroom (MAS)", antwerp, "The Museum aan de Stroom, or MAS, is a striking museum located on the banks of the River Scheldt. It showcases the city's rich cultural heritage and maritime history through a diverse collection of artifacts, artworks, and interactive exhibits. Visitors can enjoy panoramic views of Antwerp from the museum's rooftop terrace or explore its engaging displays on topics ranging from global trade to local traditions.", "");
        Attraction rubensHouse = new Attraction("Rubenshuis (Rubens' House)", antwerp, "Rubenshuis, or Rubens' House, is the former residence and studio of the renowned Flemish Baroque painter Peter Paul Rubens. It now operates as a museum dedicated to his life and work. Visitors can explore the beautifully preserved rooms, admire Rubens' masterpieces, and learn about his artistic techniques and influences. The museum also features a garden designed in the style of Rubens' era, providing a tranquil retreat in the heart of Antwerp.", "");


// Save attraction in the database
        attractionRepository.save(antwerpCentralStation);
        attractionRepository.save(antwerpZoo);
        attractionRepository.save(diamondDistrict);
        attractionRepository.save(masMuseum);
        attractionRepository.save(rubensHouse);


//Ghent


        Attraction gravensteenCastle = new Attraction("Gravensteen Castle", ghent, "Gravensteen Castle, also known as the Castle of the Counts, is a medieval fortress located in the heart of Ghent. It dates back to the 12th century and offers visitors a glimpse into the city's rich history. Explore the castle's imposing walls, towers, and dungeons, and learn about its role in medieval life through interactive exhibits and guided tours.", "");
        Attraction ghentAltarpiece = new Attraction("Ghent Altarpiece", ghent, "The Ghent Altarpiece, also known as the Adoration of the Mystic Lamb, is a renowned masterpiece of Renaissance art created by the Van Eyck brothers. It is housed in Saint Bavo's Cathedral and is considered one of the most important works of Western art. Visitors can admire the altarpiece's intricate panels, rich symbolism, and exceptional craftsmanship.", "");
        Attraction ghentCanals = new Attraction("Ghent Canals", ghent, "Ghent's picturesque canals offer visitors a scenic way to explore the city's historic center. Take a boat tour along the waterways, passing by charming medieval buildings, picturesque bridges, and waterfront cafés. Learn about Ghent's maritime history and architectural landmarks while enjoying a leisurely cruise through the heart of the city.", "");
        Attraction stBavosAbbey = new Attraction("St. Bavo's Abbey", ghent, "St. Bavo's Abbey is a historic abbey located on the outskirts of Ghent. Founded in the 7th century, it played a significant role in the religious and cultural life of the region. Visitors can explore the abbey's tranquil grounds, visit its museum and art gallery, and learn about its fascinating history through exhibitions and guided tours.", "");

// Save attraction in database

        attractionRepository.save(gravensteenCastle);
        attractionRepository.save(ghentAltarpiece);
        attractionRepository.save(ghentCanals);
        attractionRepository.save(stBavosAbbey);


//brugges


        Attraction belfryOfBruges = new Attraction("Belfry of Bruges", bruges, "The Belfry of Bruges is a medieval bell tower located in the heart of the city. It offers panoramic views of Bruges and the surrounding area from its 83-meter-high tower. Visitors can climb the 366 steps to the top for breathtaking vistas of the city's historic center and picturesque landscape.", "");
        Attraction minnewaterPark = new Attraction("Minnewater Park", bruges, "Minnewater Park, also known as the 'Lake of Love,' is a tranquil oasis located in the southern part of Bruges. It features a picturesque lake surrounded by trees, walking paths, and gardens. Visitors can enjoy a leisurely stroll, relax by the water's edge, or feed the swans that inhabit the area.", "");
        Attraction begijnhof = new Attraction("Begijnhof", bruges, "The Begijnhof is a tranquil enclave in the heart of Bruges, originally founded in the 13th century as a religious community for laywomen. It consists of quaint white houses, a central green courtyard, and a small chapel. Visitors can explore the peaceful surroundings, learn about the history of the Beguines, and admire the well-preserved architecture.", "");
        Attraction brugesCanals = new Attraction("Bruges Canals", bruges, "The canals of Bruges are a network of waterways that wind their way through the city's medieval streets and historic landmarks. Visitors can take a boat tour along the canals to discover Bruges from a unique perspective, passing by charming bridges, old warehouses, and picturesque gabled houses.", "");
        Attraction chocolaterieDepla = new Attraction("Chocolaterie Depla", bruges, "Chocolaterie Depla is a family-owned chocolate shop located in the heart of Bruges. It offers a wide range of handmade chocolates, pralines, and truffles, crafted using traditional Belgian techniques and high-quality ingredients. Visitors can take a guided tour of the chocolate-making process, sample delicious treats, and purchase souvenirs to take home.", "");

        attractionRepository.save(belfryOfBruges);
        attractionRepository.save(minnewaterPark);
        attractionRepository.save(begijnhof);
        attractionRepository.save(brugesCanals);
        attractionRepository.save(chocolaterieDepla);

//liege



        Attraction citadelOfLiege = new Attraction("Citadel of Liège", liege, "The Citadel of Liège is a historic fortress located on a hill overlooking the city. It dates back to the 10th century and has played a significant role in the defense of Liège over the centuries. Visitors can explore the fortress's ramparts, bastions, and underground tunnels, and enjoy panoramic views of the city and surrounding landscape.", "");
        Attraction laBoverie = new Attraction("La Boverie", liege, "La Boverie is an art museum located in a beautiful 19th-century building on the banks of the River Meuse. It houses a diverse collection of artworks, ranging from Old Masters to contemporary pieces. Visitors can admire paintings, sculptures, and decorative arts from various periods and styles, and explore temporary exhibitions highlighting different aspects of the art world.", "");
        Attraction montagneDeBueren = new Attraction("Montagne de Bueren", liege, "Montagne de Bueren is a famous staircase in Liège, consisting of 374 steps that ascend a steep hillside. It is one of the city's most iconic landmarks and offers a challenging yet rewarding climb for visitors. At the top, you'll be rewarded with stunning views of Liège and the surrounding area, making it a popular spot for photographers and fitness enthusiasts alike.", "");
        Attraction curtiusMuseum = new Attraction("Curtius Museum", liege, "The Curtius Museum is a fascinating museum housed in a series of historic buildings along the River Meuse. It showcases the art and history of Liège, with collections ranging from ancient artifacts to decorative arts and fine arts. Visitors can explore exhibits on archaeology, medieval life, and the industrial revolution, providing insights into the city's rich cultural heritage.", "");
        Attraction parcDeLaBoverie = new Attraction("Parc de la Boverie", liege, "Parc de la Boverie is a beautiful park located on an island in the River Meuse, adjacent to the La Boverie museum. It features lush greenery, scenic walking paths, and picturesque views of the river. Visitors can enjoy leisurely strolls, picnics by the water, or simply relax in the peaceful surroundings of this urban oasis.", "");

        // Save attraction in database

        attractionRepository.save(citadelOfLiege);
        attractionRepository.save(laBoverie);
        attractionRepository.save(montagneDeBueren);
        attractionRepository.save(curtiusMuseum);
        attractionRepository.save(parcDeLaBoverie);


        //Attractions for cities in Netherlands

        //amsterdam


        Attraction vanGoghMuseum = new Attraction("Van Gogh Museum", amsterdam, "The Van Gogh Museum is dedicated to the life and work of the Dutch artist Vincent van Gogh. It houses the largest collection of his paintings and drawings in the world, including iconic masterpieces such as 'Sunflowers' and 'The Bedroom.' Visitors can explore van Gogh's artistic evolution, learn about his turbulent life, and appreciate his contributions to the art world.", "");
        Attraction anneFrankHouse = new Attraction("Anne Frank House", amsterdam, "The Anne Frank House is a museum dedicated to the Jewish wartime diarist Anne Frank, who hid from Nazi persecution with her family during World War II. The museum is located in the actual house where the Frank family lived in hiding for over two years. Visitors can tour the secret annex, see Anne's original diary, and learn about the Holocaust and its impact on Anne's life and legacy.", "");
        Attraction rijksmuseum = new Attraction("Rijksmuseum", amsterdam, "The Rijksmuseum is the national museum of the Netherlands, showcasing Dutch art and history from the Middle Ages to the present day. It houses a vast collection of masterpieces, including works by Rembrandt, Vermeer, and Van Gogh. Visitors can admire paintings, sculptures, decorative arts, and historical artifacts, providing insights into Dutch culture and heritage.", "");
        Attraction canalCruise = new Attraction("Canal Cruise", amsterdam, "A canal cruise is a popular way to explore Amsterdam's picturesque waterways and historic landmarks. Visitors can hop aboard a boat and enjoy a leisurely tour of the city's canals, passing by iconic sights such as the Anne Frank House, Westerkerk, and Skinny Bridge. Along the way, you'll learn about Amsterdam's rich history, architecture, and culture from informative guides.", "");
        Attraction vondelpark = new Attraction("Vondelpark", amsterdam, "Vondelpark is Amsterdam's most famous park, spanning over 47 hectares of greenery in the heart of the city. It offers a peaceful retreat from the hustle and bustle of urban life, with winding paths, ponds, gardens, and open lawns. Visitors can enjoy leisurely walks, picnics, cycling, or simply relax and soak up the natural beauty of this beloved Amsterdam landmark.", "");


        // Save attraction in database

        attractionRepository.save(vanGoghMuseum);
        attractionRepository.save(anneFrankHouse);
        attractionRepository.save(rijksmuseum);
        attractionRepository.save(canalCruise);
        attractionRepository.save(vondelpark);

        //rotterdam



        Attraction rotterdamMarkthal = new Attraction("Rotterdam Markthal", rotterdam, "The Rotterdam Markthal is a modern indoor market located in the heart of the city. It is known for its striking horseshoe-shaped architecture and vibrant atmosphere. Visitors can explore a wide variety of food stalls, selling fresh produce, gourmet delicacies, and international cuisine. The ceiling of the Markthal is adorned with a colorful mural, making it a feast for the eyes as well as the palate.", "");
        Attraction ssRotterdam = new Attraction("SS Rotterdam", rotterdam, "The SS Rotterdam is a former ocean liner and cruise ship, now permanently moored in Rotterdam as a hotel and museum. Visitors can tour the ship's decks, cabins, and public areas, learning about its history and maritime heritage. The SS Rotterdam offers a unique glimpse into the golden age of ocean travel, with exhibits, artifacts, and interactive displays showcasing life onboard a luxury liner.", "");
        Attraction euromast = new Attraction("Euromast", rotterdam, "The Euromast is an iconic observation tower in Rotterdam, offering panoramic views of the city and its surroundings from a height of 185 meters. Visitors can ride the elevator to the top of the tower and enjoy breathtaking vistas of Rotterdam's skyline, the Port of Rotterdam, and the Dutch countryside beyond. The Euromast also features a restaurant and brasserie, where guests can dine while taking in the view.", "");
        Attraction cubeHouses = new Attraction("Cube Houses", rotterdam, "The Cube Houses, or Kubuswoningen, are a unique architectural landmark in Rotterdam. Designed by architect Piet Blom, these innovative residential buildings are tilted at an angle of 45 degrees, creating a striking visual spectacle. Visitors can explore the interior of one of the Cube Houses, known as the Kijk-Kubus, to experience firsthand what it's like to live in these unconventional homes.", "");
        Attraction delfshaven = new Attraction("Delfshaven", rotterdam, "Delfshaven is a historic neighborhood in Rotterdam, known for its picturesque canals, 17th-century houses, and maritime heritage. Visitors can stroll along the quayside, admire the traditional Dutch architecture, and visit landmarks such as the Pilgrim Fathers' Church and the historic Delfshaven Harbor. Delfshaven offers a charming contrast to Rotterdam's modern skyline, providing a glimpse into the city's rich history and culture.", "");

        // Save attraction in database

        attractionRepository.save(rotterdamMarkthal);
        attractionRepository.save(ssRotterdam);
        attractionRepository.save(euromast);
        attractionRepository.save(cubeHouses);
        attractionRepository.save(delfshaven);


        // Attractions for cities in russia
        //Moscow

        Attraction bolshoiTheatre = new Attraction("Bolshoi Theatre", moscow, "The Bolshoi Theatre is one of the most renowned opera and ballet theaters in the world. It is known for its grand architecture, opulent interiors, and world-class performances. Visitors can attend ballets, operas, and concerts at the Bolshoi Theatre, or take a guided tour to learn about its history and backstage operations.", "");
        Attraction gorkyPark = new Attraction("Gorky Park", moscow, "Gorky Park is a vast recreational area in central Moscow, offering a wide range of activities for visitors of all ages. It features scenic walking paths, landscaped gardens, playgrounds, and sports facilities. Visitors can rent bikes, boats, or rollerblades, attend outdoor concerts and festivals, or simply relax and enjoy the natural beauty of this urban oasis.", "");
        Attraction tretyakovGallery = new Attraction("Tretyakov Gallery", moscow, "The Tretyakov Gallery is Russia's foremost museum of Russian art, housing an extensive collection of paintings, sculptures, and icons from the 11th to the 20th century. It features masterpieces by renowned artists such as Ivan Aivazovsky, Mikhail Vrubel, and Ivan Shishkin. Visitors can admire works of art spanning various styles and periods, providing insights into Russia's rich cultural heritage.", "");


        // Save attraction in database
        attractionRepository.save(bolshoiTheatre);
        attractionRepository.save(gorkyPark);
        attractionRepository.save(tretyakovGallery);


        //Saintpetersburg


        Attraction hermitageMuseum = new Attraction("Hermitage Museum", saintPetersburg, "The Hermitage Museum is one of the largest and most prestigious art museums in the world, housed in the magnificent Winter Palace. It boasts a vast collection of artworks, including paintings, sculptures, and decorative arts from various periods and cultures. Visitors can admire masterpieces by artists such as Leonardo da Vinci, Rembrandt, and Michelangelo, and explore the opulent interiors of the palace itself.", "");
        Attraction peterhofPalace = new Attraction("Peterhof Palace", saintPetersburg, "Peterhof Palace, also known as the 'Russian Versailles,' is a grand imperial palace located on the Gulf of Finland. It is renowned for its stunning gardens, elaborate fountains, and opulent interiors. Visitors can tour the palace's lavish rooms, stroll through the landscaped grounds, and marvel at the engineering marvels of the cascading fountains.", "");
        Attraction mariinskyTheatre = new Attraction("Mariinsky Theatre", saintPetersburg, "The Mariinsky Theatre is one of Russia's most famous opera and ballet houses, known for its world-class performances and historic significance. It has hosted premieres of works by renowned composers such as Tchaikovsky, Rachmaninoff, and Stravinsky. Visitors can attend ballets, operas, and concerts at the Mariinsky Theatre, or take a guided tour to learn about its illustrious history and backstage operations.", "");
        Attraction nevskyProspect = new Attraction("Nevsky Prospect", saintPetersburg, "Nevsky Prospect is the main thoroughfare of Saint Petersburg, lined with historic buildings, shops, restaurants, and cultural institutions. It is a bustling hub of activity, offering visitors a glimpse into the city's vibrant life and dynamic atmosphere. Visitors can explore Nevsky Prospect on foot or by taking a leisurely stroll along its sidewalks, stopping to admire architectural landmarks and sample local cuisine.", "");
        Attraction peterAndPaulFortress = new Attraction("Peter and Paul Fortress", saintPetersburg, "The Peter and Paul Fortress is a historic citadel located on Hare Island in the Neva River. It was founded by Peter the Great in 1703 and served as the original citadel of Saint Petersburg. Visitors can explore the fortress's bastions, ramparts, and cathedral, which houses the tombs of Russian tsars and emperors. The fortress also offers panoramic views of the city skyline and the surrounding river.", "");

        // Save attraction in database

        attractionRepository.save(hermitageMuseum);
        attractionRepository.save(peterhofPalace);
        attractionRepository.save(mariinskyTheatre);
        attractionRepository.save(nevskyProspect);
        attractionRepository.save(peterAndPaulFortress);



    //Attractions in iceland

       Attraction blueLagoon = new Attraction("Blue Lagoon", reykjavik, "The Blue Lagoon is a geothermal spa located in a lava field in Grindavik, southwest Iceland. It is renowned for its milky-blue waters, rich in minerals like silica and sulfur, which are believed to have healing properties. Visitors can soak in the lagoon's warm waters, indulge in spa treatments, and enjoy stunning views of the surrounding volcanic landscape.", "");
        Attraction goldenCircle = new Attraction("Golden Circle", reykjavik, "The Golden Circle is a popular tourist route in southwest Iceland, known for its breathtaking natural attractions. It includes three primary stops: Thingvellir National Park, where visitors can walk between the North American and Eurasian tectonic plates; the Geysir Geothermal Area, home to the erupting geyser Strokkur; and Gullfoss Waterfall, one of Iceland's most majestic cascades.", "");
        Attraction perlan = new Attraction("Perlan", reykjavik, "Perlan, or 'The Pearl,' is a landmark building in Reykjavik situated on Oskjuhlid Hill. It is known for its distinctive dome-shaped structure and rotating glass dome, which offers panoramic views of the city and surrounding landscapes. Visitors can explore the building's exhibition space, dine in its revolving restaurant, or enjoy a walk in the surrounding gardens.", "");


        // Save attraction in database
        attractionRepository.save(blueLagoon);
        attractionRepository.save(goldenCircle);
        attractionRepository.save(perlan);



    //Attraction for cities in switzerland
        // zurich



        Attraction lakeZurich = new Attraction("Lake Zurich", zurich, "Lake Zurich is a scenic lake situated in the heart of the city. It offers stunning views of the surrounding mountains and is a popular destination for recreational activities such as swimming, boating, and picnicking. Visitors can take a leisurely stroll along the lake promenade, rent a paddleboat, or simply relax on the shores and enjoy the serene atmosphere.", "");
        Attraction swissNationalMuseum = new Attraction("Swiss National Museum", zurich, "The Swiss National Museum is the largest cultural history museum in Switzerland, showcasing the country's rich cultural heritage from prehistoric times to the present day. Housed in a historic castle-like building, the museum features a vast collection of artifacts, including ancient artifacts, medieval art, traditional costumes, and decorative arts. Visitors can explore exhibits on Swiss history, culture, and folklore, providing insights into the nation's diverse heritage.", "");
        Attraction zurichOldTown = new Attraction("Old Town (Altstadt)", zurich, "Zurich's Old Town, or Altstadt, is a charming historic district known for its medieval buildings, cobblestone streets, and lively atmosphere. Visitors can wander through narrow alleyways, discover quaint shops, cafes, and galleries, and admire architectural landmarks such as the Grossmünster and Fraumünster churches. The Old Town is also home to the vibrant Niederdorf district, where visitors can enjoy shopping, dining, and nightlife.", "");
        Attraction uetlibergMountain = new Attraction("Uetliberg Mountain", zurich, "Uetliberg Mountain is Zurich's local mountain, offering panoramic views of the city, Lake Zurich, and the Swiss Alps. Visitors can hike or take the train to the summit, where they'll find observation towers, scenic viewpoints, and hiking trails. Uetliberg is a popular destination for outdoor activities such as hiking, mountain biking, and paragliding, as well as picnicking and enjoying the natural beauty of the Swiss countryside.", "");
        Attraction kunsthausZurich = new Attraction("Kunsthaus Zurich", zurich, "Kunsthaus Zurich is one of Switzerland's most important art museums, housing a vast collection of European art from the Middle Ages to the present day. It features works by renowned artists such as Rembrandt, Monet, Picasso, and Munch, as well as Swiss artists like Hodler and Giacometti. The museum also hosts temporary exhibitions, lectures, and events, providing visitors with a comprehensive overview of European art history.", "");


    //save attraction in database

        attractionRepository.save(lakeZurich);
        attractionRepository.save(swissNationalMuseum);
        attractionRepository.save(zurichOldTown);
        attractionRepository.save(uetlibergMountain);
        attractionRepository.save(kunsthausZurich);


        //geneva

        Attraction lakeGeneva = new Attraction("Lake Geneva", geneva, "Lake Geneva is one of the largest lakes in Europe and a defining feature of the city. It offers scenic views of the surrounding Alps and Jura mountains and is a popular destination for water sports, boat cruises, and lakeside picnics. Visitors can stroll along the lake promenade, visit parks and gardens along its shores, or take a relaxing boat ride to explore nearby towns and attractions.", "");
        Attraction jetDEau = new Attraction("Jet d'Eau", geneva, "Jet d'Eau is one of Geneva's most famous landmarks, a towering fountain located on Lake Geneva's waterfront. It shoots water up to 140 meters into the air, creating an impressive spectacle visible from miles around. Visitors can admire the fountain's beauty from the shore or take a boat cruise for a closer view. Jet d'Eau is particularly stunning at night when illuminated by lights.", "");
        Attraction unitedNationsHeadquarters = new Attraction("United Nations Headquarters", geneva, "The United Nations Headquarters in Geneva is one of the largest UN centers in the world and a hub for international diplomacy and cooperation. Visitors can take guided tours of the Palais des Nations, where they'll learn about the UN's work in peace and security, human rights, and humanitarian affairs. The complex also houses a museum and exhibits on global issues and challenges.", "");
        Attraction vieilleVille = new Attraction("Vieille Ville (Old Town)", geneva, "Geneva's Vieille Ville, or Old Town, is a charming historic district known for its narrow streets, medieval buildings, and historic landmarks. Visitors can wander through cobblestone alleys, discover hidden squares, and admire architectural gems such as the Maison Tavel and St. Peter's Cathedral. The Old Town is also home to boutique shops, cafes, and restaurants, making it a delightful area to explore on foot.", "");
        Attraction parcDesBastions = new Attraction("Parc des Bastions", geneva, "Parc des Bastions is a picturesque park located in the heart of Geneva's Old Town. It features lush greenery, tree-lined pathways, and historic monuments, including the Reformation Wall and the University of Geneva. Visitors can relax on benches, play chess on giant boards, or enjoy a leisurely stroll through the park's tranquil surroundings. Parc des Bastions is a peaceful oasis in the heart of the city.", "");


    //save attraction in database

        attractionRepository.save(lakeGeneva);
        attractionRepository.save(jetDEau);
        attractionRepository.save(unitedNationsHeadquarters);
        attractionRepository.save(vieilleVille);
        attractionRepository.save(parcDesBastions);

    //basel

        Attraction baselArtMuseum = new Attraction("Basel Art Museum", basel, "The Basel Art Museum, also known as Kunstmuseum Basel, is one of the oldest and most renowned art museums in Switzerland. It houses a vast collection of artworks from the medieval period to contemporary art, including pieces by renowned artists such as Holbein, Picasso, and Monet. Visitors can explore the museum's permanent collections and rotating exhibitions, providing insights into the history and development of European art.", "");
        Attraction baselZoo = new Attraction("Basel Zoo", basel, "Basel Zoo is one of the oldest and largest zoos in Switzerland, home to over 6,000 animals from around the world. It features a wide variety of species, including mammals, birds, reptiles, and amphibians, housed in naturalistic habitats. Visitors can observe animals such as elephants, giraffes, penguins, and lions, participate in feeding sessions and animal encounters, and learn about wildlife conservation efforts.", "");
        Attraction rheinRiverCruise = new Attraction("Rhine River Cruise", basel, "A Rhine River cruise is a popular way to explore Basel's picturesque waterfront and scenic surroundings. Visitors can embark on a leisurely boat ride along the Rhine River, passing by historic landmarks, charming villages, and lush vineyards. Guided cruises offer informative commentary on the region's history, culture, and natural beauty, making it an enjoyable and educational experience for all ages.", "");
        Attraction baselHistoricalMuseum = new Attraction("Basel Historical Museum", basel, "The Basel Historical Museum, or Historisches Museum Basel, is dedicated to the history and culture of the Basel region. It features permanent exhibitions on topics such as archaeology, medieval history, and everyday life in Basel. Visitors can explore artifacts, documents, and multimedia displays, providing insights into the city's past and its role in Swiss history.", "");
        Attraction baselBotanicalGarden = new Attraction("Basel Botanical Garden", basel, "The Basel Botanical Garden, or Botanischer Garten Basel, is a peaceful oasis in the heart of the city, showcasing a diverse collection of plants from around the world. It features themed gardens, greenhouses, and outdoor exhibits, including alpine plants, tropical flora, and medicinal herbs. Visitors can enjoy leisurely walks, educational tours, and seasonal events, surrounded by the beauty and tranquility of nature.", "");


    //save attraction in dat

        attractionRepository.save(baselArtMuseum);
        attractionRepository.save(baselZoo);
        attractionRepository.save(rheinRiverCruise);
        attractionRepository.save(rheinRiverCruise);
        attractionRepository.save(baselBotanicalGarden);

        // Top Attractions for Hanoi
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
        Attraction baNaHills = new Attraction("Ba Na Hills", daNang, "Ba Na Hills is a hill station and resort located in the Truong Son Mountains near Da Nang, Vietnam. It is known for its scenic beauty, French colonial architecture, and attractions such as the Golden Bridge and Fantasy Park. Visitors can ride the world's longest cable car to reach Ba Na Hills, enjoy panoramic views of the surrounding landscapes, explore gardens, and pagodas, and experience thrilling rides and entertainment.", "");
        Attraction marbleMountains = new Attraction("Marble Mountains", daNang, "The Marble Mountains are a cluster of five limestone hills located just south of Da Nang, Vietnam. They are known for their stunning natural beauty, sacred caves. Visitors can climb to the summits of the mountains, explore caves filled with religious statues and carvings, and enjoy panoramic views of the coastline and surrounding countryside.", "");
        Attraction dragonBridge = new Attraction("Dragon Bridge", daNang, "Dragon Bridge is a bridge over the Han River in Da Nang, Vietnam, known for its unique design and nightly dragon-shaped fire and water shows. It is one of the city's most iconic landmarks, symbolizing prosperity and good fortune. Visitors can watch the dragon breathe fire and spout water, walk along the bridge's pedestrian walkways, and enjoy views of the river and city skyline.", "");
        Attraction myKheBeach = new Attraction("My Khe Beach", daNang, "My Khe Beach is a popular beach located in Da Nang, Vietnam. It is known for its soft white sand, clear blue waters, and gentle waves, making it an ideal destination for swimming, sunbathing, and water sports. Visitors can relax on the beach, take a dip in the ocean, or enjoy activities such as surfing, jet skiing, and parasailing.", "");

// Save attractions in Da Nang
        attractionRepository.save(baNaHills);
        attractionRepository.save(marbleMountains);
        attractionRepository.save(dragonBridge);
        attractionRepository.save(myKheBeach);

        // Hoi An Attractions
        Attraction hoiAnAncientTown = new Attraction("Hoi An Ancient Town", hoiAn, "Hoi An Ancient Town is a UNESCO World Heritage Site located in Quang Nam Province, central Vietnam. It is known for its well-preserved historic architecture, charming streets, and cultural heritage. Visitors can explore its ancient buildings, and assembly halls, stroll along the picturesque Thu Bon River, and shop for handicrafts, lanterns, and tailor-made clothing.", "");
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
        Attraction uenoPark = new Attraction("Ueno Park", tokyo, "Ueno Park is a spacious public park located in Ueno, Taito, Tokyo, Japan. It is a popular destination for both locals and tourists, offering a wide range of attractions including museums, and gardens. Visitors can explore attractions such as Ueno Zoo, Tokyo National Museum, Shinobazu Pond, and enjoy cherry blossom viewing during spring.", "");
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
        Attraction chenClanAcademy = new Attraction("Chen Clan Academy", guangzhou, "Chen Clan Academy, also known as Chen Clan Ancestral Hall, is a historic academic complex located in Liwan District, Guangzhou, China. It is renowned for its exquisite architecture, ornate decorations, and cultural significance. Visitors can explore the academy's courtyards, halls, and galleries, and admire traditional Cantonese architecture, woodcarvings, and folk art.", "");
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
        Attraction centralWorld = new Attraction("Central Word", bangkok, "This massive shopping complex in Bangkok houses over 500 stores across seven floors. CentralWorld is also connected to a 5-star hotel, a 15-screen cinema, and an ice skating rink—great for a family outing. For avid shoppers, expect designer brands as well as leading international and local fashion brands. When hungry, don’t miss the Central Food Hall and the array of restaurants, cafes, and dessert joints in the mall. Tourists can obtain a special discount card with their passports and enjoy even more savings. CentralWorld can be easily reached by the BTS Skytrain.", "");

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

// Top Attractions for Phuket
        Attraction patongBeach = new Attraction("Patong Beach", phuket, "Patong Beach is one of Phuket's most popular beaches, known for its vibrant atmosphere, golden sands, and crystal-clear waters. Visitors can enjoy a wide range of water sports and activities, including swimming, snorkeling, and jet skiing, or simply relax on the beach and soak up the sun. The beach is also lined with restaurants, bars, and shops, offering plenty of dining and entertainment options day and night.", "");
        Attraction phiPhiIslands = new Attraction("Phi Phi Islands", phuket, "The Phi Phi Islands are a group of picturesque islands located off the coast of Phuket, Thailand. Known for their stunning natural beauty, turquoise waters, and vibrant marine life, the islands are a popular destination for snorkeling, diving, and island hopping tours. Visitors can explore attractions such as Maya Bay, where the movie 'The Beach' was filmed, as well as enjoy swimming, sunbathing, and beach picnics on the islands' pristine beaches.", "");
        Attraction oldPhuketTown = new Attraction("Old Phuket Town", phuket, "Old Phuket Town is the historic heart of Phuket, known for its colorful Sino-Portuguese buildings, vibrant street art, and cultural attractions. Visitors can wander through its charming streets, lined with quaint cafes, boutique shops, and art galleries, and admire the architecture and street murals. The area also features historic landmarks such as Thalang Road and Soi Rommanee, as well as museums, and markets showcasing Phuket's rich cultural heritage.", "");
        Attraction similanIslandsNationalPark = new Attraction("Similan Islands National Park", phuket, "Similan Islands National Park is a group of stunning islands located off the coast of Phang Nga Province, near Phuket, Thailand. Known for their crystal-clear waters, vibrant coral reefs, and diverse marine life, the Similan Islands are a paradise for snorkeling, diving, and beach lovers. Visitors can explore pristine beaches, hike through lush forests, and swim alongside colorful fish and sea turtles in the park's protected marine areas. The islands are also home to scenic viewpoints, hiking trails, and camping sites, offering opportunities for adventure and relaxation amidst the beauty of nature.", "");

        attractionRepository.save(patongBeach);
        attractionRepository.save(phiPhiIslands);
        attractionRepository.save(oldPhuketTown);
        attractionRepository.save(similanIslandsNationalPark);

// Top Attractions for Pattaya
        Attraction pattayaBeach = new Attraction("Pattaya Beach", pattaya, "Pattaya Beach is one of Thailand's most famous beaches, known for its golden sands, clear waters, and vibrant atmosphere. Visitors can enjoy a wide range of water sports and activities, including swimming, jet skiing, and parasailing, or simply relax on the beach and soak up the sun. The beach is lined with restaurants, bars, and shops, offering plenty of dining and entertainment options day and night.", "");
        Attraction nongNoochTropicalBotanicalGarden = new Attraction("Nong Nooch Tropical Botanical Garden", pattaya, "Nong Nooch Tropical Botanical Garden is a sprawling botanical garden and cultural village located in Pattaya, Thailand. Known for its lush landscapes, colorful flower displays, and exotic plant collections, the garden offers visitors a serene retreat amidst the beauty of nature. Visitors can explore themed gardens, enjoy cultural performances, and learn about traditional Thai arts and crafts. The garden also features recreational activities such as elephant shows, orchid gardens, and Thai massage pavilions, providing a diverse range of experiences for visitors of all ages.", "");
        Attraction pattayaFloatingMarket = new Attraction("Pattaya Floating Market", pattaya, "Pattaya Floating Market is a vibrant market located in Pattaya, Thailand, known for its unique floating stalls, traditional crafts, and local delicacies. Visitors can explore the market by boat or on foot, browsing through a wide variety of goods, including handmade crafts, clothing, souvenirs, and street food. The market also features cultural performances, demonstrations, and workshops showcasing Thai cultural heritage and craftsmanship. Pattaya Floating Market offers a lively and immersive experience, providing visitors with a glimpse into Thailand's rich cultural diversity and culinary traditions.", "");
        Attraction artInParadise = new Attraction("Art in Paradise", pattaya, "Art in Paradise is an interactive art museum located in Pattaya, Thailand, known for its optical illusions, 3D paintings, and immersive art installations. The museum features a variety of themed galleries and exhibits, where visitors can pose for photos and interact with the artwork. From underwater adventures to famous landmarks, the museum offers a creative and entertaining experience for visitors of all ages. Art in Paradise is a popular destination for families, couples, and groups looking for unique and memorable photo opportunities in Pattaya.", "");

        attractionRepository.save(pattayaBeach);
        attractionRepository.save(nongNoochTropicalBotanicalGarden);
        attractionRepository.save(pattayaFloatingMarket);
        attractionRepository.save(artInParadise);

// Top Attractions for Nonthaburi
        Attraction kohKretIsland = new Attraction("Koh Kret Island", nonthaburi, "Koh Kret is a man-made island located in the Chao Phraya River, near Nonthaburi, Thailand. Known for its traditional Mon culture, pottery villages, and scenic landscapes, the island offers visitors a unique cultural experience away from the hustle and bustle of Bangkok. Visitors can explore the island's markets, artisan workshops, and sample local delicacies. Koh Kret is also a popular destination for cycling, boat tours, and relaxing riverside picnics, making it a peaceful retreat for travelers seeking authentic Thai culture and natural beauty.", "");
        Attraction muangBoranAncientCity = new Attraction("Muang Boran (Ancient City)", nonthaburi, "Muang Boran, also known as Ancient City, is a cultural park located in Samut Prakan Province, near Nonthaburi, Thailand. The park features replicas of Thailand's most famous landmarks, and historical sites, showcasing the country's rich cultural heritage and architectural diversity. Visitors can explore the park by foot, bicycle, or tram, marveling at the intricate details and craftsmanship of the ancient structures. Muang Boran offers a fascinating journey through Thailand's history and culture, providing visitors with insights into the kingdom's past and present.", "");

        attractionRepository.save(kohKretIsland);
        attractionRepository.save(muangBoranAncientCity);

// Top Attractions for Kuala Lumpur
        Attraction petronasTwinTowers = new Attraction("Petronas Twin Towers", kualaLumpur, "The Petronas Twin Towers are an iconic landmark and symbol of Kuala Lumpur, Malaysia. Standing at 451.9 meters tall, they were once the tallest buildings in the world. Visitors can admire the towers' impressive architecture, take a guided tour to learn about their construction and history, and enjoy panoramic views of the city skyline from the observation deck on the 86th floor. The towers are also surrounded by a beautifully landscaped park with fountains and walking paths, making them a must-visit attraction for tourists.", "");
        Attraction kualaLumpurTower = new Attraction("Kuala Lumpur Tower", kualaLumpur, "The Kuala Lumpur Tower, also known as Menara KL, is a telecommunications tower and iconic landmark in Kuala Lumpur, Malaysia. Standing at 421 meters tall, it offers panoramic views of the city skyline from its observation deck and revolving restaurant. Visitors can take high-speed elevators to the top, where they can enjoy breathtaking views of Kuala Lumpur and its surrounding landscapes. The tower also features a variety of attractions, including a cultural village, souvenir shops, and an amphitheater, making it a popular destination for tourists and locals alike.", "");
        Attraction centralMarket = new Attraction("Central Market", kualaLumpur, "Central Market is a cultural and heritage landmark located in the heart of Kuala Lumpur, Malaysia. Built-in 1928, it is one of the city's oldest markets and a popular destination for arts, crafts, and Malaysian souvenirs. Visitors can explore the market's bustling stalls, which offer a wide range of items, including batik fabrics, traditional handicrafts, and local snacks. The market also hosts cultural performances, art exhibitions, and workshops, providing visitors with opportunities to learn about Malaysian culture and traditions.", "");
        Attraction kualaLumpurBirdPark = new Attraction("Kuala Lumpur Bird Park", kualaLumpur, "The Kuala Lumpur Bird Park is the largest covered bird park in the world and a popular tourist attraction in Kuala Lumpur, Malaysia. Spanning 20.9 acres, it is home to over 3,000 birds from more than 200 species, including rare and endangered birds. Visitors can explore the park's aviaries, walk-through exhibits, and landscaped gardens, where they can observe birds in their natural habitats and participate in feeding sessions and bird shows. The park also offers educational programs and guided tours, making it a fun and educational experience for visitors of all ages.", "");

        attractionRepository.save(petronasTwinTowers);
        attractionRepository.save(kualaLumpurTower);
        attractionRepository.save(centralMarket);
        attractionRepository.save(kualaLumpurBirdPark);

// Top Attractions for George Town
        Attraction penangHill = new Attraction("Penang Hill", georgeTown, "Penang Hill, also known as Bukit Bendera, is a hill resort located in George Town, Penang, Malaysia. It offers panoramic views of the city skyline and surrounding landscapes from its peak, which stands at 833 meters above sea level. Visitors can reach the top by taking the Penang Hill Railway, a funicular railway that has been in operation since 1923. At the summit, visitors can explore attractions such as the Owl Museum, Monkey Cup Garden, and historical colonial bungalows. Penang Hill is also a popular destination for hiking, nature walks, and birdwatching, offering visitors a serene retreat amidst the lush tropical rainforest.", "");
        Attraction streetArt = new Attraction("Street Art", georgeTown, "George Town is renowned for its vibrant street art scene, featuring colorful murals and installations by local and international artists. Visitors can explore the city's streets and alleys to discover these artworks, which depict scenes from Penang's rich cultural heritage, history, and everyday life. Some of the most famous murals include 'Children on Bicycle', 'Little Children on a Bicycle', and 'Boy on a Bike'. George Town's street art adds character and charm to the city's urban landscape, making it a popular destination for art lovers, photographers, and cultural enthusiasts.", "");
        Attraction penangPeranakanMansion = new Attraction("Penang Peranakan Mansion", georgeTown, "The Penang Peranakan Mansion is a museum located in George Town, Penang, Malaysia, showcasing the rich heritage and culture of the Peranakan community. Housed in a beautifully restored colonial mansion, the museum features a vast collection of antiques, artifacts, and memorabilia from the Peranakan era, including furniture, ceramics, jewelry, and clothing. Visitors can explore the mansion's opulent interiors, learn about Peranakan customs and traditions, and admire the intricate craftsmanship and design of the era. The Penang Peranakan Mansion offers a fascinating glimpse into the unique blend of Chinese, Malay, and European influences that characterize Peranakan culture.", "");
        Attraction penangButterflyFarm = new Attraction("Penang Butterfly Farm", georgeTown, "The Penang Butterfly Farm is a tropical butterfly sanctuary located in Teluk Bahang, Penang, Malaysia, just outside of George Town. Spanning over 0.8 hectares, it is home to thousands of butterflies from over 120 species, as well as other insects and reptiles. Visitors can explore the farm's lush gardens, walk-through exhibits, and educational displays, where they can observe butterflies in various stages of their life cycle and learn about their behavior, habitat, and conservation. The farm also features a souvenir shop, cafe, and guided tours, making it a fun and educational experience for visitors of all ages.", "");
        Attraction penangStreetFood = new Attraction("Penang Street Food", georgeTown, "George Town is famous for its diverse and delicious street food, which reflects the multicultural heritage of Penang. Visitors can explore the city's hawker stalls, food courts, and open-air markets to sample a wide variety of dishes, including char kway teow, laksa, nasi kandar, and cendol. Some of the most popular street food destinations in George Town include Gurney Drive Hawker Centre, New Lane Hawker Centre, and Kimberley Street Night Market. Penang's street food scene offers a culinary adventure for food lovers, with flavors and aromas that will tantalize the taste buds.", "");

        attractionRepository.save(penangHill);
        attractionRepository.save(streetArt);
        attractionRepository.save(penangPeranakanMansion);
        attractionRepository.save(penangButterflyFarm);
        attractionRepository.save(penangStreetFood);

// Top Attractions for Johar Bahru
        Attraction legolandMalaysiaResort = new Attraction("Legoland Malaysia Resort", johorBahru, "Legoland Malaysia Resort is a theme park located in Iskandar Puteri, Johor Bahru, Malaysia. It features a variety of attractions, including roller coasters, water rides, and interactive exhibits, all based on the popular Lego brand. Visitors can explore themed zones such as Lego City, Lego Technic, and Lego Kingdoms, and enjoy rides and attractions suitable for all ages. The resort also includes a water park, Legoland Water Park, and a themed hotel, Legoland Hotel, offering visitors a complete Lego-themed experience.", "");
        Attraction johorBahruCitySquare = new Attraction("Johor Bahru City Square", johorBahru, "Johor Bahru City Square is a shopping mall located in the heart of Johor Bahru, Malaysia. It features a wide range of retail outlets, restaurants, and entertainment facilities, making it a popular destination for locals and tourists alike. Visitors can shop for a variety of goods, including clothing, electronics, and souvenirs, and dine at a selection of restaurants offering both local and international cuisine. The mall also hosts events and activities throughout the year, providing visitors with entertainment and leisure options.", "");
        Attraction dangaBay = new Attraction("Danga Bay", johorBahru, "Danga Bay is a waterfront development located in Johor Bahru, Malaysia, along the Straits of Johor. It features a variety of attractions and recreational facilities, including parks, promenades, and water sports activities. Visitors can enjoy leisurely strolls along the waterfront, dine at waterfront restaurants offering panoramic views of the straits, or participate in activities such as jet skiing, kayaking, and paddle boating. Danga Bay is also a popular spot for picnics, family outings, and evening walks, offering visitors a relaxing escape from the city.", "");
        Attraction puteriHarbourFamilyThemePark = new Attraction("Puteri Harbour Family Theme Park", johorBahru, "Puteri Harbour Family Theme Park is a family-friendly entertainment complex located in Iskandar Puteri, Johor Bahru, Malaysia. It features a variety of attractions and activities suitable for all ages, including amusement rides, indoor playgrounds, and themed attractions based on popular children's characters. Visitors can explore themed zones such as Sanrio Hello Kitty Town, Thomas Town, and The Little Big Club, and enjoy interactive experiences and live shows featuring beloved characters. The theme park also includes dining outlets, souvenir shops, and facilities for birthday parties and special events, making it a popular destination for families and children.", "");
        Attraction johorZoo = new Attraction("Johor Zoo", johorBahru, "Johor Zoo is a zoological park located in Johor Bahru, Malaysia. It is home to a diverse collection of animals, including mammals, birds, reptiles, and fish, from Malaysia and around the world. Visitors can explore the zoo's exhibits, which include naturalistic habitats and interactive displays, and observe animals such as tigers, elephants, orangutans, and crocodiles. The zoo also offers educational programs, guided tours, and feeding sessions, providing visitors with opportunities to learn about wildlife conservation and biodiversity. Johor Zoo is a popular destination for families, school groups, and animal lovers, offering a fun and educational experience for visitors of all ages.", "");

        attractionRepository.save(legolandMalaysiaResort);
        attractionRepository.save(johorBahruCitySquare);
        attractionRepository.save(dangaBay);
        attractionRepository.save(puteriHarbourFamilyThemePark);
        attractionRepository.save(johorZoo);

// Top Attractions for Ipoh
        Attraction lostWorldOfTambun = new Attraction("Lost World of Tambun", ipoh, "Lost World of Tambun is a theme park and hot springs resort located in Ipoh, Perak, Malaysia. It features a variety of attractions, including water slides, amusement rides, a petting zoo, and a natural hot springs spa. Visitors can explore themed zones such as Adventure Park, Water Park, and Tiger Valley, and enjoy activities such as cave exploration, zip-lining, and elephant encounters. The resort also includes accommodation options, dining outlets, and event spaces, making it a popular destination for families, thrill-seekers, and nature lovers alike.", "");
        Attraction kintaRiverfrontWalk = new Attraction("Kinta Riverfront Walk", ipoh, "Kinta Riverfront Walk is a scenic promenade located along the Kinta River in Ipoh, Perak, Malaysia. It offers visitors a leisurely stroll amidst lush greenery, landscaped gardens, and picturesque river views. The walkway is lined with benches, pavilions, and public art installations, providing opportunities for relaxation and recreation. Visitors can enjoy activities such as jogging, cycling, or simply taking in the serene surroundings. Kinta Riverfront Walk is also a popular spot for photography, picnics, and outdoor events, making it a favorite destination for both locals and tourists.", "");
        Attraction gunungLangRecreationalPark = new Attraction("Gunung Lang Recreational Park", ipoh, "Gunung Lang Recreational Park is a natural park located in Ipoh, Perak, Malaysia. It offers visitors a tranquil retreat amidst lush greenery, limestone hills, and scenic lakes. The park features walking trails, picnic areas, and viewing platforms, allowing visitors to explore its natural beauty and wildlife. Highlights of the park include a scenic lake with boat rides, a limestone hill with a lookout tower, and a canopy walkway through the treetops. Gunung Lang Recreational Park is a popular destination for nature lovers, bird watchers, and outdoor enthusiasts, offering opportunities for relaxation and adventure.", "");
        Attraction ipohRailwayStation = new Attraction("Ipoh Railway Station", ipoh, "Ipoh Railway Station is a historic train station located in Ipoh, Perak, Malaysia. Built-in 1917, it is known for its unique architecture, which combines Moorish, British colonial, and Malay influences. The station features a grand facade with domes, arches, and intricate details, making it one of the most photographed landmarks in Ipoh. Visitors can admire the station's exterior and interior design, which includes stained glass windows, marble floors, and antique furnishings. Ipoh Railway Station is still in use today and serves as a transportation hub for trains traveling between Kuala Lumpur and Penang.", "");
        Attraction ipohOldTown = new Attraction("Ipoh Old Town", ipoh, "Ipoh Old Town is a historic district located in the heart of Ipoh, Perak, Malaysia. It is known for its colonial-era architecture, bustling markets, and vibrant street art. Visitors can explore the district's narrow alleyways and heritage buildings, which house cafes, galleries, and boutique shops. Highlights of Ipoh Old Town include Concubine Lane, a narrow street lined with souvenir stalls and street food vendors, and Mural Art's Lane, which features colorful murals depicting scenes from Ipoh's history and culture. Ipoh Old Town is a popular destination for foodies, history buffs, and photographers, offering a glimpse into the city's rich heritage and cultural diversity.", "");

        attractionRepository.save(lostWorldOfTambun);
        attractionRepository.save(kintaRiverfrontWalk);
        attractionRepository.save(gunungLangRecreationalPark);
        attractionRepository.save(ipohRailwayStation);
        attractionRepository.save(ipohOldTown);

// Top Attractions for Kuching
        Attraction sarawakCulturalVillage = new Attraction("Sarawak Cultural Village", kuching, "Sarawak Cultural Village is a living museum located in Kuching, Sarawak, Malaysia. It showcases the diverse cultures and traditions of Sarawak's indigenous ethnic groups, including the Iban, Bidayuh, Orang Ulu, and Melanau. Visitors can explore traditional longhouses, watch cultural performances, and participate in hands-on activities such as cooking demonstrations, handicraft making, and blowpipe shooting. The village is set amidst lush tropical rainforest, providing visitors with an immersive experience in Sarawak's rich cultural heritage and natural beauty.", "");
        Attraction kuchingWaterfront = new Attraction("Kuching Waterfront", kuching, "Kuching Waterfront is a scenic promenade located along the Sarawak River in Kuching, Sarawak, Malaysia. It offers visitors panoramic views of the city skyline, historic landmarks, and traditional Malay kampong houses. The waterfront features a pedestrian walkway lined with cafes, restaurants, and souvenir shops, making it a popular spot for leisurely strolls, sunset watching, and boat cruises. Visitors can also explore nearby attractions such as the Sarawak State Legislative Assembly Building, Fort Margherita, and the Astana, the official residence of the Governor of Sarawak.", "");
        Attraction bakoNationalPark = new Attraction("Bako National Park", kuching, "Bako National Park is a protected area located on the Muara Tebas Peninsula in Kuching Division, Sarawak, Malaysia. It is known for its diverse ecosystems, including mangrove swamps, dipterocarp forests, and coastal cliffs, as well as its rich biodiversity, including proboscis monkeys, bearded pigs, and pitcher plants. Visitors can explore the park's network of hiking trails, which lead to scenic viewpoints, secluded beaches, and unique rock formations. Bako National Park is also a popular destination for wildlife spotting, birdwatching, and nature photography, offering visitors a chance to experience Sarawak's pristine natural beauty up close.", "");
        Attraction semenggohNatureReserve = new Attraction("Semenggoh Nature Reserve", kuching, "Semenggoh Nature Reserve is a wildlife rehabilitation center located in Kuching Division, Sarawak, Malaysia. It is home to semi-wild orangutans that have been rescued from captivity or orphaned due to deforestation and illegal hunting. Visitors can observe the orangutans in their natural habitat during feeding times, which are held twice daily. The reserve also features lush rainforest trails, where visitors can spot other wildlife such as gibbons, hornbills, and monitor lizards. Semenggoh Nature Reserve plays a crucial role in orangutan conservation efforts in Sarawak, providing a safe haven for these endangered primates.", "");
        Attraction kubahNationalPark = new Attraction("Kubah National Park", kuching, "Kubah National Park is a protected area located in Kuching Division, Sarawak, Malaysia. It is known for its diverse ecosystems, including mixed dipterocarp forests, peat swamp forests, and montane forests, as well as its rich biodiversity, including rare orchids, pitcher plants, and endemic frogs. Visitors can explore the park's network of hiking trails, which lead to scenic waterfalls, natural pools, and panoramic viewpoints. Kubah National Park is also a popular destination for birdwatching, with over 100 species of birds recorded within the park's boundaries. The park offers visitors a chance to experience Sarawak's unique flora and fauna in a pristine rainforest setting.", "");

        attractionRepository.save(sarawakCulturalVillage);
        attractionRepository.save(kuchingWaterfront);
        attractionRepository.save(bakoNationalPark);
        attractionRepository.save(semenggohNatureReserve);
        attractionRepository.save(kubahNationalPark);

// Top Attractions for Seoul
        Attraction gyeongbokgungPalace = new Attraction("Gyeongbokgung Palace", seoul, "This historic palace is the largest of the Five Grand Palaces built during the Joseon Dynasty. Visitors can explore its impressive architecture, beautiful gardens, and learn about Korean royal history.", "");
        Attraction myeongdongShoppingStreet = new Attraction("MyeongdongShoppingStreet", seoul, "A bustling district renowned for its vibrant blend of modernity and tradition. Lined with skyscrapers and neon signs, the narrow streets offer a sensory explosion of sizzling street food aromas and tantalizing Korean delicacies. It's a haven for fashion enthusiasts, with a maze of boutiques and international brands, alongside a paradise for beauty aficionados, boasting an array of cosmetics shops. Amidst the hustle, traditional hanok houses peek out, offering a glimpse into Seoul's rich heritage. As night falls, Myeongdong transforms into a pulsating hub of nightlife, with street performances and bustling night markets, making it an exhilarating destination for immersive cultural experiences.", "");
        Attraction nationalMuseumOfKorea = new Attraction("National Museum of Korea", seoul, "A cultural gem renowned for its vast collection spanning centuries of Korean history and art. Set against a backdrop of modern architecture, the museum offers a journey through the nation's rich heritage, from ancient artifacts to contemporary masterpieces. Visitors are immersed in a treasure trove of exhibits showcasing traditional ceramics, exquisite paintings, and archaeological wonders. The museum's sprawling grounds also feature tranquil gardens, providing a serene escape amidst the bustling city. With its comprehensive displays and immersive experiences, the National Museum of Korea stands as a beacon of cultural preservation and exploration.", "");
        Attraction changdeokgungPalace = new Attraction("Changdeokgung Palace", seoul, "A testament to Korea's majestic royal history. Surrounded by lush gardens and centuries-old trees, the palace exudes an aura of tranquility and grandeur. Its meticulously preserved architecture, characterized by intricate wooden structures and colorful painted details, offers visitors a glimpse into the opulent lifestyle of Korean royalty. As you wander through its graceful courtyards and ornate halls, you're transported back in time to a bygone era of splendor and tradition. Changdeokgung Palace, a UNESCO World Heritage site, stands as a timeless symbol of Korea's cultural heritage and architectural brilliance.", "");
        Attraction nSeoulTower = new Attraction("N Seoul Tower", seoul, "An iconic landmark perched atop Namsan Mountain in the heart of Seoul, offers panoramic views and cultural experiences that captivate visitors. Rising majestically above the city skyline, the tower's observation decks provide breathtaking vistas of Seoul's sprawling urban landscape and surrounding mountains. Beyond its awe-inspiring views, N Seoul Tower boasts an array of attractions, including restaurants, exhibitions, and even a digital art gallery, offering visitors a diverse range of experiences. Whether you're admiring the city lights at night or enjoying a leisurely stroll through the adjacent Namsan Park, N Seoul Tower stands as a symbol of Seoul's vibrant spirit and a must-visit destination for locals and tourists alike.", "");
        Attraction insadong = new Attraction("Insadong", seoul, "A cultural enclave nestled in the heart of Seoul, enchants visitors with its charming blend of tradition and modernity. Lined with quaint alleyways and historic storefronts, this bustling neighborhood is a treasure trove of Korean art, crafts, and cuisine. Meandering through its lively streets, visitors encounter a vibrant tapestry of galleries, teahouses, and souvenir shops, showcasing everything from traditional hanbok attire to contemporary artwork. Amidst the hustle and bustle, tranquil gardens provide serene retreats from the urban landscape, offering a glimpse into Seoul's rich cultural heritage. Whether savoring a cup of aromatic green tea or exploring the latest in Korean crafts, Insadong captivates with its timeless charm and vibrant energy.", "");

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
        Attraction incheonChinatown = new Attraction("Incheon Chinatown", incheon, "Incheon Chinatown is the largest Chinatown in South Korea, offering a rich tapestry of Chinese culture, history, and cuisine. Visitors can explore its colorful streets lined with traditional Chinese buildings, and shops selling souvenirs and street food. The area is known for its vibrant atmosphere, with lantern festivals, cultural performances, and culinary events celebrating Chinese heritage.", "");
        Attraction wolmidoIsland = new Attraction("Wolmido Island", incheon, "Wolmido Island is a popular leisure destination in Incheon, offering scenic views, outdoor activities, and entertainment options. Visitors can take a ferry to the island and explore its waterfront promenades, amusement parks, and seafood restaurants. Wolmido also features cultural attractions such as the Incheon Port Lighthouse and Wolmi Theme Park, as well as opportunities for hiking, biking, and enjoying sunset views over the Yellow Sea.", "");
        Attraction incheonGrandPark = new Attraction("Incheon Grand Park", incheon, "Incheon Grand Park is a sprawling urban park that offers a tranquil retreat from the city's hustle and bustle. Visitors can explore its lush green spaces, scenic walking trails, and botanical gardens, which showcase a diverse range of plant species. The park also features recreational facilities, including picnic areas, playgrounds, and a zoo, making it a popular destination for families, nature lovers, and outdoor enthusiasts.", "");
        Attraction incheonBridge = new Attraction("Incheon Bridge", incheon, "As one of the longest cable-stayed bridges in the world, Incheon Bridge is an iconic landmark that connects the mainland of Incheon to Yeongjong Island. Visitors can admire the bridge's sleek design and engineering marvels from various vantage points along the coast. The bridge is especially enchanting at night when it is illuminated by colorful lights, creating a stunning spectacle against the backdrop of the night sky.", "");

        attractionRepository.save(songdoCentralPark);
        attractionRepository.save(incheonChinatown);
        attractionRepository.save(wolmidoIsland);
        attractionRepository.save(incheonGrandPark);
        attractionRepository.save(incheonBridge);

// Top Attractions for Daegu
        Attraction daeguEworld = new Attraction("Daegu E-world", daegu, "Daegu E-world is a major amusement park and entertainment complex in Daegu, South Korea. It features thrilling rides, family-friendly attractions, and entertainment shows, making it a popular destination for visitors of all ages. The park also includes shopping malls, restaurants, and a water park, providing a full day of fun and excitement for visitors.", "");
        Attraction seomunMarket = new Attraction("Seomun Market", daegu, "Seomun Market is one of the largest traditional markets in South Korea, located in the heart of Daegu. It offers a wide variety of goods, including clothing, accessories, food, and household items, at affordable prices. Visitors can explore its bustling alleyways, sample local delicacies, and experience the vibrant atmosphere of traditional Korean market culture.", "");
        Attraction daeguNationalMuseum = new Attraction("Daegu National Museum", daegu, "Daegu National Museum is a cultural institution that showcases the history and heritage of Daegu and its surrounding regions. It features a diverse collection of artifacts, artworks, and archaeological finds, spanning thousands of years of Korean history. Visitors can learn about Daegu's cultural heritage, traditional crafts, and archaeological discoveries through interactive exhibits and educational programs.", "");
        Attraction apsanPark = new Attraction("Apsan Park", daegu, "Apsan Park is a scenic mountain park located in the heart of Daegu, offering stunning views of the city and surrounding countryside. Visitors can hike along its trails, explore historic sites such as Apsan Observatory, and enjoy recreational activities such as picnicking and birdwatching. Apsan Park is also home to Apsan Park Ropeway, which offers a convenient way to reach the mountain's summit and enjoy panoramic vistas of Daegu and beyond.", "");
        Attraction daeguPalgongsan = new Attraction("Daegu Palgongsan", daegu, "Daegu Palgongsan is a scenic mountain range located northeast of Daegu city, offering breathtaking natural beauty and cultural attractions. Visitors can explore its lush forests, and picturesque hiking trails, which provide stunning views of the surrounding landscape. .", "");

        attractionRepository.save(daeguEworld);
        attractionRepository.save(seomunMarket);
        attractionRepository.save(daeguNationalMuseum);
        attractionRepository.save(apsanPark);
        attractionRepository.save(daeguPalgongsan);

// Top Attractions for Daejeon
        Attraction daejeonExpoPark = new Attraction("Daejeon Expo Park", daejeon, "Daejeon Expo Park is a sprawling recreational area located in the heart of Daejeon, South Korea. It was originally built for the 1993 Daejeon Expo and has since been transformed into a popular destination for locals and tourists alike. The park features beautiful gardens, walking trails, and outdoor sculptures, as well as cultural facilities such as the Daejeon Museum of Art and the Daejeon Science Center. Visitors can enjoy leisurely strolls, picnics, and cultural experiences amidst the park's scenic surroundings.", "");
        Attraction daejeonOworld = new Attraction("Daejeon O World", daejeon, "Daejeon O World is a large theme park and zoo complex located in Daejeon, South Korea. It offers a wide range of attractions and entertainment options for visitors of all ages, including thrilling rides, animal exhibits, and live shows. The park is divided into several themed zones, such as Adventure Land, Zoo Topia, and Magic World, each offering unique experiences and adventures. Daejeon O World is a popular destination for families, school trips, and group outings, providing a fun-filled day of excitement and amusement.", "");
        Attraction daejeonHanbatArboretum = new Attraction("Daejeon Hanbat Arboretum", daejeon, "Daejeon Hanbat Arboretum is a botanical garden located in Daejeon, South Korea, known for its diverse collection of plant species and tranquil atmosphere. The arboretum features themed gardens, walking paths, and educational exhibits, providing visitors with opportunities to learn about plant life and conservation. It also hosts various events and workshops throughout the year, including flower shows, gardening classes, and nature walks, making it a popular destination for nature lovers and gardening enthusiasts.", "");
        Attraction daejeonSkyroad = new Attraction("Daejeon Skyroad", daejeon, "Daejeon Skyroad is a scenic walking trail that spans approximately 18 kilometers along the banks of the Daejeoncheon Stream in Daejeon, South Korea. It offers stunning views of the city skyline, lush greenery, and cultural landmarks, making it a popular destination for outdoor recreation and sightseeing. Visitors can walk, jog, or cycle along the trail, which is divided into several sections, each offering unique attractions and experiences. Daejeon Skyroad is a peaceful retreat from the urban bustle, providing opportunities for relaxation, exercise, and exploration amidst nature.", "");
        Attraction daejeonNationalScienceMuseum = new Attraction("Daejeon National Science Museum", daejeon, "Daejeon National Science Museum is a leading science museum located in Daejeon, South Korea, dedicated to promoting scientific education and exploration. The museum features interactive exhibits, hands-on experiments, and educational programs that cover a wide range of scientific disciplines, including physics, chemistry, biology, and astronomy. Visitors can participate in various activities and demonstrations, learn about cutting-edge research and technology, and explore the wonders of the natural world. Daejeon National Science Museum is a fun and educational destination for visitors of all ages, inspiring curiosity and discovery.", "");

        attractionRepository.save(daejeonExpoPark);
        attractionRepository.save(daejeonOworld);
        attractionRepository.save(daejeonHanbatArboretum);
        attractionRepository.save(daejeonSkyroad);
        attractionRepository.save(daejeonNationalScienceMuseum);
    }
}
