package com.example.filter;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.filter
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 11:31
 * 修改人：Administrator
 * 修改时间：2016/12/27 11:31
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person (String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getGender () {
        return gender;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus () {
        return maritalStatus;
    }

    public void setMaritalStatus (String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
