package com.inspur.zhangdian.design.single_rule;

public enum UserType {
    GUEST("访客"), ORDINARY("普通用户"), VIP("VIP");

    private String userType;

    UserType(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }
}
