import React, { Component } from 'react';

class Contact extends Component {
  render() {
    const { mesg, mesg2, children: body } = this.props;
    return (
      <div>
        {mesg}
        <br />
        {mesg2}
        <br />
        {body}
      </div>
    );
  }
}

export default Contact;
