package StrategyPattern;

import StrategyPattern.FlyingBehaviors.FlyNoWay;
import StrategyPattern.FlyingBehaviors.FlyWithWings;
import StrategyPattern.QuackingBehaviors.Quack;
import StrategyPattern.QuackingBehaviors.Squeak;

/**
 * Created by vytautassugintas on 17/03/16.
 */
public class Demo {

    public static void main(String[] args) {

        Duck duck1 = new MallardDuck(new Quack(), new FlyWithWings());
        Duck duck2 = new RedheadDuck(new Quack(), new FlyWithWings());
        Duck duck3 = new RubberDuck(new Squeak(), new FlyNoWay());

        duck1.display();
        duck1.performQuack();
        duck1.tryToFly();
        System.out.println();

        duck2.display();
        duck2.performQuack();
        duck2.tryToFly();
        System.out.println();


        duck3.display();
        duck3.performQuack();
        duck3.tryToFly();
        System.out.println();
    }

}
