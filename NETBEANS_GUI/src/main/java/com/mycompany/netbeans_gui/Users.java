/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.netbeans_gui;

import java.io.*;
/**
 *
 * @author Costner tk
 */
public class Users implements Serializable{
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Users(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
}
