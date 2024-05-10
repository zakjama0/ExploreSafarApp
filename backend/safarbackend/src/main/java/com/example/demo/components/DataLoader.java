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
    public void run(ApplicationArguments arguments) throws Exception{
        User user1 = new User("Zakaria", "zak@safar.com","password");
        User user2 = new User("Tadiwa","tadiwa@safar.com","password");
        User user3 = new User("Marvellous", "marv@safar.com","password");
        User user4 = new User("Mohammed", "sharif@safar.com","password");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);

        //Africa Continent
        Country egypt = new Country(Region.NORTHERN_AFRICA, Continent.AFRICA, "https://i.natgeofe.com/k/109a4e08-5ebc-48a5-99ab-3fbfc1bbd611/Giza_Egypt_KIDS_0123_square.jpg", "Egypt");
        Country algeria = new Country(Region.NORTHERN_AFRICA, Continent.AFRICA, "", "Algeria");
        Country morocco = new Country(Region.NORTHERN_AFRICA, Continent.AFRICA, "", "Morocco");
        Country tunisia = new Country(Region.NORTHERN_AFRICA, Continent.AFRICA, "", "Tunisia");
        Country libya = new Country(Region.NORTHERN_AFRICA, Continent.AFRICA, "", "Libya");
        Country nigeria = new Country(Region.WESTERN_AFRICA, Continent.AFRICA, "", "Nigeria");
        Country ghana = new Country(Region.WESTERN_AFRICA, Continent.AFRICA, "", "Ghana");
        Country ethiopia = new Country(Region.EASTERN_AFRICA, Continent.AFRICA, "", "Ethiopia");
        Country kenya = new Country(Region.EASTERN_AFRICA, Continent.AFRICA, "", "Kenya");
        Country southAfrica = new Country(Region.SOUTHERN_AFRICA, Continent.AFRICA, "", "South Africa");
        Country tanzania = new Country(Region.EASTERN_AFRICA, Continent.AFRICA, "", "Tanzania");
        //FEATURED AFRICAN COUNTRY:  EGYPT, TANZANIA, ALGERIA, KENYA SOUTH AFRICA
        //Asia Continent
        Country china = new Country(Region.EAST_ASIA, Continent.ASIA, "", "China");
        Country india = new Country(Region.SOUTH_ASIA, Continent.ASIA, "", "India");
        Country japan = new Country(Region.EAST_ASIA, Continent.ASIA, "", "Japan");
        Country indonesia = new Country(Region.SOUTH_EAST_ASIA, Continent.ASIA, "", "Indonesia");
        Country pakistan = new Country(Region.SOUTH_ASIA, Continent.ASIA, "", "Pakistan");
        Country bangladesh = new Country(Region.SOUTH_ASIA, Continent.ASIA, "", "Bangladesh");
        Country philippines = new Country(Region.SOUTH_EAST_ASIA, Continent.ASIA, "", "Philippines");
        Country vietnam = new Country(Region.SOUTH_EAST_ASIA, Continent.ASIA, "", "Vietnam");
        Country iran = new Country(Region.MIDDLE_EAST, Continent.ASIA, "", "Iran");
        Country kyrgyzstan = new Country(Region.CENTRAL_ASIA, Continent.ASIA, "", "Kyrgyzstan");
        Country australia = new Country(Region.OCEANIA, Continent.ASIA, "", "Australia");
        //FEATURED ASIA COUNTRY: Vietnam, Indoneisa, Japan, China, Kygryzstan, Austalia
        //South America
        Country brazil = new Country(Region.EAST_COAST, Continent.SOUTH_AMERICA, "", "Brazil");
        Country argentina = new Country(Region.EAST_COAST, Continent.SOUTH_AMERICA, "", "Argentina");
        Country colombia = new Country(Region.WEST_COAST, Continent.SOUTH_AMERICA, "", "Colombia");
        Country venezuela = new Country(Region.EAST_COAST, Continent.SOUTH_AMERICA, "", "Venezuela");
        Country peru = new Country(Region.WEST_COAST, Continent.SOUTH_AMERICA, "", "Peru");
        Country chile = new Country(Region.WEST_COAST, Continent.SOUTH_AMERICA, "", "Chile");
        Country ecuador = new Country(Region.WEST_COAST, Continent.SOUTH_AMERICA, "", "Ecuador");
        Country bolivia = new Country(Region.WEST_COAST, Continent.SOUTH_AMERICA, "", "Bolivia");
        Country paraguay = new Country(Region.WEST_COAST, Continent.SOUTH_AMERICA, "", "Paraguay");
        Country uruguay = new Country(Region.EAST_COAST, Continent.SOUTH_AMERICA, "", "Uruguay");
        // South America Featured: Brazil, Columbia
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
        Country poland = new Country(Region.EASTERN_EUROPE, Continent.EUROPE, "", "Poland");
        Country sweden = new Country(Region.SCANDINAVIA, Continent.EUROPE, "", "Sweden");
       // Featured Europe Countries: Turkey, Switzerland, Austria, Italy, Spain, France, Greece, Portugal

        //North America
        Country unitedStates = new Country(Region.NORTHERN_AMERICA, Continent.NORTH_AMERICA, "", "United States");
        Country mexico = new Country(Region.CENTRAL_AMERICA, Continent.NORTH_AMERICA, "", "Mexico");
        Country canada = new Country(Region.NORTHERN_AMERICA, Continent.NORTH_AMERICA, "", "Canada");
        Country dominicanRepublic = new Country(Region.CARIBBEAN, Continent.NORTH_AMERICA, "", "Dominican Republic");
        Country cuba = new Country(Region.CARIBBEAN, Continent.NORTH_AMERICA, "", "Cuba");
        Country costaRica = new Country(Region.CENTRAL_AMERICA, Continent.NORTH_AMERICA, "", "Costa Rica");
        Country panama = new Country(Region.CENTRAL_AMERICA, Continent.NORTH_AMERICA, "", "Panama");
        Country jamaica = new Country(Region.CARIBBEAN, Continent.NORTH_AMERICA, "", "Jamaica");
        Country bahamas = new Country(Region.CARIBBEAN, Continent.NORTH_AMERICA, "", "Bahamas");
        Country guatemala = new Country(Region.CENTRAL_AMERICA, Continent.NORTH_AMERICA, "", "Guatemala");
        Country honduras = new Country(Region.CENTRAL_AMERICA, Continent.NORTH_AMERICA, "", "Honduras");
        Country elSalvador = new Country(Region.CENTRAL_AMERICA, Continent.NORTH_AMERICA, "", "El Salvador");
        Country nicaragua = new Country(Region.CENTRAL_AMERICA, Continent.NORTH_AMERICA, "", "Nicaragua");
        Country haiti = new Country(Region.CARIBBEAN, Continent.NORTH_AMERICA, "", "Haiti");
        Country trinidadAndTobago = new Country(Region.CARIBBEAN, Continent.NORTH_AMERICA, "", "Trinidad and Tobago");
//        USA, Canada, Mexico, DR, Bahamahs

        countryRepository.save(unitedStates);
        countryRepository.save(mexico);
        countryRepository.save(canada);
        countryRepository.save(dominicanRepublic);
        countryRepository.save(cuba);
        countryRepository.save(costaRica);
        countryRepository.save(panama);
        countryRepository.save(jamaica);
        countryRepository.save(bahamas);
        countryRepository.save(guatemala);
        countryRepository.save(honduras);
        countryRepository.save(elSalvador);
        countryRepository.save(nicaragua);
        countryRepository.save(haiti);
        countryRepository.save(trinidadAndTobago);

        countryRepository.save(brazil);
        countryRepository.save(argentina);
        countryRepository.save(colombia);
        countryRepository.save(venezuela);
        countryRepository.save(peru);
        countryRepository.save(chile);
        countryRepository.save(ecuador);
        countryRepository.save(bolivia);
        countryRepository.save(paraguay);
        countryRepository.save(uruguay);

        countryRepository.save(china);
        countryRepository.save(india);
        countryRepository.save(japan);
        countryRepository.save(indonesia);
        countryRepository.save(pakistan);
        countryRepository.save(bangladesh);
        countryRepository.save(philippines);
        countryRepository.save(vietnam);
        countryRepository.save(iran);
        countryRepository.save(turkey);
        countryRepository.save(kyrgyzstan);
        countryRepository.save(australia);

        countryRepository.save(egypt);
        countryRepository.save(portugal);
        countryRepository.save(algeria);
        countryRepository.save(morocco);
        countryRepository.save(tunisia);
        countryRepository.save(libya);
        countryRepository.save(nigeria);
        countryRepository.save(ghana);
        countryRepository.save(ethiopia);
        countryRepository.save(kenya);
        countryRepository.save(southAfrica);
        countryRepository.save(tanzania);

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
        countryRepository.save(poland);
        countryRepository.save(sweden);

// CITIES

        // Top 5 cities in Egypt
        City cairo = new City("Cairo", egypt);
        City alexandria = new City("Alexandria", egypt);
        City giza = new City("Giza", egypt);
        City sharmElSheikh = new City("Sharm El Sheikh", egypt);
        City luxor = new City("Luxor", egypt);

        // Top 5 cities in Tanzania
        City darEsSalaam = new City("Dar es Salaam", tanzania);
        City arusha = new City("Arusha", tanzania);
        City zanzibarCity = new City("Zanzibar City", tanzania);
        City dodoma = new City("Dodoma", tanzania);
        City mbeya = new City("Mbeya", tanzania);

    // Top 5 cities in Algeria
        City algiers = new City("Algiers", algeria);
        City oran = new City("Oran", algeria);
        City constantine = new City("Constantine", algeria);
        City annaba = new City("Annaba", algeria);
        City batna = new City("Batna", algeria);

    // Top 5 cities in Kenya
        City nairobi = new City("Nairobi", kenya);
        City mombasa = new City("Mombasa", kenya);
        City kisumu = new City("Kisumu", kenya);
        City nakuru = new City("Nakuru", kenya);
        City eldoret = new City("Eldoret", kenya);

// Top 5 cities in South Africa
        City johannesburg = new City("Johannesburg", southAfrica);
        City capeTown = new City("Cape Town", southAfrica);
        City durban = new City("Durban", southAfrica);
        City pretoria = new City("Pretoria", southAfrica);
        City portElizabeth = new City("Port Elizabeth", southAfrica);

