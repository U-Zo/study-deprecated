import React, { Component } from 'react';

class PersonList extends Component {
  render() {
    const persons = this.props.xxx;

    return (
      persons.map((person, index) => (
        <tr key={index}>
          <td>{index + 1}</td>
          <td>{person.name}</td>
          <td>{person.age}</td>
        </tr>
      ))
    );
  }
}

export default PersonList;
