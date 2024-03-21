package fr.univ_orleans.iut45.mud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Thing {
    private int capacity;
    private List<String> listStr;
    private Map<String,Integer> inventory;

    public Thing(int value) {
        this.capacity = value;
        this.listStr = new ArrayList<>();
        this.inventory = new HashMap<>();
    }

    public Thing() {
        this.capacity = 0;
        this.listStr = new ArrayList<>();
        this.inventory = new HashMap<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int value) {
        this.capacity = value;
    }

    public List<String> getListStr() {
        return listStr;
    }

    public void setListStr(List<String> listStr) {
        this.listStr = listStr;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(Map<String, Integer> inventory) {
        this.inventory = inventory;
    }
}
