package factorymethod;

import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/**
 * 电话工厂
 *
 * @author zhan
 *         Created on 2017/07/09  13:32
 */
public class MobileFactory {

    /**
     * 根据对象创建不同的对象
     * @param string 类型
     * @return 根据类型创建不同的对象
     */
    @Nullable
    public static Mobile createMoblie(String string) {
        if (Objects.equals("smart", string)) {
            return new SmartMobile();
        } else if (Objects.equals("normal", string)) {
            return new NormalMobile();
        }else{
            System.out.println("请输入正确的类型：[smart,normal]");
            return null;
        }
    }
}
