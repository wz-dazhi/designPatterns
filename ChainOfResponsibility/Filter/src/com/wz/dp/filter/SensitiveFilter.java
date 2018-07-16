package com.wz.dp.filter;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter
 * @className: SensitiveFilter
 * @description:
 * @author: Zhi Wang
 * @createDate: 2018/7/16 16:20
 **/
public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        // 处理敏感字眼
        return msg.replace("敏感", "").replace("被就业", "就业");
    }
}
