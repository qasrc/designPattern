package simplefactory;

import java.util.Scanner;

/**
 * @author zhan
 * Created on 2018/01/03  12:40
 */
public class Main {
    public static void main(String[] args) {
        Double num1;
        Double num2;
        String operationStr;
        System.out.println("请输入第一个数字：");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextDouble();
        System.out.println("请输入第二个数字：");
        num2 = scanner.nextDouble();
        System.out.println("请输入运算符号：");
        operationStr = scanner.next();
        AbstractOperation operation = OperationFactory.getOperation(operationStr);
        if (operation != null) {
            operation.setNum1(num1);
            operation.setNum2(num2);
            System.out.println("结果为：" + operation.getResult());
        }

    }

}
