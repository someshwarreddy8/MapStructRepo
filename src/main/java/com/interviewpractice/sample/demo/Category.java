package com.interviewpractice.sample.demo;

public class Category {
    public String Electronics;
    public String Clothing;
    public String Groceries;

    public String getElectronics() {
        return Electronics;
    }

    public void setElectronics(String electronics) {
        Electronics = electronics;
    }

    public String getClothing() {
        return Clothing;
    }

    public void setClothing(String clothing) {
        Clothing = clothing;
    }

    public String getGroceries() {
        return Groceries;
    }

    public void setGroceries(String groceries) {
        Groceries = groceries;
    }

    @Override
    public String toString() {
        return "Category{" +
                "Electronics='" + Electronics + '\'' +
                ", Clothing='" + Clothing + '\'' +
                ", Groceries='" + Groceries + '\'' +
                '}';
    }
}
