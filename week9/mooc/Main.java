package week9.mooc;

import week9.main.Printer;

public class Main {
    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("C:\\Users\\User\\IdeaProjects\\LABS\\src\\com\\Week9\\mooc\\textfile\\txt");
        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}
