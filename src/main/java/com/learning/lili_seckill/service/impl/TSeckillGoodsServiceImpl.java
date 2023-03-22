package com.learning.lili_seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learning.lili_seckill.entity.TSeckillGoods;
import com.learning.lili_seckill.mapper.TSeckillGoodsMapper;
import com.learning.lili_seckill.service.ITSeckillGoodsService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * 秒杀商品表 服务实现类
 */
@Service
@Primary
public class TSeckillGoodsServiceImpl extends ServiceImpl<TSeckillGoodsMapper, TSeckillGoods> implements ITSeckillGoodsService {

}
