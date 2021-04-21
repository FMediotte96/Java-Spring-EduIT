package com.educacionit.spring.beginning.class01.search;

import java.util.Map;


import java.util.List;

public class Database {

    private Map<Integer, String> data = null;
    private Integer key = null;
    private ISearch search = null;

    public Database(Map<Integer, String> data) {
        super();
        this.data = data;
    }

    public Database(Map<Integer, String> data, Integer key) {
        super();
        this.data = data;
        this.key = key;
    }

    public void setSearch(ISearch search) {
        this.search = search;
    }

    public List<String> findByIdMoreThan(Integer id) {
        return this.search.find(this.data, id);
    }

    public List<String> findByIdMoreThan() {
        return this.search.find(this.data, this.key);
    }
}