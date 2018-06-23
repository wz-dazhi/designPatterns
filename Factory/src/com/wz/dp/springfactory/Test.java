package com.wz.dp.springfactory;

import java.util.Properties;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.springfactory
 * @className: Test
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 16:24
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(Test.class.getClassLoader().getResourceAsStream("com/wz/dp/springfactory/spring.properties"));
        String vehicleType = props.getProperty("VehicleType");
        Object o = Class.forName(vehicleType).newInstance();
        Moveable m = (Moveable) o;
        m.run();
    }
}
