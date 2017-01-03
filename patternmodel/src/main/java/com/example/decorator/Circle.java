package com.example.decorator;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.decorator
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 15:29
 * 修改人：Administrator
 * 修改时间：2016/12/27 15:29
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Circle implements Shape {
    @Override
    public void draw () {
        System.out.println("Shape: Circle");
    }
}
