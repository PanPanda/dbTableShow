package com.kyee.chis.db_show.dao.entity;

public class HisTables {

    private Integer id;

    private String tableName;

    private String module;

    private String tableComment;


    public Integer getId() {
        return id;
    }

    public HisTables setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    public HisTables setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getModule() {
        return module;
    }

    public HisTables setModule(String module) {
        this.module = module;
        return this;
    }

    public String getTableComment() {
        return tableComment;
    }

    public HisTables setTableComment(String tableComment) {
        this.tableComment = tableComment;
        return this;
    }
}
