package com.example.adapter;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.adapter
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 20:23
 * 修改人：Administrator
 * 修改时间：2016/12/28 20:23
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    public static void main (String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
