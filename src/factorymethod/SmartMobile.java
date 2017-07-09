package factorymethod;

/**
 * 智能机
 *
 * @author zhan
 *         Created on 2017/07/09  12:42
 */
public class SmartMobile implements Mobile {

    @Override
    public void call(String number) {
        System.out.println("正在初始化系统。。。");
        System.out.println("smartPhone正在拨打电话，号码：" + number);
    }
}
