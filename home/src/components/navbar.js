import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { Outlet } from "react-router-dom";
import React from 'react';

function Header() {
  return (
    <>
      <Navbar bg="primary" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="/" >IndiaTour</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="/Search">Registeration</Nav.Link>

            <Nav variant="pills" defaultActiveKey="/home"></Nav>
            <Nav.Item>
                <Nav.Link href="/Signin" className='ss' style={{ color: "#fff" }}>Sign in</Nav.Link>
            </Nav.Item>
            <Nav.Link href="/Search" className='ss' style={{ color: "#fff" }}>Search</Nav.Link>
          </Nav>
        </Container>
      </Navbar>
      <Outlet />
      <br />
    </>
  );
}

export default Header;