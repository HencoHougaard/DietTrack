package com.henco.dietapp.Domain;

import java.io.Serializable;

/**
 * Created by Henco on 8/5/2017.
 */
public class TADay extends EatingPlan implements Serializable{

    public TADay() {
    }

    public TADay(Builder builder) {
        this.day = builder.day;
        this.foodType = builder.foodType;
        this.fluids = builder.fluids;
    }

    public static class Builder{
        private int day;
        private String foodType;
        private String fluids;

        public Builder day(int value){
            this.day = value;
            return this;
        }

        public Builder foodType(String value){
            this.foodType = value;
            return this;
        }

        public Builder fluids(String value){
            this.fluids = value;
            return this;
        }

        public TADay build(){
            return new TADay(this);
        }
    }

    @Override
    public String breakfast() {
        return super.breakfast();
    }

    @Override
    public String lunch() {
        return super.lunch();
    }

    @Override
    public String dinner() {
        return super.dinner();
    }

    @Override
    public String snack() {
        return super.snack();
    }
}
