package staticcc.factory.method.man;

public class Main {

    public static void main(String[] args) {
        Cleaner defaultLevelCleaner = Cleaner.defaultLevelCleaner();
        Cleaner levelOneCleaner = Cleaner.levelOneCleaner();
        Cleaner levelTenCleaner = Cleaner.levelTenCleaner();
        Cleaner tamaraCleaner = Cleaner.tamaraCleaner();

        defaultLevelCleaner.clean();
        levelOneCleaner.clean();
        levelTenCleaner.clean();
        tamaraCleaner.clean();
    }

}
