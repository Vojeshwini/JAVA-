package com.java.xworkz.dto;

public class ParachutDto {
private String parachutType;
private boolean n_reusable;
private String deploymentType;
private String manufacturedBy;
private int n_capacity;
private int n_cost;




//by default all the getter and setter will be set

    public void setParachutType(String parachutType) {
        this.parachutType = parachutType;
    }
//
    public void setN_reusable(boolean n_reusable) {
        this.n_reusable = n_reusable;
    }

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    public void setManufacturedBy(String manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public void setN_capacity(int n_capacity) {
        this.n_capacity = n_capacity;
    }

    public void setN_cost(int n_cost) {
        this.n_cost = n_cost;
    }

    public String getParachutType() {
        return parachutType;
    }

    public int getN_capacity() {
        return n_capacity;
    }

    public int getN_cost() {
        return n_cost;
    }

    public String getDeploymentType() {
        return deploymentType;
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }
//
    public boolean isN_reusable() {
        return n_reusable;
    }


    @Override
    public String toString() {
        return "ParachutDto{" +
                "parachutType='" + parachutType + '\'' +
                ", n_reusable=" + n_reusable +
                ", deploymentType='" + deploymentType + '\'' +
                ", manufacturedBy='" + manufacturedBy + '\'' +
                ", n_capacity=" + n_capacity +
                ", n_cost=" + n_cost +
                '}';
    }
}
