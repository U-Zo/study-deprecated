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

    const personTag = persons.map((person, index) => (
      <div key={index}>
        {person.name}: {person.age}
      </div>
    ));

    return (
      <div>
        <Contact xxx="홍길동" />
        {personTag}
      </div>
    );
  }
}

export default App;
