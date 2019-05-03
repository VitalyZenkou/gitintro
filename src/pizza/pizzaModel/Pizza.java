package pizza.pizzaModel;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    private final Set<Topping> toppings;

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                '}';
    }

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    abstract static class Builder<T extends Builder<T>> {

        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        protected abstract T self();

        public abstract Pizza build();
    }
}
