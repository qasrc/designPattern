package strategy;

/**
 * @author zhan
 * Created on 2017/10/28  8:45
 */
public class StrategyTest {
    public static void main(String[] args) {
        //采用不同的策略模式
        DiscountStrategy discountStrategy = new MediaDiscountStrategy();
        Price price = new Price(discountStrategy);
        System.out.println(price.getPrice(30));

    }
}
