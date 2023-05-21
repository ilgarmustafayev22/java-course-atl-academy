package lesson16.P2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class HasMapApp {

    public static void main(String[] args) {
        HashMap<String, Queue<Integer>> map = new HashMap<>();

        Queue<Integer> wolt = new LinkedList<>();
        wolt.add(10);
        map.put("Shaurma",wolt);
        System.out.println(map);

        Queue<Integer> boltFood = new LinkedList<>();
        boltFood.add(5);
        map.put("Doner",boltFood);
        System.out.println(map);
    }

}
