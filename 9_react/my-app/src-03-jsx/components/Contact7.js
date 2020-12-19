import React, { Component } from 'react';

class Contact7 extends Component {
  render() {
    const myStyle = {
      fontSize: '50px',
      background: 'yellow',
    };

    return (
      <div>
        <p style={myStyle}>myStyle 적용됨1</p>
        <p style={{ fontSize: '20px', background: 'red' }}>myStyle 적용됨2</p>
      </div>
    );
  }
}

export default Contact7;
