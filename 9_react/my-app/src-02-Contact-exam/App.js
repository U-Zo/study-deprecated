import React, { Component } from 'react';
import './App.css';
import Contact from './components/Contact';

class App extends Component {
  render() { // 화면에 DOM을 그리는 함수
    return (
      <div>
        <h1>App Component</h1>
        <Contact />
      </div>
    );
  }
}

export default App;
