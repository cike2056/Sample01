package com.example.flyweight;

import java.util.HashMap;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.flyweight
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 17:41
 * 修改人：Administrator
 * 修改时间：2016/12/28 17:41
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle (String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
