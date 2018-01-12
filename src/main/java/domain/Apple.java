package domain;

public class Apple extends Fruit implements Comparable<Apple> {

    public Apple(Integer weight, Color color) {
        super(weight, color);
    }

    @Override
    public int compareTo(Apple apple) {
        return this.getWeight().compareTo(apple.getWeight());
    }
}
