package com.enverus;

import java.util.Date;

public class FruitStoreItem {
    private Fruit type;
    private double cost;
    private String origin;
    private Date expiry;

    public Fruit getType() {
        return type;
    }

    public void setType(Fruit type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
