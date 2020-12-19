import React, { Component } from 'react';

class Contact4 extends Component {
  render() {
    const multi = [
      <span key="_1">Hello</span>,
      <span key="_2">World</span>,
    ];

    return (
      <div>
        {multi}
      </div>
    );
  }
}

export default Contact4;
