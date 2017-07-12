package abstractfactory;

/**
 * 生产发送邮件的对象
 *
 * @author zhan
 *         Created on 2017/07/10  8:12
 */
public class MailFactory implements AbstractFactory {


    @Override
    public Sender getProvider() {
        return new MailSender();
    }
}
