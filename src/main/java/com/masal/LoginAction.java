package com.masal;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Yeganeh on 5/15/16.
 */
public class LoginAction extends ActionSupport{
    private String username;
    private String pass;

    public String m1() {
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
