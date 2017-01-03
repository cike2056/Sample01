package com.example.bridge;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.bridge
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/30 20:06
 * 修改人：Administrator
 * 修改时间：2016/12/30 20:06
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Circle extends Shape {
    private int x,y,radius;
    public Circle(int x,int y,int radius,DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        drawAPI.drawCircle(radius,x,y);
    }
}
