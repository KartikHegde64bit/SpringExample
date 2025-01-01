package com.autowire.byConstructor;

public class Car {
    private Specification specification;

    // this constructor will be used by the "autowire by constructor"
    public Car(Specification specification) {
        this.specification = specification;
    }

    public void setSpecification(Specification specification){
        this.specification = specification;
    }

    public void displayCar() {
        System.out.println(specification.toString());
    }
}
