package duck;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱呱");
    }
}
