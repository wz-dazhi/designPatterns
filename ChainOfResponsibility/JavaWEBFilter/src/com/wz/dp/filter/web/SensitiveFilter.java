package com.wz.dp.filter.web;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter.web
 * @className: SensitiveFilter
 * @description:
 * @author: Zhi Wang
 * @createDate: 2018/7/16 16:20
 **/
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request req, Response resp, FilterChain chain) {
        // 处理敏感字眼
        String reqResult = req.getValue().replace("敏感", "").replace("被就业", "就业") + "---SensitiveFilter()---";
        req.setValue(reqResult);

        chain.doFilter(req, resp, chain);

        String respResult = resp.getValue() + "---SensitiveFilter()---";
        resp.setValue(respResult);
    }
}
