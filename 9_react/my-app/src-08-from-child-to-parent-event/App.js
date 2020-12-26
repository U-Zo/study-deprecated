import React, { Component } from 'react';
import './App.css';
import Child from './components/Child';
import Child2 from './components/Child2';

class App extends Component {
  appHandleEvent(e) {
    console.log('App.appHandleEvent');
    console.log(e);
  }

  render() {
    const mesg = '홍길동';
    const appHandleEvent = this.appHandleEvent.bind(this);

    return (
      <div>
        <Child mesg={mesg} />
        <Child2 mesg={mesg} onEvent={appHandleEvent} />
      </div>
    );
  }
}

export default App;
