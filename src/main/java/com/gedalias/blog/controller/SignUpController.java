package com.gedalias.blog.controller;

import com.gedalias.blog.model.User;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author gedalias
 */
@ManagedBean(name = "signUpController")
@RequestScoped
public class SignUpController implements Serializable {
    @Inject
    private User user;
    
    public SignUpController() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
