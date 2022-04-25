package com.inspur.zhangdian.design.single_rule.service.impl;

import com.inspur.zhangdian.design.single_rule.service.IUserVideoService;

public class VIPUserVideoServiceImpl implements IUserVideoService {
    @Override
    public void userDefine() {
        System.out.println("VIP 牛逼plus");
    }

    @Override
    public void ad() {
        System.out.println("没广告");
    }
}
