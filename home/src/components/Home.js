
import React from 'react';
import Card from './card';
import "bootstrap/dist/css/bootstrap.min.css";
// import {Footer1} from './components/Footer1';
import Header from './navbar';
import Footer from './Footer';
function Home() {
    return (
      <div>
        <Header />
  
        <div className='first-half'>
          <Card />
          <Card />
          <Card />
        </div>
  
        <div className='sec-half'>
          <Card />
          <Card />
          <Card />
        </div>
        
        <Footer />
      </div>
    );
  }
  
  export default Home;