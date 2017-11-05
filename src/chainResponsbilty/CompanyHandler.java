package chainResponsbilty;

/**
 * @author zhan
 * Created on 2017/11/03  19:00
 */
public class CompanyHandler extends Handler {
    @Override
    public String procesReq(String userName, double account) {
        String str = "";
        if (account <60000) {
            if (userName.equals("张三")) {
                str = "公司经理处理【"+userName+"】的请求，已通过审批。";
            }else{
                str = "公司经理处理【" + userName + "】的请求，未通过审批。";
            }
        }else{
            if (getProcesser() != null) {
                return getProcesser().procesReq(userName, account);
            }
        }
        return str;
    }
}
