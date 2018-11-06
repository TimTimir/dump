package org.flomintv.lambda;

/* Java anonymous classes can have state. Whereas lambda expressions are stateless */
public class OneMoreMain {

    private static String someStaticVar = "Some text";

    public static void main(String[] args) {
        doSmth((s) -> {
            System.out.println("Before doing smth...");
        });

        /*------------------------------*/

        OneMoreMain oneMoreMain = new OneMoreMain();
        oneMoreMain.doSmthElse();

        /*------------------------------*/

        MyPrinter myPrinter = System.out::println;

        /*------------------------------*/

        Finder finder = MyClass::doFind;

        System.out.println(finder.find("asdfghjkl", "fghj"));
    }

    private static void doSmth(MyInterface myInterface) {
        myInterface.printIt("");
        System.out.println("I'm doing smth!");
    }

    private void doSmthElse() {
        String myString = "Test"; // effectively final variable

        MyFactory myFactory = (chars) -> {
            return new String(chars) + myString + this.getClass().getName() + someStaticVar;
        };

        System.out.println(myFactory.create(new char[0]));
    }

}