// Top 5 cities in Vietnam
        City hanoi = new City("Hanoi", vietnam);
        City hoChiMinhCity = new City("Ho Chi Minh City", vietnam);
        City daNang = new City("Da Nang", vietnam);
        City haiPhong = new City("Hai Phong", vietnam);
        City canTho = new City("Can Tho", vietnam);
        City hoiAn = new City("HoiAn", vietnam);
        City nhaTrang = new City ("nhaTrang", vietnam);

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
// Top 5 cities in Brazil
        City saoPaulo = new City("São Paulo", brazil);
        City rioDeJaneiro = new City("Rio de Janeiro", brazil);
        City brasilia = new City("Brasília", brazil);
        City salvador = new City("Salvador", brazil);
        City fortaleza = new City("Fortaleza", brazil);

// Top 5 cities in Colombia
        City bogota = new City("Bogotá", colombia);
        City medellin = new City("Medellín", colombia);
        City cali = new City("Cali", colombia);
        City barranquilla = new City("Barranquilla", colombia);
        City cartagena = new City("Cartagena", colombia);

// Top 5 cities in Turkey
        City istanbul = new City("Istanbul", turkey);
        City ankara = new City("Ankara", turkey);
        City izmir = new City("Izmir", turkey);
        City antalya = new City("Antalya", turkey);
        City bursa = new City("Bursa", turkey);

// Top 5 cities in Switzerland
        City zurich = new City("Zurich", switzerland);
        City geneva = new City("Geneva", switzerland);
        City basel = new City("Basel", switzerland);
        City bern = new City("Bern", switzerland);
        City lucerne = new City("Lucerne", switzerland);

// Top 5 cities in Austria
        City vienna = new City("Vienna", austria);
        City salzburg = new City("Salzburg", austria);
        City innsbruck = new City("Innsbruck", austria);
        City graz = new City("Graz", austria);
        City linz = new City("Linz", austria);

// Top 5 cities in Italy
        City rome = new City("Rome", italy);
        City milan = new City("Milan", italy);
        City venice = new City("Venice", italy);
        City florence = new City("Florence", italy);
        City naples = new City("Naples", italy);

// Top 5 cities in Spain
        City madrid = new City("Madrid", spain);
        City barcelona = new City("Barcelona", spain);
        City valencia = new City("Valencia", spain);
        City seville = new City("Seville", spain);
        City bilbao = new City("Bilbao", spain);

// Top 5 cities in France
        City paris = new City("Paris", france);
        City marseille = new City("Marseille", france);
        City lyon = new City("Lyon", france);
        City nice = new City("Nice", france);
        City toulouse = new City("Toulouse", france);

// Top 5 cities in Greece
        City athens = new City("Athens", greece);
        City thessaloniki = new City("Thessaloniki", greece);
        City heraklion = new City("Heraklion", greece);
        City rhodes = new City("Rhodes", greece);
        City chania = new City("Chania", greece);

// Top 5 cities in Portugal
        City lisbon = new City("Lisbon", portugal);
        City porto = new City("Porto", portugal);
        City faro = new City("Faro", portugal);
        City coimbra = new City("Coimbra", portugal);
        City braga = new City("Braga", portugal);

// Top 5 cities in the United States
        City newYork = new City("New York", unitedStates);
        City losAngeles = new City("Los Angeles", unitedStates);
        City chicago = new City("Chicago", unitedStates);
        City washingtonDC = new City("Washington, D.C.", unitedStates);
        City sanFrancisco = new City("San Francisco", unitedStates);

// Top 5 cities in Canada
        City toronto = new City("Toronto", canada);
        City montreal = new City("Montreal", canada);
        City vancouver = new City("Vancouver", canada);
        City calgary = new City("Calgary", canada);
        City ottawa = new City("Ottawa", canada);

// Top 5 cities in Mexico
        City mexicoCity = new City("Mexico City", mexico);
        City guadalajara = new City("Guadalajara", mexico);
        City monterrey = new City("Monterrey", mexico);
        City cancun = new City("Cancun", mexico);
        City tijuana = new City("Tijuana", mexico);

// Top 5 cities in the Dominican Republic
        City santoDomingo = new City("Santo Domingo", dominicanRepublic);
        City santiago = new City("Santiago", dominicanRepublic);
        City puertoPlata = new City("Puerto Plata", dominicanRepublic);
        City puntaCana = new City("Punta Cana", dominicanRepublic);


        cityRepository.save(cairo);
        cityRepository.save(alexandria);
        cityRepository.save(giza);
        cityRepository.save(sharmElSheikh);
        cityRepository.save(luxor);
// Save cities for Tanzania
        cityRepository.save(darEsSalaam);
        cityRepository.save(arusha);
        cityRepository.save(zanzibarCity);
        cityRepository.save(dodoma);
        cityRepository.save(mbeya);
// Save cities for Algeria
        cityRepository.save(algiers);
        cityRepository.save(oran);
        cityRepository.save(constantine);
        cityRepository.save(annaba);
        cityRepository.save(batna);
// Save cities for Kenya
        cityRepository.save(nairobi);
        cityRepository.save(mombasa);
        cityRepository.save(kisumu);
        cityRepository.save(nakuru);
        cityRepository.save(eldoret);
// Save cities for South Africa
        cityRepository.save(johannesburg);
        cityRepository.save(capeTown);
        cityRepository.save(durban);
        cityRepository.save(pretoria);
        cityRepository.save(portElizabeth);
// Continue saving cities for other countries...

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

// Save cities for Switzerland
        cityRepository.save(zurich);
        cityRepository.save(geneva);
        cityRepository.save(basel);
        cityRepository.save(bern);
        cityRepository.save(lucerne);

// Save cities for Austria
        cityRepository.save(vienna);
        cityRepository.save(salzburg);
        cityRepository.save(innsbruck);
        cityRepository.save(graz);
        cityRepository.save(linz);
// Save cities in Brazil
        cityRepository.save(saoPaulo);
        cityRepository.save(rioDeJaneiro);
        cityRepository.save(brasilia);
        cityRepository.save(salvador);
        cityRepository.save(fortaleza);
        // Save cities in Colombia
        cityRepository.save(bogota);
        cityRepository.save(medellin);
        cityRepository.save(cali);
        cityRepository.save(barranquilla);
        cityRepository.save(cartagena);

        // Save cities in Turkey
        cityRepository.save(istanbul);
        cityRepository.save(ankara);
        cityRepository.save(izmir);
        cityRepository.save(antalya);
        cityRepository.save(bursa);
// Save cities for Italy
        cityRepository.save(rome);
        cityRepository.save(milan);
        cityRepository.save(venice);
        cityRepository.save(florence);
        cityRepository.save(naples);

// Save cities for Spain
        cityRepository.save(madrid);
        cityRepository.save(barcelona);
        cityRepository.save(valencia);
        cityRepository.save(seville);
        cityRepository.save(bilbao);

// Save cities for France
        cityRepository.save(paris);
        cityRepository.save(marseille);
        cityRepository.save(lyon);
        cityRepository.save(nice);
        cityRepository.save(toulouse);

// Save cities for Greece
        cityRepository.save(athens);
        cityRepository.save(thessaloniki);
        cityRepository.save(heraklion);
        cityRepository.save(rhodes);
        cityRepository.save(chania);

// Save cities for Portugal
        cityRepository.save(lisbon);
        cityRepository.save(porto);
        cityRepository.save(faro);
        cityRepository.save(coimbra);
        cityRepository.save(braga);

// Continue saving cities for other countries...

// Save cities for the United States
        cityRepository.save(newYork);
        cityRepository.save(losAngeles);
        cityRepository.save(chicago);
        cityRepository.save(washingtonDC);
        cityRepository.save(sanFrancisco);

// Save cities for Canada
        cityRepository.save(toronto);
        cityRepository.save(montreal);
        cityRepository.save(vancouver);
        cityRepository.save(calgary);
        cityRepository.save(ottawa);

// Save cities for Mexico
        cityRepository.save(mexicoCity);
        cityRepository.save(guadalajara);
        cityRepository.save(monterrey);
        cityRepository.save(cancun);
        cityRepository.save(tijuana);

// Save cities for the Dominican Republic
        cityRepository.save(santoDomingo);
        cityRepository.save(santiago);
        cityRepository.save(puertoPlata);
        cityRepository.save(puntaCana);

        // Top 5 attractions in Cairo
        Attraction pyramidsOfGiza = new Attraction("The Pyramids of Giza", cairo, "One of the Seven Wonders of the Ancient World", "");
        Attraction egyptianMuseum = new Attraction("Egyptian Museum", cairo, "Home to a vast collection of ancient Egyptian artifacts", "");
        Attraction khanElKhalili = new Attraction("Khan El-Khalili", cairo, "A historic souq (market) known for its vibrant atmosphere and diverse range of goods", "");
        Attraction salahElDinCitadel = new Attraction("Salah El-Din Citadel", cairo, "A medieval Islamic fortification with panoramic views of the city", "");
        Attraction copticCairo = new Attraction("Coptic Cairo", cairo, "An ancient area showcasing Egypt's Christian heritage with churches and monuments", "");

// Top 5 attractions in Alexandria
        Attraction bibliothecaAlexandrina = new Attraction("Bibliotheca Alexandrina", alexandria, "A modern library and cultural center built to commemorate the ancient Library of Alexandria", "");
        Attraction catacombsOfKomElShoqafa = new Attraction("Catacombs of Kom el Shoqafa", alexandria, "An ancient burial site featuring catacombs, sculptures, and tombs", "");
        Attraction qaitbayCitadel = new Attraction("Qaitbay Citadel", alexandria, "A 15th-century fortress built on the site of the ancient Lighthouse of Alexandria", "");
        Attraction corniche = new Attraction("Corniche", alexandria, "A scenic waterfront promenade offering beautiful views of the Mediterranean Sea", "");
        Attraction montazahPalaceGardens = new Attraction("Montazah Palace Gardens", alexandria, "A lush royal park featuring a palace, beaches, and beautiful gardens", "");

