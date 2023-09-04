// import React, { useState,useEffect } from 'react';
// import { Form, Button, Col } from 'react-bootstrap'; // Import Form.Check component and Col
// import './PassengerDetail.css';
// import { useNavigate } from 'react-router-dom';
// //import Swal from 'react-swal';
// import Swal from 'sweetalert2'


// function PassengerDetail() {
//   const [inputValue, setInputValue] = useState('');
//   const [datevalue,setdatevalue] = useState('');
//   const [selectedOption, setSelectedOption] = useState();

  
  
//   const navigate = useNavigate();
  
//   const handleInputChange = (event) => {
//     setInputValue(event.target.value);
//   };
   
//   const handleDateChange= (event) => {
//     setdatevalue(event.target.value);
//   }

//   const handleRadioChange = (event) => {
//     setSelectedOption(event.target.value);
//   };
//   console.log(selectedOption)
//   // console.log(datevalue,inputValue)
//    const custid = 2; // we will take it from session storage
//   const id = 4; //will take it from param
//   const [cost,setCost]=useState([]);
    
//      const getCost = () => {
//       fetch("http://localhost:8080/api/getCostByPack/4")
//         .then(response => response.json())
//         .then(data => {
//           setCost(data); // Assuming the fetched data is a single object
//           setSelectedOption(data?.key || (cost.singlePersonCost) ); // Set default selected option
//         })
//         .catch(error => {
//           console.error('Error fetching data:', error);
//         });
//     };
    
//      useEffect(()=>{
//         getCost();
//         console.log(cost);
//      },[])
//      const x = cost[selectedOption];
//      console.log(x);
//      //posting data into database
//      const url = "http://localhost:8080/api/passenger";
//      const data = {
//       paxName: inputValue,
//       paxBirthdate: datevalue,
//       paxType:selectedOption,
//       paxAmount:x,
//       packageid:id, //it will come from param
//       customerid: custid     // it will come from seesion storage
//      }; //  POST data
     
//      const handleSubmit = (event) => {
//       event.preventDefault();
//       fetch(url, {
//         method: "POST",
//         headers: {
//           "Content-Type": "application/json"
//           // Add other headers if needed
//         },
//         body: JSON.stringify(data) // Convert data to JSON string
//       })
//         .then(response => response.json())
//         .then(result => {
//           console.log("Success:", result);
//           // Handle the success response here
//         })
//         .catch(error => {
//           console.error("Error:", error);
//           // Handle errors here
//         });
//         Swal.fire(
//           `Details saved 🤩 `,
//           ' Booking Details are ✈️ here !!',
//           'success'
//         );
        
//         navigate(`/Bookings/${id}`);

//     };
    

//   return (
//     <div className="user-input-container">
//       <h2 className="text-center">Passenger Details 📄</h2>
//       <Form onSubmit={handleSubmit} className="custom-form">
//         <Form.Group controlId="inputValue">
//           <Form.Label className="custom-label">Passenger Name:</Form.Label>
//           <Form.Control
//             type="text"
//             placeholder="Enter Name..."
//             value={inputValue}
//             onChange={handleInputChange}
//             className="custom-input"
//           />
//         </Form.Group>
//         <Form.Group controlId="birthdate">
//           <Form.Label className="custom-label">Birth Date:</Form.Label>
//           <Form.Control
//             type="date"
//             placeholder="Enter Birth Date..."
//             value={datevalue}
//             onChange={handleDateChange}
//             className="custom-input"
//           />
//         </Form.Group>
//         <Form.Group controlId="radioGroup">
//           <Form.Label className="custom-label">Passenger Type:</Form.Label>
//           <Col>
//             <Form.Check
//               type="radio"
//               label={`Single Person Cost: $${cost.singlePersonCost}`}
//               name="radioGroup"
//               value="singlePersonCost"
//               checked={selectedOption === 'singlePersonCost'}
//               onChange={handleRadioChange}
//               className="radio-input"
//             />
//             <Form.Check
//               type="radio"
//               label={`Extra Person Cost: $${cost.extraPersonCost}`}
//               name="radioGroup"
//               value="extraPersonCost"
//               checked={selectedOption === 'extraPersonCost'}
//               onChange={handleRadioChange}
//               className="radio-input"
//             />
//             <Form.Check
//               type="radio"
//               label={`Child with Bed: $${cost.childWithBed}`}
//               name="radioGroup"
//               value="childWithBed"
//               checked={selectedOption === 'childWithBed'}
//               onChange={handleRadioChange}
//               className="radio-input"
//             />
//           </Col>
//         </Form.Group>
//         <Button variant="primary" type="submit" className="submit-button">
//           Submit
//         </Button>
//       </Form>
//     </div>
//   );
// }

// export default PassengerDetail



import React, { useState,useEffect } from 'react';
import { Form, Button, Col, Table } from 'react-bootstrap';
import './PassengerDetail.css';
import Swal from 'sweetalert2';
import { useNavigate } from 'react-router-dom';

