package com.exercise.demo.service;

import com.exercise.demo.dao.RelationDao;
import com.exercise.demo.model.Goods;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "relationService")
public class RelationServiceImpl implements RelationService{
    @Autowired
    RelationDao relationDao;
    @Override
    public PageInfo<Goods> findAllRelation(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> relationList=relationDao.selectAllRelation();
        PageInfo<Goods> result=new PageInfo(relationList);
        return result;
    }

    @Override
    public PageInfo<Goods> queryRelation(String condition, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> relationList=relationDao.queryRelation(condition);
        PageInfo<Goods> result=new PageInfo(relationList);
        return result;
    }
}
