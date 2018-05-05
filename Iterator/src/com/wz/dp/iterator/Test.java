package com.wz.dp.iterator;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.iterator
 * @className: Test
 * @description:
 * @author: wangzhi
 * @createDate: 2018/5/5 15:43
 **/
public class Test {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        LinkedList list = new LinkedList();
//        Collection c = new ArrayList();
        Collection c = new LinkedList();
        for (int i = 0; i < 15; i++) {
            c.add(new Cat(i));
        }

        System.out.println(c.size());

        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.print(o + " ");
        }
    }
}
