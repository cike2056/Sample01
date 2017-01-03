package com.example.chainofresponsibility;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.chainofresponsibility
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 21:14
 * 修改人：Administrator
 * 修改时间：2016/12/28 21:14
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message){
        if (this.level <= level){
            write(message);
        }
        if (nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }

    abstract protected void write(String message);
}
