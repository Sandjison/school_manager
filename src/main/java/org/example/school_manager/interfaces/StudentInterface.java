package org.example.school_manager.interfaces;

import org.example.school_manager.models.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentInterface  {


    void create (Student student) throws SQLException;
    List<Student> read(int id);
    void  uptade (Student student);
    void delete (Student student);
}
