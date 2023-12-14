/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author kaush
 */
public class CafeItem {
    private String itemName;
    private int itemPrice;
    private String itemCategory;

    public CafeItem(String itemName, int itemPrice, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    @Override
    public String toString() {
        return "CafeItem{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemCategory=" + itemCategory + '}';
    }

    static class CakeItem extends CafeItem {
        public CakeItem(String itemName, int itemPrice) {
            super(itemName, itemPrice, Categories.CAKE.toString());
        }
    }
}
