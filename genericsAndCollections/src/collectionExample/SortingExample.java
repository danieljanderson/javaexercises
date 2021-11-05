package collectionExample;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingExample {
    public static void main(String[]args){
        List<String> listOfItems = new LinkedList<String>();
        listOfItems.add("Mike");
        listOfItems.add("Bob");
        listOfItems.add("Alice");
        Collections.sort(listOfItems);
        for(String name: listOfItems){
            System.out.println(name);
        }
    }
}
