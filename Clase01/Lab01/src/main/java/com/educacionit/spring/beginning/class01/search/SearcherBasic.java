package com.educacionit.spring.beginning.class01.search;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class SearcherBasic implements ISearch {

    public SearcherBasic() {
        super();
    }


    /* (non-Javadoc)
     * @see com.educacionit.spring.beginning.class01.search.ISearch#find (java.util.Map, java.lang.Integer)
     */
    @Override
    public List<String> find(final Map<Integer, String> map, final Integer filter) {
        return map.entrySet()
                .stream()
                .filter(e -> e.getKey() > filter)
                .map(Map.Entry::getValue)
                .collect(toList());
    }
}
