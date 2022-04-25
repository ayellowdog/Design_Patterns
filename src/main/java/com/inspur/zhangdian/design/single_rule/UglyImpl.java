package com.inspur.zhangdian.design.single_rule;

public class UglyImpl {
    public void userVideoManager (String userType) {
        if (UserType.GUEST.getUserType().equals(userType)) {
            System.out.println("访客用户，480P播放，并且有广告");
        } else if (UserType.ORDINARY.getUserType().equals(userType)) {
            System.out.println("普通用户，1080P播放，有广告");
        } else if (UserType.VIP.getUserType().equals(userType)) {
            System.out.println("VIP 牛逼plus 没广告");
        } else {
            System.out.println("获取传入用户类型错误");
        }

    }
}
