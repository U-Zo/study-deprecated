import React, { Component } from 'react';

class Contact extends Component {
  render() {
    const mesg = 'world';

    return (
      <div>
        <h1>
          {mesg} {100}
          {'Hello'}
        </h1>
      </div>
    );
  }
}

export default Contact;
