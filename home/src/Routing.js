import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Search from './components/Search';
import Registration from './components/Registration';
import Home from './components/Home';
import App from './App'
import SubSector from './components/SubSector';
import Package from './components/Package';
import Iternary from './components/Iternary';
import Login from './components/Login';
import PassengerDetail from './components/PassengerDetail';
import Bookings from './components/Bookings';
export default function Routing(){
    return(
        <React.StrictMode>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<App />}>
          <Route path="/" element={<Home />} />
          <Route path="/Home" element={<Home />} />
          <Route path="/Search" element={<Search />} />
          {/* <Route path="/Signin" element={<Signin />} /> */}
          <Route path="/Registration" element={<Registration/>} />
          <Route path="/SubSector/:id" element={<SubSector/>} / >
          <Route path="/Package/:id" element={<Package/>} />
          <Route path="/Iternary/:id" element={<Iternary/>} />
          <Route path="/Login" element={<Login/>} />
          <Route path="/PassengerDetail/:id" element={<PassengerDetail/>} />
          <Route path="/Bookings/:id" element={<Bookings/>} />
         
        </Route>
      </Routes>

    </BrowserRouter>
  </React.StrictMode>
    );

}