package strategy1;

/**
 * @author zhan
 * Created on 2018/01/13  13:39
 */
public class PriceStandardStrategy extends AbstractPriceStrategy {

    public PriceStandardStrategy(Double price, Integer count) {
        super(price, count);
    }

    @Override
    public Double getPrice() {
        return price * count;
    }


}
