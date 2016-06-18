package com.masal.register;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Yeganeh on 6/14/16.
 */
public class ClassPerson extends ActionSupport {
    private String name;
    private String lastName;
    private String pass;
    private String phone_Number;
    private String address;

    public String m1() {
        if (name == null || name.equals("") || lastName == null || lastName.equals("") || pass == null || pass.equals("") || phone_Number == null || phone_Number.equals("")) {
            addActionError("Please fill in the fields below ");
            return ERROR;
        }
        PersonRegister personRegister = new PersonRegister();
        Person person = new Person();
        person.setName(name);
        person.setLastName(lastName);
        person.setPass(pass);
        person.setPhone_Number(phone_Number);
        person.setAddress(address);

        if (personRegister.register(person)) {
            return SUCCESS;
        }
        return ERROR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
