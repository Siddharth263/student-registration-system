import React from 'react'

export default function Homepage() {
  return (
    <>
      <div className="container-md mt-5 text-center">
        <div className="row gx-0 gap-3">
          <div className="col border rounded">
            <div className="p-3">
              <img width="150" height="150" src="./images/daLogo.png" alt="image1" />
              <h1 className="display-6">Data Analyst</h1>
              <p className="small">Lorem ipsum dolor sit amet consectetur adipisicing elit. Rerum, fugit labore. Obcaecati, vel. Ullam magni animi id fugit aliquid amet distinctio, doloribus quasi, dignissimos saepe deleniti, architecto delectus quas ut.</p>
              <button type="button" class="btn btn-outline-primary">Regiser To Become a Data Analyst</button>
              {/* Todo: add links to the buttons to go on respective pages */}
            </div>
          </div>
          <div className="col border rounded">
            <div className="p-3">
              <img width="150" height="150" src="./images/sdLogo.svg" alt="image1" />
              <h1 className="display-6">Software Developer</h1>
              <p className="small">Lorem ipsum dolor sit amet consectetur adipisicing elit. Rerum, fugit labore. Obcaecati, vel. Ullam magni animi id fugit aliquid amet distinctio, doloribus quasi, dignissimos saepe deleniti, architecto delectus quas ut.</p>
              <button type="button" class="btn btn-outline-primary">Regiser To Become a Software Developer</button>
            </div>
          </div>
        </div>
      </div>
    </>
  )
}
