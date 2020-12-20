import React, { Component } from 'react';
import PropTypes from 'prop-types';

class Contact extends Component {
  render() {
    return (
      <div>
        <h1>{this.props.mesg}</h1>
        <h1>{this.props.mesg2}</h1>
      </div>
    );
  }
}

Contact.defaultProps = {
  mesg: '유관순',
  mesg2: 20,
};

Contact.propTypes = {
  mesg: PropTypes.string,
  mesg2: PropTypes.number,
};

export default Contact;
