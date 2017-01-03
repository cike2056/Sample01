package com.example.menento;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.menento
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 14:47
 * 修改人：Administrator
 * 修改时间：2016/12/28 14:47
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public void add (Memento memento) {
        mementos.add(memento);
    }

    public Memento get (int index) {
        return mementos.get(index);
    }

    public void remove (int index) {
        mementos.remove(index);
    }
}
