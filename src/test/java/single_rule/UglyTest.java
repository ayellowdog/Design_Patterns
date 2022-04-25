package single_rule;

import com.inspur.zhangdian.design.single_rule.UglyImpl;
import com.inspur.zhangdian.design.single_rule.UserType;

public class UglyTest {
    public static void main(String[] args) {
        UglyImpl ugly = new UglyImpl();
        ugly.userVideoManager(UserType.GUEST.getUserType());
    }
}
