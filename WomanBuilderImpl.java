package com.suning.ics.JavaDesign.builder;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: 18070967
 * @CreateDate: 2018/10/20 16:27
 * @Version: 1.0
 */
public class WomanBuilderImpl implements PersonBuilder {
    Person person;

    public WomanBuilderImpl() {
        person = new Person();
    }

    @Override
    public void builderHead() {
        person.setHead("语文课代表");
    }

    @Override
    public void builderBody() {
        person.setBody("死胖子");
    }

    @Override
    public void builderFoot() {
        person.setFoot("小脚");
    }

    @Override
    public Person builderPerson() {
        return person;
    }
}
