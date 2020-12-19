import React, { Component } from 'react';
import './App.css';
import PersonList from './components/PersonList';

class App extends Component {
  persons = [
    //this 키워드로 접근
    { name: '홍길동', age: 20 },
    { name: '이순신', age: 30 },
    { name: '유관순', age: 40 },
    { name: '강감찬', age: 50 },
  ];

  render() { // 화면에 DOM을 그리는 함수
    return (
      <div>
        <h1>App Component</h1>
        <table border="1">
          <thead>
          <tr>
            <th>번호</th>
            <th>이름</th>
            <th>나이</th>
          </tr>
          </thead>
          <tbody>
          <PersonList xxx={this.persons} />
          </tbody>
        </table>
      </div>
    );
  }
}

export default App;
