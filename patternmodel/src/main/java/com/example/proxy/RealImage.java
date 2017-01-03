package com.example.proxy;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.proxy
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 18:37
 * 修改人：Administrator
 * 修改时间：2016/12/27 18:37
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display () {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
