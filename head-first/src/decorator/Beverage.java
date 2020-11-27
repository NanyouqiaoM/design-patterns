package decorator;

import lombok.Getter;

public abstract class Beverage {
    @Getter
    String description = "Unknown";

    public abstract double cost();

}
