package com.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grocery_item")
public class GroceryItem {

    @Id
    @GeneratedValue
    @Column
    private int grocery_id;

    @Column
    private String grocery_name, grocery_type;

    @Column
    private double grocery_price;

    @ManyToOne(fetch = FetchType.EAGER)
    private GroceryListInformation grocery_list;


    public GroceryItem() {
    }

    public GroceryItem(int grocery_id, String grocery_name, String grocery_type, double grocery_price, GroceryListInformation grocery_list) {
        this.grocery_id = grocery_id;
        this.grocery_name = grocery_name;
        this.grocery_type = grocery_type;
        this.grocery_price = grocery_price;
        this.grocery_list = grocery_list;
    }

    public GroceryItem(String grocery_name, String grocery_type, double grocery_price, GroceryListInformation grocery_list) {
        this.grocery_name = grocery_name;
        this.grocery_type = grocery_type;
        this.grocery_price = grocery_price;
        this.grocery_list = grocery_list;
    }

    public GroceryItem(String grocery_name, String grocery_type, double grocery_price) {
        this.grocery_name = grocery_name;
        this.grocery_type = grocery_type;
        this.grocery_price = grocery_price;
    }

    public int getGrocery_id() {
        return this.grocery_id;
    }

    public void setGrocery_id(int grocery_id) {
        this.grocery_id = grocery_id;
    }

    public String getGrocery_name() {
        return this.grocery_name;
    }

    public void setGrocery_name(String grocery_name) {
        this.grocery_name = grocery_name;
    }

    public String getGrocery_type() {
        return this.grocery_type;
    }

    public void setGrocery_type(String grocery_type) {
        this.grocery_type = grocery_type;
    }

    public double getGrocery_price() {
        return this.grocery_price;
    }

    public void setGrocery_price(double grocery_price) {
        this.grocery_price = grocery_price;
    }

    public GroceryListInformation getGrocery_list() {
        return this.grocery_list;
    }

    public void setGrocery_list(GroceryListInformation grocery_list) {
        this.grocery_list = grocery_list;
    }

    @Override
    public String toString() {
        return "{" +
            " grocery_id='" + getGrocery_id() + "'" +
            ", grocery_name='" + getGrocery_name() + "'" +
            ", grocery_type='" + getGrocery_type() + "'" +
            ", grocery_price='" + getGrocery_price() + "'" +
            ", grocery_list='" + getGrocery_list() + "'" +
            "}";
    }

}