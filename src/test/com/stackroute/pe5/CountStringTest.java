package test.com.stackroute.pe5;

import main.com.stackroute.pe5.CountString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CountStringTest {
    private static CountString countString;

    @Before
    public void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        countString=new CountString();
    }

    @After
    public void tearDown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        countString=null;
    }
    @Test
    public void test(){
        String input= "one one -one___two,,three,one @three*one?two";

        //This statement gives the each word count in the paragraph.
        Map<String,Integer> result=countString.countString(input);
        Map<String,Integer> expected=new HashMap<String, Integer>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);

        //This method checks actual output with expected output.
        assertEquals(expected,result);
        }
    }



