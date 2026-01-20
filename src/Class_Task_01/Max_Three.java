package Class_Task_01;

public class Max_Three {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 9;
//        int MaxNumber = (a>b)? a: (b>c) ? b:c;
        int MaxNumber = ((a>b) && (a>c)) ? a : (b>c) ? b : c;
        System.out.printf("Max Number is %d" , MaxNumber);

    }
}
