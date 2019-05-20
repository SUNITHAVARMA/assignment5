package main.com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class SortedSet {

    //This method returns the sorted ArrayList.
    public ArrayList<String> sortSet(Set<String> input) {
        ArrayList<String> list=new ArrayList<>();

        //This statement is used to add all the list
        list.addAll(input);

        //This method is used to sort the list.
        Collections.sort(list);
        return list;

    }
}
