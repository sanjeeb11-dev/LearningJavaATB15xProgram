package For_Loop;

public class Print_OddNumber {
    static void main() {
        int i;
        for (i=1;i<=50;++i){
            if (i%2==1){
                System.out.println("Number is Odd : "+ i);
            } else {
                System.out.println("Number is Even : "+ i);
            }
        }
    }
}
