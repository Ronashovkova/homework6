package com.cursor;

import java.util.ArrayList;
import java.util.List;

public class CommonElement {
    List<String> elementList1 = new ArrayList<>();
    List<String> elementList2 = new ArrayList<>();
    List<String> common = new ArrayList<>();

    public void addInFirstList(String data) {
        elementList1.add(data);
    }

    public void addInSecondList(String data) {
        elementList2.add(data);
    }

    public void print1() {
        for (String value : elementList1) {
            System.out.println(value);
        }
    }

    public void print2() {
        for (String value : elementList2) {
            System.out.println(value);
        }
    }

    public void checkForCommon() {
        for (String value : elementList1) {
            if (elementList2.contains(value)) {
                common.add(value);
            }
        }
        System.out.println("Common elements: " + common);
    }
}