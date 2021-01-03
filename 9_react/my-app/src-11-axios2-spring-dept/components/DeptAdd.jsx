import React, { Component } from 'react';

class DeptAdd extends Component {
  onSave(e) {
    e.preventDefault();
    this.onDeptSave({
      deptno: this.deptno,
      dname: this.dname,
      loc: this.loc,
    });
  }

  render() {
    const onSave = this.onSave.bind(this);
    this.onDeptSave = this.props.onSave;

    return (
      <div>
        <h1>부서 추가</h1>
        <form onSubmit={onSave}>
          부서 번호:{' '}
          <input
            type="text"
            ref={(ref) => {
              this.deptno = ref;
            }}
          />
          <br />
          부서명:{' '}
          <input
            type="text"
            ref={(ref) => {
              this.dname = ref;
            }}
          />
          <br />
          부서 위치:{' '}
          <input
            type="text"
            ref={(ref) => {
              this.loc = ref;
            }}
          />
          <br />
          <button>추가</button>
        </form>
      </div>
    );
  }
}

export default DeptAdd;
