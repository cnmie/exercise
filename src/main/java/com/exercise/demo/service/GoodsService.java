package com.exercise.demo.service;

import com.exercise.demo.model.Goods;
import com.github.pagehelper.PageInfo;

public interface GoodsService {
    public PageInfo<Goods> findAllGoods(int pageNum, int pageSize);
}
