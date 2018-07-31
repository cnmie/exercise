package com.exercise.demo.service;

import com.exercise.demo.model.Repertory;
import com.exercise.demo.dao.RepertoryDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "repertoryService")
public class RepertoryServiceImpl implements RepertoryService{
    @Autowired
    private RepertoryDao repertoryDao;
    @Override
    public PageInfo<Repertory> findAllRepertory(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Repertory> repertoryList=repertoryDao.selectAllRepertory();
        PageInfo<Repertory> result=new PageInfo(repertoryList);
        return result;
    }

    @Override
    public PageInfo<Repertory> queryRepertory(String condition,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Repertory> repertoryList=repertoryDao.queryRepertory(condition);
        PageInfo<Repertory> result=new PageInfo(repertoryList);
        return result;
    }

    @Override
    public int addRepertory(Repertory repertory) {
        return repertoryDao.addRepertory(repertory);
    }

    @Override
    public int updateRepertory(Repertory repertory) {
        return repertoryDao.updateRepertory(repertory);
    }
}
