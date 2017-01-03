package com.example.proxy;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.proxy
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 18:39
 * 修改人：Administrator
 * 修改时间：2016/12/27 18:39
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
