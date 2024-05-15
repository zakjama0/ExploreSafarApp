import logo from './logo.svg';
import './App.css';
import HomeContainer from './containers/HomeContainer';
import LabelBottomNavigation from "./components/LabelBottomNavigation";
import ResponsiveAppBar from './components/ResponsiveAppBar';


function App() {
  return (
    <>
    <ResponsiveAppBar />
    <HomeContainer />
    <LabelBottomNavigation/>
    </>
  );
}

export default App;
