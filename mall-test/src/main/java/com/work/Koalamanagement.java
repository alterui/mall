package com.work;

import org.checkerframework.checker.units.qual.K;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Koalamanagement {
    private static final List<Koala> koalas = new LinkedList<>();

    public void addKoala(Koala koala) {
        koalas.add(koala);
    }


    public List<Koala> findHealthyKoalas(String location) {
        List<Koala> healthyKoalas = new ArrayList<>();
        for (Koala koala : koalas) {
            if (location.equals(koala.getLocation()) && koala.getHealth() < 5 / 10) {
                healthyKoalas.add(koala);
            }
        }
        return healthyKoalas;
    }

    public int predictkoaladeaths(int age, int healthy) {
        int number = 0;
        for (Koala koala : koalas) {
            if (koala.getAge() > age && koala.getHealth() < healthy) {
                number++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
       boolean x =true;
       boolean y = false;
       short z = 42;
       //if(y==true)
        if ((z++==42)&&(y=true))z++;
        if ((x=false)||(++z==45))z++;
        System.out.println(z);


    }
}
