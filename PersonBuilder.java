package com.suning.ics.JavaDesign.builder;

/**
 * java类简单作用描述
 *
 * @Description: 制造人的接口
 * @Author: 18070967
 * @CreateDate: 2018/10/20 15:50
 * @Version: 1.0
 */
public interface PersonBuilder {
    void builderHead();
    void builderBody();
    void builderFoot();
    Person builderPerson();

}
