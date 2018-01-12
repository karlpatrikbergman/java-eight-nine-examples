package chapter3;

import domain.Apple;
import domain.Color;
import domain.FruitSallad;

import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *
 * Notations from book to describe the signatures of lambdas and functional interface:
 *
 * The notation
 * () -> void
 * represents a function with an empty list of parameters returning void.
 *
 * The notation
 * (Apple, Apple) -> int
 * denotes a function taking two Apples as parameters and returning an int.
 */

public class LambdaExpressions {

    public static void main(String args[]) {
        Function<String,String> rev = s -> new StringBuffer(s).reverse().toString();
        String result = rev.apply("Patrik");

        BiFunction<Integer, Color, Apple> appleBiFunction = Apple::new;
        BiFunction<Integer, Color, FruitSallad> fruitSalladBiFunction = appleBiFunction.andThen(apple -> new FruitSallad(Collections.singletonList(apple)));
        FruitSallad fruitSallad = fruitSalladBiFunction.apply(150, Color.RED);

        Stream<Apple> appleStream = Stream.<Apple>builder()
            .add(new Apple(100, Color.RED))
            .add(new Apple(120, Color.GREEN))
            .add(new Apple(110, Color.YELLOW))
            .build();

        Stream.Builder<Apple> appleBuilder= Stream.<Apple>builder();
        appleBuilder.accept(new Apple(90, Color.GREEN));
        appleBuilder.add(new Apple(130, Color.RED));

        Runnable runnable = () -> {};
    }
}
