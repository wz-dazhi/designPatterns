package com.wz.dp.filter;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.filter
 * @className: Main
 * @description:
 * @author: Zhi Wang
 * @createDate: 2018/7/16 15:25
 **/
public class Main {

    public static void main(String[] args) {
        String msg = "hello :), <script>alert('hello')</script>敏感信息,被就业...测试信息";
        MsgProcessor mp = new MsgProcessor();
        mp.setMsg(msg);
        // 定义FilterChain
        FilterChain chain1 = new FilterChain();
        chain1.addFilter(new HTMLFilter())
             .addFilter(new SensitiveFilter());

        // 定义第二个FilterChain
        FilterChain chain2 = new FilterChain();
        chain2.addFilter(new FaceFilter());

        // 将第二个FilterChain放到第一个FilterChain中
        chain1.addFilter(chain2);

        mp.setFc(chain1);
        String result = mp.process();
        System.out.println(result);
    }

}
