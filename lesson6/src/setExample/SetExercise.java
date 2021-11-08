package setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args){
        List<String> numbers = new ArrayList<String>();
        numbers.add("Hello");
        numbers.add("hello");
        numbers.add("helLo");
        numbers.add("122-33-4456");
        numbers.add("122-33-4456");
        Set<String> uniqueNumbers = new HashSet<String>(numbers);
        for(String number : uniqueNumbers){
            System.out.println(number);
        }
    }
}
