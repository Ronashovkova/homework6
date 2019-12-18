package com.cursor;

public class AppExecutor {
    public static void start() {
        findCommonElements();
        changeFruit();
        findDividedByThree();
    }

    public static void changeFruit() {
        FruitList fruitList = new FruitList();
        fruitList.add("Orange");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.print();
        fruitList.hasSpecialFruit();
        fruitList.setFruitList();
        System.out.println();
    }

    public static void findDividedByThree() {
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

    public static void findCommonElements() {
        CommonElement commonElement = new CommonElement();
        commonElement.addInFirstList("cup");
        commonElement.addInFirstList("plate");
        commonElement.addInFirstList("spoon");
        commonElement.addInFirstList("glass");

        commonElement.addInSecondList("jar");
        commonElement.addInSecondList("plate");
        commonElement.addInSecondList("jar");
        commonElement.addInSecondList("glass");

        commonElement.printElements(commonElement.getElementList1());

        System.out.println();
        commonElement.printElements(commonElement.getElementList2());
        System.out.println();
        commonElement.checkForCommon();
        System.out.println();
    }
}
