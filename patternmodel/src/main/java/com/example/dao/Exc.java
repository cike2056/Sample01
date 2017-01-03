package com.example.dao;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.dao
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/29 16:30
 * 修改人：Administrator
 * 修改时间：2016/12/29 16:30
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    public static void main (String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }


        //更新学生
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
