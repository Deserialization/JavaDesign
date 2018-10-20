package com.suning.ics.JavaDesign.builder;

/**
 * java类简单作用描述
 *
 * @Description:
 * @Author: 18070967
 * @CreateDate: 2018/10/20 15:56
 * @Version: 1.0
 */
public class builderTest {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilderImpl());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());


        PersonDirector pd1 = new PersonDirector();
        Person person1 = pd1.constructPerson(new WomanBuilderImpl());
        System.out.println(person1.getBody());
        System.out.println(person1.getFoot());
        System.out.println(person1.getHead());

    }
}
