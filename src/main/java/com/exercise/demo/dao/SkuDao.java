package com.exercise.demo.dao;

import com.exercise.demo.model.Sku;

import java.util.List;

public interface SkuDao {
    int addSku(Sku sku);

    List<Sku> selectAllSku();

    int updateSku(Sku sku);

    List<Sku> querySku(String condition);
}
