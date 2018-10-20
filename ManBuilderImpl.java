package com.suning.ics.JavaDesign.builder;

/**
 * java类简单作用描述
 *
 * @Description: 实现造人的类，实现了造人的接口，new一个对象，然后在set对象。最后返回一个造好的man
 * @Author: 18070967
 * @CreateDate: 2018/10/20 15:51
 * @Version: 1.0
 */
public class ManBuilderImpl implements PersonBuilder {
    Person person;

    public ManBuilderImpl() {
        person = new Person();
    }

    @Override
    public void builderHead() {
        person.setHead("创建男人的头");
    }

    @Override
    public void builderBody() {
        person.setBody("创建男人的身体");
    }

    @Override
    public void builderFoot() {
        person.setFoot("创建男人的脚");
    }

    @Override
    public Person builderPerson() {
        return person;
    }
}
