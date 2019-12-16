package com.cursor;

import java.util.ArrayList;
import java.util.List;

public class FruitList {

    List<String> fruitList = new ArrayList<>();

    public void add(String data) {
        fruitList.add(data);
    }

    public void print() {
        for (String value : fruitList) {
            System.out.println(value);
        }
    }

    public void hasSpecialFruit() {
        if (!fruitList.contains("Orange")) {
            System.out.println("Oops! This fruit doesn't exist.");
        }
    }

    public void setFruitList() {
        for (int i = 0; i < fruitList.size(); i++) {
            if (fruitList.get(i) == "Orange") {
                fruitList.set(i, "Grapefruit");
            }
        }
        System.out.println(fruitList);
    }
}

