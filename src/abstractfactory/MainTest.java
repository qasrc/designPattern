package abstractfactory;

/**
 * @author zhan
 *         Created on 2017/07/10  8:17
 */
public class MainTest {
    public static void main(String[] args) {

        AbstractFactory factory = new SmsFactory();

        Sender sender = factory.getProvider();
        sender.send();

    }
}
