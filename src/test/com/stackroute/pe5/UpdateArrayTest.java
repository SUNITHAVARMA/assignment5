package test.com.stackroute.pe5;

import main.com.stackroute.pe5.UpdateArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UpdateArrayTest {
    private static UpdateArray updateArray;

    @Before
    public void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        updateArray=new UpdateArray();
    }

    @After
    public void tearDown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        updateArray=null;
    }

    @Test
    public void updateArray(){

        //This statement is used to create ArrayList.
        ArrayList<String> list1=new ArrayList<String>();

        //These statements are used to add the values in the ArrayList.
        list1.add("apple");
        list1.add("grape");
        list1.add("melon");
        list1.add("berry");

        //This statement is used to create ArrayList.
        ArrayList<String> list2=new ArrayList<String>();

        //These statements are used to add the values in the ArrayList.
        list2.add("kiwi");
        list2.add("grape");
        list2.add("banana");
        list2.add("berry");

        //This statement gives the updated ArrayList.
        ArrayList<String> result=updateArray.updateArrayElements(list1);

        //This method checks the actual output with expected output.
        assertEquals(list2,result);
    }

    @Test
    public void emptyArray(){

        //This statement is used to create ArrayList.
        ArrayList<String> list1=new ArrayList<String>();

        //These statements are used to add the values in the ArrayList.
        list1.add("apple");
        list1.add("grape");
        list1.add("melon");
        list1.add("berry");

        //This statement gives the updated ArrayList.
        boolean result1=updateArray.emptyArrayElements(list1);

        //This method checks the actual output with expected output.
        assertEquals(true,result1);
    }
}
