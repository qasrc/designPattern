package factorymethod;

/**
 * @author zhan
 *         Created on 2017/07/09  13:29
 */
public class MainTest {
    public static void main(String[] args) {
        Mobile mobile = MobileFactory.createMoblie("normal");
        if (mobile != null) {
            mobile.call("123123123");
        }
    }
}
