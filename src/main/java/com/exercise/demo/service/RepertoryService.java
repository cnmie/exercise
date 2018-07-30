package com.exercise.demo.service;

import com.exercise.demo.model.Repertory;
import com.github.pagehelper.PageInfo;

public interface RepertoryService {
    public PageInfo<Repertory> findAllRepertory(int pageNum, int pageSize);

    public PageInfo<Repertory> queryRepertory(String condition,int pageNum, int pageSize);

    public int addRepertory(Repertory repertory);
}
