import React from 'react';
import { NavLink } from 'react-router-dom';

const Navi = () => {
  return (
    <div>
      <div>
        <NavLink to="/">Home</NavLink>&nbsp;&nbsp;
        <NavLink to="/login">Login</NavLink>&nbsp;&nbsp;
        <NavLink to="/member/홍길동?xxx=100">Member</NavLink>
      </div>
    </div>
  );
};

export default Navi;
