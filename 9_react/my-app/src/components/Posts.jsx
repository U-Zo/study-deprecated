import React from 'react';
import { Link, Route } from 'react-router-dom';

const Post = ({ match }) => {
  return <div>{match.params.title}입니다.</div>;
};

const Posts = () => {
  return (
    <div>
      <h1>포스트</h1>
      <Link to="/posts/react">React</Link>&nbsp;&nbsp;
      <Link to="/posts/redux">Redux</Link>&nbsp;&nbsp;
      <Link to="/posts/angular">Angular</Link>&nbsp;&nbsp;
      <Route component={Post} path="/posts/:title" />
    </div>
  );
};

export default Posts;
