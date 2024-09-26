package models;

public class Car {

    private final Engine engine;
    //Final means that can't be change once initialized

    public Car() {
        this.engine = new Engine();
    }

    public void turnCarOn(){
        engine.turnOn();
    }

    public void turnCarOff(){
        engine.turnOff();
    }


}
