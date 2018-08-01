package com.exercise.demo.service;

import com.exercise.demo.dao.SkuDao;
import com.exercise.demo.model.Sku;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "skuService")
public class SkuServicempl implements SkuService{
    @Autowired
    private SkuDao skuDao;
    @Override
    public PageInfo<Sku> findAllSku(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Sku> skuList=skuDao.selectAllSku();
        PageInfo<Sku> result=new PageInfo(skuList);
        return result;
    }
    @Override
    public int addSku(Sku sku){
        return skuDao.addSku(sku);
    }

}
