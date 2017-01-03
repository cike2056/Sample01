package com.example.iterator;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.iterator
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 16:26
 * 修改人：Administrator
 * 修改时间：2016/12/27 16:26
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class NameRepository implements Container {
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator () {
        return new NameIterator();
    }

    class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext () {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next () {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }


}
