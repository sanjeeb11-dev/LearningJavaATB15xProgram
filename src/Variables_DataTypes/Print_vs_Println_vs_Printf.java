package Variables_DataTypes;

public class Print_vs_Println_vs_Printf {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println("Pramod");
//        System.out.print("Hello");
//        System.out.print("Pramod");
        //        System.out.println("It will add a new line");
//
//        System.out.print("It will not add a new line");

        int a = 10;
//        System.out.println("Value of a is ->"+a);
//        System.out.print("Value of a is ->"+a);
        System.out.printf("Value of a is %d",a);
//        %d -> int,short,byte,long, - Data Type
//        %s -> String
//        %f -> float, double,
//        %b -> boolean

        int aa=100;
        int bb =121;
        System.out.printf("When you mul aa * bb result is = %d * %d",aa,bb);

        System.out.println();
        int table = 9;
        System.out.printf("%d*1=%d", table, table*1);
    }
}
