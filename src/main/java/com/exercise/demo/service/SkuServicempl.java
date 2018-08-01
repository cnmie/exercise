package com.exercise.demo.service;

import com.exercise.demo.dao.SkuDao;
import com.exercise.demo.model.Sku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "skuService")
public class SkuServicempl implements SkuService{
    @Autowired
    private SkuDao skuDao;
    @Override
    public int addSku(Sku sku){
        return skuDao.addSku(sku);
    }
}
