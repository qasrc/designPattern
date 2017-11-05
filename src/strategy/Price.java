package strategy;

/**
 * 价格类
 * @author zhan
 * Created on 2017/10/28  8:34
 */
public class Price {
    private DiscountStrategy discountStrategy;

    public Price(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getPrice(double price) {
        return discountStrategy.disCountPrice(price);
    }
}
