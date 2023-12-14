/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author kaush
 */
public class BeverageFactoryLazySingleton implements CafeItemFactoryAPI {
    private static BeverageFactoryLazySingleton instance;

    private BeverageFactoryLazySingleton() {}

    public static BeverageFactoryLazySingleton getInstance() {
        if (instance == null) {
            instance = new BeverageFactoryLazySingleton();
        }
        return instance;
    }

    @Override
    public CafeItem createCafeItemInstance(String name, int price) {
        //return new BeverageItem(name, price, category);
        return new BeverageItem(name, price );
    }
}
