import logo from './logo.svg';
import HomeContainer from './containers/HomeContainer';
import LabelBottomNavigation from "./components/LabelBottomNavigation";
import ResponsiveAppBar from './components/ResponsiveAppBar';
import NavBar from './components/NavBar';



function App() {
  return (
    <div>
    <NavBar />
    <HomeContainer />
    <LabelBottomNavigation/>
    </div>
  );
}

export default App;
