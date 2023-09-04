import React, { useState } from 'react';
import { Form, Button,Container,Alert } from 'react-bootstrap';
import './Registration.css'; // Import your custom CSS file



function Registration() {
  const [errors, setErrors] = useState({});
  const [formData, setFormData] = useState({
    firstName: '',
    lastName: '',
    email: '',
    gender: '',
    mobile: '',
    password: '',
    confirmPassword: '',
    birthDate: '',
  });
  const [showSuccessAlert, setShowSuccessAlert] = useState(false);

  function handleInputChange(e) {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  }

  function handleSubmit(e) {
    e.preventDefault();
    console.log('Form submitted');
    const errors = {};

    // Email validation using regular expression
    const emailRegex = /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;
    if (!formData.email.match(emailRegex)) {
      errors.email = 'Invalid email address';
    }

    // Mobile validation (assuming a 10-digit mobile number)
    const mobileRegex = /^\d{10}$/;
    if (!formData.mobile.match(mobileRegex)) {
      errors.mobile = 'Invalid mobile number';
    }

    // Date of birth (DOB) validation using regular expression (YYYY-MM-DD)
    const dobRegex = /^\d{4}-\d{2}-\d{2}$/;
    if (!formData.birthDate.match(dobRegex)) {
      errors.birthDate = 'Invalid date format (YYYY-MM-DD)';
    }

    // Required field validation
    if (!formData.firstName) {
      errors.firstName = 'First name is required';
    }
    if (!formData.lastName) {
      errors.lastName = 'Last name is required';
    }
    if (!formData.gender) {
      errors.gender = 'Gender is required';
    }
    if (!formData.password) {
      errors.password = 'Password is required';
    }
    if (!formData.confirmPassword) {
      errors.confirmPassword = 'Confirm password is required';
    }

    // Check for password match
    if (formData.password !== formData.confirmPassword) {
      errors.confirmPassword = 'Passwords do not match';
    }

    // If there are errors, set them in state and prevent form submission
    if (Object.keys(errors).length > 0) {
      setErrors(errors);
      return;
    }
    setErrors({});

    // Create a data object with your form fields
    const data = {
      email: formData.email,//entity name as it is = veriable.name at form
      firstname: formData.firstName,
      gender: formData.gender,
      lastname: formData.lastName,
      mobile: formData.mobile,
      password: formData.password,
      dob: formData.birthDate,
    };

    // Send the data to the backend server
    fetch("http://localhost:8080/api/CustomerController", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data),
    })
      .then((res) => {
        if (!res.ok) {
          throw new Error("Network response was not ok");
        }
        // Check if the response has data before trying to parse it as JSON
        const contentType = res.headers.get("content-type");
        if (contentType && contentType.includes("application/json")) {
          return res.json();
        } else {
          return {}; // Return an empty object if the response is not JSON
        }
      })
      .then((response) => {
        if (Object.keys(response).length === 0) {
          // Registration was successful
          setShowSuccessAlert(true); // Show the success alert
        } else {
          alert("Registration successful:", response);
          // Handle successful registration, e.g., redirecting to a login page
        }
      })
      .catch((error) => {
        console.error("Registration error:", error);
        // Handle registration errors here, e.g., display error messages to the user
      });
    
  }

  return (
    <Container className="text-center">
     <Form onSubmit={handleSubmit} className="my-5 p-3 border rounded">
        <h1 className="mb-4">Registration 📜</h1>
      <Form.Group controlId="firstName">
        <Form.Label>First Name</Form.Label>
        <Form.Control
          type="text"
          name="firstName"
          value={formData.firstName}
          onChange={handleInputChange}
          placeholder="Enter your first name"
          className="form-control-sm custom-input"
          
        />
        {errors.firstName && (
          <Form.Text className="text-danger">{errors.firstName}</Form.Text>
        )}
      </Form.Group>

      <Form.Group controlId="lastName">
        <Form.Label>Last Name</Form.Label>
        <Form.Control
          type="text"
          name="lastName"
          value={formData.lastName}
          onChange={handleInputChange}
          placeholder="Enter your last name"
        />
        {errors.lastName && (
          <Form.Text className="text-danger">{errors.lastName}</Form.Text>
        )}
      </Form.Group>

      <Form.Group controlId="email">
        <Form.Label>Email</Form.Label>
        <Form.Control
          type="email"
          name="email"
          value={formData.email}
          onChange={handleInputChange}
          placeholder="Enter your email"
        />
        {errors.email && (
          <Form.Text className="text-danger">{errors.email}</Form.Text>
        )}
      </Form.Group>

      <Form.Group controlId="gender">
        <Form.Label>Gender</Form.Label>
        <Form.Control
          as="select"
          name="gender"
          value={formData.gender}
          onChange={handleInputChange}
        >
          <option value="">Select Gender</option>
          <option value="male">Male</option>
          <option value="female">Female</option>
          <option value="other">Other</option>
        </Form.Control>
        {errors.gender && (
          <Form.Text className="text-danger">{errors.gender}</Form.Text>
        )}
      </Form.Group>

      <Form.Group controlId="mobile">
        <Form.Label>Mobile</Form.Label>
        <Form.Control
          type="text"
          name="mobile"
          value={formData.mobile}
          onChange={handleInputChange}
          placeholder="Enter your mobile number"
        />
        {errors.mobile && (
          <Form.Text className="text-danger">{errors.mobile}</Form.Text>
        )}
      </Form.Group>

      <Form.Group controlId="password">
        <Form.Label>Password</Form.Label>
        <Form.Control
          type="password"
          name="password"
          value={formData.password}
          onChange={handleInputChange}
          placeholder="Enter your password"
        />
        {errors.password && (
          <Form.Text className="text-danger">{errors.password}</Form.Text>
        )}
      </Form.Group>

      <Form.Group controlId="confirmPassword">
        <Form.Label>Confirm Password</Form.Label>
        <Form.Control
          type="password"
          name="confirmPassword"
          value={formData.confirmPassword}
          onChange={handleInputChange}
          placeholder="Confirm your password"
        />
        {errors.confirmPassword && (
          <Form.Text className="text-danger">{errors.confirmPassword}</Form.Text>
        )}
      </Form.Group>

      <Form.Group controlId="birthDate">
        <Form.Label>Birth Date</Form.Label>
        <Form.Control
          type="text"
          name="birthDate"
          value={formData.birthDate}
          onChange={handleInputChange}
          placeholder="Enter your birth date (YYYY-MM-DD)"
        />
        {errors.birthDate && (
          <Form.Text className="text-danger">{errors.birthDate}</Form.Text>
        )}
      </Form.Group>

      <Button variant="primary" type="submit" className="mt-3">
        Register
      </Button>
    </Form>
    {showSuccessAlert && (
        <Alert variant="success" className="mt-3">
          Registration successful! <br /> Please Login Again  {/* You can customize this message */}
        </Alert>
      )}
    </Container>
  );
}


export default Registration;

