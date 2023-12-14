/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author kaush
 */
public class ItemBill {
    
    private int Bnum;
    private String SellerName;
    private String SellingDate;
    private int Amount;

    
    
    public int getBnum() {
        return Bnum;
    }

    
    public void setBnum(int Bnum) {
        this.Bnum = Bnum;
    }

    public String getSellerName() {
        return SellerName;
    }
    public void setSellerName(String SellerName) {
        this.SellerName = SellerName;
    }

   
    public String getSellingDate() {
        return SellingDate;
    }

    
    public void setSellingDate(String SellingDate) {
        this.SellingDate = SellingDate;
    }

    
    public int getAmount() {
        return Amount;
    }

    
    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
    
     public ItemBill(int Bnum, String SellerName, String SellingDate, int Amount) {
        this.Bnum = Bnum;
        this.SellerName = SellerName;
        this.SellingDate = SellingDate;
        this.Amount = Amount;
    }
    
}
