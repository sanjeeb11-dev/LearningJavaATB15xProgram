package Exam_Coding_11Jan26;

//Write a Java program to print all even numbers between 1 and 50 using a do-while loop.

public class Print_Even_Numbers_10 {
    static void main(String[] args) {
        int i =1;
        do {
            if (i%2==0)
            System.out.println(i);
            i++;
        }while (i<=50);
    }
}
