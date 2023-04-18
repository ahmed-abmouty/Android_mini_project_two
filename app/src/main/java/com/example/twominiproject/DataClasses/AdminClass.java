package com.example.twominiproject.DataClasses;

public class AdminClass {
    private  int id;
    private  String name;
    private  String password;

    public AdminClass(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    public AdminClass( String name, String password) {

        this.name = name;
        this.password = password;
    }
    public AdminClass(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
