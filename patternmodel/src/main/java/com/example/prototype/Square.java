package com.example.prototype;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.prototype
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/29 15:03
 * 修改人：Administrator
 * 修改时间：2016/12/29 15:03
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
