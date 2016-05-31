package com.masal;

import com.masal.util.FileUtil;
import com.opensymphony.xwork2.ActionSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yeganeh on 5/15/16.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String pass;

    public String m1() {

        if (username == null || username.equals("")) {
            addActionError("Username field must not be empty");
        }
        if (pass == null || pass.equals("")) {
            addActionError("Password field must not be empty");
        }
        if (username.equals("saleh") && pass.equals("123")) {
            return SUCCESS;
        }
        if (getActionErrors().size() > 0) {
            return ERROR;
        }
        Map userPass = new HashMap();
        List listOfUserPass = FileUtil.readFromFile("user-pass");
        for (Object listOfUserPas : listOfUserPass) {
            userPass.put(((String) listOfUserPas).split(" ")[0], ((String) listOfUserPas).split(" ")[1]);
        }
        if (userPass.get(username) != null && userPass.get(username).equals(pass)) {
            return SUCCESS;
        }
        addActionError("Username or password is wrong.");
        return ERROR;
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
