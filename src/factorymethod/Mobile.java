package factorymethod;

/**
 * 电话接口类
 *
 * @author zhan
 *         Created on 2017/07/09  12:40
 */
public interface Mobile {

    /**
     * 拨打电话功能
     * @param number 需要拨打的手机号
     */
    void call(String number);
}
