package com.wz.dp.filter;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter
 * @className: MsgProcessor
 * @description: 消息处理器
 * @author: Zhi Wang
 * @createDate: 2018/7/16 15:28
 **/
public class MsgProcessor {
    private String msg;

    // private Filter[] filters = {new HTMLFilter(),new SensitiveFilter()};
    private FilterChain fc;

    public FilterChain getFc() {
        return fc;
    }

    public void setFc(FilterChain fc) {
        this.fc = fc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process() {
        return fc.doFilter(msg);
    }
}
