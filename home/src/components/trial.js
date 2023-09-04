import { useEffect, useState } from "react";
import axios from "axios";
import instance from "./axios";

function Trial() {
  const [tri, setTri] = useState([]);

  useEffect(() => {
    axios.get(instance.baseURL)
      .then((response) => {
        setTri(response.tri);
        console.log(tri); // Logging the data received from the API
      })
      .catch((error) => {
        console.error("Error fetching data:", error);
      });
  }, []); // Empty dependency array means this effect runs only once, similar to componentDidMount

  return null; // This is just a placeholder return since useEffect doesn't require a return value
}

export default Trial;
