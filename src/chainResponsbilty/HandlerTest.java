package chainResponsbilty;

/**
 * @author zhan
 * Created on 2017/11/03  19:02
 */
public class HandlerTest {
    public static void main(String[] args) {
        ManagerHander managerHander = new ManagerHander();
        CompanyHandler companyHandler = new CompanyHandler();
        BuMenHandler buMenHandler = new BuMenHandler();
        managerHander.setProcesser(buMenHandler);
        buMenHandler.setProcesser(companyHandler);
        String s = managerHander.procesReq("张三1", 1000);
        System.out.println(s);
    }
}
