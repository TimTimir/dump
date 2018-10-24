package aziz.prakash.chapter5.primitive5p1;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParityOfAWordTest {

    @Test
    public void checkParity() {
        assertEquals(0, ParityOfAWord.checkParity(0));
        assertEquals(1, ParityOfAWord.checkParity(1));
        assertEquals(1, ParityOfAWord.checkParity(2));
        assertEquals(0, ParityOfAWord.checkParity(3));
        assertEquals(0, ParityOfAWord.checkParity(123));
        assertEquals(0, ParityOfAWord.checkParity(235));
        assertEquals(1, ParityOfAWord.checkParity(659));
        assertEquals(1, ParityOfAWord.checkParity(Long.MAX_VALUE));

        assertEquals(0, ParityOfAWord.alternativeCheckParity(0));
        assertEquals(1, ParityOfAWord.alternativeCheckParity(1));
        assertEquals(1, ParityOfAWord.alternativeCheckParity(2));
        assertEquals(0, ParityOfAWord.alternativeCheckParity(3));
        assertEquals(0, ParityOfAWord.alternativeCheckParity(123));
        assertEquals(0, ParityOfAWord.alternativeCheckParity(235));
        assertEquals(1, ParityOfAWord.alternativeCheckParity(659));
        assertEquals(1, ParityOfAWord.alternativeCheckParity(Long.MAX_VALUE));

        assertEquals(0, ParityOfAWord.oneMoreVariationCheckParity(0));
        assertEquals(1, ParityOfAWord.oneMoreVariationCheckParity(1));
        assertEquals(1, ParityOfAWord.oneMoreVariationCheckParity(2));
        assertEquals(0, ParityOfAWord.oneMoreVariationCheckParity(3));
        assertEquals(0, ParityOfAWord.oneMoreVariationCheckParity(123));
        assertEquals(0, ParityOfAWord.oneMoreVariationCheckParity(235));
        assertEquals(1, ParityOfAWord.oneMoreVariationCheckParity(659));
        assertEquals(1, ParityOfAWord.oneMoreVariationCheckParity(Long.MAX_VALUE));
    }

    @Test
    public void checkParityOfLargeNumberOfLongs() {
        Random random = new Random(Long.MAX_VALUE);
        for (int i = 0; i < 10000; i++) {
            long longToCheck = random.nextLong();
            System.out.println(longToCheck);
            System.out.println(ParityOfAWord.checkParity(longToCheck));
            random.setSeed(longToCheck);
        }
    }

    @Test
    public void helperTest() {
        System.out.println(Integer.toBinaryString(123));
        System.out.println(Integer.toBinaryString(235));
        System.out.println(Integer.toBinaryString(659));
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
    }

    @Test
    public void helperTestNegatingLastBit() {
        Integer i1 = 123;
        Integer i2 = 456;
        Integer i3 = 789;
        Integer i4 = 1;
        Integer i5 = 2;
        Integer i6 = 3;
        Integer i7 = 4;

        andOperatorOnNegatedOriginal(i1);
        andOperatorOnNegatedOriginal(i2);
        andOperatorOnNegatedOriginal(i3);
        andOperatorOnNegatedOriginal(i4);
        andOperatorOnNegatedOriginal(i5);
        andOperatorOnNegatedOriginal(i6);
        andOperatorOnNegatedOriginal(i7);
    }

    private void andOperatorOnNegatedOriginal(Integer i1) {
        System.out.println(String.format("Original: %s", i1));
        System.out.println(String.format("Original binary: %s", Integer.toBinaryString(i1)));
        System.out.println(String.format("Original - 1: %s", Integer.toBinaryString(i1 - 1)));
        System.out.println(String.format("Negated Original - 1: %s", Integer.toBinaryString(~(i1 - 1))));
        System.out.println(String.format("Original & Negated Original - 1: %s", Integer.toBinaryString(i1 & ~(i1 - 1))));
    }

    @Test
    public void testCheckIfLastBitInAWordIsOne() {
        assertFalse(BitsOperations.checkIfLastBitInAWordIsOne(Integer.parseInt("100101110", 2)));
        assertTrue(BitsOperations.checkIfLastBitInAWordIsOne(Integer.parseInt("100101111", 2)));
        assertFalse(BitsOperations.checkIfLastBitInAWordIsOne(Integer.parseInt("100111110", 2)));
        assertFalse(BitsOperations.checkIfLastBitInAWordIsOne(Integer.parseInt("100000", 2)));
        assertTrue(BitsOperations.checkIfLastBitInAWordIsOne(Integer.parseInt("10011110101", 2)));
        assertFalse(BitsOperations.checkIfLastBitInAWordIsOne(Integer.parseInt("0", 2)));
        assertTrue(BitsOperations.checkIfLastBitInAWordIsOne(Integer.parseInt("1", 2)));
    }

    @Test
    public void dummyTest() {
        //
    }

}
