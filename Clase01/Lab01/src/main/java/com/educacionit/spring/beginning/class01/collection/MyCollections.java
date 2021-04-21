package com.educacionit.spring.beginning.class01.collection;

import java.util.List;
import java.util.Set;

public class MyCollections {

    private List<String> list;
    private Set<String> set;

    public MyCollections() {
        super();
    }

    public List<String> getList() {
        return this.list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return this.set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }
}