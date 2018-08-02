package com.exercise.demo.dao;

import com.exercise.demo.model.Goods;

import java.util.List;

public interface RelationDao {
    List<Goods> selectAllRelation();

    List<Goods> queryRelation(String condition);
}
