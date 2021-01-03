import React from 'react';
import queryString from 'query-string';

const Member = ({ match, history, location }) => {
  console.log(match);
  console.log(history);
  console.log(location);

  const query = queryString.parse(location.search);
  console.log(query);

  return (
    <div>
      <h1>Member</h1>
      params: {match.params.id} 입니다.
      <br />
      queryString: {query.xxx}
    </div>
  );
};

export default Member;
