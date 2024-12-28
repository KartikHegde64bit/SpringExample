package com.autowire.byType;

public class Specification {
    private String wheelType;
    private String frameType;
    private String engineType;

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


    @Override
    public String toString(){
        return "Specification: { " + "Frame: " + this.frameType + ", Engine: " +
                this.engineType + ", Wheel: " + this.wheelType + "}";
    }
}
