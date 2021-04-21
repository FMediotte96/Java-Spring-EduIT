package com.educacionit.spring.beginning.class01.search;

import java.util.Map;
import java.util.List;

public interface ISearch {
    List<String> find(Map<Integer, String> map, Integer filter);
}
