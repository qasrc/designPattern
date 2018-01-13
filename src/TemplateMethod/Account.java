package TemplateMethod;

/**
 * @author zhan
 * Created on 2017/11/19  16:36
 */
public abstract class Account {

    public void getMoney() {
        System.out.println("type:" + doAcountType());
        System.out.println("money" + getMoneyByType());
    }

    //钩子方法
    public abstract String doAcountType();

    public abstract Double doAcountRoate();

    private Double getMoneyByType() {
        return 1000 * doAcountRoate();
    }

}
