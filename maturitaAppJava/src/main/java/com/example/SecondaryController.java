package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML
    Label resultLabel=new Label();
    @FXML
    Label NameLabelMain=new Label();
    @FXML
    Button ActionButton= new Button();
    @FXML
    Label schoolName=new Label();

    @FXML
    protected void initialize(){
        NameLabelMain.setText(App.name);
        //System.out.println("SchoolName is "+App.user.schoolName);
        //System.out.println("Classroom Password is "+App.user.classroomLogin);
        //System.out.println("classroom name is "+App.user.classroomName);
        schoolName.setText(App.school.name);
    }

    @FXML
    private void switchToPrimary() throws IOException {
        int result=(int)(Math.random() * 20+1);
        resultLabel.setText("Historie výpočetní techniky");
        ActionButton.setText(Integer.toString(result));
        ActionButton.setOnAction(null);
    }
}