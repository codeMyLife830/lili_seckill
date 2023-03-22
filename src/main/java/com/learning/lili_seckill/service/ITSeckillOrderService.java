package com.learning.lili_seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learning.lili_seckill.entity.TSeckillOrder;
import com.learning.lili_seckill.entity.TUser;

/**
 * 秒杀订单表 服务类
 */
public interface ITSeckillOrderService extends IService<TSeckillOrder> {

    /**
     * 获取秒杀结果
     *
     * @param tUser
     * @param goodsId
     * @return orderId 成功 ；-1 秒杀失败 ；0 排队中
     * @operation add
     **/
    Long getResult(TUser tUser, Long goodsId);
}
