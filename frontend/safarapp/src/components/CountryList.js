import Card from '../components/Card';

const CountryList = ({countries}) => {

    const listCountries = countries.map(country => (
        <Card 
        key={country.id}
        name={country.name}
        image={country.image}
        />
    ));


    return ( <>
    <div>
        <ul>
            {listCountries}
        </ul>
    </div>
    
    </> );
}
 
export default CountryList;