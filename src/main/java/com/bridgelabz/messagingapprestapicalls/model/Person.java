package com.bridgelabz.messagingapprestapicalls.model;

import com.bridgelabz.messagingapprestapicalls.dto.PersonDTO;

public class Person {
    private String firstName;
    private String lastName;

    public Person(PersonDTO personDTO) {
        this.firstName = personDTO.firstName;
        this.lastName = personDTO.lastName;
    }
    public Person(){
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person :: {" +'\n'+
                "FirstName='" + firstName + '\n' +
                "LastName='" + lastName + '\n' +
                '}';
    }
}
