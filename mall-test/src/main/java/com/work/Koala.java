package com.work;


public class Koala {
    private int age;
    private int id;
    private int health;
    private String location;

    public Koala(int age, int id, int health, String location) {
        this.age = age;
        this.id = id;
        this.health = health;
        this.location = location;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
