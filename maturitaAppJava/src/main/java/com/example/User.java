package com.example;

import java.io.IOException;
import java.net.UnknownHostException;

//import com.example.School;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.*;

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
        OkHttpClient client= new OkHttpClient();

       

        JSONObject params=new JSONObject();

        try {
            params.put("schoolName", this.schoolName);
            params.put("classroomName", this.classroomName);
            params.put("classroomLogin", this.classroomLogin);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println(params);
        
        RequestBody body = RequestBody.create( params.toString(),
            MediaType.parse("application/json"));
      
       
        Request request = new Request.Builder()
        .url(App.address+"authenticate")
        .post(body)

        .build();

        Response response;

        try {
            response = client.newCall(request).execute();
        } catch (IOException d) {
            
                d.printStackTrace();
            response=null;
        }

        School school;
        try {
            school = new ObjectMapper().readValue(response.body().byteStream(), School.class);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            school=new School("null","null", false);
        }
        
        //String json="{\"name\":\"Gymnázium Vyškov\", \"authenticated\":true, \"logoURL\":\"https://www.gykovy.cz/wp-content/uploads/2021/02/cropped-GYKOVY-LOGO_bila-budova-okoli-kruhu_web-2045x2048.png\"        }";
        //School school=new School("Gymnázium a SOŠZE Vyškov", "https://www.gykovy.cz/wp-content/uploads/2021/02/cropped-GYKOVY-LOGO_bila-budova-okoli-kruhu_web-2045x2048.png", true);
        //School school = new ObjectMapper().readValue(json, School.class);//creates a new school object from the response that gets returned
        return school;
    }
}
