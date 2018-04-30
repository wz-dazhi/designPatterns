package com.wz;

/**
 * @projectName: designPatterns
 * @package: com.wz
 * @className: Address
 * @description:
 * @author: wangzhi
 * @createDate: 2018/4/30 18:28
 **/
public class Address {

    private String name;

    public Address(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
