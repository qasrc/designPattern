package strategy1;

/**
 * 抽象价格算法
 *
 * @author zhan
 * Created on 2018/01/13  13:36
 */
public abstract class AbstractPriceStrategy {

    protected Double price;
    protected Integer count;

    public AbstractPriceStrategy(Double price, Integer count) {
        this.price = price;
        this.count = count;
    }

    public AbstractPriceStrategy() {
        this.price = price;
        this.count = count;
    }

    public abstract Double getPrice();
}
