package com.learning.lili_seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learning.lili_seckill.entity.TGoods;
import com.learning.lili_seckill.mapper.TGoodsMapper;
import com.learning.lili_seckill.service.ITGoodsService;
import com.learning.lili_seckill.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品表 服务实现类
 */
@Service
@Primary
public class TGoodsServiceImpl extends ServiceImpl<TGoodsMapper, TGoods> implements ITGoodsService {

    @Autowired
    private TGoodsMapper tGoodsMapper;

    @Override
    public List<GoodsVo> findGoodsVo() {
        return tGoodsMapper.findGoodsVo();
    }

    @Override
    public GoodsVo findGoodsVobyGoodsId(Long goodsId) {
        GoodsVo goodsVobyGoodsId = tGoodsMapper.findGoodsVobyGoodsId(goodsId);
        System.out.println(goodsVobyGoodsId.toString());
//        return tGoodsMapper.findGoodsVobyGoodsId(goodsId);
        return goodsVobyGoodsId;
    }
}
