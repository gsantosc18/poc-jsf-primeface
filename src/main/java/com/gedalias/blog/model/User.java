package com.gedalias.blog.model;

import java.io.Serializable;


/**
 *
 * @author gedalias.caldas
 */
public class User implements Serializable{
    private String email;
    private String password;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User["
                + "email=" + email
                + ", password="+ password
                + "]";
    }
}
