package chapter17.functionalInterfaces2;

import java.util.function.*;

public class FunctionalInterfacesTwo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (number) -> System.out.println(number);
        consumer.accept(5);

        BiConsumer<String, String> biConsumer
                = (firstName, age) -> System.out.println(firstName + " " + age);
        biConsumer.accept("John", "20");


        Supplier<Integer> supplier
                = () -> (int) (Math.random() * 100);
        System.out.println( supplier.get());


        Predicate<Integer> predicate =
                (number) -> number > Math.random();
        System.out.println(predicate.test(540));


        BiPredicate<Integer, Integer> biPredicate =
                (number1, number2) -> number1 > number2;
        System.out.println(biPredicate.test(5, 2));

        Function<String, Integer> function =
                (number) -> Integer.parseInt(number);
        System.out.println(function.apply("2"));

        BiFunction<String, String, String> biFunction =
                (firstName1, lastName) -> firstName1 + "" + lastName;
        System.out.println(biFunction.apply("John ", "Doe"));

        // TODO: 9/5/2022 : Unary Operators should be used with the same type of data
        UnaryOperator<Integer> unaryOperator =
                (number) -> number * 2;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator =
                (number1, number2) -> number1 + number2;
        System.out.println(binaryOperator.apply(5, 2));


    }
}
