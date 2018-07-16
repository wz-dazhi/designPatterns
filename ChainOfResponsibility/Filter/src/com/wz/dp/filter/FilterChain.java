package com.wz.dp.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter
 * @className: FilterChain
 * @description:
 * @author: Zhi Wang
 * @createDate: 2018/7/16 16:47
 **/
public class FilterChain implements Filter{

    private List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    @Override
    public String doFilter(String msg) {
        for (Filter f : filters) {
            msg = f.doFilter(msg);
        }
        return msg;
    }
}
