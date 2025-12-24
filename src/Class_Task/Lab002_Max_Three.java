package Class_Task;

public class Lab002_Max_Three {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = -9;
        int MaxNumber = (a>b)? a: (b>c) ? b:c;
        System.out.printf("Max Number is %d" , MaxNumber);

    }
}

