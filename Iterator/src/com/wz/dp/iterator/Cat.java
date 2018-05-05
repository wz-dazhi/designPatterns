package com.wz.dp.iterator;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.iterator
 * @className: Cat
 * @description:
 * @author: wangzhi
 * @createDate: 2018/5/5 15:50
 **/
public class Cat {
    private int id;

    public Cat(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
