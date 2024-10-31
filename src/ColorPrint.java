public class ColorPrint {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";

    public static void printGreen(String text){
        System.out.println(GREEN + text + RESET);
    }

    public static void printRed(String text){
        System.out.println(RED + text + RESET);
    }
}
