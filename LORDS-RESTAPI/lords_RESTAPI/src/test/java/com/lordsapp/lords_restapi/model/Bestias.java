package com.lordsapp.lords_restapi.model;

public enum Bestias {

        ORCOS("orcos"), TRASGOS("trasgos");

        private String name;
        private Bestias(String name){
                this.name = name;
        }

        @Override
        public String toString() {
                return super.toString();
        }
}

