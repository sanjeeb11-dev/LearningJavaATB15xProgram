package Ex_10_Functions;

public class ex_02 {
    static void main(String[] args) {

        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type

        // 1.Without Arguments / Parameters and Without Return Type
        wop_wor_greet();

        // 2.Without Parameters but With Return Type
        String msg = wop_wr_greet_2();

        // 3.With Parameters and Without Return Type
        greet_with_details("Sanjeeb", 65, 100);

        // 4.With Parameters and With Return Type
        int sum = sum_of_two_numbers(3,4);
    }
    static int sum_of_two_numbers(int i, int i1){
        return i+i1;
    }
    static void greet_with_details(String Sanjeeb, int i, int i1){
    }
    static String wop_wr_greet_2(){
        return "Sanjeeb";
    }
    static void wop_wor_greet(){
    }
}
