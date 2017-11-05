package strategy;

/**
 * 中级会员折扣
 *
 * @author zhan
 * Created on 2017/10/28  8:42
 */
public class MediaDiscountStrategy implements DiscountStrategy {
    @Override
    public double disCountPrice(double price) {
        return price * 0.9;
    }
}
