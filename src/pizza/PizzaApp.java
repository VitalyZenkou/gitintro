package pizza;

import pizza.pizzaModel.Calzone;
import pizza.pizzaModel.NyPizza;

import static pizza.pizzaModel.NyPizza.Size.SMALL;
import static pizza.pizzaModel.Pizza.Topping.HAM;
import static pizza.pizzaModel.Pizza.Topping.ONION;

public class PizzaApp {
    public static void main(String[] args) {

        Calzone calzone = new Calzone.Builder()
                .sauceInside()
                .addTopping(HAM)
                .build();

        NyPizza nyPizza = new NyPizza.Builder(SMALL)
                .addTopping(HAM)
                .addTopping(ONION)
                .build();

        System.out.println(calzone);
        System.out.println(nyPizza);
    }
}
