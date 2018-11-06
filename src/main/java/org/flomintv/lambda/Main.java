package org.flomintv.lambda;

public class Main {

    public static void main(String[] args) {
        NumericTest isEven = n -> (n % 2) == 0;
        NumericTest isNegative = n -> (n < 0);

        System.out.println(isEven.computeTest(5));
        System.out.println(isNegative.computeTest(-1));

        /*------------------------------*/

        MyGreeting morningGreeting = s -> "Good morning, " + s + "!";
        MyGreeting eveningGreeting = s -> "Good evening, " + s + "!";

        System.out.println(morningGreeting.processName("Tim"));
        System.out.println(eveningGreeting.processName("Mary"));

        /*------------------------------*/

        MyString reverseString = s -> {
            StringBuilder result = new StringBuilder();

            for (int i = s.length() - 1; i >= 0; i--) {
                result.append(s.charAt(i));
            }

            return result.toString();
        };

        System.out.println(reverseString.myStringFunction("nimolF rumiT"));

        /*------------------------------*/

        // String version of MyGenericInteface
        MyGeneric<String> reverse = str -> {
            String result = "";

            for(int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        // Integer version of MyGeneric
        MyGeneric<Integer> factorial = (Integer n) -> {
            int result = 1;

            for(int i=1; i <= n; i++) {
                result = i * result;
            }

            return result;
        };

        /*------------------------------*/

        System.out.println(reverseString(reverseString, "reverse me"));
    }

    public static String reverseString(MyString reverse, String s) {
        return reverse.myStringFunction(s);
    }

}
