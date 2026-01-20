package Ex_11_String;

public class String_04 {
    static void main(String[] args) {
        String S1 = "Hello";
        String S2 = "Hello";

        String S5 = new String("Hello");
        String S6 = new String("Hello");
        String S7 = new String("hello");

        // == Comparison - String check the ref in String

        System.out.println(S1==S5);
        System.out.println(S1==S2);
        System.out.println(S2==S6);
        System.out.println(S5==S6);

        System.out.println(S5==S7);
        System.out.println(S6==S7);

        // equals (content)  -> value

        System.out.println(S1.equals(S2));
        System.out.println(S1.equals(S5));
        System.out.println(S5.equals(S7));
        System.out.println(S6.equalsIgnoreCase(S7));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // equal operator assignment the value
    }
}