package mybatis.generator.model;

import java.util.Date;

public class CouponAuth {
    private Long id;

    private String platformId;

    private String appId;

    private String listType;

    private String listStatus;

    private String couponBatchNumber;

    private String couponType;

    private String authField;

    private String authFieldNo;

    private String authFieldName;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    public String getListStatus() {
        return listStatus;
    }

    public void setListStatus(String listStatus) {
        this.listStatus = listStatus;
    }

    public String getCouponBatchNumber() {
        return couponBatchNumber;
    }

    public void setCouponBatchNumber(String couponBatchNumber) {
        this.couponBatchNumber = couponBatchNumber;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getAuthField() {
        return authField;
    }

    public void setAuthField(String authField) {
        this.authField = authField;
    }

    public String getAuthFieldNo() {
        return authFieldNo;
    }

    public void setAuthFieldNo(String authFieldNo) {
        this.authFieldNo = authFieldNo;
    }

    public String getAuthFieldName() {
        return authFieldName;
    }

    public void setAuthFieldName(String authFieldName) {
        this.authFieldName = authFieldName;
    }

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
}