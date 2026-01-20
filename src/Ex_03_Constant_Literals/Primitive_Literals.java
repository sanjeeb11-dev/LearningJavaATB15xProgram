package Ex_03_Constant_Literals;

public class Primitive_Literals {
    static void main(String[] args) {
        int age = 65; // Decimal System - base wil 10

        // Binary Literal
        int binary_num = 0b1010; // Binary System
        // https://www.rapidtables.com/convert/number/binary-to-decimal.html?x=1010


        // Octal base? -> 8
        int octal = 0101;

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745

        char c1 = 'A';
        // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; String - "" - bunch of chars.
        char c2 = 'B';
        System.out.println(c2);
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodDutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("Pramod\nDutta");
        System.out.println("Pramod"+tab_line+"Dutta");
        System.out.println("Pramod"+back_space+"Dutta");
        System.out.println("Pramod"+carriage_return+"Dutta");

        System.out.println( " ----- ");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';

        int binary = 0b1010;
        int hexa = 0xFF;
        long amount = 1_00_000L;
        System.out.println(amount);

        // char A  = "10";
        char c = 'A'; // 65
        System.out.println(c);

        String name = null;
        String name1 = "";
        char d = '0';
        //int a = null;
    }
}
