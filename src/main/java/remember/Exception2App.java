package remember;

import java.time.LocalDate;

public class Exception2App {
    public static void main(String[] args) {
        Integer num = 5;
        String word = "Hello";
        LocalDate date = LocalDate.now();
        method(num);
        method(word);
        method(date);

        num = null;
        word = null;
        date = null;

        method(num);
        method(word);
        method(date);


    }

   // public static void method(Integer num) {
   //     if (num == null) {
   //         throw new NullPointerException();
   //     }
   // }
//
   // public static void method(String word) {
   //     if (word == null) {
   //         throw new NullPointerException();
   //     }
   // }
//
   // public static void method(LocalDate data) {
   //     if (data == null) {
   //         throw new NullPointerException();
   //     }
   // }
    public static<T> void method(T data){
        if (data == null) {
            throw new NullPointerException();
        }
    }
}