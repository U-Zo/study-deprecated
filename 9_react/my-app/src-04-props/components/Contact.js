import React, { Component } from 'react';

class Contact extends Component {
  render() {
    // template 함수
    console.log(this);
    const mesg = this.props.mesg;
    const mesg2 = this.props.mesg2;

    return (
      <div>
        <h1>Contact1</h1>
        <h1>{mesg}</h1>
        <h1>{this.props.mesg}</h1>
        <h1>{this.props.mesg2}</h1>
        <h1>{mesg2}</h1>
      </div>
    );
  }
}

export default Contact;
