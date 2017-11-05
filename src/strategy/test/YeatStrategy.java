package strategy.test;

/**
 * @author zhan
 * Created on 2017/10/28  15:23
 */
public class YeatStrategy extends EatStrategy {

    @Override
    void eat(String food) {
        System.out.println("yes:"+food);
    }
}
