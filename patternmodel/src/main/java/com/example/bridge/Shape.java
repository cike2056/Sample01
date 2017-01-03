package com.example.bridge;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.bridge
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/30 20:03
 * 修改人：Administrator
 * 修改时间：2016/12/30 20:03
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape (DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw ();
}
