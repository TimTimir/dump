package org.flomintv.staticcc.factory.method.man;

public class Cleaner {

    private Integer desiredCleanlinessLevel;

    private static final Cleaner defaultCleaner = new Cleaner(0);

    /**
    * ctor
    */
    public Cleaner(Integer desiredCleanlinessLevel) {
        this.desiredCleanlinessLevel = desiredCleanlinessLevel;
    }

    /**
     * default factory
     */
    public static Cleaner defaultLevelCleaner() {
        return defaultCleaner;
    }

    /**
     * level 1 factory
     */
    public static Cleaner levelOneCleaner() {
        return new Cleaner(1);
    }

    /**
     * level 10 factory
     */
    public static Cleaner levelTenCleaner() {
        return new Cleaner(10);
    }

    /**
     * Tamara 'the cleaner' factory
     */
    public static Cleaner tamaraCleaner() {
        return new Tamara(42);
    }

    /**
     * actual cleaning action. well, sort of
     */
    public void clean() {
        System.out.println(String.format("Let's pretend that I clean something. By the way, my cleanliness level is %d", desiredCleanlinessLevel));
    }

}
