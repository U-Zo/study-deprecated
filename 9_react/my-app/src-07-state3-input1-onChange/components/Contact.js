import React, { Component } from 'react';

class Contact extends Component {
  constructor(props) {
    super(props);
    this.state = {
      contactData: [
        { name: 'Allen', phone: '000-000-0001' },
        { name: 'Bob', phone: '000-000-0002' },
        { name: 'Charlie', phone: '000-000-0003' },
        { name: 'David', phone: '000-000-0004' },
      ],
      username: '',
      phone: '',
    };

    this.handleChange = this.handleChange.bind(this);
    this.handle = this.handle.bind(this);
  }

  handleChange(e) {
    this.setState({
      [e.target.name]: e.target.value,
    });
  }

  handle() {
    this.setState({
      contactData: this.state.contactData.concat({
        name: this.state.username,
        phone: this.state.phone,
      }),
      username: '',
      phone: '',
    });
  }

  render() {
    return (
      <div>
        {this.state.contactData.map((data, index) => (
          <div key={index}>
            {data.name}&nbsp;&nbsp;{data.phone}
          </div>
        ))}
        이름
        <input
          type="text"
          name="username"
          id="kkk"
          value={this.state.username}
          onChange={this.handleChange}
        />
        <br />
        전화번호
        <input
          type="text"
          name="phone"
          id="kkk"
          value={this.state.phone}
          onChange={this.handleChange}
        />
        <br />
        <button onClick={this.handle}>추가하기</button>
      </div>
    );
  }
}

export default Contact;
