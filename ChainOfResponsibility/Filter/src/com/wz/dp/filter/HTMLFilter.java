package com.wz.dp.filter;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter
 * @className: HTMLFilter
 * @description:
 * @author: Zhi Wang
 * @createDate: 2018/7/16 15:46
 **/
public class HTMLFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        // 处理HTML
        return msg.replace('<', '[').replace('>', ']');
    }
}
