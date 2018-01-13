package strategy1;

/**
 * @author zhan
 * Created on 2018/01/12  9:53
 */
public class PriceMinus implements PriceCalculate{

    private Double sum;
    private Double minus;

    public PriceMinus(Double sum, Double minus) {
        this.sum = sum;
        this.minus = minus;
    }

    @Override
    public Double calculate(Double num1, Double num2) {
        Double total = num1 * num2;
        return total >= sum ? total - minus : total;
    }
}
