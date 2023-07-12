import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import Form from 'react-bootstrap/Form';

function App() {
  return (
    <div className="container">
      <div className="row">
        <div className="col">
          <h3 className='border border-primary p-3 mt-5 text-center'>Login As Admin</h3>
          <Form className="border border-primary p-3">
            <div className="form-group">
              <label for="email">Email address</label>
              <input type="email" className="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email" />
              <small id="email" className="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
            <div className="form-group">
              <label for="password">Password</label>
              <input type="password" className="form-control" id="password" placeholder="Password" />
            </div>
            <button type="submit" className="btn btn-primary mt-3" >Submit</button>
          </Form>
        </div>
        <div className="col">
          <h3 className='border border-primary p-3 mt-5  text-center'>Login As Student</h3>
          <Form className="border border-primary p-3">
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
  );
}

export default App;
