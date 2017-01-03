package com.example.state;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.state
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 20:50
 * 修改人：Administrator
 * 修改时间：2016/12/27 20:50
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
