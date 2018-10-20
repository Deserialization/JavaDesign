package com.suning.ics.FactoryMethod;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: 18070967
 * @CreateDate: 2018/10/19 15:39
 * @Version: 1.0
 */
public class FactoryTest {
    public static void main(String[] args) {
        GetWork manFactory = new ManGetWorkImpl();
        manFactory.getWork().doWork();
        GetWork womanFactory = new WomanGetWorkImpl();
        womanFactory.getWork().doWork();

    }
}
