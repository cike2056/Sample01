package com.example.dao;

import java.util.List;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.dao
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/29 16:03
 * 修改人：Administrator
 * 修改时间：2016/12/29 16:03
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public interface StudentDao {
    List<Student> getAllStudents ();

    Student getStudent (int rollNo);

    void updateStudent (Student student);

    void deleteStudent (Student student);
}
