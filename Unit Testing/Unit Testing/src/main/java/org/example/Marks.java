package org.example;

public class Marks {
    public int mark1 = 80;
    public int mark2 = 85;
    public int mark3 = 90;

    public int sum() {
        return mark1 + mark2 + mark3;
    }

    public float avg() {
        return (float) sum() / 3.0f;
    }

    public static void main(String[] args) {
        Marks mark = new Marks();
        System.out.println("Sum: " + mark.sum());
        System.out.println("Avg: " + mark.avg());
    }
}
