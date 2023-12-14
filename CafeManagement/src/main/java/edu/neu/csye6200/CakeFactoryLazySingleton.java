/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author kaush
 */
public class CakeFactoryLazySingleton implements CafeItemFactoryAPI {
    private static CakeFactoryLazySingleton instance;

    private CakeFactoryLazySingleton() {}

    public static CakeFactoryLazySingleton getInstance() {
        if (instance == null) {
            try {
                instance = new CakeFactoryLazySingleton();
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e);
            }
            
        }
        return instance;
    }

    @Override
    public CafeItem createCafeItemInstance(String name, int price) {
        
        return new CafeItem.CakeItem(name, price);
    }
}