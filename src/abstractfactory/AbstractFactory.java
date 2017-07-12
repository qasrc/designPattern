package abstractfactory;

/**
 * 抽象工厂
 *
 * @author zhan
 *         Created on 2017/07/10  8:11
 */
public interface AbstractFactory {
    /**
     * 获取消息发送的提供者
     * @return 消息发送的超类
     */
    Sender getProvider();
}