function PassengerDetail() {
  const [inputValue, setInputValue] = useState('');
  const [datevalue, setDateValue] = useState('');
  const [selectedOption, setSelectedOption] = useState('');
  const [passengers, setPassengers] = useState([]); // State for storing passengers
  const [showTable, setShowTable] = useState(false); // State for toggling the table


  const navigate = useNavigate();

  const handleInputChange = (event) => {
    setInputValue(event.target.value);
  };

  const handleDateChange = (event) => {
    setDateValue(event.target.value);
  };

  const handleRadioChange = (event) => {
    setSelectedOption(event.target.value);
  };

  


const addPassenger = () => {
  const passenger = {
    name: inputValue,
    birthdate: datevalue,
    type: selectedOption,
    cost: cost[selectedOption], // Include the cost in the passenger object
  };

    setPassengers([...passengers, passenger]); // Add the new passenger to the list

    setInputValue('');
    setDateValue('');
    setSelectedOption('');
     };

console.log(selectedOption)

  // console.log(datevalue,inputValue)
   const custid = 2; // we will take it from session storage
  const id = 4; //will take it from param
  const [cost,setCost]=useState([]);
    
     const getCost = () => {
      fetch("http://localhost:8080/api/getCostByPack/4")
        .then(response => response.json())
        .then(data => {
          setCost(data); // Assuming the fetched data is a single object
          setSelectedOption(data?.key || (cost.singlePersonCost) ); // Set default selected option
        })
        .catch(error => {
          console.error('Error fetching data:', error);
        });
    };
    
     useEffect(()=>{
        getCost();
        console.log(cost);
     },[])
     const x = cost[selectedOption];
     console.log(x);
     //posting data into database
     const url = "http://localhost:8080/api/passenger";
    //  const data = {
    //   paxName: inputValue,
    //   paxBirthdate: datevalue,
    //   paxType:selectedOption,
    //   paxAmount:x,
    //   packageid:id, //it will come from param
    //   customerid: custid     // it will come from session storage
    //  }; //  POST data

 // Replace '4' with the actual 'id' or retrieve it from your application's state
 const callfetch = (passengerData) => {
  fetch(url, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      // Add other headers if needed
    },
    body: JSON.stringify(passengerData), // Convert data to JSON string
  })
    .then((response) => response.json())
    .then((result) => {
      console.log("Success:", result);
      // Handle the success response here if needed
    })
    .catch((error) => {
      console.error("Error:", error);
      // Handle errors here if needed
    });
};

const handleSubmit = (event) => {
  event.preventDefault();

  // Iterate through passengers and send each passenger's data
  passengers.forEach((passenger) => {
    const passengerData = {
      paxName: passenger.name,
      paxBirthdate: passenger.birthdate,
      paxType: passenger.type,
      paxAmount: passenger.cost,
      packageid: id, // Assuming 'id' is defined in the component's scope
      customerid: custid, // Assuming 'custid' is defined in the component's scope
    };

    // Send the passenger's data to the server
    callfetch(passengerData);
  });

  Swal.fire(
    'Details saved 🤩',
    'Booking Details are ✈️ here !!',
    'success'
  );

  navigate(`/Bookings/${id}`);
};
  return (
    <div className="user-input-container">
      <h2 className="text-center">Passenger Details 📄</h2>
      <Form onSubmit={handleSubmit} className="custom-form">
        <Form.Group controlId="inputValue">
          <Form.Label className="custom-label">Passenger Name:</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter Name..."
            value={inputValue}
            onChange={handleInputChange}
            className="custom-input"
          />
        </Form.Group>
        <Form.Group controlId="birthdate">
          <Form.Label className="custom-label">Birth Date:</Form.Label>
          <Form.Control
            type="date"
            placeholder="Enter Birth Date..."
            value={datevalue}
            onChange={handleDateChange}
            className="custom-input"
          />
        </Form.Group>
        <Form.Group controlId="radioGroup">
          <Form.Label className="custom-label">Passenger Type:</Form.Label>
          <Col>
            <Form.Check
              type="radio"
              label={`Single Person Cost: $${cost.singlePersonCost}`}
              name="radioGroup"
              value="singlePersonCost"
              checked={selectedOption === 'singlePersonCost'}
              onChange={handleRadioChange}
              className="radio-input"
            />
            <Form.Check
              type="radio"
              label={`Extra Person Cost: $${cost.extraPersonCost}`}
              name="radioGroup"
              value="extraPersonCost"
              checked={selectedOption === 'extraPersonCost'}
              onChange={handleRadioChange}
              className="radio-input"
            />
            <Form.Check
              type="radio"
              label={`Child with Bed: $${cost.childWithBed}`}
              name="radioGroup"
              value="childWithBed"
              checked={selectedOption === 'childWithBed'}
              onChange={handleRadioChange}
              className="radio-input"
            />
          </Col>
        </Form.Group>
        <Button variant="primary" type="submit" className="submit-button">
          Submit
        </Button>
        <Button
          variant="secondary"
          type="button"
          className="submit-button" 
          onClick={addPassenger}
        >
          Add Passenger
        </Button>
        <Button
          variant="info"
          type="button"
          className="submit-button"
          onClick={() => setShowTable(!showTable)} // Toggle the table display
        >
          Show Table
        </Button>
      </Form>

      {showTable && (
        <Table striped bordered hover variant="dark">
          <thead>
            <tr>
              <th>Name</th>
              <th>Birth Date</th>
              <th>Type</th>
            </tr>
          </thead>
          <tbody>
            {passengers.map((passenger, index) => (
              <tr key={index}>
                <td>{passenger.name}</td>
                <td>{passenger.birthdate}</td>
                <td>{passenger.type}</td>
                <td>${passenger.cost.toFixed(2)}</td>
              </tr>
            ))}
          </tbody>
        </Table>
      )}
    </div>
  );
}
export default PassengerDetail;






