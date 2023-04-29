package lesson05;
@FunctionalInterface
public interface Speaking {
    void speak();
    default void speak2(){

    }
}
