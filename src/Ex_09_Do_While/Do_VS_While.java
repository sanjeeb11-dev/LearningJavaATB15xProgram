package Ex_09_Do_While;

public class Do_VS_While {
    static void main(String[] args) {
        int a = 0;
//        while (a<0){   // Will not give any output
//            System.out.println(a);
//            a++;
//        }
        do {  // Will give at least one output
            System.out.println(a);
            a++;
        }while (a<0);
    }
}
