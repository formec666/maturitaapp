package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.*;
import java.net.*;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    static String name;
    public static School school=new School();
    public static User user=new User(); // creates an instance of the user object that will be used by individual controllers
    public static Student[] students=new Student[2];


    public static String address="http://127.0.0.1:5000/";

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
        
        System.setProperty("jdk.security.allowNonCaAnchor", "true" );
        
        
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
    public static void troubleShootConnection(Exception e)throws UnknownHostException, IOException
    {
      InetAddress geek = InetAddress.getByName(address);
      System.out.println("Sending Ping Request to " + address);
      if (geek.isReachable(5000))
        System.out.println("Host is reachable");
      else
        System.out.println("Sorry ! We can't reach to this host");
    }

}