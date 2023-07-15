import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

export default function Navbar() {
  return (
    <>
      <nav className="navbar navbar-expand-md navbar-dark bg-dark">
        <a className="navbar-brand ms-2 " href="./index.html">
          <img src="./images/logo1.jpg" width="30" height="30" className="d-inline-block align-top" alt="logo" />
        </a>
        <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarNav">
          <ul className="navbar-nav ms-auto mb-2 mb-lg-0">
            <li className="nav-item active">
              <a className="nav-link" href="./index.html">Home</a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/">Login/Signup</a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/">Admin Login</a>
            </li>
          </ul>
        </div>
      </nav>
    </>
  )
}
