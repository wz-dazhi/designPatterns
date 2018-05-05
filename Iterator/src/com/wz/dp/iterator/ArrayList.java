package com.wz.dp.iterator;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.iterator
 * @className: ArrayList
 * @description: 自定义ArrayList
 * @author: wangzhi
 * @createDate: 2018/5/5 15:44
 **/
public class ArrayList implements Collection{

    private Object[] objects = new Object[10];

    /**
     * 索引,记录有效数据
     */
    private int index = 0;

    @Override
    public void add(Object o) {
        // 判断容器的容量是否超过规定的数量
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator{
        private int currentIndex = 0;

        @Override
        public Object next() {
            Object o = objects[currentIndex];
            currentIndex++;
            return o;
        }

        @Override
        public boolean hasNext() {
            if (currentIndex >= index) {
                return false;
            } else {
                return true;
            }
        }
    }
}
