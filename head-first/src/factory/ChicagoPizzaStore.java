package factory;

import lombok.ToString;

@ToString
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        System.out.println(type);
        return new ChicagoStyleCheesePizza();
    }
}
