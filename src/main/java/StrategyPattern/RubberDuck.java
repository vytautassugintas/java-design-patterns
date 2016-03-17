package StrategyPattern;

import StrategyPattern.FlyingBehaviors.FlyBehavior;
import StrategyPattern.QuackingBehaviors.QuackBehavior;

/**
 * Created by vytautassugintas on 17/03/16.
 */
public class RubberDuck extends Duck {

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior){
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void display() {
        System.out.println("I'm Rubber duck, BATHS 4 LIFE");
    }
}
