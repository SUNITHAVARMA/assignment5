package test.com.stackroute.pe5;

import main.com.stackroute.pe5.SortedSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SortedSetTest {
    private static SortedSet sortedSet;

    @Before
    public void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        sortedSet=new SortedSet();
    }

    @After
    public void tearDown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        sortedSet=null;
    }

    @Test
    public void test(){
        //This statement is used to create the Set interface.
        Set<String> data=new HashSet<>();

        //These statements are used to add the values into HashSet.
        data.add("Harry");
        data.add("Olive");
        data.add("Alice");
        data.add("Bluto");
        data.add("Eugene");

        //This statement is used to create the ArrayList.
        ArrayList<String> expected=new ArrayList<>();

        //These statements are used to add the values into ArrayList.
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");

        //This statement returns the sorted ArrayList.
        ArrayList<String> result=sortedSet.sortSet(data);

        //This method checks the actual output with expected output.
        assertEquals(expected,result);
    }

}
