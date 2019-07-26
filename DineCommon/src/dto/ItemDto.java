/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author dimesha
 */
public class ItemDto implements Serializable{
     private String itemcode;
    private String itemname;
    private int qty;
     private double unitprice;

    public ItemDto() {
    }

    public ItemDto(String itemcode, String itemname, int qty, double unitprice) {
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.qty = qty;
        this.unitprice = unitprice;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
     
     
    
}
