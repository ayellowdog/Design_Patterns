package com.inspur.zhangdian.design.single_rule.service.impl;

import com.inspur.zhangdian.design.single_rule.service.IUserVideoService;

public class GuestUserVideoServiceImpl implements IUserVideoService {
    @Override
    public void userDefine() {
        System.out.println("访客用户，480P播放");
    }

    @Override
    public void ad() {
        System.out.println("有广告");
    }
}
