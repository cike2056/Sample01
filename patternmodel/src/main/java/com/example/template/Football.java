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

public class Football extends Game {

    @Override
    void endPlay () {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize () {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay () {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