// Top 5 attractions in Giza
        Attraction sphinx = new Attraction("The Great Sphinx of Giza", giza, "An iconic ancient statue with the body of a lion and the head of a human", "");
        Attraction saqqara = new Attraction("Saqqara", giza, "An ancient burial ground featuring the Step Pyramid of Djoser, one of the oldest stone structures in the world", "");
        Attraction memphis = new Attraction("Memphis", giza, "The ancient capital of Egypt, showcasing ruins and artifacts from the Old Kingdom", "");
        Attraction gizaPyramidsSoundAndLightShow = new Attraction("Giza Pyramids Sound and Light Show", giza, "An immersive audiovisual experience that brings the history of the pyramids to life at night", "");
        Attraction alHaramMosque = new Attraction("Al-Haram Mosque", giza, "A historic mosque located near the Giza Pyramids, known for its intricate Islamic architecture", "");

// Top 5 attractions in Sharm El Sheikh
        Attraction rasMohammedNationalPark = new Attraction("Ras Mohammed National Park", sharmElSheikh, "A protected area known for its vibrant coral reefs, marine life, and diving opportunities", "");
        Attraction naamaBay = new Attraction("Naama Bay", sharmElSheikh, "A popular resort area with beaches, restaurants, and shops", "");
        Attraction sohoSquare = new Attraction("SOHO Square", sharmElSheikh, "An entertainment complex offering restaurants, shops, and nightlife", "");
        Attraction tiranIsland = new Attraction("Tiran Island", sharmElSheikh, "A picturesque island known for its clear waters and snorkeling spots", "");
        Attraction sharkBay = new Attraction("Shark Bay", sharmElSheikh, "A bay renowned for its coral reefs and opportunities to spot marine life, including sharks", "");

        attractionRepository.save(pyramidsOfGiza);
        attractionRepository.save(egyptianMuseum);
        attractionRepository.save(khanElKhalili);
        attractionRepository.save(salahElDinCitadel);
        attractionRepository.save(copticCairo);
// Save attractions for Alexandria
        attractionRepository.save(bibliothecaAlexandrina);
        attractionRepository.save(catacombsOfKomElShoqafa);
        attractionRepository.save(qaitbayCitadel);
        attractionRepository.save(corniche);
        attractionRepository.save(montazahPalaceGardens);
// Save attractions for Giza
        attractionRepository.save(sphinx);
        attractionRepository.save(saqqara);
        attractionRepository.save(memphis);
        attractionRepository.save(gizaPyramidsSoundAndLightShow);
        attractionRepository.save(alHaramMosque);
// Save attractions for Sharm El Sheikh
        attractionRepository.save(rasMohammedNationalPark);
        attractionRepository.save(naamaBay);
        attractionRepository.save(sohoSquare);
        attractionRepository.save(tiranIsland);
        attractionRepository.save(sharkBay);

        // Top 5 attractions in Dar es Salaam
        Attraction nationalMuseumOfTanzania = new Attraction("National Museum of Tanzania", darEsSalaam, "The National Museum of Tanzania is a multi-disciplinary institution dedicated to documenting and preserving Tanzania's rich cultural and natural heritage. Located in Dar es Salaam, the museum houses a vast collection of artifacts, including archaeological finds, ethnographic objects, and biological specimens. Visitors can explore exhibits on Tanzania's history, culture, and biodiversity, providing insights into the country's diverse communities and ecosystems.", "");
        Attraction villageMuseum = new Attraction("Village Museum", darEsSalaam, "The Village Museum is an open-air museum in Dar es Salaam that offers visitors a unique opportunity to experience the traditional cultures and lifestyles of Tanzania's various ethnic groups. Spread across several acres of landscaped grounds, the museum features replica traditional dwellings, artifacts, and demonstrations of traditional crafts and activities. Visitors can immerse themselves in the rich cultural heritage of Tanzania and gain a deeper understanding of its diverse communities.", "");
        Attraction kivukoniFishMarket = new Attraction("Kivukoni Fish Market", darEsSalaam, "The Kivukoni Fish Market is a bustling market located on the waterfront in Dar es Salaam. It is one of the largest fish markets in Tanzania, where fishermen bring in their daily catches to sell to local buyers and seafood vendors. Visitors to the market can experience the vibrant atmosphere of a traditional African fish market, with rows of stalls displaying a wide variety of fresh seafood, including fish, shellfish, and crustaceans.", "");
        Attraction askariMonument = new Attraction("Askari Monument", darEsSalaam, "The Askari Monument is a historical landmark located in the heart of Dar es Salaam. Erected in 1927, the monument commemorates Tanzanian soldiers who fought in World War I as part of the British colonial forces. The centerpiece of the monument is a bronze statue of an Askari soldier, standing at attention and holding a rifle. Surrounding the statue are plaques inscribed with the names of Tanzanian soldiers who served in the war. The Askari Monument is a symbol of Tanzania's military history and its contribution to the Allied cause during the Great War.", "");
        Attraction botanicalGardens = new Attraction("Botanical Gardens", darEsSalaam, "The Botanical Gardens in Dar es Salaam is a serene oasis amidst the bustling city. Established in the late 19th century, the gardens showcase a diverse collection of plants and trees from Tanzania and around the world. Visitors can stroll along winding pathways, explore themed gardens, and relax in shaded groves. The gardens also serve as a research and education center, providing valuable resources for botanists, horticulturists, and nature enthusiasts alike.", "");

// Save attractions for Dar es Salaam
        attractionRepository.save(nationalMuseumOfTanzania);
        attractionRepository.save(villageMuseum);
        attractionRepository.save(kivukoniFishMarket);
        attractionRepository.save(askariMonument);
        attractionRepository.save(botanicalGardens);

// Top 5 attractions in Arusha
        Attraction serengetiNationalPark = new Attraction("Serengeti National Park", arusha, "Serengeti National Park is one of Africa's most iconic wildlife destinations, renowned for its vast savannahs, diverse ecosystems, and spectacular wildlife sightings. Located in northern Tanzania, the park is home to the annual Great Migration, where millions of wildebeest, zebras, and other herbivores migrate in search of fresh grazing lands. Visitors to Serengeti National Park can embark on thrilling game drives, hot air balloon safaris, and guided walking tours, offering opportunities to witness the Big Five and other iconic African species in their natural habitat.", "");
        Attraction ngorongoroCrater = new Attraction("Ngorongoro Crater", arusha, "Ngorongoro Crater is a UNESCO World Heritage Site and one of Africa's most breathtaking natural wonders. Formed by the collapse of an ancient volcano, the crater is home to an extraordinary concentration of wildlife, including lions, elephants, rhinos, and hippos. Visitors to Ngorongoro Crater can descend into the crater floor on guided safaris, where they can witness the abundance of wildlife up close and admire the stunning landscapes of the crater rim.", "");
        Attraction mountKilimanjaro = new Attraction("Mount Kilimanjaro", arusha, "Mount Kilimanjaro is Africa's highest peak and one of the world's most iconic mountains. Located in northern Tanzania, the mountain rises to a height of 5,895 meters (19,341 feet) above sea level, towering over the surrounding plains and savannahs. Kilimanjaro is a popular destination for trekkers and climbers from around the world, offering a range of routes and experiences for adventurers of all levels. The climb to the summit is a challenging but rewarding journey, culminating in awe-inspiring views of the African continent below.", "");
        Attraction tarangireNationalPark = new Attraction("Tarangire National Park", arusha, "Tarangire National Park is a scenic wilderness area located in northern Tanzania, known for its large elephant herds, ancient baobab trees, and diverse birdlife. The park is named after the Tarangire River, which flows through its plains and provides a vital water source for wildlife during the dry season. Visitors to Tarangire can enjoy game drives, guided walking safaris, and birdwatching excursions, offering opportunities to spot lions, leopards, giraffes, and more against the backdrop of stunning landscapes.", "");
        Attraction lakeManyaraNationalPark = new Attraction("Lake Manyara National Park", arusha, "Lake Manyara National Park is a picturesque wilderness area nestled at the base of the Great Rift Valley escarpment in northern Tanzania. The park is renowned for its tree-climbing lions, abundant birdlife, and stunning landscapes, including the alkaline Lake Manyara itself. Visitors to Lake Manyara can enjoy game drives, birdwatching tours, and guided walking safaris, offering opportunities to explore the park's diverse habitats and encounter a wide variety of wildlife species.", "");

// Save attractions for Arusha
        attractionRepository.save(serengetiNationalPark);
        attractionRepository.save(ngorongoroCrater);
        attractionRepository.save(mountKilimanjaro);
        attractionRepository.save(tarangireNationalPark);
        attractionRepository.save(lakeManyaraNationalPark);

// Top 5 attractions in Zanzibar City
        Attraction stoneTown = new Attraction("Stone Town", zanzibarCity, "Stone Town is the historic heart of Zanzibar City and a UNESCO World Heritage Site, renowned for its labyrinthine alleys, ancient buildings, and rich cultural heritage. The town's architecture reflects a blend of African, Arab, Indian, and European influences, with ornate doorways, intricately carved balconies, and bustling markets. Visitors to Stone Town can explore its narrow streets, visit historic sites such as the Sultan's Palace and Old Fort, and immerse themselves in the vibrant sights, sounds, and flavors of this enchanting destination.", "");
        Attraction spiceTour = new Attraction("Spice Tour", zanzibarCity, "The Spice Tour is a popular excursion on the island of Zanzibar, offering visitors the opportunity to explore the island's rich spice heritage and learn about its history as a major spice trading hub. Led by knowledgeable guides, the tour takes visitors to local spice plantations, where they can see, smell, and taste a variety of spices and tropical fruits, including cloves, cinnamon, vanilla, and nutmeg. Along the way, visitors can learn about the cultivation and processing of spices and their cultural significance in Zanzibari cuisine and daily life.", "");
        Attraction prisonIsland = new Attraction("Prison Island", zanzibarCity, "Prison Island, also known as Changuu Island, is a small island located just off the coast of Zanzibar City. The island is home to a historic prison complex, built in the late 19th century to house rebellious slaves. Today, Prison Island is a popular tourist destination known for its beautiful beaches, crystal-clear waters, and giant tortoise sanctuary. Visitors to the island can explore the ruins of the old prison, relax on the beach, and interact with the friendly resident tortoises, some of which are over a century old.", "");
        Attraction nakupendaBeach = new Attraction("Nakupenda Beach", zanzibarCity, "Nakupenda Beach is a pristine stretch of coastline located on the northern tip of Zanzibar Island, known for its powdery white sand and crystal-clear turquoise waters. The beach is a popular destination for sunbathing, swimming, and water sports, offering tranquil surroundings and breathtaking views of the Indian Ocean. Visitors to Nakupenda Beach can relax on the sand, take a dip in the warm waters, and enjoy a variety of activities such as snorkeling, kayaking, and beach volleyball.", "");
        Attraction forodhaniGardens = new Attraction("Forodhani Gardens", zanzibarCity, "Forodhani Gardens is a waterfront park located in the heart of Stone Town, Zanzibar City. The park is famous for its evening food market, where local vendors set up stalls to sell a variety of traditional Zanzibari dishes and street food delicacies. Visitors to Forodhani Gardens can sample fresh seafood, grilled meats, samosas, and other delicious snacks, while enjoying live music and entertainment. The park also offers beautiful views of the sunset over the Indian Ocean, making it a popular spot for locals and tourists alike.", "");

