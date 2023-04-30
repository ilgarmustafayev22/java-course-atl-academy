package lesson07;

public class ConcatApp {
    public static void mainV1(String[] args) {
        String user1 = "Elvin";
        String user2 = user1;
        //user1 = user1 + " Taghizade";
        user1 = user1.concat(" Taghizade");
        System.out.println(user1);
        System.out.println(user2);
    }
    public static void main(String[] args) {
        String user1 = new String("Elvin");
        String user2 = user1;
        String third = user2.concat(user1);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(third);
    }
}
