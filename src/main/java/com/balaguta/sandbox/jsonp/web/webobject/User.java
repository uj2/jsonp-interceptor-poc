package com.balaguta.sandbox.jsonp.web.webobject;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author: Andrey
 * @version: 1
 */
@XmlRootElement
public final class User {

    @XmlElement
    private final String id;
    @XmlElement
    private final String firstName;
    @XmlElement
    private final String lastName;

    public User(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private User() {
        this.id = null;
        this.firstName = null;
        this.lastName = null;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