// Save attractions for Zanzibar City
        attractionRepository.save(stoneTown);
        attractionRepository.save(spiceTour);
        attractionRepository.save(prisonIsland);
        attractionRepository.save(nakupendaBeach);
        attractionRepository.save(forodhaniGardens);

        // Top 5 attractions in Dodoma
        Attraction kisasaHill = new Attraction("Kisasa Hill", dodoma, "Kisasa Hill is a scenic viewpoint located on the outskirts of Dodoma, offering panoramic views of the city and surrounding countryside. Visitors can hike to the top of the hill to enjoy breathtaking vistas of the rolling hills, plains, and distant mountains, making it a popular spot for picnics, photography, and outdoor recreation.", "");
        Attraction dodomaCathedral = new Attraction("Dodoma Cathedral", dodoma, "Dodoma Cathedral, also known as St. John's University Cathedral, is a prominent landmark in the heart of Dodoma. The cathedral is known for its distinctive architecture, featuring a striking bell tower and stained glass windows. Visitors can attend religious services, admire the cathedral's interior decor, and learn about its history and significance as a place of worship in the region.", "");
        Attraction nyalugusuFalls = new Attraction("Nyalugusu Falls", dodoma, "Nyalugusu Falls is a series of picturesque waterfalls located near Dodoma, amidst the scenic landscapes of the Tanzanian highlands. The falls are fed by mountain streams and cascades over rocky cliffs into crystal-clear pools below, creating a tranquil oasis in the wilderness. Visitors can hike to the falls, swim in the refreshing waters, and enjoy a picnic amidst the natural beauty of the surroundings.", "");
        Attraction kikuyuBotanicalGarden = new Attraction("Kikuyu Botanical Garden", dodoma, "Kikuyu Botanical Garden is a peaceful retreat located in Dodoma, featuring a diverse collection of plants, flowers, and trees from Tanzania and around the world. Visitors can wander through landscaped gardens, stroll along shaded pathways, and relax in tranquil settings. The garden also serves as an educational resource, offering guided tours, workshops, and events on topics such as botany, horticulture, and conservation.", "");
        Attraction matambweHotSprings = new Attraction("Matambwe Hot Springs", dodoma, "Matambwe Hot Springs is a natural thermal spring located in the Dodoma region, known for its therapeutic properties and healing waters. The springs emerge from underground sources and flow into shallow pools, where visitors can soak and relax in warm, mineral-rich waters. The springs are surrounded by lush vegetation and offer a serene setting for rejuvenation and wellness.", "");

// Save attractions for Dodoma
        attractionRepository.save(kisasaHill);
        attractionRepository.save(dodomaCathedral);
        attractionRepository.save(nyalugusuFalls);
        attractionRepository.save(kikuyuBotanicalGarden);
        attractionRepository.save(matambweHotSprings);

// Top 5 attractions in Mbeya
        Attraction kituloPlateauNationalPark = new Attraction("Kitulo Plateau National Park", mbeya, "Kitulo Plateau National Park, also known as the 'Serengeti of Flowers', is a protected area located in the Southern Highlands of Tanzania. The park is renowned for its stunning display of wildflowers, which bloom in abundance during the rainy season, covering the plateau in a carpet of vibrant colors. Visitors to Kitulo Plateau can enjoy hiking trails, birdwatching, and photography, with opportunities to spot rare and endemic species of flora and fauna amidst breathtaking landscapes.", "");
        Attraction mbeyaPeak = new Attraction("Mbeya Peak", mbeya, "Mbeya Peak is the highest point in the Mbeya Range, located in southwestern Tanzania near the border with Zambia. The peak offers spectacular views of the surrounding valleys, mountains, and plains, with opportunities for hiking, climbing, and adventure. Visitors can embark on guided treks to the summit, traversing rugged terrain and encountering diverse ecosystems along the way.", "");
        Attraction lushotoDistrict = new Attraction("Lushoto District", mbeya, "Lushoto District is a scenic region in the Mbeya Highlands, known for its lush green hills, fertile valleys, and cool climate. The district is dotted with picturesque villages, tea plantations, and fruit orchards, offering opportunities for hiking, birdwatching, and cultural immersion. Visitors to Lushoto can explore the area's natural beauty, visit local markets and craft shops, and interact with the friendly residents, known for their hospitality and warmth.", "");
        Attraction mdimuWaterfall = new Attraction("Mdimu Waterfall", mbeya, "Mdimu Waterfall is a hidden gem tucked away in the Mbeya Highlands, surrounded by lush vegetation and pristine wilderness. The waterfall cascades over rocky cliffs into a tranquil pool below, creating a picturesque oasis in the heart of nature. Visitors can hike to the waterfall, swim in the refreshing waters, and enjoy a picnic amidst the serene surroundings, making it a perfect escape from the hustle and bustle of city life.", "");
        Attraction kiwiraRiver = new Attraction("Kiwira River", mbeya, "Kiwira River is a scenic waterway flowing through the Mbeya Region of Tanzania, known for its crystal-clear waters, rocky rapids, and lush riverbanks. The river offers opportunities for fishing, kayaking, and river rafting, with abundant fish species and pristine natural habitats to explore. Visitors can embark on guided river trips, camping adventures, and eco-tours, immersing themselves in the beauty and tranquility of the Kiwira River.", "");

// Save attractions for Mbeya
        attractionRepository.save(kituloPlateauNationalPark);
        attractionRepository.save(mbeyaPeak);
        attractionRepository.save(lushotoDistrict);
        attractionRepository.save(mdimuWaterfall);
        attractionRepository.save(kiwiraRiver);
        // Top 5 attractions in Algiers
        Attraction casbahOfAlgiers = new Attraction("Casbah of Algiers", algiers, "The Casbah of Algiers is a UNESCO World Heritage Site and one of the oldest neighborhoods in the city. Dating back to the 17th century, the Casbah is a maze of narrow streets, alleys, and traditional houses, reflecting centuries of Algerian history and culture. Visitors can explore its winding pathways, visit historic landmarks such as the Ketchaoua Mosque and the Palace of the Dey, and immerse themselves in the vibrant atmosphere of this ancient quarter.", "");
        Attraction notreDameDafrique = new Attraction("Notre-Dame d'Afrique", algiers, "Notre-Dame d'Afrique is a Roman Catholic basilica located on the heights of Algiers, offering panoramic views of the city and the Mediterranean Sea. Built in the 19th century, the basilica is known for its striking Neo-Byzantine architecture, with a white facade, domed roof, and intricate mosaics. Visitors can admire its ornate interior, climb to the top of its bell tower for sweeping vistas, and explore the surrounding gardens and shrines.", "");
        Attraction jardinDEssaiDuHamma = new Attraction("Jardin d'Essai du Hamma", algiers, "The Jardin d'Essai du Hamma is a historic botanical garden located in Algiers, renowned for its diverse collection of plant species from around the world. Established in the 19th century, the garden features lush greenery, ornamental fountains, and winding pathways, providing a peaceful oasis in the heart of the city. Visitors can stroll through its themed gardens, enjoy picnics on its lawns, and discover rare and exotic plants from across the globe.", "");
        Attraction bastion23 = new Attraction("Bastion 23", algiers, "Bastion 23 is a historic fortress located on the waterfront of Algiers, overlooking the Bay of Algiers and the Kasbah. Built during the French colonial period, the bastion served as a defensive stronghold and military barracks. Today, it is a popular tourist attraction and cultural venue, hosting art exhibitions, concerts, and events. Visitors can explore its ramparts, visit its museums and galleries, and enjoy stunning views of the city and the sea.", "");
        Attraction museumOfModernArtOfAlgiers = new Attraction("Museum of Modern Art of Algiers", algiers, "The Museum of Modern Art of Algiers is a contemporary art museum located in the heart of the city, showcasing a diverse collection of modern and contemporary artworks by Algerian and international artists. Housed in a renovated historic building, the museum features rotating exhibitions, permanent collections, and educational programs, providing a platform for artistic expression and cultural exchange. Visitors can explore its galleries, attend lectures and workshops, and engage with cutting-edge contemporary art from Algeria and beyond.", "");

// Save attractions for Algiers
        attractionRepository.save(casbahOfAlgiers);
        attractionRepository.save(notreDameDafrique);
        attractionRepository.save(jardinDEssaiDuHamma);
        attractionRepository.save(bastion23);
        attractionRepository.save(museumOfModernArtOfAlgiers);

