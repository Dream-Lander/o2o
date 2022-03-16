package com.example.myo2o.dao;

import com.example.myo2o.BaseTest;
import o2o.dao.AreaDao;
import o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaDaoTest extends BaseTest {
@Autowired
    private AreaDao areaDao;
@Test
    public void testQueryArea(){
    List<Area> areaList = areaDao.queryArea();
    System.out.println(areaList.get(0).getAreaId());
}
}
