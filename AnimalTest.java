package com.suning.ics.abstractFactory;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: 18070967
 * @CreateDate: 2018/10/20 11:17
 * @Version: 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalFactory blackAnimalFactory = new BlackAnimalFactoryImpl();
        Cat blackCat = blackAnimalFactory.createCat();
        blackCat.eat();
        Dog blackDog = blackAnimalFactory.createDog();
        blackDog.eat();

        AnimalFactory whiteAnimalFactory = new WhiteAnimalFactoryImpl();
        Cat whileCat = whiteAnimalFactory.createCat();
        whileCat.eat();
        Dog whileDog = whiteAnimalFactory.createDog();
        whileDog.eat();
    }


}
