package com.kyee.chis.db_show.dao.mapper;

import com.kyee.chis.db_show.dao.entity.HisTables;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HisTablesMapper {

    @Select("SELECT * FROM HIS_TABLES;")
    public List<HisTables> getAllTables();

    @Insert("INSERT INTO HIS_TABLES (ID,TABLE_NAME,MODULE,TABLE_COMMENT)\n" +
            "VALUES (#{id}, #{tableName}, #{module}, #{tableComment});")
    public int addTable(HisTables hisTables);
}
