package com.jlc.interview.practice;

public class Person {

    private int pid;
    private String name;
    private int age;
    private double price;
    private String category;

    public Person() {
    }

    public Person(int pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

    public Person(int pid, String name, int age, double price, String category) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.price = price;
        this.category = category;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}