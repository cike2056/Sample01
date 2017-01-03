package com.example.adapter;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.adapter
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 20:08
 * 修改人：Administrator
 * 修改时间：2016/12/28 20:08
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc (String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4 (String fileName) {
        //什么也不做
    }
}
