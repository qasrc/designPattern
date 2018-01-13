package strategy1;

import java.util.Scanner;

/**
 * @author zhan
 * Created on 2018/01/11  20:47
 */
public class MainTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数量");
        double num1 = scanner.nextDouble();
        System.out.println("请输入单价");
        double num2 = scanner.nextDouble();
        System.out.println("请输入打折比例");
        double num3 = scanner.nextDouble();
        System.out.println("总价：" + (num1 * num2 * num3));
    }
}
