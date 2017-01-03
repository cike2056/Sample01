package com.example.template;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.template
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 21:04
 * 修改人：Administrator
 * 修改时间：2016/12/27 21:04
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Cricket extends Game {
    @Override
    void endPlay () {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize () {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay () {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
