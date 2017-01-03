package com.example.facade;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.facade
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/21 11:32
 * 修改人：Administrator
 * 修改时间：2016/12/21 11:32
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    public static void main(String [] args){
        ShapeMaker maker = new ShapeMaker();
        maker.drawRectangle(new Rectangle());
        maker.drawCircle(new Circle());
    }
}
