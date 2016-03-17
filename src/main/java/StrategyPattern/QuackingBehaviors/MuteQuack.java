package StrategyPattern.QuackingBehaviors;

/**
 * Created by vytautassugintas on 17/03/16.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Muted!");
    }
}
