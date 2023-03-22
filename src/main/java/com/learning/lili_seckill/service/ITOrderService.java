package com.learning.lili_seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learning.lili_seckill.entity.TOrder;
import com.learning.lili_seckill.entity.TUser;
import com.learning.lili_seckill.vo.GoodsVo;
import com.learning.lili_seckill.vo.OrderDeatilVo;

/**
 * 服务类
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 秒杀
     *
     * @param user    用户对象
     * @param goodsVo 商品对象
     * @return com.example.seckilldemo.entity.TOrder
     * @operation add
     **/
    TOrder secKill(TUser user, GoodsVo goodsVo);

    /**
     * 订单详情方法
     *
     * @param orderId
     * @return com.learning.lili_seckill.vo.OrderDeatilVo
     * @operation add
     **/
    OrderDeatilVo detail(Long orderId);

    /**
     * 获取秒杀地址
     *
     * @param user
     * @param goodsId
     * @return java.lang.String
     * @operation add
     **/
    String createPath(TUser user, Long goodsId);

    /**
     * 校验秒杀地址
     *
     * @param user
     * @param goodsId
     * @param path
     * @return boolean
     * @operation add
     **/
    boolean checkPath(TUser user, Long goodsId, String path);

    /**
     * 校验验证码
     * @operation add
     * @param tuser
     * @param goodsId
     * @param captcha
     * @return boolean
     **/
    boolean checkCaptcha(TUser tuser, Long goodsId, String captcha);
}
