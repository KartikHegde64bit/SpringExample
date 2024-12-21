package car.example.constructor.injection;

public class Specification {
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    private String make;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString(){
        return "Specification{ " + "Make: " + make + "," + "Model: " + model + "}";
    }
}
