package com.challenge.controller;

import com.challenge.model.GroceryItem;
import com.challenge.service.GroceryItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/groceryitem")
@CrossOrigin(origins = {"http://localhost:3000"})
public class GroceryItemController {

    @Autowired
    private GroceryItemService gis;

    @GetMapping("/all")
    public Iterable<GroceryItem> getAllItems() {
        return gis.getAllItems();
    }

    @GetMapping(value = "/{name}")
    public GroceryItem getByName(@PathVariable("name") String name) {
        return gis.getByName(name);
    }

    @PostMapping("/new")
    public String saveItem(@RequestBody GroceryItem item) {
        if(item != null){
            gis.saveItem(item);
            return "Grocery Item Added";
        }
        return null;
    }

    @PutMapping("/update")
    public String updateItem(@RequestBody GroceryItem item) {
        if(item != null){
            gis.updateItem(item);
            return "Grocery Item Updated";
        }
        return null;
    }

    @DeleteMapping("/delete")
    public String deleteItem(@RequestBody GroceryItem item) {
        if(item != null){
            gis.deleteItem(item);
            return "Grocery Item Deleted";
        }
        return null;

    }

    @DeleteMapping(value = "/delete/{name}")
    public String deleteItemByName(@PathVariable("name") String name) {
        if(name != null){
            gis.deleteItemByName(name);
            return "Grocery Item "+name+" Deleted";
        }
        return null;

    }

}