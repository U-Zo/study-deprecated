import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      xyz: 0,
      number: 100,
    };
    this.handleClick = this.handleClick.bind(this);
  }

  handleClick() {
    console.log('handleClick()');
    this.setState({
      xyz: this.state.xyz + 1,
    });
  }

  render() {
    return (
      <div>
        <h2>{this.state.xyz}</h2>
        <p>{this.state.number}</p>
        <button onClick={this.handleClick}>xyz 값 증가</button>
      </div>
    );
  }
}

export default Counter;
