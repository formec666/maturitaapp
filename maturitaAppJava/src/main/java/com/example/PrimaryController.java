package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.DialogPane;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class PrimaryController {

    @FXML
    VBox failedWarning=new VBox();
    @FXML
    TextField schoolName=new TextField(); //inits the school name text field
    @FXML
    PasswordField classroomLogin=new PasswordField(); //inits the classroom login text field
    @FXML
    TextField classroomName=new TextField(); //inits the classroom name text field

    @FXML
    private void switchToSecondary() throws IOException {
        
        App.name="Tomáš Formánek";
        
        App.user.createUser(schoolName.getText(),classroomLogin.getText(),classroomName.getText());// takes the user input into the user object
        App.school=App.user.authenticate();//begins the users authentication
        if (App.school.authenticated==true)
            {App.setRoot("secondary");} // and switches to second screen if the authentication happens correctly
        else{failedWarning.setVisible(true);}
    }
}
