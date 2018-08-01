package com.exercise.demo.dao;

import com.exercise.demo.model.Goods;
import com.exercise.demo.model.Repertory;

import java.util.List;

public interface GoodsDao {

    List<Goods> selectAllGoods();
}
