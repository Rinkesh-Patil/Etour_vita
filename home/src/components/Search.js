import React, { useState } from 'react';

import locdata from './Locations';
import { Card } from 'react-bootstrap';
import './search.css';

function LocationCard({ location }) {
    return (
        <a href={location.link}>
            <Card style={{ width: '18rem' }} className='fcontainer'>
                <Card.Img variant="top" src={location.imagePath} />
                <Card.Body>
                    <Card.Title>{location.name}</Card.Title>
                </Card.Body>
            </Card>
        </a>
    );
}

function LocationSearch() {
    const [searchTerm, setSearchTerm] = useState('');
    const [searchedLocation, setSearchedLocation] = useState(null);

    const handleSearch = () => {
        const foundLocation = locdata.find((location) =>
            location.name.toLowerCase() === searchTerm.toLowerCase()
        );

        if (foundLocation) {
            setSearchedLocation(foundLocation);
        } else {
            setSearchedLocation(null); // Clear the displayed location if not found
        }
    };

    return (
        <div>
            <h1>Location Search</h1>
            <input
                type="text"
                placeholder="Search locations..."
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
            />
            <button onClick={handleSearch}>Search</button>
            {searchedLocation ? (
                <div className="location-card">
                    <LocationCard location={searchedLocation} />
                </div>
            ) : searchTerm !== '' ? (
                <div className="location-card">
                    <p>There is no location.</p>
                </div>
            ) : null} {/* Display nothing initially */}
        </div>
    );
}

export default LocationSearch;