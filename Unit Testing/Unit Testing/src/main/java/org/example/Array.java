package org.example;

public class Array {
    public int[] arr = new int[5];

    public void fill(int[] values) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = values[i];
        }
    }

    public void display() {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int max() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int min() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public class Password {
        private String password;

        public Password(String password) {
            if (password.length() >= 5 && password.length() <= 10) {
                this.password = password;
            } else {
                throw new IllegalArgumentException("Password should be between 5 to 10 characters.");
            }
        }

        public String getPassword() {
            return password;
        }
    }
    public static void main(String[] args) {
        Array array = new Array();
        int[] values = {3, 7, 2, 9, 5};
        array.fill(values);

        array.display();

        System.out.println("Maximum value: " + array.max());
        System.out.println("Minimum value: " + array.min());
    }

}
