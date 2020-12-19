import React, { Component } from 'react';
import './App.css';
import Contact from './components/Contact';
import Contact2 from './components/Contact2';

class App extends Component {
  render() { // 화면에 DOM을 그리는 함수
    return (
      <div>
        <h1>App Component</h1>
        <Contact mesg="홍길동" mesg2="10" />
        <Contact2 mesg="이순신" mesg2="50" />
      </div>
    );
  }
}

export default App;
