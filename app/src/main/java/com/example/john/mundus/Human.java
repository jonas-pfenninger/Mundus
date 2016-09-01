package com.example.john.mundus;

/**
 * Created by john on 8/21/2016.
 */
public class Human {
    private final int max_health = 100;
    private int health;
    private int stepCounter;
    Human() {
        health = max_health;
    }
    public void eat() {
        health = Math.min(health + 1, max_health);
    }

    public void advanceSimulation() {
        advanceHealth();
    }

    private void advanceHealth() {
        if (stepCounter == 1000) {
            --health;
            stepCounter = 0;
        } else {
            ++stepCounter;
        }
        return;
    }
}
