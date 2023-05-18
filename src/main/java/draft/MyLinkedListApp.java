package draft;

public class MyLinkedListApp {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(5);
        System.out.println(linkedList);

        linkedList.addTail(6);
        System.out.println(linkedList);

        linkedList.addTail(7);
        System.out.println(linkedList);

        linkedList.addTail(8);
        System.out.println(linkedList);

        linkedList.addHead(9);
        System.out.println(linkedList);

        linkedList.deleteTail();
        System.out.println(linkedList);

        int size = linkedList.getSize();
        System.out.println(size);

        System.out.println(linkedList.findByIndex(0));
    }
}
