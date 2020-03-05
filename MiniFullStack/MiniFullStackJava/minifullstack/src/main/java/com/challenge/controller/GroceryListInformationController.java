package com.challenge.controller;

import com.challenge.model.GroceryListInformation;
import com.challenge.service.GroceryListInforationService;

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
@RequestMapping(value = "/grocerylist")
@CrossOrigin(origins = {"http://localhost:3000"})
public class GroceryListInformationController {

    @Autowired
    private GroceryListInforationService glis;

    @GetMapping("/all")
    public Iterable<GroceryListInformation> getAllGroceryList() {
        return glis.getAllGroceryList();
    }

    @GetMapping(value = "/{name}")
    public GroceryListInformation getByName(@PathVariable("name") String name) {
        return glis.getByName(name);
    }

    @PostMapping("/new")
    public String saveGroceryList(@RequestBody GroceryListInformation list) {
        if(list != null){
            glis.saveGroceryList(list);
            return "Grocery List Added";
        }
        return null;
    }

    @PutMapping("/update")
    public String updateGroceryList(@RequestBody GroceryListInformation list) {
        if(list != null){
            glis.updateGroceryList(list);
            return "Grocery List Updated";
        }
        return null;
    }

    @DeleteMapping("/delete")
    public String deleteGroceryList(@RequestBody GroceryListInformation list) {
        if(list != null){
            glis.deleteGroceryList(list);
            return "Grocery List Deleted";
        }
        return null;
    }

    @DeleteMapping(value = "/delete/{name}")
    public String deleteGroceryListByName(@PathVariable("name") String name) {
        if(name != null){
            glis.deleteGroceryListByName(name);
            return "Grocery List "+name+" Deleted";
        }
        return null;

    }
}