// Top 5 attractions in Oran
        Attraction leTheatreRegionalDEnnahli = new Attraction("Le Theatre Regional d'Ennahli", oran, "Le Theatre Regional d'Ennahli is a cultural landmark and performing arts venue located in Oran, known for its vibrant theatrical productions, musical performances, and dance recitals. The theater showcases a variety of artistic genres, including drama, comedy, opera, and ballet, attracting audiences from across Algeria and beyond. Visitors can attend live performances, participate in workshops, and experience the rich cultural heritage of Oran and its artistic community.", "");
        Attraction cathedraleDuSacredCoeur = new Attraction("Cathedrale du Sacre-Coeur", oran, "The Cathedrale du Sacre-Coeur is a Roman Catholic cathedral located in the heart of Oran, known for its magnificent Neo-Gothic architecture and historical significance. Built in the late 19th century, the cathedral features soaring arches, stained glass windows, and ornate decorations, making it a striking symbol of faith and spirituality. Visitors can admire its interior beauty, attend religious services, and learn about its role in the religious and cultural life of Oran.", "");
        Attraction laGrandeMosqueeDOran = new Attraction("La Grande Mosquee d'Oran", oran, "La Grande Mosquee d'Oran is a historic mosque located in the center of Oran, renowned for its elegant Islamic architecture and cultural importance. Originally built in the 18th century, the mosque has undergone several renovations and expansions over the centuries, reflecting various architectural styles and influences. Visitors can explore its prayer halls, courtyards, and minarets, and experience the spiritual ambiance of this sacred place of worship.", "");
        Attraction palaisDeLaCultureAhmedZabana = new Attraction("Palais de la Culture Ahmed Zabana", oran, "The Palais de la Culture Ahmed Zabana is a cultural complex and event venue located in Oran, dedicated to promoting arts, culture, and education in the region. Named after a prominent Algerian freedom fighter, the palace hosts a wide range of cultural activities, including concerts, theater productions, art exhibitions, and film screenings. Visitors can attend performances, participate in workshops, and engage with the vibrant cultural scene of Oran and its diverse artistic community.", "");
        Attraction parcDattractionsDeTlemcen = new Attraction("Parc d'Attractions de Tlemcen", oran, "The Parc d'Attractions de Tlemcen is a family-friendly amusement park located in the outskirts of Oran, offering a variety of rides, games, and entertainment for visitors of all ages. The park features thrilling roller coasters, carousels, bumper cars, and water slides, as well as arcade games, snack bars, and picnic areas. Visitors can enjoy a fun-filled day of excitement and adventure, making memories with family and friends amidst the scenic surroundings of Tlemcen Park.", "");

// Save attractions for Oran
        attractionRepository.save(leTheatreRegionalDEnnahli);
        attractionRepository.save(cathedraleDuSacredCoeur);
        attractionRepository.save(laGrandeMosqueeDOran);
        attractionRepository.save(palaisDeLaCultureAhmedZabana);
        attractionRepository.save(parcDattractionsDeTlemcen);

// Top 5 attractions in Constantine
        Attraction vieuxPontSuspendu = new Attraction("Vieux Pont Suspendu", constantine, "The Vieux Pont Suspendu, or Old Suspension Bridge, is a historic bridge spanning the Rhumel Gorge in Constantine. Built in the 19th century, the bridge is an iconic landmark of the city, offering panoramic views of the gorge, the river below, and the surrounding cliffs. Visitors can walk across the bridge, admire its ironwork structure, and capture breathtaking photographs of Constantine's dramatic natural scenery.", "");
        Attraction palaisDahmedBey = new Attraction("Palais d'Ahmed Bey", constantine, "The Palais d'Ahmed Bey is a historic palace located in the heart of Constantine, known for its elegant Ottoman architecture and cultural significance. Built in the 19th century by the Ottoman governor Ahmed Bey, the palace served as a residence for local rulers and government officials. Today, it houses the Museum of Cirta, showcasing archaeological artifacts, historical documents, and works of art related to the history of Constantine and the surrounding region.", "");
        Attraction museeDuCaidAllouache = new Attraction("Musee du Caid Allouache", constantine, "The Musee du Caid Allouache is a cultural museum located in a historic mansion in Constantine, dedicated to preserving and promoting the cultural heritage of the city and its diverse communities. The museum features exhibits on local history, traditional crafts, and contemporary art, highlighting the contributions of the region's Berber, Arab, and French influences. Visitors can explore the museum's galleries, attend lectures and events, and learn about the rich cultural tapestry of Constantine and its people.", "");
        Attraction parcDattractionsDeDjebelElWard = new Attraction("Parc d'Attractions de Djebel el Ward", constantine, "Parc d'Attractions de Djebel el Ward is a family-friendly amusement park located in the outskirts of Constantine, offering a wide range of rides, games, and activities for visitors of all ages. The park features thrilling roller coasters, water slides, and carnival games, as well as picnic areas and food stalls. Visitors can enjoy a day of fun and excitement amidst the scenic landscapes of Djebel el Ward, making memories with family and friends.", "");
        Attraction museeNationalDeCirta = new Attraction("Musee National de Cirta", constantine, "The Musee National de Cirta is an archaeological museum located in Constantine, dedicated to the preservation and interpretation of the region's rich history and cultural heritage. The museum features a diverse collection of artifacts, including ancient Roman sculptures, Byzantine mosaics, and Islamic ceramics, spanning over two millennia of history. Visitors can explore the museum's galleries, learn about the civilizations that have inhabited Constantine, and gain insight into the city's role as a crossroads of cultures and civilizations.", "");

// Save attractions for Constantine
        attractionRepository.save(vieuxPontSuspendu);
        attractionRepository.save(palaisDahmedBey);
        attractionRepository.save(museeDuCaidAllouache);
        attractionRepository.save(parcDattractionsDeDjebelElWard);
        attractionRepository.save(museeNationalDeCirta);
// Top 5 attractions in Nairobi
        Attraction nairobiNationalPark = new Attraction("Nairobi National Park", nairobi, "Nairobi National Park is a unique wildlife reserve located just outside the bustling city of Nairobi. It offers visitors the opportunity to see a wide variety of wildlife, including lions, giraffes, zebras, and rhinos, against the backdrop of the city skyline. The park also features picnic areas, walking trails, and guided safari tours, providing an unforgettable wildlife experience within easy reach of the capital.", "");
        Attraction davidSheldrickWildlifeTrust = new Attraction("David Sheldrick Wildlife Trust", nairobi, "The David Sheldrick Wildlife Trust is an elephant orphanage and rehabilitation center located in Nairobi. It is dedicated to the rescue and care of orphaned elephant calves, many of whom have been orphaned due to poaching or human-wildlife conflict. Visitors to the trust can observe the elephants during their feeding and playtime, learn about the conservation efforts to protect them, and even adopt an elephant to support their ongoing care and rehabilitation.", "");
        Attraction giraffeCentre = new Attraction("Giraffe Centre", nairobi, "The Giraffe Centre is a conservation and education center focused on the endangered Rothschild's giraffe, located in the suburb of Lang'ata in Nairobi. Visitors can enjoy up-close encounters with these graceful creatures, feed them from a raised platform, and learn about giraffe conservation efforts in Kenya. The center also offers guided nature walks, birdwatching, and educational programs for visitors of all ages.", "");
        Attraction karenBlixenMuseum = new Attraction("Karen Blixen Museum", nairobi, "The Karen Blixen Museum is located in the former home of Danish author Karen Blixen, best known for her memoir 'Out of Africa'. The museum showcases the life and work of Blixen, as well as the colonial history of Kenya during the early 20th century. Visitors can explore the beautifully preserved farmhouse, stroll through the lush gardens, and learn about Blixen's contributions to literature and cultural heritage.", "");
        Attraction nairobiNationalMuseum = new Attraction("Nairobi National Museum", nairobi, "The Nairobi National Museum is a cultural institution dedicated to the preservation and promotion of Kenya's rich cultural and natural heritage. The museum features exhibits on archaeology, ethnography, paleontology, and natural history, showcasing artifacts, artworks, and specimens from across the country. Visitors can explore the museum's galleries, attend lectures and events, and gain insight into the diverse cultures, ecosystems, and history of Kenya.", "");

// Save attractions for Nairobi
        attractionRepository.save(nairobiNationalPark);
        attractionRepository.save(davidSheldrickWildlifeTrust);
        attractionRepository.save(giraffeCentre);
        attractionRepository.save(karenBlixenMuseum);
        attractionRepository.save(nairobiNationalMuseum);

// Top 5 attractions in Mombasa
        Attraction hallerpark = new Attraction("Haller Park", mombasa, "Haller Park is a nature reserve and wildlife sanctuary located in Mombasa, dedicated to conservation and environmental education. The park was created from a disused limestone quarry and has been transformed into a lush green oasis, home to a variety of plant and animal species. Visitors can take guided nature walks, explore the botanical gardens, and see wildlife such as giraffes, zebras, and hippos up close. The park also features picnic areas, playgrounds, and a reptile house.", "");
        Attraction oldTown = new Attraction("Old Town", mombasa, "Old Town is the historic heart of Mombasa, characterized by its narrow streets, ancient buildings, and vibrant markets. It is one of the oldest and best-preserved Swahili settlements on the East African coast, with a rich cultural heritage influenced by Arab, Persian, Indian, and European traders. Visitors can wander through the maze-like alleyways, admire the ornate architecture of the old buildings, and explore attractions such as the Swahili House Museum and the Old Dhow Harbour.", "");
        Attraction mombasaMarineNationalPark = new Attraction("Mombasa Marine National Park", mombasa, "Mombasa Marine National Park is a protected marine reserve located off the coast of Mombasa, renowned for its coral reefs, mangrove forests, and diverse marine life. The park encompasses a network of coral reefs, seagrass beds, and coral islands, providing habitats for a wide variety of fish, marine mammals, and invertebrates. Visitors can enjoy snorkeling, diving, and boat trips to explore the underwater wonders of the park, and see colorful coral gardens, tropical fish, and other marine creatures in their natural environment.", "");
        Attraction dianiBeach = new Attraction("Diani Beach", mombasa, "Diani Beach is a picturesque stretch of coastline located south of Mombasa, renowned for its pristine white sands, clear turquoise waters, and swaying palm trees. It is one of Kenya's most popular beach destinations, offering a wide range of water sports, beach activities, and relaxation options for visitors. Whether you're looking to soak up the sun, go snorkeling or diving on the coral reefs, or simply enjoy a leisurely stroll along the shore, Diani Beach has something for everyone to enjoy.", "");

// Save attractions for Mombasa
        attractionRepository.save(hallerpark);
        attractionRepository.save(oldTown);
        attractionRepository.save(mombasaMarineNationalPark);
        attractionRepository.save(dianiBeach);
