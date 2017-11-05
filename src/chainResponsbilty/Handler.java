package chainResponsbilty;

/**
 * 抽象处理者角色
 *
 * @author zhan
 * Created on 2017/11/03  18:29
 */
public abstract class Handler {

    //下一个处理请求的对象
    private Handler processer = null;

    public Handler getProcesser() {
        return processer;
    }

    public void setProcesser(Handler processer) {
        this.processer = processer;
    }

    /**
     * 处理请求
     * @param userName 申请人姓名
     * @param account 申请金额
     */
    public abstract String procesReq(String userName, double account);

}
