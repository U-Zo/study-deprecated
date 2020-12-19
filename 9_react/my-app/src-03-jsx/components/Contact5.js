import React, { Component } from 'react';

const myOk = () => {
  console.log('ok');
};

class Contact5 extends Component {
  myOk2() {
    // this 키로 접근
    console.log('ok2');
  }

  render() {
    return (
      <div>
        <button onClick={myOk}>myOk</button>
        <button onClick={this.myOk2}>myOk2</button>
      </div>
    );
  }
}

export default Contact5;
