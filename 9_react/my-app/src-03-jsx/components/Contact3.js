import React, { Component } from 'react';

class Contact3 extends Component {
  render() {
    const attr = {
      href: 'https://www.google.com/',
      target: '_blank',
    };

    return (
      <div>
        <a {...attr}>google: {attr.href}</a>
      </div>
    );
  }
}

export default Contact3;
