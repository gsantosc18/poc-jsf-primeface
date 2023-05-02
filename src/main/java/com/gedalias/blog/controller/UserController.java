package com.gedalias.blog.controller;

import com.gedalias.blog.model.User;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author gedalias.caldas
 */
@ManagedBean
@SessionScoped
public class UserController implements Serializable {
    @Inject
    private User user;
    
    public UserController() {
    }
    
    public void logar() {
        System.out.println("usuário: "+user);
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, null, "O usuário está logado! "+user));
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
