package strategy;

/**
 * @author zhan
 * Created on 2017/10/28  8:43
 */
public class AdvanceDiscountStrategy implements DiscountStrategy {

    @Override
    public double disCountPrice(double price) {
        return price * 0.8;
    }
}
