package org.example.school_manager.models;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.example.school_manager.interfaces.UserInterface;

import java.sql.SQLException;
import java.util.List;

public class User implements UserInterface {

    private int id;
    private String email;
    private String password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public List<User> list() throws SQLException {
        return null;
    }
}
