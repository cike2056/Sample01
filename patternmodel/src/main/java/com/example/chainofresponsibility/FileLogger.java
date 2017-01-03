package com.example.chainofresponsibility;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.chainofresponsibility
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 21:23
 * 修改人：Administrator
 * 修改时间：2016/12/28 21:23
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class FileLogger extends AbstractLogger {

    public FileLogger (int level) {
        this.level = level;
    }

    @Override
    protected void write (String message) {
        System.out.println("File::Logger: " + message);
    }
}
