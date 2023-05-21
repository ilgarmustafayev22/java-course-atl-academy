package datastructor;

public class StackApp {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);

        System.out.println(stack);

        int pop = stack.pop();
        System.out.println(pop);

        int pop1 = stack.pop();
        System.out.println(pop1);

    }

}
