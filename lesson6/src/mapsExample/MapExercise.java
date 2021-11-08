package mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args){
        Map<String,Person> mapOfPeople = new HashMap<String,Person>();
        Person mike = new Person("Mike","mike@email.com");
        Person shaun = new Person("Shaun","shaun@email.com");
        Person sally = new Person("Sally","sally@email.com");
        Person cesar = new Person("Cesar","cesar@email.com");
        ArrayList<Person> people = new ArrayList<Person>();
        mapOfPeople.put(mike.getEmail(),mike);
        mapOfPeople.put(shaun.getEmail(), shaun);
        mapOfPeople.put(sally.getEmail(), sally);
        mapOfPeople.put(cesar.getEmail(), cesar);

        for (String email: mapOfPeople.keySet()){
           System.out.println(email);
        }
        for(Person person: mapOfPeople.values()){
            System.out.println(person);
        }
        System.out.println("Get Mike: "+mapOfPeople.get("mike@email.com"));
        System.out.println("Get Shaun: "+mapOfPeople.get("shaun@email.com"));
        System.out.println("Get Sally: "+mapOfPeople.get("sally@email.com"));
        System.out.println("Get Cesar: "+mapOfPeople.get("cesar@email.com"));
    }
}
