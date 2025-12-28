package Class_Task;

/*
All sides are equal equilateral triangle
isosceles (Two sides are equal)
scalene (no sides are equal)
*/

import java.util.Scanner;

public class Triangle_Classifier {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 Sides : ");
        int side1 = scan.nextInt();
//        System.out.println("Enter Side2 : ");
        int side2 = scan.nextInt();
//        System.out.println("Enter Side3 : ");
        int side3 = scan.nextInt();

        if (side1 == side2 && side1 == side3){
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("isosceles Triangle");
        } else{
            System.out.println("scalene Triangle");
        }
        scan.close();
    }
}