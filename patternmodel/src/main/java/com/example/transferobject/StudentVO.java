package com.example.transferobject;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.transferobject
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/30 14:11
 * 修改人：Administrator
 * 修改时间：2016/12/30 14:11
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class StudentVO {
    private String name;
    private int rollNo;

    StudentVO(String name, int rollNo){
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
