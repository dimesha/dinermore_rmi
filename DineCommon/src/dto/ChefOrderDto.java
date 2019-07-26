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
public class ChefOrderDto implements Serializable{
    
    private String orderid;
    private String orderdate;
    private int orderqty;
    private String itemCode;
    private String itemname;
    private String custname;
    private String custtelno;
    private String custaddress;
    private String startTime;
    private String endTime;
    private String chefname;
    private String telopid;
    private String price;

    public ChefOrderDto() {
    }

    public ChefOrderDto(String orderid, String orderdate, int orderqty, String itemCode, String itemname, String custname, String custtelno, String custaddress, String startTime, String endTime, String chefname, String telopid, String price) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.orderqty = orderqty;
        this.itemCode = itemCode;
        this.itemname = itemname;
        this.custname = custname;
        this.custtelno = custtelno;
        this.custaddress = custaddress;
        this.startTime = startTime;
        this.endTime = endTime;
        this.chefname = chefname;
        this.telopid = telopid;
        this.price = price;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public int getOrderqty() {
        return orderqty;
    }

    public void setOrderqty(int orderqty) {
        this.orderqty = orderqty;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCusttelno() {
        return custtelno;
    }

    public void setCusttelno(String custtelno) {
        this.custtelno = custtelno;
    }

    public String getCustaddress() {
        return custaddress;
    }

    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getChefname() {
        return chefname;
    }

    public void setChefname(String chefname) {
        this.chefname = chefname;
    }

    public String getTelopid() {
        return telopid;
    }

    public void setTelopid(String telopid) {
        this.telopid = telopid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
    
}
