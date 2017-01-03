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

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc (String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4 (String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
