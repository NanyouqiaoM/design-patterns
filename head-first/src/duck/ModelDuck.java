package duck;

import javax.sound.sampled.SourceDataLine;

public class ModelDuck extends Duck {
    void display() {
        System.out.println("模型鸭");
    }

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
}
