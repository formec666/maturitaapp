package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    static String name;
    public static School school=new School();
    public static User user=new User(); // creates an instance of the user object that will be used by individual controllers
    public static Student[] students=new Student[2];

/*
all the code below the line is just some javaFX stuff, no need to bother
---------------------------------------------------------------------------------------------------------------
*/ 


    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 600, 600);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
        
        
    }


    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }



    public static void main(String[] args) {
        launch();
    }

}