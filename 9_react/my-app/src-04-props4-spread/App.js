import React, { Component } from 'react';
import './App.css';
import First from './components/First';

class App extends Component {
  render() {
    return (
      <div>
        {/* first -> second -> third 연산자 사용 */}
        <First id="홍길동" pw="1234" />
      </div>
    );
  }
}

export default App;