// Top 5 attractions in Cape Town
        Attraction tableMountain = new Attraction("Table Mountain", capeTown, "Table Mountain is a prominent landmark and natural icon overlooking the city of Cape Town. It is one of the New7Wonders of Nature and a UNESCO World Heritage Site, renowned for its flat-topped summit, stunning panoramic views, and diverse flora and fauna. Visitors can hike or take a cable car to the top of the mountain, explore its scenic trails, and enjoy breathtaking vistas of the city, coastline, and surrounding mountains.", "");
        Attraction robbenIsland = new Attraction("Robben Island", capeTown, "Robben Island is a historic island located off the coast of Cape Town, known for its role as a political prison during the apartheid era. It was here that Nelson Mandela and other anti-apartheid activists were imprisoned for their efforts to bring an end to racial segregation in South Africa. Today, Robben Island is a UNESCO World Heritage Site and museum, offering guided tours that provide insight into the island's history, the struggles of its inmates, and the legacy of apartheid.", "");
        Attraction victoriaAndAlfredWaterfront = new Attraction("Victoria & Alfred Waterfront", capeTown, "The Victoria & Alfred Waterfront is a vibrant shopping, dining, and entertainment district located in the heart of Cape Town's harbor. It features a diverse array of shops, restaurants, cafes, and attractions, including the Two Oceans Aquarium, the Zeitz Museum of Contemporary Art Africa, and the historic Clock Tower. Visitors can enjoy harbor cruises, live music performances, and cultural events, as well as stunning views of Table Mountain and the surrounding waterfront.", "");
        Attraction kirstenboschNationalBotanicalGarden = new Attraction("Kirstenbosch National Botanical Garden", capeTown, "Kirstenbosch National Botanical Garden is a beautiful botanical garden located at the eastern foot of Table Mountain in Cape Town. It is renowned for its diverse collection of indigenous plants, including fynbos, proteas, and cycads, as well as its stunning natural landscapes and scenic hiking trails. Visitors can explore the garden's themed gardens, enjoy picnics on the lawns, and attend concerts and events at the Kirstenbosch Summer Concerts series.", "");
        Attraction capePoint = new Attraction("Cape Point", capeTown, "Cape Point is a scenic promontory located at the southwestern tip of the Cape Peninsula, within the Table Mountain National Park. It is known for its dramatic sea cliffs, rugged coastline, and breathtaking ocean views, as well as its diverse wildlife and natural beauty. Visitors can hike or take a funicular tram to the top of the promontory, explore its historic lighthouse and viewpoints, and enjoy activities such as whale watching, birdwatching, and nature walks.", "");

// Save attractions for Cape Town
        attractionRepository.save(tableMountain);
        attractionRepository.save(robbenIsland);
        attractionRepository.save(victoriaAndAlfredWaterfront);
        attractionRepository.save(kirstenboschNationalBotanicalGarden);
        attractionRepository.save(capePoint);

// Top 5 attractions in Johannesburg
        Attraction apartheidMuseum = new Attraction("Apartheid Museum", johannesburg, "The Apartheid Museum is a museum dedicated to documenting the history of apartheid and the struggle for freedom and democracy in South Africa. Located in Johannesburg, it features a series of permanent and temporary exhibits that provide insight into the apartheid era, the lives of its victims, and the heroes who fought against it. Visitors can explore the museum's multimedia displays, artifacts, and interactive exhibits, and gain a deeper understanding of South Africa's complex past and ongoing journey towards reconciliation.", "");
        Attraction cradleOfHumankind = new Attraction("Cradle of Humankind", johannesburg, "The Cradle of Humankind is a UNESCO World Heritage Site located just outside of Johannesburg, renowned for its rich fossil record and archaeological significance. It is one of the world's most important paleoanthropological sites, containing a wealth of fossilized hominid remains dating back millions of years. Visitors can explore the visitor centers, tour the fossil sites and caves, and learn about the origins of humanity and the evolution of life on Earth.", "");
        Attraction goldReefCity = new Attraction("Gold Reef City", johannesburg, "Gold Reef City is a popular theme park and entertainment complex located in Johannesburg, built around the site of a historic gold mine. It offers a wide range of attractions and activities for visitors of all ages, including thrill rides, roller coasters, live shows, and historical exhibits. Visitors can explore the underground mine tour, try their luck at the casino, and enjoy dining and shopping experiences inspired by the city's gold rush heritage.", "");
        Attraction mabonengPrecinct = new Attraction("Maboneng Precinct", johannesburg, "The Maboneng Precinct is a dynamic urban neighborhood and creative hub located in downtown Johannesburg, known for its vibrant arts scene, street art, and cultural diversity. It features a variety of galleries, studios, shops, cafes, and restaurants, as well as public art installations, markets, and events. Visitors can explore the neighborhood on foot, discover local artists and designers, and experience the energy and creativity of contemporary Johannesburg.", "");

// Save attractions for Johannesburg
        attractionRepository.save(apartheidMuseum);
        attractionRepository.save(cradleOfHumankind);
        attractionRepository.save(goldReefCity);
        attractionRepository.save(mabonengPrecinct);
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
        Attraction poNagarChamTowers = new Attraction("Po Nagar Cham Towers", nhaTrang, "Po Nagar Cham Towers are a group of ancient Hindu temples located on a hill overlooking the city of Nha Trang, Vietnam. They were built by the Cham civilization between the 7th and 12th centuries and are dedicated to the Hindu goddess Po Nagar. Visitors can explore the towers, admire their intricate carvings and architecture, and learn about the history and religious significance of the Cham people.", "");
        Attraction honChongPromontory = new Attraction("Hon Chong Promontory", nhaTrang, "Hon Chong Promontory is a scenic coastal area located in Nha Trang, Vietnam. It is known for its unique rock formations, tide pools, and panoramic views of the South China Sea. Visitors can climb the rocky promontory, explore the natural sculptures and caves, and enjoy breathtaking sunsets over the ocean.", "");
        Attraction longSonPagoda = new Attraction("Long Son Pagoda", nhaTrang, "Long Son Pagoda is a Buddhist temple located in Nha Trang, Vietnam. It is known for its giant white Buddha statue, which sits atop a hill overlooking the city. Visitors can climb the steps to the pagoda, admire the statue and its surrounding gardens, and enjoy panoramic views of Nha Trang and its coastline.", "");

// Save attractions in Nha Trang
        attractionRepository.save(vinpearlLand);
        attractionRepository.save(nhaTrangBeach);
        attractionRepository.save(poNagarChamTowers);
        attractionRepository.save(honChongPromontory);
        attractionRepository.save(longSonPagoda);
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
        Attraction borobudurTemple = new Attraction("Borobudur Temple", yogyakarta, "Borobudur Temple is a UNESCO World Heritage Site and the largest Buddhist temple in the world, located near Yogyakarta, Indonesia. It is one of the most famous and important landmarks in Indonesia, known for its magnificent architecture, intricate stone carvings, and spiritual significance. Visitors can explore the temple's nine stacked platforms, climb to the top for panoramic views of the surrounding landscape, and learn about its history and symbolism.", "");
        Attraction prambananTemple = new Attraction("Prambanan Temple", yogyakarta, "Prambanan Temple is a UNESCO World Heritage Site and one of the largest Hindu temple complexes in Indonesia, located near Yogyakarta. It is renowned for its towering spires, intricate carvings, and rich cultural significance. Visitors can explore the temple's main shrines dedicated to the Hindu trinity of Brahma, Vishnu, and Shiva, attend cultural performances such as Ramayana ballet, and learn about Javanese art and architecture.", "");
        Attraction kratonYogyakarta = new Attraction("Kraton Yogyakarta", yogyakarta, "Kraton Yogyakarta, also known as the Yogyakarta Palace, is the official residence of the Sultan of Yogyakarta and the royal court of the Yogyakarta Sultanate. It is a cultural and historical landmark located in the heart of Yogyakarta city. Visitors can explore the palace complex, learn about Javanese royal traditions and ceremonies, and visit the Sultan's living quarters, museums, and cultural exhibits.", "");
        Attraction tamanSariWaterCastle = new Attraction("Taman Sari Water Castle", yogyakarta, "Taman Sari Water Castle, also known as Taman Sari Palace or Taman Sari Underground Mosque, is a historical water palace located in Yogyakarta, Indonesia. It was built in the 18th century as a royal garden and pleasure palace for the Sultan of Yogyakarta. Visitors can explore the palace's complex system of pools, bathing areas, and underground tunnels, and learn about its history and architectural significance.", "");
        Attraction malioboroStreet = new Attraction("Malioboro Street", yogyakarta, "Malioboro Street is a bustling shopping street and cultural hub located in the heart of Yogyakarta, Indonesia. It is known for its vibrant atmosphere, street vendors, and wide range of shops selling clothing, handicrafts, batik textiles, and souvenirs. Visitors can stroll along the street, shop for traditional Javanese goods, sample local street food, and experience Javanese culture and hospitality.", "");

// Save attractions in Yogyakarta
        attractionRepository.save(borobudurTemple);
        attractionRepository.save(prambananTemple);
        attractionRepository.save(kratonYogyakarta);
        attractionRepository.save(tamanSariWaterCastle);
        attractionRepository.save(malioboroStreet);
// Top 5 attractions in Tokyo
        Attraction tokyoTower = new Attraction("Tokyo Tower", tokyo, "Tokyo Tower is a landmark communications and observation tower located in the Shiba-koen district of Minato, Tokyo, Japan. It is one of the most iconic symbols of Tokyo, offering panoramic views of the city skyline from its observation decks. Visitors can also enjoy shopping, dining, and various attractions at the base of the tower.", "");
        Attraction sensojiTemple = new Attraction("Senso-ji Temple", tokyo, "Senso-ji Temple, also known as Asakusa Kannon Temple, is a Buddhist temple located in Asakusa, Tokyo, Japan. It is the oldest and most visited temple in Tokyo, attracting millions of visitors annually. Visitors can explore the temple grounds, visit the main hall and pagoda, and experience traditional Japanese culture through street food stalls, souvenir shops, and cultural performances.", "");
        Attraction meijiShrine = new Attraction("Meiji Shrine", tokyo, "Meiji Shrine, located in Shibuya, Tokyo, Japan, is a Shinto shrine dedicated to the deified spirits of Emperor Meiji and Empress Shoken. It is one of Tokyo's most important and popular shrines, known for its tranquil forested surroundings and traditional architecture. Visitors can explore the shrine's grounds, participate in Shinto rituals such as purification rites and prayer, and enjoy walking paths through the forest.", "");
        Attraction uenoPark = new Attraction("Ueno Park", tokyo, "Ueno Park is a spacious public park located in Ueno, Taito, Tokyo, Japan. It is a popular destination for both locals and tourists, offering a wide range of attractions including museums, temples, shrines, and gardens. Visitors can explore attractions such as Ueno Zoo, Tokyo National Museum, Shinobazu Pond, and enjoy cherry blossom viewing during spring.", "");
        Attraction tsukijiMarket = new Attraction("Tsukiji Outer Market", tokyo, "Tsukiji Outer Market is a bustling shopping district located near the former site of the famous Tsukiji Fish Market in Tokyo, Japan. It is known for its fresh seafood stalls, sushi restaurants, and culinary shops selling a variety of Japanese ingredients and kitchenware. Visitors can enjoy shopping for seafood, trying fresh sushi and street food, and learning about Japanese culinary culture.", "");

