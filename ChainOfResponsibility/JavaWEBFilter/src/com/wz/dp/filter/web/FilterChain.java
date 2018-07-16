package com.wz.dp.filter.web;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter.web
 * @className: FilterChain
 * @description:
 * @author: Zhi Wang
 * @createDate: 2018/7/16 16:47
 **/
public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<>();

    private int index = 0;

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request req, Response resp, FilterChain chain) {
        if (index == filters.size()) {
            return;
        }

        Filter filter = this.filters.get(index);
        index++;
        filter.doFilter(req, resp, chain);
    }
}
