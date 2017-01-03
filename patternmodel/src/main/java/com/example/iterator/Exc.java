package com.example.iterator;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.iterator
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 16:37
 * 修改人：Administrator
 * 修改时间：2016/12/27 16:37
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class Exc {
    public static void main(String [] args){
        NameRepository namesRepository = new NameRepository();
        Iterator iter = namesRepository.getIterator();
        while (iter.hasNext()){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
//        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
//            String name = (String)iter.next();
//            System.out.println("Name : " + name);
//        }
    }
}
