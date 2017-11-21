package com.javasampleapproach.springbatch.model;

import java.util.ArrayList;
import java.util.List;

public class Addresses {
    public List<Address> getItem() {
        return item;
    }

    public void setItem(List<Address> item) {
        this.item = item;
    }

    private List<Address> item=new ArrayList<>();

}
