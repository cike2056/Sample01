package com.example.strategy;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.strategy
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 21:52
 * 修改人：Administrator
 * 修改时间：2016/12/28 21:52
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    public static void main (String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
