package com.example.eatit.Model;

public class User {
    private String Name;
    private String Password;
    private String Phone;
    private String IfStaff;

    public User() {
    }

    public User(String name, String password) {
        Name = name;
        Password = password;
        IfStaff ="false";
    }

//    public User(String name, String password, String phone) {
//        Name = name;
//        Password = password;
//        Phone = phone;
//    }


    public String getIfStaff() {
        return IfStaff;
    }

    public void setIfStaff(String ifStaff) {
        IfStaff = ifStaff;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
