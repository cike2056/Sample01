package com.example.bridge;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.bridge
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/30 20:02
 * 修改人：Administrator
 * 修改时间：2016/12/30 20:02
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
