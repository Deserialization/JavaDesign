package com.suning.ics.abstractFactory;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: 18070967
 * @CreateDate: 2018/10/20 11:05
 * @Version: 1.0
 */
public class BlackAnimalFactoryImpl implements AnimalFactory {
    @Override
    public Cat createCat() {
        return new BlackCatImpl();
    }

    @Override
    public Dog createDog() {
        return new BlackDogImpl();
    }
}
