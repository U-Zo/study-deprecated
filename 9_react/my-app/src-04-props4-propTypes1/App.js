import React, { Component } from 'react';
import './App.css';
import Contact from './components/Contact';

class App extends Component {
  render() {
    return (
      <div>
        <Contact mesg="홍길동" age={10} />
        <Contact />
      </div>
    );
  }
}

export default App;
