package BehaviorInterfaces;

import BehaviorInterfaces.FlyingBehaviors.FlyBehavior;
import BehaviorInterfaces.QuackingBehaviors.QuackBehavior;

/**
 * Created by vytautassugintas on 17/03/16.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior){
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void display() {
        System.out.println("I'm a Redhead duck, my head is red");
    }

}
