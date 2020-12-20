import React, { Component } from 'react';
import PropTypes from 'prop-types';

class Contact extends Component {
  render() {
    const { name, age, phones, my, isMarried } = this.props;

    return (
      <div>
        <h1>{name}</h1>
        <h1>{age}</h1>
        <h1>{phones[0]}</h1>
        <h1>{isMarried + ""}</h1>
        <h1>{my()}</h1>
      </div>
    );
  }
}

Contact.defaultProps = {
  name: '유관순',
  age: 20,
};

Contact.propTypes = {
  name: PropTypes.string,
  age: PropTypes.number,
  phones: PropTypes.array,
  my: PropTypes.func,
  isMarried: PropTypes.bool,
};

export default Contact;
