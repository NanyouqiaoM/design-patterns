package duck;

public class MallardDuck extends Duck {
    @Override
    void display() {
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
