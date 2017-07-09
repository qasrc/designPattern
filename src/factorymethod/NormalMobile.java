package factorymethod;

/**
 * 普通手机
 *
 * @author zhan
 *         Created on 2017/07/09  12:44
 */
public class NormalMobile implements Mobile {

    /**
     * 普通手机拨打电话
     * @param number 需要拨打的手机号
     */
    @Override
    public void call(String number) {
        System.out.println("正在拨打电话：" + number);
    }
}
