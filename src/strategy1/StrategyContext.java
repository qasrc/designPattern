package strategy1;

/**
 * @author zhan
 * Created on 2018/01/13  13:46
 */
public class StrategyContext {
    private AbstractPriceStrategy abstractPriceStrategy;

    private Double price;
    private Integer count;
    private String type;

    public StrategyContext(Double price, Integer count, String type) {
        this.price = price;
        this.count = count;
        this.type = type;
        switch (type) {
            case "standard":
                abstractPriceStrategy = new PriceStandardStrategy(price, count);
                break;
            case "discount":
                abstractPriceStrategy = new PriceDiscountStrategy(price, count, 0.3);
                break;
            case "minus":
                abstractPriceStrategy = new PriceMinusStrategy(price, count, 200.00, 100.00);
                break;
            default:
                break;
        }
    }

    public StrategyContext(AbstractPriceStrategy abstractPriceStrategy) {
        this.abstractPriceStrategy = abstractPriceStrategy;
    }

    public Double contextInterface() {
        return abstractPriceStrategy.getPrice();
    }
}
