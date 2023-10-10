import java.awt.*;

import static java.lang.Math.pow;

public class Circle  {
    private double radius;private String colour;private boolean isFilled;
    Circle(){
        this.radius = 0;
        this.setColour("Blank");
        this.setFilled(false);
    }Circle(double radius, String colour,boolean isFilled){
        this.radius = radius;
        this.setColour(colour);
        this.setFilled(isFilled);
    }public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColour(String colour) {this.colour = colour; }
    public void setFilled(boolean filled) {isFilled = filled;}
    public double getArea() {
        return 3.14*pow(radius,2.0);
    }
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ", isFilled=" + isFilled +
                ", perimeter=" + getPerimeter()+
                ", area=" + getArea() +
                '}';
    }
}
