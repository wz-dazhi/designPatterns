package com.wz.dp.filter.web;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter.web
 * @className: Main
 * @description:
 * @author: Zhi Wang
 * @createDate: 2018/7/16 15:25
 **/
public class Main {

    public static void main(String[] args) {
        String msg = "hello :), <script>alert('hello')</script>敏感信息,被就业...测试信息";
        Request req = new Request();
        req.setValue(msg);
        Response resp = new Response();
        resp.setValue(">>> response--");

        // 定义FilterChain
        FilterChain chain = new FilterChain();
        chain.addFilter(new HTMLFilter())
             .addFilter(new SensitiveFilter());

        chain.doFilter(req, resp, chain);

        System.out.println(req.getValue());
        System.out.println(resp.getValue());
    }

}
