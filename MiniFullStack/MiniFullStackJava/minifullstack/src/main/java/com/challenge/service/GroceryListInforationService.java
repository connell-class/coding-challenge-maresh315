package com.challenge.service;

import com.challenge.dao.GroceryListInformationDao;
import com.challenge.model.GroceryListInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryListInforationService {
    @Autowired
    private GroceryListInformationDao glid;

    public Iterable<GroceryListInformation> getAllGroceryList(){
        return glid.findAll();
    }

    public GroceryListInformation getByName(String name){
        Iterable<GroceryListInformation> tempList = glid.findAll();
        GroceryListInformation temp = null;
        for (GroceryListInformation gli : tempList){
            if (gli.getGrocery_list_name().equals(name))
                temp = gli;
        }
        return temp;
    }

    public void saveGroceryList(GroceryListInformation list){
        glid.save(list);
    }

    public void updateGroceryList(GroceryListInformation list){
        glid.save(list);
    }

    public GroceryListInformation deleteGroceryList(GroceryListInformation list){
        glid.delete(list);
        return list;
    }

    public GroceryListInformation deleteGroceryListByName(String name){
        Iterable<GroceryListInformation> tempList = glid.findAll();
        GroceryListInformation temp = null;
        for (GroceryListInformation gli : tempList){
            if (gli.getGrocery_list_name().equals(name))
                temp = gli;
        }
        glid.delete(temp);
        return temp;
    }

}