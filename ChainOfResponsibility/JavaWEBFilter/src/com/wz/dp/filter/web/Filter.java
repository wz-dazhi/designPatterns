package com.wz.dp.filter.web;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter.web
 * @className: Filter
 * @description:
 * @author: Zhi Wang
 * @createDate: 2018/7/16 15:36
 **/
public interface Filter {
    void doFilter(Request req, Response resp, FilterChain chain);
}
