package com.challenge.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grocery_list_information")
public class GroceryListInformation {

    @Id
    @GeneratedValue
    @Column
    private int grocery_list_id;

    @Column
    private String grocery_list_name;

    @OneToMany(mappedBy = "grocery_list", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<GroceryItem> grocery_item;


    public GroceryListInformation() {
    }

    public GroceryListInformation(int grocery_list_id, String grocery_list_name, List<GroceryItem> grocery_item) {
        this.grocery_list_id = grocery_list_id;
        this.grocery_list_name = grocery_list_name;
        this.grocery_item = grocery_item;
    }

    public GroceryListInformation(String grocery_list_name, List<GroceryItem> grocery_item) {
        this.grocery_list_name = grocery_list_name;
        this.grocery_item = grocery_item;
    }

    public GroceryListInformation(int grocery_list_id, String grocery_list_name) {
        this.grocery_list_id = grocery_list_id;
        this.grocery_list_name = grocery_list_name;
    }

    public GroceryListInformation(String grocery_list_name) {
        this.grocery_list_name = grocery_list_name;
    }

    public int getGrocery_list_id() {
        return this.grocery_list_id;
    }

    public void setGrocery_list_id(int grocery_list_id) {
        this.grocery_list_id = grocery_list_id;
    }

    public String getGrocery_list_name() {
        return this.grocery_list_name;
    }

    public void setGrocery_list_name(String grocery_list_name) {
        this.grocery_list_name = grocery_list_name;
    }

    public List<GroceryItem> getGrocery_item() {
        return this.grocery_item;
    }

    public void setGrocery_item(List<GroceryItem> grocery_item) {
        this.grocery_item = grocery_item;
    }

    @Override
    public String toString() {
        return "{" +
            " grocery_list_id='" + getGrocery_list_id() + "'" +
            ", grocery_list_name='" + getGrocery_list_name() + "'" +
            ", grocery_item='" + getGrocery_item() + "'" +
            "}";
    }

}