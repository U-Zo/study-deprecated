import React, { Component } from 'react';
import Second from './Second';

class First extends Component {
  render() {
    return (
      <div>
        <Second {...this.props} />
      </div>
    );
  }
}

export default First;
