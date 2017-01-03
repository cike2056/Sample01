package com.example.template;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.template
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 21:05
 * 修改人：Administrator
 * 修改时间：2016/12/27 21:05
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    public static void main (String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
