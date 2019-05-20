package main.com.stackroute.pe5;

import java.util.HashMap;

public class ModifyMap {

    //This method returns the modified Map.
    public HashMap<String,String> modifyData(HashMap<String,String> input){

        //This statement replace the value
        String addString=input.replace("value1"," ");

        //This statement replace the value
         addString=input.replace("value2","java");
        return input;
    }
}
