package com.example.john.mundus;

/**
 * Created by john on 8/21/2016.
 */
public class Human {
    private final int maxhealth = 100;
    private int health;
    Human() {
        health = maxhealth;
    }
    public void eat() {
        health = Math.min(health + 1, maxhealth);
    }
}
