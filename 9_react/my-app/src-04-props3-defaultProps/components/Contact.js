import React, { Component } from 'react';

class Contact extends Component {
  render() {
    const { mesg: a, mesg2: b } = this.props;

    return (
      <div>
        <h1>{a}</h1>
        <h1>{b}</h1>
      </div>
    );
  }
}

Contact.defaultProps = {
  mesg: '유관순',
  mesg2: 200,
};

export default Contact;
