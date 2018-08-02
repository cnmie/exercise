package com.exercise.demo.service;

import com.exercise.demo.dao.GoodsDao;
import com.exercise.demo.model.Goods;
import com.exercise.demo.model.Repertory;
import com.exercise.demo.model.Sku;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "goodsService")
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public PageInfo<Goods> findAllGoods(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goodsList=goodsDao.selectAllGoods();
        PageInfo<Goods> result=new PageInfo(goodsList);
        return result;
    }

}
