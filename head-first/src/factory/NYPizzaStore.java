package factory;

import lombok.ToString;

@ToString
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        return new NYStyleCheesePizza();
    }
}
