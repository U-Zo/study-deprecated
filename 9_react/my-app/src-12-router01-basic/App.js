import React, { Component } from 'react';
import { BrowserRouter, Route } from 'react-router-dom';
import Error from './components/Error';
import Home from './components/Home';
import Login from './components/Login';
import Member from './components/Member';

class App extends Component {
  render() {
    return (
      <BrowserRouter>
        <Route path="/" component={Home} exact />
        <Route path="/member" component={Member} exact />
        <Route path="/login" component={Login} exact />
        <Route path="*" component={Error} />
      </BrowserRouter>
    );
  }
}

export default App;
