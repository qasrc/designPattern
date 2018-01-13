package TemplateMethod;

/**
 * @author zhan
 * Created on 2017/11/19  16:44
 */
public class AcountTest {
    public static void main(String[] args) {
        Account account = new AcountA();
        account.getMoney();
        Account account1 = new AcountB();
        account1.getMoney();
    }
}
