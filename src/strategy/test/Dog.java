package strategy.test;

/**
 * @author zhan
 * Created on 2017/10/28  15:20
 */
public class Dog {
    private EatStrategy eatStrategy;

    public Dog(EatStrategy eatStrategy) {
        this.eatStrategy = eatStrategy;
    }

    public void eat(String food) {
        eatStrategy.eat(food);
    }
}
