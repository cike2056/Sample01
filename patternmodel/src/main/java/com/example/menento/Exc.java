package com.example.menento;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.menento
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/28 15:00
 * 修改人：Administrator
 * 修改时间：2016/12/28 15:00
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveState());
        originator.setState("State #3");
        careTaker.add(originator.saveState());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.restoreState(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.restoreState(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
