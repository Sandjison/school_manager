package org.example.school_manager.interfaces;

import org.example.school_manager.models.Classroom;
import org.example.school_manager.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserInterface {
    List<User> list() throws SQLException;
}
