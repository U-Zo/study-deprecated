import React from 'react';

function Child() {
  const handleEvent = () => {
    console.log('handleEvent ==========');
  };

  const handleEvent2 = (e) => {
    console.log('handleEvent2 =========', e);
  };

  const handleEvent3 = (e) => {
    e.preventDefault();
    console.log('handleEvent3 preventDefault', e);
  };

  const a = () => {
    console.log('a ==========');
  };

  const b = (x, y) => {
    console.log('b ==========', x, y);
  };

  return (
    <div>
      <button onClick={handleEvent}>handleEvent</button>
      <br />
      <button onClick={handleEvent2}>handleEvent2</button>
      <br />
      <a href="https://www.google.com/" onClick={handleEvent3}>handleEvent3</a>
      <br />
      <button onClick={() => a()}>a()</button>
      <br />
      <button onClick={e => b(e, 100)}>b()</button>
    </div>
  );
}

export default Child;
