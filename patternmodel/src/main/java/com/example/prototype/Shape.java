package com.example.prototype;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.prototype
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/29 14:40
 * 修改人：Administrator
 * 修改时间：2016/12/29 14:40
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw ();

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getType () {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
