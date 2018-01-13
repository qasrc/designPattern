package simplefactory;

import java.util.Scanner;

/**
 * @author zhan
 * Created on 2018/01/03  12:24
 */
public class OperationMail {
    public static void main(String[] args) {
        Integer num1;
        Integer num2;
        Double result = null;
        String operationStr;
        System.out.println("请输入第一个数字：");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        num2 = scanner.nextInt();
        System.out.println("请输入运算符号：");
        operationStr = scanner.next();
        boolean flag = true;
        switch (operationStr) {
            case "+":
                result = Double.valueOf(num1 + num2);
                break;
            case "-":
                result = Double.valueOf(num1 - num2);
                break;
            case "*":
                result = Double.valueOf(num1 * num2);
                break;
            case "/":
                result = Double.valueOf(num1 / num2);
                break;
            default:
                flag = false;
                System.out.println("请输入正确的运算符");
                break;
        }
        if (flag) {
            System.out.println("运算结果：");
            System.out.println(num1 + operationStr + num2 + "=" + result);

        }

    }
}
