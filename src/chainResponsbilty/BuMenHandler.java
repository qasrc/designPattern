package chainResponsbilty;

/**
 * @author zhan
 * Created on 2017/11/03  18:59
 */
public class BuMenHandler extends Handler {
    @Override
    public String procesReq(String userName, double account) {
        String str = "";
        if (account <3000) {
            if (userName.equals("张三")) {
                str = "部门经理处理【"+userName+"】的请求，已通过审批。";
            }else{
                str = "部门经理处理【" + userName + "】的请求，未通过审批。";
            }
        }else{
            if (getProcesser() != null) {
                return getProcesser().procesReq(userName, account);
            }
        }
        return str;
    }
}
