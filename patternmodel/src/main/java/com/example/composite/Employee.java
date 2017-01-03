package com.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.composite
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 20:02
 * 修改人：Administrator
 * 修改时间：2016/12/27 20:02
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee (String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
