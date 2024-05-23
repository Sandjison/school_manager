package org.example.school_manager.interfaces;

import org.example.school_manager.models.Classroom;
import org.example.school_manager.models.Student;

import java.sql.SQLException;
import java.util.List;

public interface ClassroomInterface {

    List<Classroom> list() throws SQLException;

}
