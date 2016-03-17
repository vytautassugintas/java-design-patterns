package StrategyPattern.FlyingBehaviors;

/**
 * Created by vytautassugintas on 17/03/16.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
