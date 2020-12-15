package factory;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@Data
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println(name + toppings.toString());
    }

    void bake() {
        System.out.println("baking");
    }

    void cut() {
        System.out.println("cutting");
    }

    void box() {
        System.out.println("box");
    }

}
