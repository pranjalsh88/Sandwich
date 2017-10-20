package com.pranjsha.cisco;

public class Server extends Thread {
    Sandwich sandwich;
    Prepable prepable;

    public Server(Sandwich sandwich, Prepable prepable) {
        this.sandwich = sandwich;
        this.prepable = prepable;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) sandwich.getPrepTime()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        prepable.prepared(sandwich);
    }
}
