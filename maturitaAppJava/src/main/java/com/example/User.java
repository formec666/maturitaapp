package com.example;

import com.example.School;

public class User {
    public String schoolName;
    public String classroomLogin;
    public String classroomName;


    public void createUser(String password, String login, String classroom){
        //basically a constructor method, isnt called on class construct however, and is instead called when the user inputs their login info
        this.schoolName=password;
        this.classroomLogin=login;
        this.classroomName=classroom;
        
    }
    public School authenticate(){
        School school=new School("Gymnázium a SOŠZE Vyškov", "https://www.gykovy.cz/wp-content/uploads/2021/02/cropped-GYKOVY-LOGO_bila-budova-okoli-kruhu_web-2045x2048.png", true);
        return school;
    }
}
