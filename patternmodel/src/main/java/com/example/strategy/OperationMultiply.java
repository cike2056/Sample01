package com.example.strategy;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.strategy
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 21:49
 * 修改人：Administrator
 * 修改时间：2016/12/28 21:49
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation (int num1, int num2) {
        return num1 * num2;
    }
}
