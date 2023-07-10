package org.example;

public class Result {
    public int rollNo;
    public String name;
    public int[] marks = new int[3];

    public Result() {
        this.rollNo = 0;
        this.name = "";
        for (int i = 0; i < 3; i++) {
            this.marks[i] = 0;
        }
    }

    public void input(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = marks[i];
        }
    }

    public void show() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks in Subject " + (i+1) + ": " + this.marks[i]);
        }
    }

    public int total() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += this.marks[i];
        }
        return sum;
    }

    public double avg() {
        return (double) total() / 3.0;
    }

    public static void main(String[] args) {
        int[] marks = {85, 95, 79};

        Result student = new Result();
        student.input(132, "Muhammad Abeer Khan", marks);

        student.show();
        System.out.println("Total marks: " + student.total());
        System.out.println("Average marks: " + student.avg());
    }
}

