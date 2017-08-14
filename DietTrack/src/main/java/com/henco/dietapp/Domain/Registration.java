package com.henco.dietapp.Domain;

import java.io.Serializable;

public class Registration implements Serializable {

    private int id;
    private String username;
    private String email;
    private String password;
    private String gender;
    private String dateOfBirth;

    public Registration() {
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Registration(Builder builder){
        this.id = builder.id;
        this.username = builder.username;
        this.email = builder.email;
        this.password = builder.password;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
    }

    public static class Builder{
        private int id;
        private String username;
        private String email;
        private String password;
        private String gender;
        private String dateOfBirth;

        public Builder id(int value){
            this.id = value;
            return this;
        }

        public Builder username(String value){
            this.username = value;
            return this;
        }
        public Builder email(String value){
            this.email = value;
            return this;
        }
        public Builder password(String value){
            this.password = value;
            return this;
        }
        public Builder gender(String value){
            this.gender = value;
            return this;
        }
        public Builder dateOfBirth(String value){
            this.dateOfBirth = value;
            return this;
        }

        public Registration build(){
            return new Registration(this);
        }
    }

}
