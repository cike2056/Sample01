package com.example.decorator;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.decorator
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 15:35
 * 修改人：Administrator
 * 修改时间：2016/12/27 15:35
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator (Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw () {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder (Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

}
