package com.example.decorator;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.decorator
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 15:38
 * 修改人：Administrator
 * 修改时间：2016/12/27 15:38
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    public static void main(){
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
