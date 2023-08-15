import './App.css';
import Card from './components/card';
import Footer from './components/footer';

import Header from './components/navbar';
function App() {
  return (
    <div>
      <Header/>
      <div className='fcontainer'>
      <Card/>
      <Card/>
      <Card/>
      <Card/>
      <Card/>
      <Card/>
      </div>
      <Footer/>
    </div>
  );
}

export default App;
