import React, { Component } from 'react';
import ContactList from './ContactList';

class Contact extends Component {
  render() {
    return (
      <>
        <h2>Contacts Component</h2>
        <ContactList />
      </>
    );
  }
}

export default Contact;
