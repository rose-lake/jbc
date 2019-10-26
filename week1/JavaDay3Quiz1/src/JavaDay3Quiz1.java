public class JavaDay3Quiz1 {

    // TEACHER code version 2:
    public static void main(String[] args) {
        int sum = 0;
        int start = 8, end = 0;     // how to declare + initialize more than one variable at a time! ;)
        // note: with this structure, you can ask the user to input start and end, too!
        // this shows the importance of using 'i >= end'
        // rather than the 'easy way out' of using 'i > end' b/c you knew it would work when end=0.
        for (int i = start; i >= end; i--) {
            if ( i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }

//    // TEACHER code version 1:
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 8; i >= 0; i--) {
//            if ( i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("Sum = " + sum);
//    }

//    // corrected PERSONAL code:
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 8; i >= 0; i -= 2) {
//            sum += i;
//        }
//        System.out.println("Sum=" + sum);
//    }

//    // corrected PARTNER code:
//    // this runs just fine, now!
//    public static void main(String args[]) {
//
//        int sum = 0;  // original code had no declaration
//
////        for (int i = 0; i < 8; i = 2) {   // original
//        for (int i = 0; i <= 8; i +=2) {     // new
//            sum += i;
//        }
//        // System.out.println("Sum=" + i);    // original
//        System.out.println("Sum=" + sum);     // new
//
//    }

}
