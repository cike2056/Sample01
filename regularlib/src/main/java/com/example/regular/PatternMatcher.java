package com.example.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 项目名称：Sample01
 * 应用包名 ：com.example.regular
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2017/1/3 17:04
 * 修改人：Administrator
 * 修改时间：2017/1/3 17:04
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class PatternMatcher {
    public static void main(String [] args){
        String line = "This order was placed for QT3000! OK?";
        String p = "(\\D*)(\\d+)(.*)";
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(line);
        System.out.println(m.groupCount());
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
