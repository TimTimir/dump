package aziz.prakash.chapter5.primitive5p1;

public class ParityOfAWord {


    static int checkParity(Integer integerToCheck) {
        return BitsOperations.countBits(integerToCheck) % 2;
    }

    static int checkParity(Long longToCheck) {
        return BitsOperations.countBits(longToCheck) % 2;
    }

    static int alternativeCheckParity(Integer integerToCheck) {
        short result = 0;
        long inputIntegerCopy = integerToCheck;
        while (inputIntegerCopy != 0) {
            result ^= (inputIntegerCopy & 1);
            inputIntegerCopy >>>= 1;
        }
        return result;
    }

    static int alternativeCheckParity(Long longToCheck) {
        short result = 0;
        long inputLongCopy = longToCheck;
        while (inputLongCopy != 0) {
            result ^= (inputLongCopy & 1);
            inputLongCopy >>>= 1;
        }
        return result;
    }

    static int oneMoreVariationCheckParity(Integer integerToCheck) {
        short result = 0;
        int inputIntegerCopy = integerToCheck;
        while (inputIntegerCopy != 0) {
            result ^= 1;
            inputIntegerCopy &= (inputIntegerCopy - 1);
        }
        return result;
    }

    static int oneMoreVariationCheckParity(Long longToCheck) {
        short result = 0;
        long inputLongCopy = longToCheck;
        while (inputLongCopy != 0) {
            result ^= 1;
            inputLongCopy &= (inputLongCopy - 1);
        }
        return result;
    }

}
