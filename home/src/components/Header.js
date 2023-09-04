import React from 'react';
import { Nav, Navbar } from 'react-bootstrap';
import { Outlet } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import Registration from './Registration';

function Header() {
  const headerContainerStyle = {
    backgroundColor: '#212121',
    padding: '15px 0',
    boxShadow: '0 2px 4px rgba(0, 0, 0, 0.2)',
  };

  const brandStyle = {
    color: '#FFC107',
    fontWeight: 'bold',
    fontSize: '28px',
    textTransform: 'uppercase',
    letterSpacing: '2px',
  };

  const navLinkStyle = {
    color: '#FFFFFF',
    fontSize: '16px',
    marginRight: '20px',
    textDecoration: 'none',
    transition: 'color 0.3s ease',
    fontWeight: '500',
    letterSpacing: '1px',
  };

  const searchInputStyle = {
    borderRadius: '4px',
    padding: '8px 12px',
    border: 'none',
    marginRight: '10px',
    boxShadow: '0 1px 2px rgba(0, 0, 0, 0.1)',
    fontSize: '14px',
  };

  const searchButtonStyle = {
    backgroundColor: '#FFC107',
    color: '#212121',
    border: 'none',
    borderRadius: '4px',
    padding: '8px 16px',
    cursor: 'pointer',
    fontSize: '14px',
    transition: 'background-color 0.3s ease',
    fontWeight: 'bold',
  };

  const searchButtonHoverStyle = {
    backgroundColor: '#FFA000',
  };

  const navLinkHoverStyle = {
    color: '#FFC107',
  };

  return (
    <div style={headerContainerStyle}>
      <Navbar expand="lg">
        <Navbar.Brand href="/Home" style={brandStyle}>
          INDIA TOUR & TRAVELS ✈️🌍
        </Navbar.Brand>
        <Navbar.Toggle aria-controls="navbarSupportedContent" />
        <Navbar.Collapse id="navbarSupportedContent">
          <Nav className="me-auto">
            <Nav.Link href="/Home" style={navLinkStyle}>
              Home 🏠
            </Nav.Link>
            <Nav.Link href="/Registration" style={navLinkStyle}>
              Register Here 🙋
            </Nav.Link>
            <Nav.Link href="/Login" style={navLinkStyle}>
              Login 👈
            </Nav.Link>
            <Nav.Link href="/Search" style={navLinkStyle}>
              Search 🤔
            </Nav.Link>
            {/* Add dropdown menu items here */}
          </Nav>
          {/* <form className="d-flex">
            <input
              className="form-control"
              type="search"
              placeholder="Search"
              aria-label="Search"
              style={searchInputStyle}
            />
            <button
              className="btn"
              type="submit"
              style={{ ...searchButtonStyle, ...searchButtonHoverStyle }}
            >
              Search
            </button>
          </form> */}
        </Navbar.Collapse>
      </Navbar>
    </div>
  );
}

export default Header;
