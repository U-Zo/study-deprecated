import React, { Component } from 'react';
import MemberList from './MemberList';

class Member extends Component {
  constructor(props) {
    super(props);
    this.state = {
      memberData: [],
      username: '',
      age: 0,
      address: '',
    };
    this.onChange = this.onChange.bind(this);
    this.addMember = this.addMember.bind(this);
  }

  onChange(e) {
    const { name, value } = e.target;
    this.setState({
      [name]: value,
    });
  }

  addMember() {
    this.setState({
      memberData: this.state.memberData.concat({
        username: this.state.username,
        age: this.state.age,
        address: this.state.address,
      }),
    });
  }

  render() {
    return (
      <div>
        이름
        <input
          type="text"
          name="username"
          value={this.state.username}
          onChange={this.onChange}
        />
        <br />
        나이
        <input
          type="text"
          name="age"
          value={this.state.age}
          onChange={this.onChange}
        />
        <br />
        주소
        <input
          type="text"
          name="address"
          value={this.state.address}
          onChange={this.onChange}
        />
        <br />
        <button onClick={this.addMember}>저장</button>
        <MemberList memberData={this.state.memberData} />
      </div>
    );
  }
}

export default Member;
