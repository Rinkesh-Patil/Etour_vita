//import Card from 'react-bootstrap/Card';
import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { Card, Button } from 'react-bootstrap';
import './Cost.css';
function Cost(){
     const [cost,setCost]=useState([]);
     const navigate = useNavigate();
     const getCost=()=>{
        fetch("http://localhost:8080/api/getCostByPack/4")
        .then(respone => respone.json())
        .then(set => setCost(set));
     }
     useEffect(()=>{
        getCost();
        console.log(cost);
     },[])
     const id = 4;
     const handleNavigate = (id) => {
        navigate(`/Login`);
      };
    return (
        <div className="cost-master-container">
            <h1 className="centered-heading">BOOKINGS ARE OPEN !! ✈️</h1>
            <div className="card-container">
                <Card className="cost-card">
                    <Card.Body>
                        {/* <Card.Title className="card-title">Cost ID: {item?.costId}</Card.Title> */}
                        <div className="table-container">
                            <table className="table">
                                <b>
                                <tbody>
                                    <tr>
                                        <th>Field</th>
                                        <th>Value</th>
                                    </tr>
                                    <tr>
                                        <td>Cost    💲</td>
                                        <td>{cost.cost}</td>
                                    </tr>
                                    <tr>
                                        <td>Single Person Cost 👨 </td>
                                        <td>{cost.singlePersonCost}</td>
                                    </tr>
                                    <tr>
                                        <td>Extra Person Cost 👨💁‍♀️</td>
                                        <td>{cost.extraPersonCost}</td>
                                    </tr>
                                    <tr>
                                        <td>Child With Bed 👨‍👩‍👧‍👦</td>
                                        <td>{cost.childWithBed}</td>
                                    </tr>
                                    {/* <tr>
                                        <td>Child Without Bed</td>
                                        <td></td>
                                    </tr> */}
                                    <tr>
                                        <td>Valid From  🛫</td>
                                        <td>{cost.validFrom}</td>
                                    </tr>
                                    <tr>
                                        <td>Valid To 🛬</td>
                                        <td>{cost.validTo}</td>
                                    </tr>
                                </tbody>
                                </b>
                            </table>
                        </div>
                        <br />
                        <Button variant="primary" onClick={() => handleNavigate(id)}>
                            Book Now !👈
                        </Button>
                    </Card.Body>
                </Card>
            </div>
        </div>
    );
}
export default Cost;