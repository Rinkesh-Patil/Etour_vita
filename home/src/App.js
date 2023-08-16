import { alignPropType } from 'react-bootstrap/esm/types';
import './App.css';
import Card from './components/card';
import Footer from './components/footer';

import Header from './components/navbar';
function App() {
  return (
    
    <div>
      <Header/>
      
      <div  className='first-half'>
      <Card/>
      <Card/>
      <Card/>
    </div>
    <h1 style={{textAlign:'center'}}>All inclusive tours </h1>
    <div className='sec-half'>
      <Card/>
      <Card/>
      <Card/>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default App;
