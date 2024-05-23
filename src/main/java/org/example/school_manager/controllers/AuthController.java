package org.example.school_manager.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.school_manager.models.Student;

import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AuthController  {

    @FXML
    private Button closeButton;
    @FXML
    private TextField classroomTextField;
    @FXML
    private TextField stateTextField;
    @FXML
    private DatePicker dateOfBirthDatePicker;

    @FXML
    private TextField firstnameTextField;

    @FXML
    private TextField lastnameTextField;

    @FXML
    private TextField placeOfBirthTextField;

    @FXML
    private Button registerButton;

    //   @FXML
    //   private Label registrationMessageLabel;






    @FXML
    void closeButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void registerButtonOnAction(ActionEvent event) throws SQLException {


        if (firstnameTextField.getText().isEmpty() || lastnameTextField.getText().isEmpty()
                || placeOfBirthTextField.getText().isEmpty()  || dateOfBirthDatePicker.getValue() == null
        || classroomTextField.getText().isEmpty() || stateTextField.getText().isEmpty() ){


        }else {
            LocalDate dateOfBirth = dateOfBirthDatePicker.getValue();
            String firstName = firstnameTextField.getText().trim();
            String lastName = lastnameTextField.getText().trim();
            int state = Integer.parseInt(stateTextField.getText().trim());
            int classroom = Integer.parseInt(classroomTextField.getText().trim());
            String placeOfBirth = placeOfBirthTextField.getText().trim();

            Student student = new Student();

            student.setFirstname(firstName);
            student.setState(state);
            student.setClassroomId(classroom);
            student.setLastname(lastName);
            student.setPlaceOfBirth(placeOfBirth);
            student.setDateOfBirth(dateOfBirth);

            student.create(student);
        }

    }





}
