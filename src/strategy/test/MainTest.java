package strategy.test;

/**
 * @author zhan
 * Created on 2017/10/28  15:38
 */
public class MainTest {
    public static void main(String[] args) {
        Dog dog = new Dog(new YeatStrategy());
        dog.eat("apple");
    }
}
