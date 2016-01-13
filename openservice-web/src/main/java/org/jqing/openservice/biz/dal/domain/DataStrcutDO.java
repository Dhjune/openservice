package org.jqing.openservice.biz.dal.domain;

/**
 * Created by user on 2016/1/13.
 */
public class DataStrcutDO extends BaseDO{

    private static final long serialVersionUID = 8952143362507879415L;

    private long id;
    /**
     * 数据结构id
     */
    private long structId;
    /**
     * apiId
     */
    private long apiId;
    /**
     * input or output
     */
    private int  type;
    /**
     * 描述
     */
    private String desc ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStructId() {
        return structId;
    }

    public void setStructId(long structId) {
        this.structId = structId;
    }

    public long getApiId() {
        return apiId;
    }

    public void setApiId(long apiId) {
        this.apiId = apiId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
