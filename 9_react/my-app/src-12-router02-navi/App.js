import React, { Component } from 'react';
import { BrowserRouter, Link, Route, Switch } from 'react-router-dom';
import Home from './components/Home';
import Login from './components/Login';
import Member from './components/Member';
import NoMatch from './components/NoMatch';
import Navi from './navi/Navi';

class App extends Component {
  render() {
    return (
      <>
        <BrowserRouter>
          <Navi />
          <hr />
          <Switch>
            <Route path="/" component={Home} exact />
            <Route path="/member" component={Member} exact />
            <Route path="/login" component={Login} exact />
            <Route component={NoMatch} />
          </Switch>
        </BrowserRouter>
      </>
    );
  }
}

export default App;
