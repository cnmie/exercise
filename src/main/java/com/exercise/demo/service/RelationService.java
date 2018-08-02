package com.exercise.demo.service;

import com.exercise.demo.model.Goods;
import com.github.pagehelper.PageInfo;

public interface RelationService {
    public PageInfo<Goods> findAllRelation(int pageNum, int pageSize);

    PageInfo<Goods> queryRelation(String condition, int pageNum, int pageSize);
}
