package aziz.prakash.primitive5p1;

class BitsOperations {

    private BitsOperations() {
        //
    }

    static short countBits(int inputInteger) {
        short numBits = 0;
        int inputIntegerCopy = inputInteger;
        while (inputIntegerCopy != 0) {
            numBits += (inputIntegerCopy & 1);
            inputIntegerCopy >>>= 1;
        }
        return numBits;
    }

    static short countBits(long inputInteger) {
        short numBits = 0;
        long inputIntegerCopy = inputInteger;
        while (inputIntegerCopy != 0) {
            numBits += (inputIntegerCopy & 1);
            inputIntegerCopy >>>= 1;
        }
        return numBits;
    }

    static int unsignedShiftBytesByNumberToTheRight(int inputInteger, int shiftByThisNumber) {
        return inputInteger >>> shiftByThisNumber;
    }

    static int signedShiftBytesByNumberToTheLeft(int inputInteger, int shiftByThisNumber) {
        return inputInteger << shiftByThisNumber;
    }

    static int signedShiftBytesByNumberToTheRight(int inputInteger, int shiftByThisNumber) {
        return inputInteger >> shiftByThisNumber;
    }

    static boolean checkIfLastBitInAWordIsOne(Integer integer) {
        return 1 == (integer & ~(integer - 1));
    }

}
