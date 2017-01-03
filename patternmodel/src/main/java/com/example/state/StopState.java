package com.example.state;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.state
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 20:49
 * 修改人：Administrator
 * 修改时间：2016/12/27 20:49
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
