import React, { Component } from 'react';

class Contact2 extends Component {
  render() {
    const { mesg, mesg2 } = this.props;

    return (
      <div>
        <h1>Contact2</h1>
        <h1>{mesg}</h1>
        <h1>{mesg2}</h1>
      </div>
    );
  }
}

export default Contact2;
