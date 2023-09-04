import React, { useEffect, useState } from 'react';
import "bootstrap/dist/css/bootstrap.min.css";
import Carosel from './Carosel';
import { Card, Row, Col } from 'react-bootstrap';
import { Link, useParams } from 'react-router-dom';
import Package from './Package';

function SubSector() {
  const [subsector, setSubSector] = useState([]);
  const{id} = useParams();

  const getTours = () => {
    fetch("http://localhost:8080/api/SubSector/"+id)
      .then(response => response.json())
      .then(res => setSubSector(res));
  }

  useEffect(() => {
    getTours();
    console.log(subsector);
  }, []);

  return (
    <div>
      <Carosel />
      <br />

      <Row className="justify-content-center">
        {subsector.map(sec => (
          <Col key={sec.id} md={4} className="mb-4">
            <Card style={{ width: '18rem' }} className='fcontainer'>
              <Card.Img variant="top" src={sec.subsectorImgPath} />
              
              <Card.Body>
              <Link to={/Package/+sec.subSectorId}>
                <Card.Title>{sec.subSectorName}</Card.Title>
              </Link>
                <Card.Text>
                  {sec.subsectorinfo}
                </Card.Text>
                
              </Card.Body>
            </Card>
          </Col>
        ))}
      </Row>
    </div>
  );
}

export default SubSector;