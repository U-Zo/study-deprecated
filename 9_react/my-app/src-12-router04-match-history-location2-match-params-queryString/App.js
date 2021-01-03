import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Home from './components/Home';
import Login from './components/Login';
import Member from './components/Member';
import NoMatch from './components/NoMatch';
import Navi from './navi/Navi';

const App = () => {
  return (
    <>
      <BrowserRouter>
        <div>
          <Navi />
        </div>
        <hr />
        <Switch>
          <Route component={Home} path="/" exact />
          <Route component={Login} path="/login" exact />
          <Route component={Member} path={['/member/:id', '/member']} exact />
          <Route component={NoMatch} />
        </Switch>
      </BrowserRouter>
    </>
  );
};

export default App;
