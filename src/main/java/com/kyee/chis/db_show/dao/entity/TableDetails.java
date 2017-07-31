package com.kyee.chis.db_show.dao.entity;

public class TableDetails {

    private Integer id;

    private String fieldName;

    private Integer tableId;

    private Integer isPrimary;

    private Integer isNull;

    private String defauleValue;

    public Integer getId() {
        return id;
    }

    public TableDetails setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFieldName() {
        return fieldName;
    }

    public TableDetails setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public Integer getTableId() {
        return tableId;
    }

    public TableDetails setTableId(Integer tableId) {
        this.tableId = tableId;
        return this;
    }

    public Integer getIsPrimary() {
        return isPrimary;
    }

    public TableDetails setIsPrimary(Integer isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    public Integer getIsNull() {
        return isNull;
    }

    public TableDetails setIsNull(Integer isNull) {
        this.isNull = isNull;
        return this;
    }

    public String getDefauleValue() {
        return defauleValue;
    }

    public TableDetails setDefauleValue(String defauleValue) {
        this.defauleValue = defauleValue;
        return this;
    }
}
