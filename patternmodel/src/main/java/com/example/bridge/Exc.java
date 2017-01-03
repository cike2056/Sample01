package com.example.bridge;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.bridge
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/30 20:08
 * 修改人：Administrator
 * 修改时间：2016/12/30 20:08
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    public static void main (String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
