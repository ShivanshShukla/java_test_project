package AnonymusFunction;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 an even number: " + isEven.test(4));
        System.out.println("Is 11 an even number: " + isEven.test(11));
    }
}