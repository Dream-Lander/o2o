package com.example.myo2o.service;

import com.example.myo2o.BaseTest;
import o2o.entity.Area;
import o2o.service.AreaService;
import o2o.service.impl.AreaServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area>areaList=areaService.getAreaList();
        assertEquals("顺义",areaList.get(0).getAreaName());
    }
}
