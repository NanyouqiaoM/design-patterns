package factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        System.out.println(nyStore.orderPizza("111"));
        System.out.println(chicagoStore.orderPizza("1121"));

    }
}
