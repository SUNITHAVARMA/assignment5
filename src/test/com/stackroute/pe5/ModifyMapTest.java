package test.com.stackroute.pe5;

import main.com.stackroute.pe5.ModifyMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ModifyMapTest {
    private static ModifyMap modifyMap;

    @Before
    public void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        modifyMap=new ModifyMap();
    }

    @After
    public void tearDown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        modifyMap=null;
    }

    @Test
    public void test(){

        //This statement is used to create the HashMap
        HashMap<String,String> data=new HashMap<>();

        //These statements are used to put the values into HashMap.
        data.put("value1","java");
        data.put("value2","c++");

        //This statement is used to create the HashMap
        HashMap<String,String> expected=new HashMap<>();

        //These statements are used to put the values into HashMap.
        expected.put("value1"," ");
        expected.put("value2","java");

        //This statement returns the modified Map.
        HashMap<String,String> result=modifyMap.modifyData(data);

        //This method checks the actual output with expected output.
        assertEquals(expected,result);

    }
}
