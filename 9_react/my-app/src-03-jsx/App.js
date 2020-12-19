import React, { Component } from 'react';
import './App.css';
import Contact from './components/Contact';
import Contact2 from './components/Contact2';
import Contact21 from './components/Contact21';
import Contact3 from './components/Contact3';
import Contact4 from './components/Contact4';
import Contact5 from './components/Contact5';
import Contact6 from './components/Contact6';
import Contact7 from './components/Contact7';
import Contact8 from './components/Contact8';

class App extends Component {
  render() { // 화면에 DOM을 그리는 함수
    return (
      <div>
        <h1>App Component</h1>
        <Contact /> {/* jsx 안에서 변수 사용하기 */}
        <Contact2 /> {/* 배열 map 함수로 요소 출력하기 */}
        <Contact21 /> {/* 컴포넌트 밖에 함수 정의하여 jsx 안에 사용하기 */}
        <Contact3 /> {/* 태그 속성 변수로 지정하여 사용하기 */}
        <Contact4 /> {/* jsx 안에서 요소를 담은 배열 출력하기 */}
        <Contact5 /> {/* 함수 호출하기 */}
        <Contact6 /> {/* className 적용하기 */}
        <Contact7 /> {/* css 직접 적용하기 */}
        <Contact8 /> {/* 주석 적용하기 */}
      </div>
    );
  }
}

export default App;
