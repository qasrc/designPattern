package simplefactory;

/**
 * @author zhan
 * Created on 2018/01/03  18:11
 */
public class AddOperation extends AbstractOperation {
    public AddOperation(Double num1, Double num2) {
        super(num1, num2);
    }

    public AddOperation() {
    }

    @Override
    Double getResult() {
        return getNum1() + getNum2();
    }
}
