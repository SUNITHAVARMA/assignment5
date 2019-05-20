package main.com.stackroute.pe5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountString {

    //This method eturns the each word count in the paragraph.
    public Map<String, Integer> countString(String s) {

        //This statement splits the string.
        String[] strings = s.split("[\\s@&.*?$+-_]+");

        //This Statement is used to creating Map interface.
        Map<String, Integer> counts = new HashMap<String, Integer>();
        for (String string: strings) {
            if (counts.containsKey(string)) {

                //This statement increments the word count.
                counts.put(string, counts.get(string) + 1);
            } else {
                counts.put(string, 1);
            }
        }
        return counts;

    }
}
