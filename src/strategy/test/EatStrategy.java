package strategy.test;

/**
 * @author zhan
 * Created on 2017/10/28  15:18
 */
public abstract class EatStrategy {

    abstract void eat(String food);

    public void mouth() {
        System.out.println("------run---------");
    }


}
