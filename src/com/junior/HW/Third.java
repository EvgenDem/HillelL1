package com.junior.HW;

public class Third {
    public static void main(String[] args) {

        int count = 7;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0 || i == count - 1 || j == 0 || j == count-1) {
                    System.out.print("#");
                } else if (i == j) {
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0 || i == count - 1 ) {
                    System.out.print("#");
                } else if (i == j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == count - 1 || i == 0 ) {
                    System.out.print("#");
                } else if (i == (count-j-1)  ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
