import React, { useState } from 'react';
import { Form, Button } from 'react-bootstrap';

function Registration() {
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

  const [errors, setErrors] = useState({});

  function handleInputChange(e) {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  }

  function handleSubmit(e) {
    e.preventDefault();

    // Validation for email
    const emailRegex = /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;
    if (!formData.email.match(emailRegex)) {
      setErrors({ email: 'Invalid email address.' });
      return;
    }

    // Validation for mobile number: should be 10 digits and contain only numbers
    const mobileRegex = /^[0-9]{10}$/;
    if (!formData.mobile.match(mobileRegex)) {
      setErrors({ mobile: 'Mobile number must be 10 digits and contain only numbers.' });
      return;
    }

    // Validation for birth date: should be in the format YYYY-MM-DD
    const birthDateRegex = /^\d{4}-\d{2}-\d{2}$/;
    if (!formData.birthDate.match(birthDateRegex)) {
      setErrors({ birthDate: 'Invalid birth date format (YYYY-MM-DD).' });
      return;
    }

    // Validation for password: add your password validation logic here
    // For example, you can check if it meets certain complexity criteria.

    // Validation for password confirmation
    if (formData.password !== formData.confirmPassword) {
      setErrors({ confirmPassword: 'Passwords do not match.' });
      return;
    }

    // Reset errors if there are no validation errors
    setErrors({});

    // Continue with the form submission logic here.
    // You can add your additional validation and submission code.
  }

  return (
    <Form onSubmit={handleSubmit}>
      <Form.Group controlId="firstName">
        <Form.Label>First Name</Form.Label>
        <Form.Control
          type="text"
          name="firstName"
          value={formData.firstName}
          onChange={handleInputChange}
          placeholder="Enter your first name"
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

      <Button variant="primary" type="submit">
        Register
      </Button>
    </Form>
  );
}

export default Registration;