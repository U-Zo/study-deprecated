import React, { Component } from 'react';

export class Contact extends Component {
  render() {
    return (
      <div>
        Contact Component
      </div>
    );
  }
}

export class Contact2 extends Component {
  info() {
    return <h2>Contact2 Component</h2>;
  }

  render() {
    return this.info();
  }
}
