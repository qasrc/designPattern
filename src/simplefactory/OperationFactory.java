package simplefactory;

/**
 * @author zhan
 * Created on 2018/01/03  18:22
 */
public class OperationFactory {
    public static AbstractOperation getOperation(String op) {
        switch (op) {
            case "+":
                return new AddOperation();
            case "-":
                return new OddOperation();
            default:
                return null;
        }

    }
}
