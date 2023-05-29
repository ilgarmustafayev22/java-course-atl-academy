package lesson16.P3;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

public class StackApp {
    private static final Deque<Operations> stack = new LinkedList<>();

    public static void main(String[] args) {
        Operations[] values = Operations.values();
        System.out.println(Arrays.toString(values));

        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);

    }

    public static Operations doOperation() {
        stack.add(Operations.generateRandom());
        return stack.peek();
    }

    public static Optional<Operations> ctrlZ() {
        if (!stack.isEmpty()) {
            return Optional.of(stack.removeLast());
        }
        return Optional.empty();
    }

}
