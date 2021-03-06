package com.henco.dietapp.Domain;

import java.io.Serializable;

/**
 * Created by Henco on 8/5/2017.
 */
public class User implements Serializable{

    private int id;
    private String fname;
    private String sname;
    private String age;
    private String length;
    private String weight;
    private String stomach;
    private String waist;
    private String upperBody;
    private String thigh;
    private String arm;

    User(){
    }

    public User(Builder builder){
        this.id = builder.id;
        this.fname = builder.fname;
        this.sname = builder.sname;
        this.age = builder.age;
        this.length = builder.length;
        this.weight = builder.weight;
        this.stomach = builder.stomach;
        this.waist = builder.waist;
        this.upperBody = builder.upperBody;
        this.thigh = builder.thigh;
        this.arm = builder.arm;
    }

    public static class Builder{
        private int id;
        private String fname;
        private String sname;
        private String age;
        private String length;
        private String weight;
        private String stomach;
        private String waist;
        private String upperBody;
        private String thigh;
        private String arm;

        public Builder id(int value){
            this.id = value;
            return this;
        }

        public Builder fname(String value){
            this.fname = value;
            return this;
        }
        public Builder sname(String value){
            this.sname = value;
            return this;
        }
        public Builder age(String value){
            this.age = value;
            return this;
        }
        public Builder length(String value){
            this.length = value;
            return this;
        }
        public Builder weight(String value){
            this.weight = value;
            return this;
        }
        public Builder stomach(String value){
            this.stomach = value;
            return this;
        }
        public Builder waist(String value){
            this.waist = value;
            return this;
        }public Builder upperBody(String value){
            this.upperBody = value;
            return this;
        }
        public Builder thigh(String value){
            this.thigh = value;
            return this;
        }
        public Builder arm(String value){
            this.arm = value;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public int getId() {
        return id;
    }


    public String getFname() {
        return fname;
    }


    public String getSname() {
        return sname;
    }


    public String getAge() {
        return age;
    }


    public String getLength() {
        return length;
    }


    public String getWeight() {
        return weight;
    }


    public String getStomach() {
        return stomach;
    }


    public String getWaist() {
        return waist;
    }


    public String getUpperBody() {
        return upperBody;
    }


    public String getThigh() {
        return thigh;
    }


    public String getArm() {
        return arm;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
