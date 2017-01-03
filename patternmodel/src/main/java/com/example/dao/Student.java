package com.example.dao;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.dao
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/29 16:01
 * 修改人：Administrator
 * 修改时间：2016/12/29 16:01
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Student {
    private String name;
    private int rollNo;

    public Student () {
    }

    public Student (String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getRollNo () {
        return rollNo;
    }

    public void setRollNo (int rollNo) {
        this.rollNo = rollNo;
    }
}
