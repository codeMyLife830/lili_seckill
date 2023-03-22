package com.learning.lili_seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learning.lili_seckill.entity.TGoods;
import com.learning.lili_seckill.vo.GoodsVo;

import java.util.List;

/**
 * 商品表 Mapper 接口
 */
public interface TGoodsMapper extends BaseMapper<TGoods> {

    /**
     * 返回商品列表
     * @operation add
     * @param
     * @return java.util.List<com.example.seckilldemo.vo.GoodsVo>
     **/
    List<GoodsVo> findGoodsVo();

    GoodsVo findGoodsVobyGoodsId(Long goodsId);
}
