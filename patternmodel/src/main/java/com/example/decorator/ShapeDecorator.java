package com.example.decorator;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.decorator
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 15:30
 * 修改人：Administrator
 * 修改时间：2016/12/27 15:30
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator (Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw () {
        decoratedShape.draw();
    }
}
