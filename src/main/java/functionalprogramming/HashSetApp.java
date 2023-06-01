package functionalprogramming;

import java.util.HashSet;

public class HashSetApp {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(-4);
        set.add(6);
        set.add(11);
        set.add(7);
        set.add(14);
        set.add(8);
        set.add(2);
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(0);
        System.out.println(set);

        int foo = foo(set);
        System.out.println(foo);


    }
    public static int foo(HashSet<Integer> set){
        int min = 1;
        while (set.contains(min)){
            ++min;
        }
        return min;
    }

}
