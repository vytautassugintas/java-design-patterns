package StrategyPattern;

import StrategyPattern.FlyingBehaviors.FlyBehavior;
import StrategyPattern.QuackingBehaviors.QuackBehavior;

/**
 * Created by vytautassugintas on 17/03/16.
 */
public abstract class Duck {

    public QuackBehavior quackBehavior;
    public FlyBehavior flyBehavior;
    // and so on...

    // with setters it is possible to change behaviors at runtime
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void tryToFly() {
        flyBehavior.fly();
    }

}
