package strategy;

/**
 * 初级会员折扣类
 *
 * @author zhan
 * Created on 2017/10/28  8:41
 */
public class PrimaryDiscountStrategy implements DiscountStrategy{

    @Override
    public double disCountPrice(double price) {
        return price;
    }
}
