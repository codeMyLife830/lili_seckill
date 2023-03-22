package com.learning.lili_seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learning.lili_seckill.entity.TGoods;
import com.learning.lili_seckill.vo.GoodsVo;

import java.util.List;

/**
 * 商品表 服务类
 */
public interface ITGoodsService extends IService<TGoods> {

    /**
     * 返回商品列表
     *
     * @param
     * @return java.util.List<com.example.seckilldemo.vo.GoodsVo>
     * @operation add
     **/
    List<GoodsVo> findGoodsVo();

    /**
     * 获取商品详情
     *
     * @param goodsId
     * @return java.lang.String
     * @operation add
     **/
    GoodsVo findGoodsVobyGoodsId(Long goodsId);
}
