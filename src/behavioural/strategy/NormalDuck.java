package behavioural.strategy;

import behavioural.strategy.flybehavior.FlyWithWings;

public class NormalDuck extends Duck {

    public NormalDuck(String name) {
        this.name = name;
        this.flyBehavior = new FlyWithWings();
    }
}
