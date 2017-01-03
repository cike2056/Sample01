package com.example.flyweight;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.flyweight
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 17:39
 * 修改人：Administrator
 * 修改时间：2016/12/28 17:39
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Circle implements Shape {
    private String color;
    private int x, y;
    private int radius;

    public Circle (String color) {
        this.color = color;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setRadius (int radius) {
        this.radius = radius;
    }

    public void setY (int y) {
        this.y = y;
    }

    @Override
    public void draw () {
        System.out.println("Circle: Draw() [Color : " + color
                + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
