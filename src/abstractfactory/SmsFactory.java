package abstractfactory;

/**
 * @author zhan
 *         Created on 2017/07/10  8:16
 */
public class SmsFactory implements AbstractFactory {

    @Override
    public Sender getProvider() {
        return new SmsSender();
    }
}
