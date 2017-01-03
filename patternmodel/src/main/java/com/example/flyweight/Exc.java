package com.example.flyweight;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.flyweight
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 19:25
 * 修改人：Administrator
 * 修改时间：2016/12/28 19:25
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main (String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor () {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX () {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY () {
        return (int) (Math.random() * 100);
    }

}
