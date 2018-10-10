package aziz.prakash.primitive5p1;

public class BitsCounterMain {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(0));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(2));

        System.out.println("---------------");

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(BitsOperations.shiftBytesByNumber(10, 1)));// 1010 --> 0101
        System.out.println(Integer.toBinaryString(11));
        System.out.println(Integer.toBinaryString(BitsOperations.shiftBytesByNumber(11, 1)));// 1011 --> 0101
        System.out.println(Integer.toBinaryString(12));
        System.out.println(Integer.toBinaryString(BitsOperations.shiftBytesByNumber(12, 1)));// 1100 --> 0110

        System.out.println("---------------");

        System.out.println(BitsOperations.countBits(0));
        System.out.println(BitsOperations.countBits(1));
        System.out.println(BitsOperations.countBits(2));
        System.out.println(BitsOperations.countBits(3));
        System.out.println(BitsOperations.countBits(4));
        System.out.println(BitsOperations.countBits(5));
        System.out.println(BitsOperations.countBits(6));
        System.out.println(BitsOperations.countBits(7));
        System.out.println(BitsOperations.countBits(8));
        System.out.println(BitsOperations.countBits(9));
    }

}
