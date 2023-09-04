import React from "react";
import Carousel from "react-bootstrap/Carousel";

export default function Carosel() {
  return (
    <Carousel data-bs-theme='dark'>
      <Carousel.Item>
        <img
          className='d-block w-100'
          src={"/images/carousel/img22.jpg"}
          alt='First slide'
        />
        <Carousel.Caption></Carousel.Caption>
      </Carousel.Item>

      <Carousel.Item>
        <img
          className='d-block w-100'
          src={"/images/carousel/img21.jpg"}
          alt='First slide'
        />
        <Carousel.Caption></Carousel.Caption>
      </Carousel.Item>

      <Carousel.Item>
        <img
          className='d-block w-100'
          src={"/images/carousel/img23.jpg"}
          alt='First slide'
        />
        <Carousel.Caption></Carousel.Caption>
      </Carousel.Item>

      <Carousel.Item>
        <img
          className='d-block w-100'
          src={"/images/carousel/img24.jpg"}
          alt='Second slide'
        />
        <Carousel.Caption></Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          className='d-block w-100'
          src={"/images/carousel/img25.jpg"}
          alt='Third slide'
        />
        <Carousel.Caption></Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          className='d-block w-100'
          src={"/images/carousel/img26.jpg"}
          alt='Third slide'
        />
    

        <Carousel.Caption></Carousel.Caption>
      </Carousel.Item>
       <Carousel.Item>
        <img
          className='d-block w-100'
          src={"/images/carousel/img27.jpg"}
          alt='Third slide'
        />
        <Carousel.Caption></Carousel.Caption>
      </Carousel.Item>
      
      <Carousel.Item>
        <img
          className='d-block w-100'
          src={"/images/carousel/img28.jpg"}
          alt='Third slide'
        />
        <Carousel.Caption></Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          className='d-block w-100'
          src={"/images/carousel/img29.jpg"}
          alt='Third slide'
        />
        <Carousel.Caption></Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          className='d-block w-100'
          src={"/images/carousel/img30.jpg"}
          alt='Third slide'
        />
        <Carousel.Caption></Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  );
}