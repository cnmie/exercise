package com.exercise.demo.dao;

import com.exercise.demo.model.Repertory;

import java.util.List;

public interface RepertoryDao {
    List<Repertory> selectAllRepertory();
    List<Repertory> queryRepertory(String condition);

    int addRepertory(Repertory repertory);

    int updateRepertory(Repertory repertory);
}
