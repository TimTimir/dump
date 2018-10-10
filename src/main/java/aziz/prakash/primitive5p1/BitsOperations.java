package aziz.prakash.primitive5p1;

class BitsOperations {

    private BitsOperations() {
        //
    }

    static short countBits(int inputInteger) {
        short numBits = 0;
        int inputIntegerCopy = inputInteger;
        while (inputIntegerCopy != 0){
            numBits += (inputIntegerCopy & 1);
            inputIntegerCopy >>>= 1;
        }
        return numBits;
    }

    static int shiftBytesByNumber(int inputInteger, int shiftByThisNumber) {
        return inputInteger >>> shiftByThisNumber;
    }
}
