import React from "react";


const Footer = () => {
    const currentYear = new Date().getFullYear();
  
    return (
      <footer
        style={{
          position: "fixed",
          bottom: "0",
          left: "0",
          width: "100%",
          backgroundColor: "#343a40",
          padding: "20px",
          display: "flex",
          justifyContent: "center",
          alignItems: "center",
          //position:"absolute",
          scrollY:100
        }}
      >
        <p style={{ margin: "0", marginRight: "10px", color: "white" }}>
          &#169; {currentYear} Created by Puneet, Akash, Harshal and Sarang 
        </p>
        <div style={{ marginLeft: "20px" }}>
          <a
            href="https://github.com/example"
            target="_blank"
            rel="noopener noreferrer"
          >
           
          </a>
          <a
            href="https://leetcode.com/example"
            target="_blank"
            rel="noopener noreferrer"
          >
          </a>
        </div>
      </footer>
    );
  };
  
  export default Footer;

