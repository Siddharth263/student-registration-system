import React from 'react'

export default function Footer() {
  return (
    <>
      <div className="bg-secondary">
        <div className="container mt-10">
          <div className="row">
            <div className="col">
              <img src="./images/logo1.jpg" width="30" height="30" className="mt-4" alt="logo" />
            </div>
            <div className="col">
              <p className="display-6 mb-2 mb-lg-0"> Follow me on:</p>
              <a href="https://twitter.com/Pcool1217" target="_blank">
                <i className="fa-brands fa-twitter me-2"></i>
              </a>
              <a href="https://github.com/Siddharth263" target="_blank">
                <i className="fa-brands fa-github me-2"></i>
              </a>
              <a href="https://www.linkedin.com/in/priyanshu-2387261b8/">
                <i className="fa-brands fa-linkedin-in me-2"></i>
              </a>
            </div>
          </div>
          <div className="row border-top mt-2 p-2">
            <div className="col text-center">
              <i className="fa-regular fa-copyright"></i> 2023 by Priyanshu Lal | Full Stack Java Developer
            </div>
          </div>
        </div>
      </div>
    </>
  )
}
