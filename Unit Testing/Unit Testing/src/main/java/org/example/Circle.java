package org.example;

import java.util.Scanner;
public class Circle {
    private double radius;
    public Circle() {
        radius = 0;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public double area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + a);
        return a;
    }
    public double circum() {
        double c = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + c);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        c.setRadius(r);
        c.area();
        c.circum();
    }
}