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

        Country egypt = new Country(Region.NORTHERN_AFRICA, Continent.AFRICA, "https://i.natgeofe.com/k/109a4e08-5ebc-48a5-99ab-3fbfc1bbd611/Giza_Egypt_KIDS_0123_square.jpg", "Egypt");
        Country portugal = new Country(Region.WESTERN_EUROPE, Continent.EUROPE, "https://www.travelandleisure.com/thmb/t7LUbPYWRDe_itXi0c9mmS4OYMc=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/TAL-header-azenhas-do-mar-portugal-PRTGREECE0922-1b53ba0a4b4c4eef999ae4190f7981cd.jpg","Portugal");

        countryRepository.save(egypt);
        countryRepository.save(portugal);

        City cairo = new City("Cairo", egypt);
        City luxor = new City("Luxor", egypt);
        City lisbon = new City("Lisbon", portugal);
        City porto = new City("Porto", portugal);

        cityRepository.save(cairo);
        cityRepository.save(luxor);
        cityRepository.save(lisbon);
        cityRepository.save(porto);

        Attraction pyramids = new Attraction("The Pyramids of Giza",cairo, "Test description", "https://i.natgeofe.com/k/109a4e08-5ebc-48a5-99ab-3fbfc1bbd611/Giza_Egypt_KIDS_0123_square.jpg" );
        Attraction valleyOfKings = new Attraction("The Valley Of Kings", luxor,"Test Description", "https://i0.wp.com/www.touristegypt.com/wp-content/uploads/2023/05/luxor.jpg?fit=1000%2C552&ssl=1");
        Attraction avenueOfSphinx = new Attraction("Avenue of the Sphinx", luxor, "Test Description", "https://s.abcnews.com/images/International/avenue-sphinxes-gty-rc-211123_1637696569650_hpMain_16x9_992.jpg");
        Attraction templeOfKarnak = new Attraction("Temple of Karnak", luxor, "Description", "https://cdn.expeditions.com/globalassets/expedition-stories/exploring-egypt-5-must-see-sights-at-karnak-temple-complex/karnak-temple-complex-main-image.jpg?width=1920&height=1080&mode=crop&scale=none&quality=50");



    }
}
