import React, { useState } from 'react';
import { Form, Button, Row, Col } from 'react-bootstrap';
const Registration = () => {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    password: '',
    phone: '',
    age: '',
    address: '',
    countryCode: '',
    proofId: '',
    gender: '',
  });

  const [errors, setErrors] = useState({});

  const handleChange = (event) => {
    const { name, value } = event.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    const newErrors = {};
    for (const key in formData) {
      if (!formData[key]) {
        newErrors[key] = `${key.charAt(0).toUpperCase() + key.slice(1)} is required`;
      }
    }
    setErrors(newErrors);

    if (Object.keys(newErrors).length === 0) {
      // Perform registration logic here
      console.log('Registration successful');
    }
  };

  return (
    <Form onSubmit={handleSubmit}>
      <Form.Group as={Row} controlId="name">
        <Form.Label column sm="3">
          Name
        </Form.Label>
        <Col sm="9">
          <Form.Control
            type="text"
            placeholder="Enter name"
            name="name"
            value={formData.name}
            onChange={handleChange}
            isInvalid={!!errors.name}
          />
          <Form.Control.Feedback type="invalid">{errors.name}</Form.Control.Feedback>
        </Col>
      </Form.Group>

      {/* Email */}
      <Form.Group as={Row} controlId="email">
        <Form.Label column sm="3">
          Email
        </Form.Label>
        <Col sm="9">
          <Form.Control
            type="email"
            placeholder="Enter email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            isInvalid={!!errors.email}
          />
          <Form.Control.Feedback type="invalid">{errors.email}</Form.Control.Feedback>
        </Col>
      </Form.Group>

      {/* Password */}
      <Form.Group as={Row} controlId="password">
        <Form.Label column sm="3">
          Password
        </Form.Label>
        <Col sm="9">
          <Form.Control
            type="password"
            placeholder="Enter password"
            name="password"
            value={formData.password}
            onChange={handleChange}
            isInvalid={!!errors.password}
          />
          <Form.Control.Feedback type="invalid">{errors.password}</Form.Control.Feedback>
        </Col>
      </Form.Group>

      {/* Phone */}
      <Form.Group as={Row} controlId="phone">
        <Form.Label column sm="3">
          Phone Number
        </Form.Label>
        <Col sm="9">
          <Form.Control
            type="text"
            placeholder="Enter phone number"
            name="phone"
            value={formData.phone}
            onChange={handleChange}
            isInvalid={!!errors.phone}
          />
          <Form.Control.Feedback type="invalid">{errors.phone}</Form.Control.Feedback>
        </Col>
      </Form.Group>

      {/* Age */}
      <Form.Group as={Row} controlId="age">
        <Form.Label column sm="3">
          Age
        </Form.Label>
        <Col sm="9">
          <Form.Control
            type="number"
            placeholder="Enter age"
            name="age"
            value={formData.age}
            onChange={handleChange}
            isInvalid={!!errors.age}
          />
          <Form.Control.Feedback type="invalid">{errors.age}</Form.Control.Feedback>
        </Col>
      </Form.Group>

      {/* Address */}
      <Form.Group as={Row} controlId="address">
        <Form.Label column sm="3">
          Address
        </Form.Label>
        <Col sm="9">
          <Form.Control
            as="textarea"
            placeholder="Enter address"
            name="address"
            value={formData.address}
            onChange={handleChange}
            isInvalid={!!errors.address}
          />
          <Form.Control.Feedback type="invalid">{errors.address}</Form.Control.Feedback>
        </Col>
      </Form.Group>

      {/* Country Code */}
      <Form.Group as={Row} controlId="countryCode">
        <Form.Label column sm="3">
          Country Code
        </Form.Label>
        <Col sm="9">
          <Form.Control
            type="text"
            placeholder="Enter country code"
            name="countryCode"
            value={formData.countryCode}
            onChange={handleChange}
            isInvalid={!!errors.countryCode}
          />
          <Form.Control.Feedback type="invalid">{errors.countryCode}</Form.Control.Feedback>
        </Col>
      </Form.Group>

      {/* Proof ID */}
      <Form.Group as={Row} controlId="proofId">
        <Form.Label column sm="3">
          Proof ID
        </Form.Label>
        <Col sm="9">
          <Form.Control
            type="text"
            placeholder="Enter proof ID"
            name="proofId"
            value={formData.proofId}
            onChange={handleChange}
            isInvalid={!!errors.proofId}
          />
          <Form.Control.Feedback type="invalid">{errors.proofId}</Form.Control.Feedback>
        </Col>
      </Form.Group>

      {/* Gender */}
      <Form.Group as={Row} controlId="gender">
        <Form.Label column sm="3">
          Gender
        </Form.Label>
        <Col sm="9">
          <Form.Control
            as="select"
            name="gender"
            value={formData.gender}
            onChange={handleChange}
            isInvalid={!!errors.gender}
          >
            <option value="">Select gender</option>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
          </Form.Control>
          <Form.Control.Feedback type="invalid">{errors.gender}</Form.Control.Feedback>
        </Col>
      </Form.Group>

      <Button variant="primary" type="submit">
        Register
      </Button>
    </Form>
  );
};

export default Registration;
