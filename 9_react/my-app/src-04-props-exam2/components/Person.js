import React, { Component } from 'react';

class Person extends Component {
  render() {
    const {yyy: person, yyy2: index} = this.props;

    return (
      <tr>
        <td>{index + 1}</td>
        <td>{person.name}</td>
        <td>{person.age}</td>
      </tr>
    );
  }
}

export default Person;
