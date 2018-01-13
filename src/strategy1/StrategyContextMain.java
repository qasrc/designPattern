package strategy1;

/**
 * @author zhan
 * Created on 2018/01/13  13:48
 */
public class StrategyContextMain {
    public static void main(String[] args) {
        Double price = 100.00;
        Integer count = 20;
        String type = "minus";
        StrategyContext context = new StrategyContext(price, count, type);
        System.out.println(context.contextInterface());
    }
}
