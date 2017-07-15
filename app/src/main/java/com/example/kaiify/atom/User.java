package com.example.kaiify.atom;

/**
 * Created by Kaiify on 7/15/2017.
 */

public class User {
    int icon;
    String name;
    String Description;

    public User(int icon, String name, String description) {
        this.icon = icon;
        this.name = name;
        Description = description;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public  User(){

    }
}
