import React from 'react';
import Form from 'react-bootstrap/Form';
import 'bootstrap/dist/css/bootstrap.min.css';

export default function AdminLogin() {
  return (
    <div className="container">
      <div className="row">
        <div className="col"></div>
        <div className="col align-self-center">
          <h3 className='border rounded bg-light p-3 mt-5  text-center'>Login to your Account</h3>
          <Form className="border rounded bg-light p-3">
            <div className="form-group">
              <label for="email">Email address</label>
              <input type="email" className="form-control mt-1" id="email" aria-describedby="emailHelp" placeholder="Enter email" />
            </div>
            <div className="form-group">
              <label for="password" className='mt-3'>Password</label>
              <input type="password" className="form-control mt-1" id="password" placeholder="Password" />
            </div>
            <button type="submit" className="btn btn-primary mt-3">Submit</button>
          </Form>
        </div>
        <div className="col"></div>
      </div>
    </div>
  )
}
