package com.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {

    List<Integer> list = new ArrayList<>();

    public void add(Integer data) {
        list.add(data);
    }

    public void print() {
        for (Integer value : list) {
            System.out.println(value);
        }
    }

    public void removeIf() {
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            if (iterator.next() % 3 == 0) {
                iterator.remove();
            }
        }
        System.out.println("New list: " + list);
    }
}
