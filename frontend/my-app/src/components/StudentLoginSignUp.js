import React from 'react'
import Form from 'react-bootstrap/Form';
import 'bootstrap/dist/css/bootstrap.min.css';

export default function StudentLoginSignUp() {
  return (
    <div className="container">
      <div className="row">
        <div className="col">
          <h3 className='border rounded bg-light p-3 mt-5 text-center'>Register for a Course</h3>
          <Form className="border rounded bg-light p-3">
            <div className="form-group">
              <label htmlFor="name">Full Name</label>
              <input type="text" className="form-control" id="name" aria-describedby="fName" placeholder="Enter your full name" />
              <label htmlFor="city" className='mt-2'>City</label>
              <input type="text" className="form-control" id="city" aria-describedby="fName" placeholder="Enter your City" />
              <label for="email" className='mt-2'>Email address</label>
              <input type="email" className="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email" />
              <small id="email" className="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
            <div className="form-group">
              <label for="password" className='mt-2'>Password</label>
              <input type="password" className="form-control" id="password" placeholder="Password" />
            </div>
            <label htmlFor="custom-select" className='mt-2'>Select Your Course</label>
            <select className="custom-select mt-2 w-100 p-1 rounded border">
              <option selected>Select Your Course</option>
              <option value="1">Web Development</option>
              <option value="2">Data Analyst</option>
            </select>
            <br />
            <button type="submit" className="btn btn-primary mt-3" >Submit</button>
          </Form>
        </div>
        <div className="col">
          <h3 className='border rounded bg-light p-3 mt-5  text-center'>Login to your Account</h3>
          <Form className="border rounded bg-light p-3">
            <div className="form-group">
              <label for="email">Email address</label>
              <input type="email" className="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email" />
              <small id="emailHelp" className="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
            <div className="form-group">
              <label for="password">Password</label>
              <input type="password" className="form-control" id="password" placeholder="Password" />
            </div>
            <button type="submit" className="btn btn-primary mt-3">Submit</button>
          </Form>
        </div>
      </div>
    </div>
  )
}
