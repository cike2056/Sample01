package com.example.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.dao
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/29 16:05
 * 修改人：Administrator
 * 修改时间：2016/12/29 16:05
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class StudentDaoImpl implements StudentDao {

    List<Student> students;

    public StudentDaoImpl () {
        students = new ArrayList<>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("John", 1);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public void deleteStudent (Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo()
                + ", deleted from database");
    }

    @Override
    public List<Student> getAllStudents () {
        return students;
    }

    @Override
    public Student getStudent (int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent (Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo()
                + ", updated in the database");
    }

}
