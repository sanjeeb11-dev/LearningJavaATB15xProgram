package For_Loop;

public class Print_EvenNumber {
    static void main(String[] args) {

        for (int i=1;i<=50;i++){
            if (i % 2 == 0){
                System.out.println("Number is Even : "+ i);
            }
//            else if (i % 2 == 1) {
//                System.out.println("Number is odd : "+ i);
//            }
            else {
                System.out.println("Number is odd : "+ i);
            }
        }
    }
}
