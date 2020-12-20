import React, { Component } from 'react';
import './App.css';
import Contact from './components/Contact';

class App extends Component {
  render() {
    const persons = [
      { name: '홍길동', age: '10' },
      { name: '유관순', age: '20' },
      { name: '강감찬', age: '30' },
    ];

    const contactProps = persons.map((person, index) => (
      <Contact key={index} username={person.name} />
    ));

    return (
      <div>
        {contactProps}
      </div>
    );
  }
}

export default App;
