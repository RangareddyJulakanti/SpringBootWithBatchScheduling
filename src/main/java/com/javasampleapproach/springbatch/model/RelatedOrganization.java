package com.javasampleapproach.springbatch.model;

public class RelatedOrganization {
    private String costCenterCd;
    private String costCenterDesc;
    private String endDt;
    private String entityName;
    private Key key;
    private String lobDesc;
    private String lobId;
    private String orgUnitId;
    private String relatedOgUnitTypeCd;
    private String startDt;

    public String getCostCenterCd() {
        return costCenterCd;
    }

    public void setCostCenterCd(String costCenterCd) {
        this.costCenterCd = costCenterCd;
    }

    public String getCostCenterDesc() {
        return costCenterDesc;
    }

    public void setCostCenterDesc(String costCenterDesc) {
        this.costCenterDesc = costCenterDesc;
    }

    public String getEndDt() {
        return endDt;
    }

    public void setEndDt(String endDt) {
        this.endDt = endDt;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getLobDesc() {
        return lobDesc;
    }

    public void setLobDesc(String lobDesc) {
        this.lobDesc = lobDesc;
    }

    public String getLobId() {
        return lobId;
    }

    public void setLobId(String lobId) {
        this.lobId = lobId;
    }

    public String getOrgUnitId() {
        return orgUnitId;
    }

    public void setOrgUnitId(String orgUnitId) {
        this.orgUnitId = orgUnitId;
    }

    public String getRelatedOgUnitTypeCd() {
        return relatedOgUnitTypeCd;
    }

    public void setRelatedOgUnitTypeCd(String relatedOgUnitTypeCd) {
        this.relatedOgUnitTypeCd = relatedOgUnitTypeCd;
    }

    public String getStartDt() {
        return startDt;
    }

    public void setStartDt(String startDt) {
        this.startDt = startDt;
    }
}
