package com.example;

//import com.example.School;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
    public School authenticate() throws JsonMappingException, JsonProcessingException{
        String json="{\"name\":\"Gymnázium Vyškov\", \"authenticated\":true, \"logoURL\":\"https://www.gykovy.cz/wp-content/uploads/2021/02/cropped-GYKOVY-LOGO_bila-budova-okoli-kruhu_web-2045x2048.png\"        }";
        //School school=new School("Gymnázium a SOŠZE Vyškov", "https://www.gykovy.cz/wp-content/uploads/2021/02/cropped-GYKOVY-LOGO_bila-budova-okoli-kruhu_web-2045x2048.png", true);
        School school = new ObjectMapper().readValue(json, School.class);
        return school;
    }
}
