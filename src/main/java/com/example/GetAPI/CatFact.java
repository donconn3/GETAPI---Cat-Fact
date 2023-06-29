package com.example.GetAPI;

public class CatFact {

    private String fact;

    public CatFact(String fact) {
        this.fact = fact;
    }

    public CatFact() {
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
