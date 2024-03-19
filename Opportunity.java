package com.salesmanagement.model;

public class Opportunity {
    private String name;
    private double amount;
    private boolean closed;

    public Opportunity(String name, double amount) {
        this.name = name;
        this.amount = amount;
        this.closed = false;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isClosed() {
        return closed;
    }

    public void markClosed() {
        closed = true;
    }
}
