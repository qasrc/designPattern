package TemplateMethod;

/**
 * @author zhan
 * Created on 2017/11/19  16:43
 */
public class AcountA extends Account {
    @Override
    public String doAcountType() {
        return "accountA";
    }

    @Override
    public Double doAcountRoate() {
        return 2.0;
    }
}
