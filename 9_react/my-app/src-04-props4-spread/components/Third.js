import React, { Component } from 'react';

class Third extends Component {
  render() {
    const { id, pw } = this.props;

    return (
      <div>
        {id}: {pw}
      </div>
    );
  }
}

export default Third;
