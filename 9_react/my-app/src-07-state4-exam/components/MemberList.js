import React, { Component } from 'react';

class MemberList extends Component {
  render() {
    const memberData = this.props.memberData;

    return (
      <table border="1">
        {memberData.map((member, index) => (
          <tr key={index}>
            <td>{member.username}</td>
            <td>{member.age}</td>
            <td>{member.address}</td>
          </tr>
        ))}
      </table>
    );
  }
}

export default MemberList;
