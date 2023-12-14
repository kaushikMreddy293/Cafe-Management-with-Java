/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author kaush
 */
public class ShakeItem extends CafeItem {
    public ShakeItem(String itemName, int itemPrice) {
        super(itemName, itemPrice, Categories.SHAKE.toString());
    }
}