package com.example.filter;

import java.util.List;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.filter
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/27 13:51
 * 修改人：Administrator
 * 修改时间：2016/12/27 13:51
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class OrCriteria implements ICriteria {
    private ICriteria criteria;
    private ICriteria otherCriteria;

    public OrCriteria(ICriteria criteria, ICriteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
