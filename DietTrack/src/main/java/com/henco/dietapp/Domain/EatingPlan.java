package com.henco.dietapp.Domain;

import com.henco.dietapp.Domain.Interface.EatingPlanInterface;

import java.io.Serializable;

/**
 * Created by Henco on 8/5/2017.
 */
public class EatingPlan implements EatingPlanInterface, Serializable {

    public int day;
    public String foodType;
    public String fluids;

    public EatingPlan() {

    }

    public EatingPlan(Builder builder) {
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

        public EatingPlan build(){
            return new EatingPlan(this);
        }
    }

    public int getDay() {
        return day;
    }


    public String getFoodType() {
        return foodType;
    }


    public String getFluids() {
        return fluids;
    }


    public String breakfast() {
        return null;
    }

    public String lunch() {
        return null;
    }

    public String dinner() {
        return null;
    }

    public String snack() {
        return null;
    }

    @Override
    public String toString() {
        return "EatingPlan{" +
                "day=" + day +
                ", foodType='" + foodType + '\'' +
                ", flueds='" + fluids + '\'' +
                '}';
    }
}
