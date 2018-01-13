package simplefactory;

/**
 * @author zhan
 * Created on 2018/01/03  18:12
 */
public class OddOperation extends AbstractOperation {
    public OddOperation(Double num1, Double num2) {
        super(num1, num2);
    }

    public OddOperation() {
    }

    @Override
    Double getResult() {
        return getNum1() - getNum2();
    }
}
