package lesson16;

import java.util.HashMap;

public class MapApp {

    public static void main(String[] args) {
        HashMap<String, String> people = new HashMap<>();
        people.put("Elvin", "123");
        people.put("Samir", "456");
        people.put("Samir", "123");
        people.put(null, "123");
        people.put(null, "56789");

        System.out.println(people);

        boolean elvin = people.containsKey("Elvin");
        System.out.println(elvin);

        boolean value = people.containsValue("123");
        System.out.println(value);

        System.out.println(people.get("Samir"));

        people.clear();
        System.out.println(people);
    }
}
