/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author kaush
 */
public class ShakeFactoryEagerSingleton implements CafeItemFactoryAPI {
    private final static ShakeFactoryEagerSingleton instance = new ShakeFactoryEagerSingleton();

    private ShakeFactoryEagerSingleton() {}

    public static ShakeFactoryEagerSingleton getInstance() {
        return instance;
    }

    @Override
    public CafeItem createCafeItemInstance(String name, int price) {
        return new ShakeItem(name,price);
    }
}
