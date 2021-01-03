import axios from 'axios';
import React, { Component } from 'react';
import DeptAdd from './components/DeptAdd';
import DeptDelete from './components/DeptDelete';
import DeptList from './components/DeptList';

class App extends Component {
  state = {
    deptData: [],
  };

  list() {
    const url = 'http://localhost:8080/app/list';

    // get 방식으로 url에 요청
    axios.get(url).then((response) => {
      // 성공하면
      console.log(response);

      // state의 deptData를 응답 결과의 데이터로 변경
      this.setState({
        deptData: response.data,
      });
    });
  }

  onAppSave(payload) {
    const url = 'http://localhost:8080/app/add';

    // post 방식으로 url에 JSON 데이터와 함께 요청
    axios
      .post(url, {
        deptno: payload.deptno.value,
        dname: payload.dname.value,
        loc: payload.loc.value,
      })
      .then(() => {
        // 성공하면 state의 deptData에 JSON 객체를 추가
        this.setState({
          deptData: this.state.deptData.concat({
            deptno: payload.deptno.value,
            dname: payload.dname.value,
            loc: payload.loc.value,
          }),
        });
      })
      .catch(() => console.log('error'));
  }

  onAppDelete(payload) {
    const url = `http://localhost:8080/app/del?deptno=${payload.value}`;

    // delete 방식으로 url에 요청
    axios
      .delete(url)
      .then(() => {
        // 성공하면 위의 list 함수 수행
        this.list();
      })
      .catch(() => console.log('error'));
  }

  componentDidMount() {
    this.list();
  }

  render() {
    // 각 함수의 this를 고정하여 변수에 저장
    const onAppSave = this.onAppSave.bind(this);
    const onAppDelete = this.onAppDelete.bind(this);

    return (
      // <> 리액트 프래그먼트, 필요없는 div 사용을 안 해도 됨
      <>
        <DeptAdd onSave={onAppSave} />
        <DeptDelete onDelete={onAppDelete} />
        <DeptList deptData={this.state.deptData} />
      </>
    );
  }
}

export default App;
