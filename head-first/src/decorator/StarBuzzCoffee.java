package decorator;

import java.io.FilterInputStream;

public class StarBuzzCoffee {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ":" + beverage.cost());
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + ":" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2=new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + ":" + beverage2.cost());

    }

}
