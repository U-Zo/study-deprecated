import React, { Component } from 'react';

const arr = ['E', 'F', 'G'];
const my = () => arr.map((row, idx) => <li key={idx}>{row}</li>);

class Contact21 extends Component {
  render() {
    return (
      <div>
        <ul>
          {my()}
        </ul>
      </div>
    );
  }
}

export default Contact21;
