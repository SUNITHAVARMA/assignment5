package test.com.stackroute.pe5;

import main.com.stackroute.pe5.AppearsTwoStrings;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AppearsTwoStringsTest {
    private static AppearsTwoStrings appearsTwoStrings;

    @Before
    public void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        appearsTwoStrings=new AppearsTwoStrings();
    }

    @After
    public void tearDown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        appearsTwoStrings=null;
    }

    @Test
    public void test(){
        String[] input={"a","b","c","d","d","a","c","c"};

        //This statement returns the string with boolean value i.e string appears 2 more in the array it returns true otherwise it returns false.
        Map<String,Boolean> result=appearsTwoStrings.checkAppearanceOfString(input);
        Map<String,Boolean> expected=new HashMap<>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",true);

        //This method checks the actual output with expected output.
        assertEquals(expected,result);
    }
}
