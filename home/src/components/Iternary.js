

import React, { useEffect, useState } from 'react';
import "bootstrap/dist/css/bootstrap.min.css";
import { useParams } from 'react-router-dom';
import Card from 'react-bootstrap/Card';
import Cost from './Cost';

function Iternary() {
  const [itr, setItr] = useState([]);
  const { id } = useParams();

  const getTours = () => {
    fetch(`http://localhost:8080/api/Iternary/${id}`)
      .then(response => response.json())
      .then(res => setItr(res));
  }

  useEffect(() => {
    getTours();
    console.log(itr);
  }, [id]);

    return (
     <> 
      <div>
      {itr.map(itr =>(
      <Card className="bg-dark text-white">
        <Card.Img src={itr.itrimgpath} alt="" />
        <Card.ImgOverlay>
          <Card.Title><b>Haridwar -{itr.day} 🚩🔱</b></Card.Title>
          <br />
          <Card.Text>
          <b>The divine view of the Ganga Aarti is a scene you cannot miss if you are in Haridwar. The Ganga Aarti in Haridwar is dedicated to the river Ganga.</b>
          </Card.Text>
          <br />
          <Card.Text>
            <b>Day 1 - Har ki Pauri</b>
            <br />
            Located in Haridwar, Har Ki Pauri Ghat is a holy spot where pilgrims from all over come to bathe in the sacred waters of the Ganga River. The ghat is also known as Lord Shivas steps, and it is said that Lord Vishnu and Lord Shiva visited here during the Vedic Period.
          </Card.Text>
          <br />
          <Card.Text>
            <b>Day 2 - Maa Chandi Devi Temple</b>
            <br />
            Maa Chandi Devi Temple is a popular Hindu temple in Haridwar, Uttarakhand that attracts thousands of devotees every day to pray to the goddess for their desires to be fulfilled. Constructed in the early 20th century, the temple features an idol of Goddess Chandi.
          </Card.Text>
          <br />
          <Card.Text>
            <b>Day 3 - Pawan Dham</b>
            <br />
            Located in the outskirts of Haridwar, Pawan Dham is a beautiful Hindu temple with intricate glasswork and colourful statues. The peaceful surroundings and serene ambiance are sure to please visitors.
          </Card.Text>
          <br />
          <Card.Text>
            <b>Day 4 - West side of town</b>
            <br />
            For day 4, we recommend exploring the west side side of town. Start the day off with Saptrishi Ashram, Haridwar, then wind down and take it easy by the time you get to Rajaji National Park. All together, your day would be filled with about 7 hours of non-stop fun.
          </Card.Text>

        </Card.ImgOverlay>
      </Card>
    ))}
    </div>
    <br />
    <div>
        <Cost/>
    </div>
      <br />
    {/* <div>
        <Carosel/>
    </div> */}
  </>
    
    );
}


export default Iternary;
