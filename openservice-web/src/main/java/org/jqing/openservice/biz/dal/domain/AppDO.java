package org.jqing.openservice.biz.dal.domain;

/**
 * Created by user on 2016/1/13.
 */
public class AppDO extends BaseDO {

    private static final long serialVersionUID = -7414485016495955650L;

    private long id;

    private long  appId;

    private String name;

    private String desc ;

    private int status;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
