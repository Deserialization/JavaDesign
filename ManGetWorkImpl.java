package com.suning.ics.FactoryMethod;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: 18070967
 * @CreateDate: 2018/10/19 15:37
 * @Version: 1.0
 */
public class ManGetWorkImpl implements GetWork {
    @Override
    public Work getWork() {
        return new ManWorkImpl();
    }
}
