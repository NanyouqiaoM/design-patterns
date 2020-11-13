package duck;

import lombok.Data;

@Data
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    void performFly() {
        flyBehavior.fly();
    }

    void perFormQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("duck swim");
    }
}
