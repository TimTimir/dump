package org.flomintv.aziz.prakash.chapter5.primitive5p1;

public class BitsCounterMain {

    public static void main(String[] args) {
        printBinaryRepresentation();

        System.out.println("---------------");

        printUnsignedRightBitShift();

        System.out.println("---------------");

        printSignedLeftBitShift();

        System.out.println("---------------");

        printSignedRightBitShift();

        System.out.println("---------------");

        printBitsCount();

        System.out.println("---------------");

        printMinMaxValues();
    }

    private static void printBinaryRepresentation() {
        System.out.println(Integer.toBinaryString(0));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(2));
    }

    private static void printUnsignedRightBitShift() {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(BitsOperations.unsignedShiftBytesByNumberToTheRight(10, 1)));
        System.out.println(Integer.toBinaryString(11));
        System.out.println(Integer.toBinaryString(BitsOperations.unsignedShiftBytesByNumberToTheRight(11, 1)));
        System.out.println(Integer.toBinaryString(12));
        System.out.println(Integer.toBinaryString(BitsOperations.unsignedShiftBytesByNumberToTheRight(12, 1)));
    }

    private static void printSignedLeftBitShift() {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(BitsOperations.signedShiftBytesByNumberToTheLeft(10, 1)));
        System.out.println(Integer.toBinaryString(11));
        System.out.println(Integer.toBinaryString(BitsOperations.signedShiftBytesByNumberToTheLeft(11, 1)));
        System.out.println(Integer.toBinaryString(12));
        System.out.println(Integer.toBinaryString(BitsOperations.signedShiftBytesByNumberToTheLeft(12, 1)));
    }

    private static void printSignedRightBitShift() {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(BitsOperations.signedShiftBytesByNumberToTheRight(10, 1)));
        System.out.println(Integer.toBinaryString(11));
        System.out.println(Integer.toBinaryString(BitsOperations.signedShiftBytesByNumberToTheRight(11, 1)));
        System.out.println(Integer.toBinaryString(12));
        System.out.println(Integer.toBinaryString(BitsOperations.signedShiftBytesByNumberToTheRight(12, 1)));
    }

    private static void printBitsCount() {
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


    private static void printMinMaxValues() {
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.SIZE);
    }
}
