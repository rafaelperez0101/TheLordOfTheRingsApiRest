package com.lordsapp.lords_restapi.model;

public enum Heroes {

    HUMANOS("humanos"), HOBBITS("hobbits"), ELFOS("elfos");

    private String name;
    private Heroes(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
