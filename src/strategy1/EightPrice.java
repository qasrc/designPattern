package strategy1;

/**
 * @author zhan
 * Created on 2018/01/12  9:07
 */
public class EightPrice implements PriceCalculate {

    @Override
    public Double calculate(Double num1, Double num2) {
        return num1 * num2 * 0.8;
    }
}
