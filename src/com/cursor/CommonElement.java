package com.cursor;

import java.util.ArrayList;
import java.util.List;

public class CommonElement {


    private List<String> elementList1 = new ArrayList<>();
    private List<String> elementList2 = new ArrayList<>();
    private List<String> common = new ArrayList<>();

    public void addInFirstList(String data) {
        elementList1.add(data);
    }

    public void addInSecondList(String data) {
        elementList2.add(data);
    }

    public void printElements(List<String> list) {
        for (String value : list) {
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

    public List<String> getElementList1() {
        return elementList1;
    }

    public List<String> getElementList2() {
        return elementList2;
    }
}