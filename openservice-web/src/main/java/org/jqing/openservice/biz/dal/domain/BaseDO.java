package org.jqing.openservice.biz.dal.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by user on 2016/1/13.
 */
public class BaseDO implements Serializable{

    private static final long serialVersionUID = 1928361271202283283L;

    private Date createTime;

    private Date  updateTime;

    private String createPerson;

    private String  updatePerson;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }




}
