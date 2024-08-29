package models;

public class Circle {

    private float radius;
    private float circumference;
    private float area;

    //Empty Constructor
    public Circle() {
    }

    //Constructor
    public Circle(float radius, float circumference, float area) {
        this.radius = radius;
        this.circumference = circumference;
        this.area = area;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    //Getters and Setters
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getCircumference() {
        return circumference;
    }
    public void setCircumference(float circumference) {
        this.circumference = circumference;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }




}
