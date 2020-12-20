import React, { Component } from 'react';
import './App.css';
import Contact from './components/Contact';

class App extends Component {
  name = '홍길동';
  age = 20;
  phones = ['010', '011'];

  my() {
    console.log('my 함수');
    return 'Hello';
  };

  isMarried = false;

  render() {
    return (
      <div>
        <Contact
          name={this.name}
          age={this.age}
          phones={this.phones}
          my={this.my}
          isMarried={this.isMarried}
        />
      </div>
    );
  }
}

export default App;
