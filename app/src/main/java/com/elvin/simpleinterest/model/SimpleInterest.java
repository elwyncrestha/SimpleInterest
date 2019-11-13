package com.elvin.simpleinterest.model;

public class SimpleInterest {
    private float principal;
    private float time;
    private float rate;

    public SimpleInterest(float principal, float time, float rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    public float calculate() {
        return (this.principal * this.time * this.rate) / 100;
    }
}
