package com.autowire.byType;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification){
        this.specification = specification;
    }

    public void displayCar() {
        System.out.println(specification.toString());
    }
}
