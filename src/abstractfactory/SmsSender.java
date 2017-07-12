package abstractfactory;

/**
 * sms消息
 *
 * @author zhan
 *         Created on 2017/07/10  8:10
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送sms消息");
    }
}
