package decorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + "摩卡";
    }

    public double cost() {
        return .20+beverage.cost();
    }
}
