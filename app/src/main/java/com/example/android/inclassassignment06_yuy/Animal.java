package com.example.android.inclassassignment06_yuy;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private String legs;
    private boolean hasFur;
    private String info;

    public Animal(String name, String legs, boolean hasFur, String info){
        this.name = name;
        this.legs = legs;
        this.hasFur = hasFur;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getLegs() {
        return legs;
    }

    public boolean hasFur() {
        return hasFur;
    }

    public String getInfo() {
        return info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
