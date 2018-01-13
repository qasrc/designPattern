package simplefactory;

/**
 * @author zhan
 * Created on 2018/01/03  18:09
 */
public abstract class AbstractOperation {
    private Double num1;
    private Double num2;

    public AbstractOperation() {
    }

    public AbstractOperation(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    abstract Double getResult();

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }
}
