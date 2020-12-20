import React, { Component } from 'react';
import PropTypes from 'prop-types';

class Contact extends Component {
  render() {
    return (
      <div>
        <h1>{this.props.mesg}</h1>
        <h1>{this.props.age}</h1>
      </div>
    );
  }
}

Contact.defaultProps = {
  mesg: '유관순',
};

Contact.propTypes = {
  mesg: PropTypes.string,
  age: PropTypes.number.isRequired,
};

export default Contact;
