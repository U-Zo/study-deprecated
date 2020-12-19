import React, { Component } from 'react';
import Person from './Person';

class PersonList extends Component {
  render() {
    const persons = this.props.xxx;

    return (
      <tbody>
      {persons.map(
        (person, index) => <Person key={index} yyy={person} yyy2={index} />)}
      </tbody>
    );
  }
}

export default PersonList;
