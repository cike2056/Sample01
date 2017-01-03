package com.example.nullobject;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.nullobject
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/30 19:01
 * 修改人：Administrator
 * 修改时间：2016/12/30 19:01
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class RealCustomer extends AbstractCustomer {
    public RealCustomer (String name) {
        this.name = name;
    }

    @Override
    public String getName () {
        return name;
    }

    @Override
    public boolean isNil () {
        return false;
    }
}
