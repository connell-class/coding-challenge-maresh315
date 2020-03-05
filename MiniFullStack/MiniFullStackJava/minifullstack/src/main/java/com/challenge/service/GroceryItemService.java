package com.challenge.service;

import com.challenge.dao.GroceryItemDao;
import com.challenge.model.GroceryItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryItemService {

    @Autowired
    private GroceryItemDao gid;

    public Iterable<GroceryItem> getAllItems(){
        return gid.findAll();
    }

    public void saveItem(GroceryItem item){
        gid.save(item);
    }

    public void updateItem(GroceryItem item){
        gid.save(item);
    }

    public GroceryItem deleteItem(GroceryItem item){
        gid.delete(item);
        return item;
    }

    public GroceryItem deleteItemByName(String name){
        Iterable<GroceryItem> tempList = gid.findAll();
        GroceryItem temp = null;
        for (GroceryItem gi : tempList){
            if (gi.getGrocery_name().equals(name))
                temp = gi;
        }
        gid.delete(temp);
        return temp;
    }

    public GroceryItem getByName(String name){
        Iterable<GroceryItem> tempList = gid.findAll();
        GroceryItem temp = null;
        for (GroceryItem gi : tempList){
            if (gi.getGrocery_name().equals(name))
                temp = gi;
        }
        return temp;
    }
}