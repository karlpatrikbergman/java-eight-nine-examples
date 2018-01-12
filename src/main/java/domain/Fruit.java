package domain;

import java.util.Objects;

public abstract class Fruit {
    private final Integer weight;
    private final Color color;

    Fruit(Integer weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(weight, fruit.weight) &&
            color == fruit.color;
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight, color);
    }
}
