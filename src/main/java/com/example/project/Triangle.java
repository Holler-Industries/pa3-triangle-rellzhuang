package com.example.project;
import java.lang.Math;

public class Triangle {
    private double x0;
    private double y0;
    private double x1;
    private double x2;
    private double y1;
    private double y2;


    public Triangle(double a, double b, double c, double d, double e, double f) {
        this.x0 = a;
        this.y0 = b;
        this.x1 = c;
        this.y1 = d;
        this.x2 = e;
        this.y2 = f;
    }
    public Triangle() {
        this.x0 = 0.0;
        this.y0 = 0.0;
        this.x1 = 0.0;
        this.y1 = 0.0;
        this.x2 = 0.0;
        this.y2 = 0.0;
    }

public double perimeter() {
    double a = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    double b = Math.sqrt(Math.pow(this.x1 - this.x0, 2) + Math.pow(this.y1 - this.y0, 2));
    double c = Math.sqrt(Math.pow(this.x0 - this.x2, 2) + Math.pow(this.y0 - this.y2, 2));
    double perimeter = a + b + c;
    return perimeter;
}
public double area() {
    double a = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    double b = Math.sqrt(Math.pow(this.x1 - this.x0, 2) + Math.pow(this.y1 - this.y0, 2));
    double c = Math.sqrt(Math.pow(this.x0 - this.x2, 2) + Math.pow(this.y0 - this.y2, 2));
    double s = (a + b + c) / 2;
    double area = Math.sqrt((s) * (s - a) * (s - b) * (s - c));
    return area;
}
    public void translateX(double x) {
    x0 = this.x0 + x;
    x1 = this.x1 + x;
    x2 = this.x2 + x;
}
    public void translateY(double y){
    y0= this.y0+y;
    y1= this.y1+y;
    y2= this.y2+y;
}



    // DO NOT DELETE THESE!
    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }


}
