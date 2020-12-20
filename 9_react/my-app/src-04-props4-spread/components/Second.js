import React, { Component } from 'react';
import Third from './Third';

class Second extends Component {
  render() {
    return (
      <div>
        <Third {...this.props} />
      </div>
    );
  }
}

export default Second;
