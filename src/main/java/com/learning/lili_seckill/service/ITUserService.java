package com.learning.lili_seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learning.lili_seckill.entity.TUser;
import com.learning.lili_seckill.vo.LoginVo;
import com.learning.lili_seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 用户表 服务类
 * </p>
 */

public interface ITUserService extends IService<TUser> {

    /**
     * 登录方法
     *
     * @param loginVo
     * @param request
     * @param response
     * @return com.example.seckilldemo.vo.RespBean
     * @operation add
     **/
    RespBean doLongin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);

    /**
     * 根据cookie获取用户
     *
     * @param userTicket
     * @return com.example.seckilldemo.entity.TUser
     * @author LC
     * @operation add
     * @date 1:50 下午 2022/3/3
     **/
    TUser getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);


    /**
     * 更新密码
     *
     * @param userTicket
     * @param id
     * @param password
     * @return com.example.seckilldemo.vo.RespBean
     * @operation add
     **/
    RespBean updatePassword(String userTicket, String password, HttpServletRequest request, HttpServletResponse response);
}
