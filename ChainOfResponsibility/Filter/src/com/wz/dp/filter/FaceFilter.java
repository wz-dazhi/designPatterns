package com.wz.dp.filter;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter
 * @className: FaceFilter
 * @description:
 * @author: Zhi Wang
 * @createDate: 2018/7/16 17:50
 **/
public class FaceFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace(":)", "^V^");
    }
}
