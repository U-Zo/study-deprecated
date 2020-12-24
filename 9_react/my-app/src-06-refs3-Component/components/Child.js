import React, { Component } from 'react';

class Child extends Component {
  info() {
    console.log('Child Component info()');
  }

  render() {
    return (
      <div>
        Child Component
      </div>
    );
  }
}

export default Child;
