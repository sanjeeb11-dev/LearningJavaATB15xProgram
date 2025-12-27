package Class_Task;

public class Increment_Decrement {
    static void main(String[] args) {
        int a = 10;
//        int a = a++ + a++ + a++;
        System.out.println(a++ + a++ + a++); // 10+11+12
        System.out.println(a);

        int x = 3;
//        int y = x++ * ++x;
        System.out.println(x++ * ++x);// 3*5
        System.out.println(x);

        int c = 5;
//        int d = c++ + c--;
        System.out.println(c++ + c--);// 5+6
        System.out.println(c);
    }
}
