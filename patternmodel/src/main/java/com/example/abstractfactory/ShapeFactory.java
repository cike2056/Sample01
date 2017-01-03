package com.example.abstractfactory;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.abstractfactory
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2017/1/3 14:12
 * 修改人：Administrator
 * 修改时间：2017/1/3 14:12
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
