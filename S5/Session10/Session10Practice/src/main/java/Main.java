import models.Cat;
import models.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        //Dictionary
        Map<Integer, String> dictionary = new HashMap<Integer, String>();

        // Adding values to the Dictionary
        dictionary.put(22011275, "Cesar");
        dictionary.put(2, "Karen");
        dictionary.put(3, "Silvio");
        dictionary.put(4, "Douglas");
        dictionary.put(5, "Angel");

        // HashMap let me search easily, for example with an ID
//        System.out.println(dictionary.get(22011275));

        Map<String, String> map = new HashMap<String, String>();
        map.put("Silva", "Cesar");
        map.put("Fonseca", "Karen");
        map.put("Mora", "Silvio");

//        System.out.println(map.get("Silva"));

        Map<String, Person> personList = new HashMap<String, Person>();
        personList.put("Silva", new Person("Cesar", "Silva"));
        personList.put("Fonseca", new Person("Karen", "Fonseca"));
        personList.put("Mora", new Person("Mora", "Silvio"));

//        System.out.println(personList.get("Silva").toString());

        // Is not good to create a Map using the field Object :p - aka: bad practice on java >:(
        Map<String, Object> differentsClasses = new HashMap<String, Object>();
        differentsClasses.put("Silva", new Person("Cesar", "Silva"));
        differentsClasses.put("gatito", new Cat("Michu"));

        System.out.println(differentsClasses.get("gatito"));


    }
}
