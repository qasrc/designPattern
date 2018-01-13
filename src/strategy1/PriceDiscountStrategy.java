package strategy1;

/**
 * @author zhan
 * Created on 2018/01/13  13:42
 */
public class PriceDiscountStrategy extends AbstractPriceStrategy {

    /**
     * 打折的比例
     */
    private Double disCountNum;

    public PriceDiscountStrategy(Double price, Integer count, Double disCountNum) {
        super(price, count);
        this.disCountNum = disCountNum;
    }

    @Override
    public Double getPrice() {
        return price * count * disCountNum;
    }

}
