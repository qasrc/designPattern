package TemplateMethod;

/**
 * @author zhan
 * Created on 2017/11/19  16:43
 */
public class AcountB extends Account {
    @Override
    public String doAcountType() {
        return "acountB";
    }

    @Override
    public Double doAcountRoate() {
        return 5.0;
    }
}
