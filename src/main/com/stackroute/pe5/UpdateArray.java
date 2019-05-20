package main.com.stackroute.pe5;

import java.util.ArrayList;

public class UpdateArray {

    //This method returns the updated Array elements.
    public ArrayList<String> updateArrayElements(ArrayList<String> list){

        //These statements are used to set the values.
       list.set(0,"kiwi");
       list.set(2,"banana");
       return list;

    }

    //This method returns the empty ArrayList.
    public boolean emptyArrayElements(ArrayList<String> list){
        if(list!=null) {

            //This statement is used to clear the list.
            list.clear();
        }
        return true;
    }
}
