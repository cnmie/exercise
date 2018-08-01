package com.exercise.demo.service;

import com.exercise.demo.model.Sku;
import com.github.pagehelper.PageInfo;

public interface SkuService {
    public int addSku(Sku sku);

    public PageInfo<Sku> findAllSku(int pageNum, int pageSize);
}
