import axios from 'axios';

const instance = axios.create(
    {
        baseURL: "http://localhost:8080/",
    }
);

instance.get('tour/sectors')

export default instance;