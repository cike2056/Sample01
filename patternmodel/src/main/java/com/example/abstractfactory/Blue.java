package com.example.abstractfactory;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.abstractfactory
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2017/1/3 14:07
 * 修改人：Administrator
 * 修改时间：2017/1/3 14:07
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
