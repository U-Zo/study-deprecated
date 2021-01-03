import React from 'react';

const Member = ({ match, history, location }) => {
  console.log(match);
  console.log(history);
  console.log(location);

  return (
    <div>
      <h1>Member</h1>
    </div>
  );
};

export default Member;
