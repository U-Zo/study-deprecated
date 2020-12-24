import React, { Component } from 'react';
import './App.css';
import Child from './components/Child';

class App extends Component {
  render() {
    return (
      <div>
        <Child ref={ref => {
          console.log('ref ===', ref);
          this.x = ref;
        }} />
        <button onClick={() => this.x.info()}>OK</button>
      </div>
    );
  }
}

export default App;
