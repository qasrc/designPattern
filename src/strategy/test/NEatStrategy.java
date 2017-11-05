package strategy.test;

/**
 * @author zhan
 * Created on 2017/10/28  15:21
 */
public class NEatStrategy extends EatStrategy {

    @Override
    public void eat(String food) {
        System.out.println("no:" + food);
    }
}
