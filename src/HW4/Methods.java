package HW4;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //object for reading an answer from user is created
        String continuePrint; //to declare and save the user's response if to continue the program

        do {
            System.out.println("Please type the NUMBER of the shape you want to draw:");
            System.out.println("1 for rectangle");
            System.out.println("2 for left triangle");
            System.out.println("3 for right triangle");
            System.out.println("4 for triangle");
            int shape = scanner.nextInt(); // to declare the variable and save the answer from user

            switch (shape) {
                case 1: //for rectangle
                    System.out.println("Enter height");
                    int heightRect = scanner.nextInt();
                    System.out.println("Enter width");
                    int widthRect = scanner.nextInt();
                    drawRect(heightRect, widthRect);
                    break;
                case 2: //for left triangle
                    System.out.println("Enter height");
                    int heightLeftTri = scanner.nextInt();
                    drawLeftTri(heightLeftTri);
                    break;
                case 3: //for right triangle
                    System.out.println("Enter height");
                    int heightRightTri = scanner.nextInt();
                    drawRightTri(heightRightTri);
                    break;
                case 4: //for triangle
                    System.out.println("Enter height");
                    int heightTri = scanner.nextInt();
                    drawTri(heightTri);
                    break;
                default:
                    System.out.println("Incorrect input. Please type the number of the shape you want to draw");
            }

            System.out.println("Do you what to continue to draw? (yes/no)"); //ask user to continue or not
            continuePrint = scanner.next();
        }
        while (continuePrint.equals("yes")); //finishing do while loop here and compare the strings (based on boolean true/false match)
    }

    //methods:

    //1. Rectangle drawing method
    public static void drawRect (int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2. Left triangle drawing method
    public static void drawLeftTri(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3. Right triangle drawing method
    public static void drawRightTri(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //4. Triangle drawing method
    public static void drawTri (int height) {
        int width = height * 2 - 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j >= height - i - 1 && j <= height + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
