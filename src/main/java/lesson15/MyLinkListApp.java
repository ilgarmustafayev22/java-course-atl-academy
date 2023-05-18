package lesson15;

public class MyLinkListApp {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(5);
        System.out.println(linkedList);

        linkedList.addTail(6);
        System.out.println(linkedList);

        linkedList.addTail(7);
        System.out.println(linkedList);

        System.out.println(linkedList.findByIndex(2));
    }
}
