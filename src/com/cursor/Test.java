package com.cursor;

public class Test {
    public static void start(){
        System.out.println("Task 3");

        CommonElement commonElement = new CommonElement();
        commonElement.addInFirstList("cup");
        commonElement.addInFirstList("plate");
        commonElement.addInFirstList("spoon");
        commonElement.addInFirstList("glass");

        commonElement.addInSecondList("jar");
        commonElement.addInSecondList("plate");
        commonElement.addInSecondList("jar");
        commonElement.addInSecondList("glass");

        commonElement.print1();
        System.out.println();
        commonElement.print2();
        System.out.println();
        commonElement.checkForCommon();
        System.out.println();

        System.out.println("Task 2");
        FruitList fruitList = new FruitList();

        fruitList.add("Orange");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.print();
        fruitList.hasSpecialFruit();
        fruitList.setFruitList();
        System.out.println();
        System.out.println("Task 1");
        MyArrayList list = new MyArrayList();

        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);
        list.print();
        list.removeIf();
    }
}
