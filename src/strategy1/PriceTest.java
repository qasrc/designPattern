package strategy1;

import java.util.*;

/**
 * @author zhan
 * Created on 2018/01/12  9:04
 */
public class PriceTest {
    public static void main(String[] args) {

        List<EightPrice> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        PriceCalculate priceCalculate = PriceCalculateFactory.getPriceCalculte("minus");
        System.out.println("请输入价格");
        Double num1 = scanner.nextDouble();
        System.out.println("请输入数量");
        Double num2 = scanner.nextDouble();
        Double price = priceCalculate.calculate(num1, num2);
        System.out.println("总价为：" + price);
    }


}
