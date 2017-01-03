package com.example.template;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.template
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 21:03
 * 修改人：Administrator
 * 修改时间：2016/12/27 21:03
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public abstract class Game {

    abstract void initialize ();

    abstract void startPlay ();

    abstract void endPlay ();

    //模板
    public final void play () {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
