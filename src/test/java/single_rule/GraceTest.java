package single_rule;

import com.inspur.zhangdian.design.single_rule.service.IUserVideoService;
import com.inspur.zhangdian.design.single_rule.service.impl.GuestUserVideoServiceImpl;

public class GraceTest {
    public static void main(String[] args) {
        IUserVideoService VideoService = new GuestUserVideoServiceImpl();
        VideoService.userDefine();
        VideoService.ad();
    }
}
