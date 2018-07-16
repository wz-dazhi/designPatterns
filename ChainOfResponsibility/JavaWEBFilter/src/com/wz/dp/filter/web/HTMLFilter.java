package com.wz.dp.filter.web;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter.web
 * @className: HTMLFilter
 * @description:
 * @author: Zhi Wang
 * @createDate: 2018/7/16 15:46
 **/
public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request req, Response resp, FilterChain chain) {
        // 处理HTML
        String reqResult = req.getValue().replace('<', '[').replace('>', ']') + "---HTMLFilter()---";
        req.setValue(reqResult);

        chain.doFilter(req, resp, chain);

        String respResult = resp.getValue() + "---HTMLFilter()---";
        resp.setValue(respResult);
    }
}
