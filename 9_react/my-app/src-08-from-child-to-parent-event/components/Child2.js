import React, { Component } from 'react';

class Child2 extends Component {
  render() {
    const { mesg, onEvent } = this.props;
    const p = { username: '홍길동', age: 20 };
    return (
      <div>
        <h1>Child2 Component</h1>
        <h1>{mesg}</h1>
        <button onClick={onEvent}>OK</button>
        <br />
        <button onClick={() => onEvent(p)}>OK2</button>
      </div>
    );
  }
}

export default Child2;
