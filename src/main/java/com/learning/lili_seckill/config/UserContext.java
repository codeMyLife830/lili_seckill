package com.learning.lili_seckill.config;

import com.learning.lili_seckill.entity.TUser;

public class UserContext {

    private static ThreadLocal<TUser> userThreadLocal = new ThreadLocal<>();

    public static void setUser(TUser tUser) {
        userThreadLocal.set(tUser);
    }

    public static TUser getUser() {
        return userThreadLocal.get();
    }
}
