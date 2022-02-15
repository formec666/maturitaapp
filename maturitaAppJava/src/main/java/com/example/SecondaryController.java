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
    protected void initialize(){
        NameLabelMain.setText(App.name);
    }

    @FXML
    private void switchToPrimary() throws IOException {
        int result=(int)(Math.random() * 20+1);
        resultLabel.setText("Historie výpočetní techniky");
        ActionButton.setText(Integer.toString(result));
        ActionButton.setOnAction(null);
    }
}