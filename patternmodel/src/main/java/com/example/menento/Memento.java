package com.example.menento;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.menento
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 14:20
 * 修改人：Administrator
 * 修改时间：2016/12/28 14:20
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Memento {
    private String state;

    public Memento (String state) {
        this.state = state;
    }

    public String getState () {
        return state;
    }

    public void setState (String state) {
        this.state = state;
    }
}
