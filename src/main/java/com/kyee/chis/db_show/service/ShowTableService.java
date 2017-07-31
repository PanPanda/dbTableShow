package com.kyee.chis.db_show.service;

import com.kyee.chis.db_show.dao.entity.HisTables;
import com.kyee.chis.db_show.dao.mapper.HisTablesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowTableService {

    @Autowired
    private HisTablesMapper hisTablesMapper;

    public List<HisTables> getHisTables() {

        return hisTablesMapper.getAllTables();
    }

    public void addHisTables(HisTables hisTables) {

        hisTablesMapper.addTable(hisTables);
    }


}
