import React, { useState } from 'react';
import './Login.css'; // Import your custom CSS for additional styling
import { useNavigate } from 'react-router-dom';
const Login = () => {
  const [mobile, setMobile] = useState('');
  const [password, setPassword] = useState('');
  const [loginMessage, setLoginMessage] = useState('');
  const navigate = useNavigate();
  const handleSubmit = async () => {
    try {
      const url = new URL('http://localhost:8080/api/CustomerController/login');
      url.searchParams.append('mobile', mobile);
      url.searchParams.append('password', password);

      const response = await fetch(url.toString());
      console.log('Response:', response);

      if (response.ok) {
        const data = await response.json();
        console.log('Data:', data);

        setLoginMessage('Login successful');
        navigate(`/PassengerDetail/4`);

      } else {
        // Handle error response from the server
        setLoginMessage('Login failed: Invalid credentials ');
        // navigate("/");
      }
    } catch (error) {
      // Handle network or other errors
      console.error('An error occurred:', error);
    }
  };
  const handleSignup = () => {
    navigate(`/Registration`)
  };

  return (
    <div className="login-container">
      <div className="login-card">
        <h1 className="login-title">Login</h1>
        <form className="login-form">
          <div className="form-group">
            <label className="form-label">Mobile:</label>
            <input
              type="text"
              className="form-input"
              value={mobile}
              onChange={(e) => setMobile(e.target.value)}
            />
          </div>
          <div className="form-group">
            <label className="form-label">Password:</label>
            <input
              type="password"
              className="form-input"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
            />
          </div>
          <div className="form-actions">
            <button type="button" className="login-button" onClick={handleSubmit}>
              Login
            </button>
            <button type="button" className="sign-up-button" onClick={handleSignup}>
              Sign Up
            </button>
          </div>
        </form>
        <p className="login-message">{loginMessage}</p>
      </div>
    </div>
  );
};

export default Login;
