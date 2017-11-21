package com.javasampleapproach.springbatch.model;

import java.util.Date;

public class PartyInfo {
    private Key key;
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private String legalName;
    private String gender;
    private Date birthDt;
    private String partyTypeCd;
    private RelatedOrganizations relatedOrganizations;
    private Addresses addresses;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDt() {
        return birthDt;
    }

    public void setBirthDt(Date birthDt) {
        this.birthDt = birthDt;
    }

    public String getPartyTypeCd() {
        return partyTypeCd;
    }

    public void setPartyTypeCd(String partyTypeCd) {
        this.partyTypeCd = partyTypeCd;
    }

    public RelatedOrganizations getRelatedOrganizations() {
        return relatedOrganizations;
    }

    public void setRelatedOrganizations(RelatedOrganizations relatedOrganizations) {
        this.relatedOrganizations = relatedOrganizations;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }
}