// Save attractions in Tokyo
        attractionRepository.save(tokyoTower);
        attractionRepository.save(sensojiTemple);
        attractionRepository.save(meijiShrine);
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
        Attraction shitennojiTemple = new Attraction("Shitenno-ji Temple", osaka, "Shitenno-ji Temple is one of the oldest Buddhist temples in Japan, located in Osaka, Japan. It is a historic and cultural landmark, known for its beautiful architecture, gardens, and religious significance. Visitors can explore the temple grounds, visit the main hall and pagoda, and experience traditional Buddhist rituals and ceremonies.", "");

// Save attractions in Osaka
        attractionRepository.save(osakaCastle);
        attractionRepository.save(dotonbori);
        attractionRepository.save(universalStudiosJapan);
        attractionRepository.save(osakaAquariumKaiyukan);
        attractionRepository.save(shitennojiTemple);
// Top 5 attractions in Nagoya
        Attraction nagoyaCastle = new Attraction("Nagoya Castle", nagoya, "Nagoya Castle is a historic castle located in Nagoya, Japan. It is one of the city's most iconic landmarks, known for its majestic architecture, beautiful gardens, and cultural significance. Visitors can explore the castle's interior museum, climb to the top of the main tower for panoramic views of Nagoya, and enjoy cherry blossom viewing during spring.", "");
        Attraction atsutaJingu = new Attraction("Atsuta Jingu", nagoya, "Atsuta Jingu is a Shinto shrine located in Nagoya, Japan. It is one of the most important and revered shrines in Japan, known for its ancient history, sacred relics, and tranquil atmosphere. Visitors can explore the shrine's grounds, visit the main hall and treasury, and participate in Shinto rituals and ceremonies.", "");
        Attraction portOfNagoyaPublicAquarium = new Attraction("Port of Nagoya Public Aquarium", nagoya, "Port of Nagoya Public Aquarium is a marine aquarium located in Nagoya, Japan. It is one of the largest and most impressive aquariums in Japan, featuring a wide variety of marine life from around the world. Visitors can explore themed exhibits such as the Antarctic Ocean and Amazon Rainforest, watch dolphin and sea lion shows, and learn about marine conservation.", "");
        Attraction nagoyaCityScienceMuseum = new Attraction("Nagoya City Science Museum", nagoya, "Nagoya City Science Museum is a science museum located in Nagoya, Japan. It features interactive exhibits, hands-on experiments, and educational programs covering various fields of science and technology. Visitors can learn about astronomy, biology, physics, and robotics through interactive displays and demonstrations.", "");
        Attraction osuKannonTemple = new Attraction("Osu Kannon Temple", nagoya, "Osu Kannon Temple is a Buddhist temple located in the Osu district of Nagoya, Japan. It is a historic and cultural landmark, known for its ancient architecture, colorful decorations, and vibrant atmosphere. Visitors can explore the temple's grounds, visit the main hall and pagoda, and explore the surrounding shopping streets and markets.", "");

// Save attractions in Nagoya
        attractionRepository.save(nagoyaCastle);
        attractionRepository.save(atsutaJingu);
        attractionRepository.save(portOfNagoyaPublicAquarium);
        attractionRepository.save(nagoyaCityScienceMuseum);
        attractionRepository.save(osuKannonTemple);
// Top 5 attractions in Sapporo
        Attraction odoriPark = new Attraction("Odori Park", sapporo, "Odori Park is a large public park located in the heart of Sapporo, Japan. It stretches for several blocks along Odori Boulevard and is a popular destination for locals and tourists alike. Visitors can enjoy seasonal events and festivals, stroll along tree-lined pathways, and relax in open green spaces.", "");
        Attraction sapporoBeerMuseum = new Attraction("Sapporo Beer Museum", sapporo, "Sapporo Beer Museum is a museum located in the Sapporo Beer Garden complex in Sapporo, Japan. It is housed in a historic red-brick building that was originally used as a brewery during the Meiji era. Visitors can learn about the history of Sapporo Beer, see brewing equipment and artifacts, and sample different varieties of beer in the tasting room.", "");
        Attraction hokkaidoShrine = new Attraction("Hokkaido Shrine", sapporo, "Hokkaido Shrine is a Shinto shrine located in Maruyama Park, Sapporo, Japan. It is dedicated to the kami (spirits) of Emperor Meiji and Empress Shoken, and is one of the most important shrines in Hokkaido. Visitors can explore the shrine's grounds, visit the main hall and purification fountain, and enjoy the peaceful atmosphere of the surrounding forest.", "");
        Attraction sapporoClockTower = new Attraction("Sapporo Clock Tower", sapporo, "Sapporo Clock Tower is a historic clock tower located in the city center of Sapporo, Japan. It is one of the city's most iconic landmarks, known for its elegant architecture and symbolic significance. Visitors can tour the interior museum, learn about the history of Sapporo and the clock tower, and enjoy panoramic views from the observation deck.", "");
        Attraction moerenumaPark = new Attraction("Moerenuma Park", sapporo, "Moerenuma Park is a unique public park located in Sapporo, Japan. It was designed by renowned artist and architect Isamu Noguchi and features distinctive sculptures, playgrounds, and landscaped gardens. Visitors can enjoy walking and cycling paths, outdoor art installations, and panoramic views of the surrounding landscape.", "");

// Save attractions in Sapporo
        attractionRepository.save(odoriPark);
        attractionRepository.save(sapporoBeerMuseum);
        attractionRepository.save(hokkaidoShrine);
        attractionRepository.save(sapporoClockTower);
        attractionRepository.save(moerenumaPark);
// Top 5 attractions in Beijing
        Attraction greatWallOfChina = new Attraction("Great Wall of China", beijing, "The Great Wall of China is one of the most iconic landmarks in the world, located near Beijing, China. It is a UNESCO World Heritage Site and one of the Seven Wonders of the World, known for its historical significance, architectural grandeur, and stunning scenery. Visitors can explore various sections of the Great Wall, hike along its ancient ramparts, and marvel at panoramic views of the surrounding landscape.", "");
        Attraction forbiddenCity = new Attraction("Forbidden City", beijing, "The Forbidden City is a vast imperial palace complex located in the heart of Beijing, China. It served as the imperial palace and political center of China for over 500 years, from the Ming dynasty to the end of the Qing dynasty. Today, it is a UNESCO World Heritage Site and one of China's most popular tourist attractions, known for its magnificent architecture, ornate palaces, and extensive collection of cultural artifacts.", "");
        Attraction templeOfHeaven = new Attraction("Temple of Heaven", beijing, "The Temple of Heaven is a complex of religious buildings located in southeastern Beijing, China. It is a UNESCO World Heritage Site and one of the largest and best-preserved ancient sacrificial complexes in China. The main structures include the Hall of Prayer for Good Harvests, the Imperial Vault of Heaven, and the Circular Mound Altar. Visitors can explore the temple's beautiful architecture, gardens, and learn about ancient Chinese rituals and ceremonies.", "");
        Attraction summerPalace = new Attraction("Summer Palace", beijing, "The Summer Palace is a vast imperial garden complex located in Beijing, China. It is a UNESCO World Heritage Site and one of the most famous classical gardens in the world, known for its natural beauty, architectural splendor, and historical significance. Visitors can explore the palace's pavilions, halls, and gardens, take boat rides on Kunming Lake, and enjoy scenic views of Longevity Hill and the surrounding landscape.", "");
        Attraction hutongAlleyways = new Attraction("Hutong Alleyways", beijing, "Hutong Alleyways are narrow alleys or lanes formed by traditional courtyard residences in Beijing, China. They are a unique and charming feature of Beijing's urban landscape, offering glimpses into the city's rich history, culture, and daily life. Visitors can explore the hutong alleyways on foot, cycle through them on a rickshaw, and discover hidden gems such as local shops, tea houses, and traditional courtyard homes.", "");

// Save attractions in Beijing
        attractionRepository.save(greatWallOfChina);
        attractionRepository.save(forbiddenCity);
        attractionRepository.save(templeOfHeaven);
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
        Attraction wuhouShrine = new Attraction("Wuhou Shrine", chengdu, "Wuhou Shrine, also known as Wuhou Temple or Temple of Marquis Wu, is a historic temple located in Chengdu, China. It is dedicated to Zhuge Liang, a famous military strategist and statesman of the Three Kingdoms period, and Liu Bei, the founding emperor of the Shu Han state. Visitors can explore the temple's halls, pavilions, and gardens, and learn about the history and culture of the Three Kingdoms.", "");
        Attraction sichuanOpera = new Attraction("Sichuan Opera", chengdu, "Sichuan Opera is a traditional Chinese opera style originating from Sichuan province, particularly Chengdu. It is known for its unique performance techniques, including face-changing, fire-spitting, and acrobatics. Visitors can attend Sichuan Opera performances at theaters and teahouses in Chengdu, and experience the vibrant art form and cultural heritage of Sichuan.", "");
        Attraction dujiangyanIrrigationSystem = new Attraction("Dujiangyan Irrigation System", chengdu, "Dujiangyan Irrigation System is an ancient water management system located in Dujiangyan, near Chengdu, China. It is a UNESCO World Heritage Site and one of the oldest and most successful irrigation projects in the world. Visitors can explore the system's dams, canals, and aqueducts, learn about its history and engineering innovations, and enjoy scenic views of the surrounding landscape.", "");

