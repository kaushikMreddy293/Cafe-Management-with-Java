/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author kaush
 */
public class BeverageItem extends CafeItem {
    public BeverageItem(String itemName, int itemPrice) {
        super(itemName, itemPrice, Categories.BEVERAGE.toString());
    }
}