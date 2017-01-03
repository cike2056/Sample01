package com.example.mvc;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.mvc
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/30 16:20
 * 修改人：Administrator
 * 修改时间：2016/12/30 16:20
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {

    public static void main (String[] args) {

        //从数据可获取学生记录
        Student model = retriveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase () {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

}
