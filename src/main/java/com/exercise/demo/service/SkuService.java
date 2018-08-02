package com.exercise.demo.service;

import com.exercise.demo.model.Sku;
import com.github.pagehelper.PageInfo;

public interface SkuService {
    public PageInfo<Sku> querySku(String condition, int pageNum, int pageSize);

    public int addSku(Sku sku);

    public PageInfo<Sku> findAllSku(int pageNum, int pageSize);

    public int updateSku(Sku sku);
}
