package com.example.nullobject;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.nullobject
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/30 19:15
 * 修改人：Administrator
 * 修改时间：2016/12/30 19:15
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
