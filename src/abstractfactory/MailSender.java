package abstractfactory;

/**
 * 发送邮件
 *
 * @author zhan
 *         Created on 2017/07/10  8:09
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}
