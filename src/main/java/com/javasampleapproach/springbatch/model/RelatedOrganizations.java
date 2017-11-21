package com.javasampleapproach.springbatch.model;

import java.util.ArrayList;
import java.util.List;

public class RelatedOrganizations {
    private List<RelatedOrganization> item=new ArrayList<>();

    public List<RelatedOrganization> getItem() {
        return item;
    }

    public void setItem(List<RelatedOrganization> item) {
        this.item = item;
    }
}
