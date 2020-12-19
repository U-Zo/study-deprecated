import React, { Component } from 'react';

class Contact2 extends Component {
  render() {
    const arr = ['A', 'B', 'C', 'D'];

    return (
      <div>
        <ul>
          {arr.map((row, idx) => (
            <li key={idx}>{row}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default Contact2;
