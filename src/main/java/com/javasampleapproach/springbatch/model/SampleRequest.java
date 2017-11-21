package com.javasampleapproach.springbatch.model;

public class SampleRequest {
    private Boolean checkAdv;
    private Boolean checkPep;
    private Boolean checkSanc;
    private Boolean screen_override;
    private String lob;
    private String rqstId;
    private PartyInfo partyInfo;

    public Boolean getCheckAdv() {
        return checkAdv;
    }

    public void setCheckAdv(Boolean checkAdv) {
        this.checkAdv = checkAdv;
    }

    public Boolean getCheckPep() {
        return checkPep;
    }

    public void setCheckPep(Boolean checkPep) {
        this.checkPep = checkPep;
    }

    public Boolean getCheckSanc() {
        return checkSanc;
    }

    public void setCheckSanc(Boolean checkSanc) {
        this.checkSanc = checkSanc;
    }

    public Boolean getScreen_override() {
        return screen_override;
    }

    public void setScreen_override(Boolean screen_override) {
        this.screen_override = screen_override;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public String getRqstId() {
        return rqstId;
    }

    public void setRqstId(String rqstId) {
        this.rqstId = rqstId;
    }

    public PartyInfo getPartyInfo() {
        return partyInfo;
    }

    public void setPartyInfo(PartyInfo partyInfo) {
        this.partyInfo = partyInfo;
    }
}
