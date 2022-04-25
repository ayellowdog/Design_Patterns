package com.inspur.zhangdian.design.single_rule.service.impl;

import com.inspur.zhangdian.design.single_rule.service.IUserVideoService;

public class OrdinaryUserVideoServiceImpl implements IUserVideoService {
    @Override
    public void userDefine() {
        System.out.println("普通用户，1080P播放");
    }

    @Override
    public void ad() {
        System.out.println("有广告");
    }
}
