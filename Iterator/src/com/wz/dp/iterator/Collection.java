package com.wz.dp.iterator;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.iterator
 * @className: Collection
 * @description:
 * @author: wangzhi
 * @createDate: 2018/5/5 16:27
 **/
public interface Collection {
    void add(Object o);
    int size();
    Iterator iterator();
}
