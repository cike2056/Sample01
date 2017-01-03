package com.example.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.filter
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 11:41
 * 修改人：Administrator
 * 修改时间：2016/12/27 11:41
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class CriteriaMale implements ICriteria {
    @Override
    public List<Person> meetCriteria (List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person:persons
             ) {
            if (person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
