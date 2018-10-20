package com.suning.ics.JavaDesign.builder;

/**
 * java类简单作用描述
 *
 * @Description: 组装类 就是来执行刚才所有的造人动作，方法的参数是之前的接口。只要实现我们这个接口的类。就都可以
 * 作为参数。
 * @Author: 18070967
 * @CreateDate: 2018/10/20 15:55
 * @Version: 1.0
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder pb){
        pb.builderBody();
        pb.builderFoot();
        pb.builderHead();
        return pb.builderPerson();
    }
}
