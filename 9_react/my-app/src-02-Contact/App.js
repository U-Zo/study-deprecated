import React, { Component } from 'react';
import { Contact, Contact2 } from './components/Contact';

class App extends Component {
  render() {
    return (
      <div>
        <h1>App Component</h1>
        <Contact />
        <Contact2 />
      </div>
    );
  }
}

export default App;
