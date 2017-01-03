package com.example.mvc;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.mvc
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/30 16:19
 * 修改人：Administrator
 * 修改时间：2016/12/30 16:19
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController (Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName (String name) {
        model.setName(name);
    }

    public String getStudentName () {
        return model.getName();
    }

    public void setStudentRollNo (String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo () {
        return model.getRollNo();
    }

    public void updateView () {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }

}
