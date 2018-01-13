package strategy1;

/**
 * @author zhan
 * Created on 2018/01/13  13:44
 */
public class PriceMinusStrategy extends AbstractPriceStrategy{

    private Double total;
    private Double minusMoney;

    public PriceMinusStrategy(Double price, Integer count, Double total, Double minusMoney) {
        super(price, count);
        this.total = total;
        this.minusMoney = minusMoney;
    }

    @Override
    public Double getPrice() {
        return caculatePrice();
    }

    private Double caculatePrice() {
        Double sum = price * count;
        return sum > total ? sum - minusMoney : sum;
    }
}