// Save attractions in Chengdu
        attractionRepository.save(giantPandaBreedingResearchBase);
        attractionRepository.save(jinliAncientStreet);
        attractionRepository.save(wuhouShrine);
        attractionRepository.save(sichuanOpera);
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
        Attraction kyrgyzNationalOperaAndBalletTheatre = new Attraction("Kyrgyz National Opera and Ballet Theatre", bishkek, "The Kyrgyz National Opera and Ballet Theatre is a prestigious performing arts venue located in Bishkek, Kyrgyzstan. It hosts regular performances of opera, ballet, and classical music, featuring talented artists and musicians from Kyrgyzstan and abroad. Visitors can enjoy world-class performances in a beautiful and historic setting.", "");

// Save attractions in Bishkek
        attractionRepository.save(alaArchaNationalPark);
        attractionRepository.save(oshBazaar);
        attractionRepository.save(victorySquare);
        attractionRepository.save(stateHistoricalMuseum);
        attractionRepository.save(kyrgyzNationalOperaAndBalletTheatre);
// Top 5 attractions in Osh
        Attraction sulaymanMountain = new Attraction("Sulayman Mountain", osh, "Sulayman Mountain is a sacred site and natural landmark located in the city of Osh, Kyrgyzstan. It is home to numerous caves, petroglyphs, and religious shrines, including the Sulayman-Too Mosque and Solomon's Throne. Visitors can hike to the top of the mountain for panoramic views of Osh and the surrounding area, as well as explore its historical and cultural significance.", "");
        Attraction leninPeak = new Attraction("Lenin Peak", osh, "Lenin Peak is one of the highest mountains in the Pamir range, located near the border between Kyrgyzstan and Tajikistan. It is a popular destination for mountaineers and adventure enthusiasts, offering challenging climbing routes and breathtaking views from its summit. Visitors can trek to base camps at the foot of the mountain or join guided expeditions to attempt the summit.", "");
        Attraction oshRegionalMuseum = new Attraction("Osh Regional Museum", osh, "The Osh Regional Museum is a cultural institution located in Osh, Kyrgyzstan. It showcases the history, culture, and heritage of the Osh region through a diverse collection of artifacts, exhibits, and displays. Visitors can learn about the region's ancient civilizations, nomadic tribes, and Silk Road heritage, as well as its modern-day culture and society.", "");
        Attraction jalaAbadBazaar = new Attraction("Jalal-Abad Bazaar", osh, "Jalal-Abad Bazaar is a bustling market located in the city of Jalal-Abad, Kyrgyzstan. It offers a wide range of goods and products, including fresh produce, spices, textiles, clothing, household items, and souvenirs. Visitors can explore the market's stalls, shop for local goods, and experience the vibrant atmosphere of Jalal-Abad's trading culture.", "");

// Save attractions in Osh
        attractionRepository.save(sulaymanMountain);
        attractionRepository.save(leninPeak);
        attractionRepository.save(oshRegionalMuseum);
        attractionRepository.save(jalaAbadBazaar);
// Top 5 attractions in Jalal-Abad
        Attraction arslanbob = new Attraction("Arslanbob", jalalAbad, "Arslanbob is a picturesque village located in the Jalal-Abad region of Kyrgyzstan. It is famous for its walnut forests, which are some of the largest in the world, as well as its stunning natural scenery and hospitable local community. Visitors can explore the village, hike in the surrounding mountains, and learn about traditional Kyrgyz culture and agriculture.", "");
        Attraction saryChelek = new Attraction("Sary-Chelek Biosphere Reserve", jalalAbad, "Sary-Chelek Biosphere Reserve is a protected area located in the Jalal-Abad region of Kyrgyzstan. It is known for its pristine natural beauty, diverse ecosystems, and unique flora and fauna. Visitors can enjoy hiking, trekking, wildlife watching, and picnicking amidst the reserve's forests, lakes, and mountain landscapes.", "");
        Attraction khujandBazaar = new Attraction("Khujand Bazaar", jalalAbad, "Khujand Bazaar is a historic market located in the city of Khujand, Tajikistan, near the border with Kyrgyzstan. It offers a wide range of goods and products, including fresh produce, spices, textiles, clothing, household items, and souvenirs. Visitors can explore the market's stalls, shop for local goods, and experience the vibrant atmosphere of Khujand's trading culture.", "");
        Attraction manasOrdo = new Attraction("Manas Ordo", jalalAbad, "Manas Ordo is a cultural and religious complex located near the village of Tash-Bashat in the Jalal-Abad region of Kyrgyzstan. It is dedicated to Manas, a legendary hero and central figure in Kyrgyz epic poetry and folklore. Visitors can explore the complex, which features statues, monuments, and shrines related to the Manas epic, as well as enjoy panoramic views of the surrounding landscape.", "");
        Attraction somalinskyCanyon = new Attraction("Sary-Chelek Biosphere Reserve", jalalAbad, "The Somalinsky Canyon is a stunning natural attraction located in the Jalal-Abad region of Kyrgyzstan. It features dramatic rock formations, rugged cliffs, and a meandering river, creating a picturesque landscape for hiking, photography, and outdoor adventure. Visitors can explore the canyon's trails, admire its geological formations, and enjoy the tranquility of nature.", "");

// Save attractions in Jalal-Abad
        attractionRepository.save(arslanbob);
        attractionRepository.save(saryChelek);
        attractionRepository.save(khujandBazaar);
        attractionRepository.save(manasOrdo);
        attractionRepository.save(somalinskyCanyon);
// Top 5 attractions in Karakol
        Attraction issykKulLake = new Attraction("Issyk-Kul Lake", karakol, "Issyk-Kul Lake is the largest and one of the most beautiful alpine lakes in Kyrgyzstan, located near the city of Karakol. It is surrounded by majestic snow-capped mountains and offers stunning scenery year-round. Visitors can enjoy swimming, sunbathing, boating, and water sports in the crystal-clear waters of the lake, as well as explore nearby attractions such as hot springs, waterfalls, and historic sites.", "");
        Attraction karakolSkiResort = new Attraction("Karakol Ski Resort", karakol, "Karakol Ski Resort is a popular winter sports destination located in the Tien Shan mountains near the city of Karakol. It offers excellent skiing and snowboarding opportunities for all skill levels, with a variety of slopes, trails, and terrain parks. Visitors can also enjoy other winter activities such as snowshoeing, snowmobiling, and sledding, as well as cozy accommodations and après-ski amenities.", "");
        Attraction prjevalskyMuseum = new Attraction("Przhevalsky Museum", karakol, "The Przhevalsky Museum is a historical museum located in the city of Karakol, Kyrgyzstan. It is dedicated to the life and explorations of Nikolai Przhevalsky, a renowned Russian explorer and naturalist who conducted expeditions in Central Asia during the 19th century. Visitors can learn about Przhevalsky's adventures, discoveries, and contributions to science and geography through exhibits, artifacts, and multimedia displays.", "");
        Attraction jetiOguz = new Attraction("Jeti-Oguz Valley", karakol, "Jeti-Oguz Valley is a picturesque gorge located near the city of Karakol, Kyrgyzstan. It is known for its distinctive red sandstone rock formations, which resemble seven bulls lying down, as well as its lush alpine meadows, forests, and rivers. Visitors can hike, horseback ride, or take a scenic drive through the valley, enjoying panoramic views of the surrounding landscape and exploring natural attractions such as waterfalls and hot springs.", "");
        Attraction holyTrinityCathedral = new Attraction("Holy Trinity Cathedral", karakol, "Holy Trinity Cathedral is a historic Russian Orthodox church located in the city of Karakol, Kyrgyzstan. It is one of the largest and most significant religious landmarks in the region, known for its beautiful architecture and ornate interior decorations. Visitors can admire the cathedral's distinctive blue domes, golden crosses, and colorful frescoes, as well as attend religious services and learn about its history and significance.", "");

// Save attractions in Karakol
        attractionRepository.save(issykKulLake);
        attractionRepository.save(karakolSkiResort);
        attractionRepository.save(prjevalskyMuseum);
        attractionRepository.save(jetiOguz);
        attractionRepository.save(holyTrinityCathedral);
// Top 5 attractions in Tokmok
        Attraction buranaTower = new Attraction("Burana Tower", tokmok, "Burana Tower is a historic minaret located near the town of Tokmok, Kyrgyzstan. It dates back to the 11th century and is one of the few remaining structures of the ancient city of Balasagun, which was once a thriving center of the Silk Road. Visitors can climb to the top of the tower for panoramic views of the surrounding countryside and explore the nearby archaeological site, which features ancient ruins, burial mounds, and petroglyphs.", "");
        Attraction balbals = new Attraction("Balbals", tokmok, "Balbals are ancient stone grave markers found throughout Central Asia, including near the town of Tokmok, Kyrgyzstan. They date back to the 6th-10th centuries and were used by nomadic tribes to commemorate their deceased leaders and warriors. Visitors can see these unique stone sculptures, which depict human figures in various poses and styles, and learn about their cultural and historical significance.", "");
        Attraction tokmokMuseum = new Attraction("Tokmok Museum", tokmok, "The Tokmok Museum is a local history museum located in the town of Tokmok, Kyrgyzstan. It showcases the history, culture, and heritage of the Tokmok region through a diverse collection of artifacts, exhibits, and displays. Visitors can learn about the area's ancient civilizations, nomadic tribes, and Soviet-era history, as well as its modern-day culture and society.", "");
        Attraction kokMoinokCave = new Attraction("Kok-Moinok Cave", tokmok, "Kok-Moinok Cave is a natural limestone cave located near the town of Tokmok, Kyrgyzstan. It is known for its unique geological formations, including stalactites, stalagmites, and underground chambers. Visitors can explore the cave's passages, admire its mineral formations, and learn about its formation and significance through guided tours and educational programs.", "");
        Attraction tokmokHorseGames = new Attraction("Tokmok Horse Games", tokmok, "Tokmok Horse Games is an annual equestrian festival held in the town of Tokmok, Kyrgyzstan. It celebrates the traditional horsemanship and equestrian sports of the Kyrgyz people, including horse racing, archery, and wrestling. Visitors can watch exciting horseback riding competitions, cultural performances, and demonstrations of traditional horsemanship skills, as well as enjoy local food, music, and crafts.", "");

// Save attractions in Tokmok
        attractionRepository.save(buranaTower);
        attractionRepository.save(balbals);
        attractionRepository.save(tokmokMuseum);
        attractionRepository.save(kokMoinokCave);
        attractionRepository.save(tokmokHorseGames);

    }
}
