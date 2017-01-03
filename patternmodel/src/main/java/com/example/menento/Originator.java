package com.example.menento;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.menento
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 14:27
 * 修改人：Administrator
 * 修改时间：2016/12/28 14:27
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Originator {
    private String state;

    public String getState () {
        return state;
    }

    public void setState (String state) {
        this.state = state;
    }

    public Memento saveState () {
        return new Memento(state);
    }

    public void restoreState (Memento memento) {
        memento.getState();
    }
}
