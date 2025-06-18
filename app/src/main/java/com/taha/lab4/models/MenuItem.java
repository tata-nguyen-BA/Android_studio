// File: app/src/main/java/com/taha/lab4/models/MenuItem.java
package com.taha.lab4.models;

public class MenuItem {
    private final int imageRes;
    private final String name;
    private final String desc;
    private final int price;

    public MenuItem(int imageRes, String name, String desc, int price) {
        this.imageRes = imageRes;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrice() {
        return price;
    }
}
