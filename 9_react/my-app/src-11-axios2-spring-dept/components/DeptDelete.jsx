import React, { Component } from 'react';

class DeptDelete extends Component {
  onDelete(e) {
    e.preventDefault();
    this.onDeptDelete(this.deptno); // input 태그 자체를 매개로 호출
  }

  render() {
    const onDelete = this.onDelete.bind(this);
    this.onDeptDelete = this.props.onDelete;

    return (
      <div>
        <h2>부서 삭제</h2>
        부서 번호:{' '}
        <input
          type="text"
          ref={(ref) => {
            this.deptno = ref;
          }}
        />
        <button onClick={onDelete}>삭제</button>
      </div>
    );
  }
}

export default DeptDelete;
