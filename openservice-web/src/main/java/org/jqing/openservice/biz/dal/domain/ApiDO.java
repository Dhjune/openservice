package org.jqing.openservice.biz.dal.domain;

/**
 * Created by user on 2016/1/13.
 */
public class ApiDO extends  BaseDO{

    private static final long serialVersionUID = -1137020986189867760L;

    private long id;

    private long apiId ;

    private long appId;

    private String name;
    /**
     * 服务方法
     */
    private String method;
    /**
     * 服务
     */
    private String service;
    /**
     * 服务类型
     */
    private String serviceType;
    /**
     * 接口版本
     */
    private String version;
    /**
     * json ，xml,默认数据类型
     */
    private String format;
    /**
     * 接受数据泛化
     */
    private boolean generalize;

    public long getApiId() {
        return apiId;
    }

    public void setApiId(long apiId) {
        this.apiId = apiId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isGeneralize() {
        return generalize;
    }

    public void setGeneralize(boolean generalize) {
        this.generalize = generalize;
    }
}
