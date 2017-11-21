package com.javasampleapproach.springbatch.model;

public class Address {
    private String addrLine1;
    private String addrLine2;
    private String addrLine3;
    private String addrLine4;
    private String addrTypeCd;
    private String city;
    private String countryCd;
    private Key key;
    private String postalCd;
    private String stateCd;
    private String validationStatus;

    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public String getAddrLine3() {
        return addrLine3;
    }

    public void setAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
    }

    public String getAddrLine4() {
        return addrLine4;
    }

    public void setAddrLine4(String addrLine4) {
        this.addrLine4 = addrLine4;
    }

    public String getAddrTypeCd() {
        return addrTypeCd;
    }

    public void setAddrTypeCd(String addrTypeCd) {
        this.addrTypeCd = addrTypeCd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getPostalCd() {
        return postalCd;
    }

    public void setPostalCd(String postalCd) {
        this.postalCd = postalCd;
    }

    public String getStateCd() {
        return stateCd;
    }

    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }

    public String getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }
}
