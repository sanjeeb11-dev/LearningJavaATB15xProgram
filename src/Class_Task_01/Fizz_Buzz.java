package Class_Task_01;

/*
prints numbers from 1 to 100.
multiples of 3, print "Fizz" instead of the number
multiples of 5, print "Buzz."
multiples of both 3 and 5, print "FizzBuzz."
*/

public class Fizz_Buzz {
    static void main(String[] args) {

        int i;
        for(i=1;i<=100;i++)

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
    }
}
