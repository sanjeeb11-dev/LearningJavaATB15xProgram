package For_Loop;

public class Break_Continue {
    static void main(String[] args) {
//        for (int i=1;i<50;i++) {
//            System.out.println(i);
//            if (i==5) {
//                break;
//                continue;
//            }
//        }
//    }
//}
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
//                break;
                continue;
            }
            System.out.println(i);
        }
        System.out.println("End");
    }
}
