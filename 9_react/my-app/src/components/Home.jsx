import React from 'react';

const Home = ({ history }) => {
  return (
    <div>
      <h1>Home</h1>
      <button onClick={() => history.push('/login')}>로그인</button>
    </div>
  );
};

export default Home;
