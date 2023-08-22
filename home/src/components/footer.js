import React from "react";
const Footer = () => {
    const currentYear = new Date().getFullYear();
  
    return (
      <div className="noprint">
          {/*footer section*/}
          <footer className ="text-muted py-5 bg-dark" id="contactus">
              <div className ="container">
                  <div className ="row">
                      <div className ="col-md-2">
                          {/* <img src="/Images/Logo_img.svg" width="150" height="auto" className ="ms-md-5 img-fluid" /> */}
                          <p className="textbottom">
                              <b>Etour</b>
                          </p>


                      </div>
                      <div className ="col-md-6">
                          
                              <ul id="footer_text">
                                  <li>
                                      <span style={{color:"white",fontSize:"medium"}}>Contact Us</span>
                                  </li>
                                  <li>
                                      <i className ="bi bi-envelope"></i> <a href="mailto:etourgrp11@gmail.com">etourgrp11@gmail.com</a>
                                  </li>
                                  <li>
                                      <i className ="bi bi-telephone"></i><span>+91 123456789</span>
                                  </li>
                                  <li>
                                      <i className ="bi bi-whatsapp"></i><span>+91 9765167306</span>
                                  </li>
                                  {/* <li>
                                      <p className ="mb-0">To Know More About Us<Link to="About">About Us</Link></p>
                                  </li> */}
                                
                              </ul>
                          
                      </div>
                      <div className ="col-md-4">
                          <p className ="float-end mb-1">
                              <a href="#">Back to top</a>
                          </p>
                      </div>

                  </div>

              </div>
          </footer>
      </div>
  );

  };
  
  export default Footer;

