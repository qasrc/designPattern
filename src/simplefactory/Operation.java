package simplefactory;

/**
 * @author zhan
 * Created on 2018/01/03  12:37
 */
public class Operation {
    private Integer num1;
    private Integer num2;
    private String operator;


    public Operation(Integer num1, Integer num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public Double result() {
        Double result = null;
        switch (operator) {
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
                throw new RuntimeException("运算符输入错误");
        }
        return result;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }
}
