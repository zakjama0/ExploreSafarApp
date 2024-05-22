import logo from './logo.svg';
import HomeContainer from './containers/HomeContainer';
import LabelBottomNavigation from "./components/LabelBottomNavigation";
import ResponsiveAppBar from './components/ResponsiveAppBar';



function App() {
  return (
    <div style={{backgroundColor: '#a4c3b2'}}>
    <ResponsiveAppBar />
    <HomeContainer />
    <LabelBottomNavigation/>
    </div>
  );
}

export default App;
